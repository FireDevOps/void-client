/* Class194 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class194 {
    static int anInt2591;
    static int anInt2592;
    static int anInt2593;
    private Class60 aClass60_2594 = new Class60(64);
    static int anInt2595;
    static Class279 aClass279_2596;
    private final Index aIndex_2597;
    static int anInt2598;

    public static void method1441(byte i) {
        aClass279_2596 = null;
        if (i != 18) aClass279_2596 = null;
    }

    final void method1442(int i, byte i_0_) {
        anInt2598++;
        synchronized (aClass60_2594) {
            if (i_0_ != 1) aClass60_2594 = null;
            aClass60_2594.method578(2, i);
        }
    }

    final void method1443(int i) {
        anInt2595++;
        int i_1_ = 14 % ((-39 - i) / 51);
        synchronized (aClass60_2594) {
            aClass60_2594.method587(-80);
        }
    }

    final void method1444(int i, int i_2_) {
        int i_3_ = -6 % ((67 - i_2_) / 47);
        anInt2591++;
        synchronized (aClass60_2594) {
            aClass60_2594.method590(0);
            aClass60_2594 = new Class60(i);
        }
    }

    final void method1445(int i) {
        anInt2592++;
        if (i == 64) {
            synchronized (aClass60_2594) {
                aClass60_2594.method590(0);
            }
        }
    }

    final Class146 method1446(int i, int i_4_) {
        anInt2593++;
        Class146 class146;
        synchronized (aClass60_2594) {
            class146 = (Class146) aClass60_2594.method583(i, 76);
        }
        if (class146 != null) return class146;
        byte[] is;
        synchronized (aIndex_2597) {
            is = aIndex_2597.method410(i_4_ ^ 0x743, Class179.method1359(true, i), Class348_Sub14.method2806(false, i));
        }
        class146 = new Class146();
        if (i_4_ != -1) return null;
        if (is != null) class146.method1191(i_4_ ^ ~0x800, new Class348_Sub49(is));
        synchronized (aClass60_2594) {
            aClass60_2594.method582(class146, i, (byte) -105);
        }
        return class146;
    }

    Class194(Class230 class230, int i, Index index) {
        do {
            try {
                aIndex_2597 = index;
                if (aIndex_2597 == null) break;
                int i_5_ = aIndex_2597.method414(-1) + -1;
                aIndex_2597.method407(0, i_5_);
            } catch (RuntimeException runtimeexception) {
                throw Class348_Sub17.method2929(runtimeexception, ("qs.<init>(" + (class230 != null ? "{...}" : "null") + ',' + i + ',' + (index != null ? "{...}" : "null") + ')'));
            }
            break;
        } while (false);
    }
}
