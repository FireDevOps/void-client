/* Class376 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

final class InputStreamBuffer implements Runnable {
    private int size;
    static int anInt4547;
    private InputStream stream;
    static int anInt4549;
    static int anInt4550;
    static int anInt4551;
    static int anInt4552;
    static int anInt4553;
    private final byte[] buffer;
    static int anInt4555;
    private int anInt4556 = 0;
    private final Thread thread;
    private int anInt4558 = 0;
    static int anInt4559 = 0;
    private IOException anIOException4560;

    final void method3615(int i) {
        synchronized (this) {
            if (i != 15984) run();
            if (anIOException4560 == null) anIOException4560 = new IOException("");
            this.notifyAll();
        }
        anInt4552++;
        try {
            thread.join();
        } catch (InterruptedException interruptedexception) {
            /* empty */
        }
    }

    static final void method3616(int i) {
        anInt4549++;
        if (Class182.anInterface16Array2447 != null) {
            Interface16[] interface16s = Class182.anInterface16Array2447;
            for (int i_0_ = 0; i_0_ < interface16s.length; i_0_++) {
                Interface16 interface16 = interface16s[i_0_];
                interface16.method57(108);
            }
        }
        if (i != 12639) anInt4559 = 72;
    }

    public final void run() {
        anInt4553++;
        for (; ; ) {
            int i;
            synchronized (this) {
                for (; ; ) {
                    if (anIOException4560 != null) return;
                    if (anInt4556 != 0) {
                        if (anInt4556 < anInt4558) i = -anInt4558 + size;
                        else i = -1 + anInt4556 - anInt4558;
                    } else i = -1 + (size + -anInt4558);
                    if (i > 0) break;
                    try {
                        this.wait();
                    } catch (InterruptedException interruptedexception) {
                        /* empty */
                    }
                }
            }
            int i_1_;
            try {
                i_1_ = stream.read(buffer, anInt4558, i);
                if (i_1_ == -1) throw new EOFException();
            } catch (IOException ioexception) {
                synchronized (this) {
                    anIOException4560 = ioexception;
                    break;
                }
            }
            synchronized (this) {
                anInt4558 = (i_1_ + anInt4558) % size;
            }
        }
    }

    final int method3617(int i, int i_2_, int i_3_, byte[] is) throws IOException {
        anInt4555++;
        if (i < 0 || i_2_ < 0 || is.length < i_2_ + i) throw new IOException();
        synchronized (this) {
            int i_4_;
            if (anInt4556 <= anInt4558) i_4_ = anInt4558 + -anInt4556;
            else i_4_ = size + (-anInt4556 - -anInt4558);
            if (i_4_ < i) i = i_4_;
            if (i_3_ == i && anIOException4560 != null) throw new IOException(anIOException4560.toString());
            if (size < i + anInt4556) {
                int i_5_ = size - anInt4556;
                Class214.method1577(buffer, anInt4556, is, i_2_, i_5_);
                Class214.method1577(buffer, 0, is, i_2_ - -i_5_, i - i_5_);
            } else Class214.method1577(buffer, anInt4556, is, i_2_, i);
            anInt4556 = (anInt4556 - -i) % size;
            this.notifyAll();
            return i;
        }
    }

    final void method3618(int i) {
        anInt4550++;
        if (i != 0) size = 110;
        stream = new InputStream_Sub1();
    }

    final boolean method3619(int i, boolean bool) throws IOException {
        anInt4551++;
        if (i <= 0 || i >= size) throw new IOException();
        synchronized (this) {
            int i_6_;
            if (anInt4556 > anInt4558) i_6_ = -anInt4556 + size - -anInt4558;
            else i_6_ = anInt4558 - anInt4556;
            if (i > i_6_) {
                if (anIOException4560 != null) throw new IOException(anIOException4560.toString());
                return false;
            }
            return bool == false;
        }
    }

    InputStreamBuffer(InputStream inputstream, int i) {
        size = i - -1;
        stream = inputstream;
        buffer = new byte[size];
        thread = new Thread(this);
        thread.setDaemon(true);
        thread.start();
    }

    static final Class148 method3620(Class318_Sub1_Sub3 class318_sub1_sub3, int i) {
        if (i < 9) anInt4559 = -27;
        anInt4547++;
        Class148 class148;
        if (Class16.aClass148_231 != null) {
            class148 = Class16.aClass148_231;
            Class16.aClass148_231 = Class16.aClass148_231.aClass148_2038;
            class148.aClass148_2038 = null;
            ha_Sub2.anInt7722--;
        } else class148 = new Class148();
        class148.aClass318_Sub1_Sub3_2040 = class318_sub1_sub3;
        return class148;
    }
}
