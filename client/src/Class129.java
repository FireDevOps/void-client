/* Class129 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class129 {
    static int anInt1873;
    int anInt1874;
    byte aByte1875;
    int anInt1876;
    int anInt1877;
    static Index SOUND_EFFECTS;
    static int anInt1879;
    int anInt1880;
    int anInt1881;
    int anInt1882;
    int anInt1883;
    int anInt1884;
    static int[] anIntArray1885 = new int[32];
    private final int anInt1886;
    static byte[][] aByteArrayArray1887;
    Class129 aClass129_1888;
    int anInt1889;
    int anInt1890;
    int anInt1891;
    int anInt1892;
    static int anInt1893;

    final Class129 method1124(int i, int i_0_, int i_1_, int i_2_) {
        anInt1893++;
        if (i_0_ != -1) return null;
        return new Class129(anInt1886, i_2_, i, i_1_, this.aByte1875);
    }

    final Class181 method1125(byte i) {
        anInt1873++;
        if (i != 59) this.anInt1880 = -51;
        return Class373.method3591(anInt1886, i ^ 0x3b);
    }

    public static void method1126(int i) {
        if (i == 32) {
            SOUND_EFFECTS = null;
            aByteArrayArray1887 = null;
            anIntArray1885 = null;
        }
    }

    Class129(int i, int i_3_, int i_4_, int i_5_, byte i_6_) {
        anInt1886 = i;
        this.aByte1875 = i_6_;
        this.anInt1881 = i_3_;
        this.anInt1892 = i_5_;
        this.anInt1877 = i_4_;
    }

    static {
        int i = 2;
        for (int i_7_ = 0; i_7_ < 32; i_7_++) {
            anIntArray1885[i_7_] = -1 + i;
            i += i;
        }
    }
}
