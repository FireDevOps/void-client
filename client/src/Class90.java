/* Class90 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class90 {
    static Class273 aClass273_1512 = new Class273("", 15);
    static int anInt1513;
    static int anInt1514;
    static int anInt1515;
    static long aLong1516;
    static int anInt1517;
    static int[] anIntArray1518 = new int[14];

    public static void method852(int i) {
        aClass273_1512 = null;
        if (i != 6)
            aLong1516 = 20L;
        anIntArray1518 = null;
    }

    static final void method853(byte i) {
        anInt1515++;
        int i_0_ = Class299.aClass348_Sub49_Sub2_3813.method3387(255);
        int i_1_ = Class299.aClass348_Sub49_Sub2_3813.readLEShort128(-121);
        boolean bool
                = Class299.aClass348_Sub49_Sub2_3813.method3387(i + 156) == 1;
        int i_2_ = Class299.aClass348_Sub49_Sub2_3813.method3355(i + -172);
        Class312.anInt3931
                = Class299.aClass348_Sub49_Sub2_3813.method3393((byte) -112);
        Class322.method2554((byte) -45);
        Class348_Sub40_Sub22.method3111(125, i_0_);
        Class299.aClass348_Sub49_Sub2_3813.method3417(-122);
        for (int i_3_ = 0; (i_3_ ^ 0xffffffff) > -5; i_3_++) {
            for (int i_4_ = 0;
                 ((i_4_ ^ 0xffffffff)
                         > (Class367_Sub4.anInt7319 >> 615048547 ^ 0xffffffff));
                 i_4_++) {
                for (int i_5_ = 0;
                     ((Class348_Sub40_Sub3.anInt9109 >> -410724637
                             ^ 0xffffffff)
                             < (i_5_ ^ 0xffffffff));
                     i_5_++) {
                    int i_6_ = Class299.aClass348_Sub49_Sub2_3813
                            .method3410((byte) -24, 1);
                    if ((i_6_ ^ 0xffffffff) != -2)
                        Class62.anIntArrayArrayArray1116[i_3_][i_4_][i_5_]
                                = -1;
                    else
                        Class62.anIntArrayArrayArray1116[i_3_][i_4_][i_5_]
                                = Class299.aClass348_Sub49_Sub2_3813
                                .method3410((byte) -24, 26);
                }
            }
        }
        Class299.aClass348_Sub49_Sub2_3813.method3412(false);
        int i_7_
                = (-((Class348_Sub49) Class299.aClass348_Sub49_Sub2_3813).anInt7197
                + Class348_Sub40_Sub25.anInt9341) / 16;
        Class239_Sub6.anIntArrayArray5894 = new int[i_7_][4];
        int i_8_ = 0;
        if (i != 99)
            method852(-55);
        for (/**/; (i_7_ ^ 0xffffffff) < (i_8_ ^ 0xffffffff); i_8_++) {
            for (int i_9_ = 0; i_9_ < 4; i_9_++)
                Class239_Sub6.anIntArrayArray5894[i_8_][i_9_]
                        = Class299.aClass348_Sub49_Sub2_3813
                        .method3385((byte) -126);
        }
        Class322.anIntArray4031 = null;
        Applet_Sub1.anIntArray38 = new int[i_7_];
        r.anIntArray9724 = new int[i_7_];
        aa_Sub1.anIntArray5192 = new int[i_7_];
        Class348_Sub23_Sub3.anIntArray9042 = new int[i_7_];
        Class295.anIntArray3759 = new int[i_7_];
        Class348_Sub50.aByteArrayArray7212 = null;
        Class348_Sub23_Sub1.aByteArrayArray8996 = new byte[i_7_][];
        Class129.aByteArrayArray1887 = new byte[i_7_][];
        Class14_Sub4.aByteArrayArray8642 = new byte[i_7_][];
        Class347.aByteArrayArray4281 = new byte[i_7_][];
        i_7_ = 0;
        for (int i_10_ = 0; (i_10_ ^ 0xffffffff) > -5; i_10_++) {
            for (int i_11_ = 0;
                 ((i_11_ ^ 0xffffffff)
                         > (Class367_Sub4.anInt7319 >> -1281045661 ^ 0xffffffff));
                 i_11_++) {
                for (int i_12_ = 0;
                     i_12_ < Class348_Sub40_Sub3.anInt9109 >> -192444093;
                     i_12_++) {
                    int i_13_ = (Class62.anIntArrayArrayArray1116[i_10_][i_11_]
                            [i_12_]);
                    if (i_13_ != -1) {
                        int i_14_ = i_13_ >> -1268148658 & 0x3ff;
                        int i_15_ = (i_13_ & 0x3ff9) >> -1151168317;
                        int i_16_ = i_15_ / 8 + (i_14_ / 8 << -498087576);
                        for (int i_17_ = 0;
                             (i_17_ ^ 0xffffffff) > (i_7_ ^ 0xffffffff);
                             i_17_++) {
                            if ((Class348_Sub23_Sub3.anIntArray9042[i_17_]
                                    ^ 0xffffffff)
                                    == (i_16_ ^ 0xffffffff)) {
                                i_16_ = -1;
                                break;
                            }
                        }
                        if ((i_16_ ^ 0xffffffff) != 0) {
                            Class348_Sub23_Sub3.anIntArray9042[i_7_] = i_16_;
                            int i_18_ = 0xff & i_16_ >> 1924313768;
                            int i_19_ = 0xff & i_16_;
                            aa_Sub1.anIntArray5192[i_7_]
                                    = (Class367_Sub10.aClass45_7382.method417
                                    ("m" + i_18_ + "_" + i_19_,
                                            Class348_Sub21.method2955(i, 99)));
                            Applet_Sub1.anIntArray38[i_7_]
                                    = Class367_Sub10.aClass45_7382
                                    .method417("l" + i_18_ + "_" + i_19_, 0);
                            Class295.anIntArray3759[i_7_]
                                    = (Class367_Sub10.aClass45_7382.method417
                                    ("um" + i_18_ + "_" + i_19_, 0));
                            r.anIntArray9724[i_7_]
                                    = (Class367_Sub10.aClass45_7382.method417
                                    ("ul" + i_18_ + "_" + i_19_, 0));
                            i_7_++;
                        }
                    }
                }
            }
        }
        Class348_Sub41.method3157(i_1_, (byte) 124, i_2_, 11, bool);
    }

    public Class90() {
        /* empty */
    }

    static final void method854(byte i) {
        anInt1513++;
        if (Class225.anInt2955 == 5 && i < -48)
            Class225.anInt2955 = 6;
    }
}
