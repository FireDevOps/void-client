/* Class239_Sub8 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class239_Sub8 extends Class239 {
    static int anInt5911;
    static int anInt5912;
    static int anInt5913;
    static int anInt5914;
    static int anInt5915;
    static int anInt5916;
    static int anInt5917;
    static int anInt5918;
    static int anInt5919;
    static int anInt5920;
    static int[][] anIntArrayArray5921;
    static int anInt5922;
    static int anInt5923;
    static int anInt5924;

    static final int method1749(Class110_Sub1 class110_sub1, Class110_Sub1 class110_sub1_0_, boolean bool, int i, byte i_1_) {
        try {
            anInt5916++;
            if (i == 1) {
                int i_2_ = class110_sub1.anInt1704;
                int i_3_ = class110_sub1_0_.anInt1704;
                if (!bool) {
                    if (i_2_ == -1) i_2_ = 2001;
                    if (i_3_ == -1) i_3_ = 2001;
                }
                return -i_3_ + i_2_;
            }
            if (i == 2) return (Class239_Sub21.method1811(9152, (class110_sub1_0_.method1038(false).aString3663), Class348_Sub33.anInt6967, (class110_sub1.method1038(false).aString3663)));
            if (i == 3) {
                if (class110_sub1.aString5787.equals("-")) {
                    if (class110_sub1_0_.aString5787.equals("-")) return 0;
                    if (bool) return -1;
                    return 1;
                } else if (class110_sub1_0_.aString5787.equals("-")) {
                    if (!bool) return -1;
                    return 1;
                }
                return (Class239_Sub21.method1811(9152, class110_sub1_0_.aString5787, Class348_Sub33.anInt6967, class110_sub1.aString5787));
            }
            if (i == 4) {
                if (!class110_sub1.method1033(-85)) {
                    if (!class110_sub1_0_.method1033(101)) return 0;
                    return -1;
                }
                if (class110_sub1_0_.method1033(70)) return 0;
                return 1;
            }
            if (i == 5) {
                if (class110_sub1.method1036((byte) -35)) {
                    if (!class110_sub1_0_.method1036((byte) -35)) return 1;
                    return 0;
                }
                if (!class110_sub1_0_.method1036((byte) -35)) return 0;
                return -1;
            }
            if (i == 6) {
                if (class110_sub1.method1031(i_1_ ^ ~0x61)) {
                    if (class110_sub1_0_.method1031(-105)) return 0;
                    return 1;
                }
                if (class110_sub1_0_.method1031(i_1_ ^ ~0x60)) return -1;
                return 0;
            }
            if (i_1_ != -30) return 63;
            if (i == 7) {
                if (class110_sub1.method1029(true)) {
                    if (!class110_sub1_0_.method1029(true)) return 1;
                    return 0;
                }
                if (class110_sub1_0_.method1029(true)) return -1;
                return 0;
            }
            if (i == 8) {
                int i_4_ = class110_sub1.anInt5788;
                int i_5_ = class110_sub1_0_.anInt5788;
                if (bool) {
                    if (i_5_ == 1000) i_5_ = -1;
                    if (i_4_ == 1000) i_4_ = -1;
                } else {
                    if (i_5_ == -1) i_5_ = 1000;
                    if (i_4_ == -1) i_4_ = 1000;
                }
                return -i_5_ + i_4_;
            }
            return (class110_sub1.anInt5786 + -class110_sub1_0_.anInt5786);
        } catch (RuntimeException runtimeexception) {
            throw Class348_Sub17.method2929(runtimeexception, ("mfa.L(" + (class110_sub1 != null ? "{...}" : "null") + ',' + (class110_sub1_0_ != null ? "{...}" : "null") + ',' + bool + ',' + i + ',' + i_1_ + ')'));
        }
    }

    final int method1710(int i) {
        if (i != 20014) method1749(null, null, false, 94, (byte) -39);
        anInt5914++;
        if (this.aClass348_Sub51_3136.method3428((byte) -80).method1456((byte) 111)) return 3;
        return 2;
    }

    static final void method1750(int i, int i_6_) {
        anInt5912++;
        Class348_Sub42_Sub1.anInt9488 = i_6_;
        Class202.aClass60_2671.method590(0);
    }

    final int method1751(int i) {
        anInt5917++;
        if (i != -32350) anInt5911 = 114;
        return this.anInt3138;
    }

    Class239_Sub8(Class348_Sub51 class348_sub51) {
        super(class348_sub51);
    }

    Class239_Sub8(int i, Class348_Sub51 class348_sub51) {
        super(i, class348_sub51);
    }

    final void method1712(int i, int i_7_) {
        int i_8_ = -87 / ((i - 82) / 35);
        anInt5915++;
        this.anInt3138 = i_7_;
    }

    final int method1714(int i, int i_9_) {
        if (i != 3) anInt5911 = 95;
        anInt5923++;
        return 1;
    }

    static final void method1752(int i, int i_10_, int i_11_) {
        Class59_Sub1.anInt5283 = i_11_;
        anInt5922++;
        Class107.anInt1651 = i_10_;
        if (i == -1) {
            if (Class348_Sub49.anInt7207 == 0) {
                Class239_Sub16.anInt6008 = (2 * Class348_Sub42_Sub9_Sub1.anInt10444 + Class107.anInt1651);
                Class348_Sub16_Sub1.anInt8854 = Class211.anInt2747 * 2 + Class59_Sub1.anInt5283;
            } else if (Class348_Sub49.anInt7207 == 1) {
                Class31.anInt425 = (Class239_Sub12.anInt5965 + Class59_Sub1.anInt5283 / Class58.anInt1067 - -2);
                Class250.anInt3225 = (Class73.anInt4784 + Class107.anInt1651 / Class344.anInt4267 - -2);
                Class348_Sub16_Sub1.anInt8854 = Class58.anInt1067 * Class31.anInt425;
                Class239_Sub16.anInt6008 = Class344.anInt4267 * Class250.anInt3225;
                Class211.anInt2747 = (-Class59_Sub1.anInt5283 + Class348_Sub16_Sub1.anInt8854 >> 1);
                Class348_Sub42_Sub9_Sub1.anInt10444 = (Class239_Sub16.anInt6008 - Class107.anInt1651 >> 1);
            } else if (Class348_Sub49.anInt7207 == 2) {
                Class348_Sub16_Sub1.anInt8854 = Class59_Sub1.anInt5283;
                Class239_Sub16.anInt6008 = Class107.anInt1651;
            }
        }
    }

    static final String method1753(int i, Class46 class46) {
        anInt5924++;
        if (client.method105(class46).method3307(116) == 0) return null;
        if (class46.aString780 == null || class46.aString780.trim().length() == 0) {
            if (Class299_Sub2.aBoolean6327) return "Hidden-use";
            return null;
        }
        if (i != 0) return null;
        return class46.aString780;
    }

    final void method1716(boolean bool) {
        anInt5913++;
        if (this.anInt3138 < 1 || this.anInt3138 > 3) this.anInt3138 = method1710(20014);
        if (bool != false) anIntArrayArray5921 = null;
    }

    static final int method1754(boolean bool, int i, int i_12_, int i_13_) {
        anInt5920++;
        if (Class348.anInt4290 < 100) return -2;
        if (bool != true) method1754(false, 115, 112, -104);
        int i_14_ = -2;
        int i_15_ = 2147483647;
        int i_16_ = i_12_ - Class75.anInt1266;
        int i_17_ = i_13_ - Class75.anInt1263;
        for (Class348_Sub21 class348_sub21 = (Class348_Sub21) Class75.aClass262_1254.method1995(4); class348_sub21 != null; class348_sub21 = (Class348_Sub21) Class75.aClass262_1254.method1990((byte) 113)) {
            if (class348_sub21.anInt6847 == i) {
                int i_18_ = class348_sub21.anInt6852;
                int i_19_ = class348_sub21.anInt6851;
                int i_20_ = (i_19_ - -Class75.anInt1263 | Class75.anInt1266 + i_18_ << 14);
                int i_21_ = ((-i_19_ + i_17_) * (-i_19_ + i_17_) + (i_16_ - i_18_) * (-i_18_ + i_16_));
                if (i_14_ < 0 || i_15_ > i_21_) {
                    i_15_ = i_21_;
                    i_14_ = i_20_;
                }
            }
        }
        return i_14_;
    }

    public static void method1755(int i) {
        anIntArrayArray5921 = null;
        if (i != 1) method1749(null, null, false, -43, (byte) 102);
    }

    static final int calculateKerning(byte[] fontData, int i, int rightGlyphIndex, int leftGlyphIndex, byte[][] rightGlyphData, byte[][] leftGlyphData, int[] leftOffsets, int[] rightOffsets) {
        try {
            anInt5918++;
            int i_28_ = -19 % ((i - 64) / 39);
            int leftOffset = leftOffsets[leftGlyphIndex];
            int leftLimit = rightOffsets[leftGlyphIndex] + leftOffset;

            int rightOffset = leftOffsets[rightGlyphIndex];
            int rightLimit = rightOffsets[rightGlyphIndex] + rightOffset;

            int minOffset = Math.max(leftOffset, rightOffset);
            int maxLimit = Math.min(rightLimit, leftLimit);

            int minDelta = 0xff & fontData[leftGlyphIndex];
            if (minDelta > (fontData[rightGlyphIndex] & 0xff)) minDelta = 0xff & fontData[rightGlyphIndex];

            byte[] leftGlyph = leftGlyphData[leftGlyphIndex];
            byte[] rightGlyph = rightGlyphData[rightGlyphIndex];
            int leftIndex = leftOffset - minOffset;
            int rightIndex = rightOffset - minOffset;
            for (int index = minOffset; maxLimit > index; index++) {
                int delta = rightGlyph[rightIndex++] + leftGlyph[leftIndex++];
                if (delta < minDelta) minDelta = delta;
            }
            return -minDelta;
        } catch (RuntimeException runtimeexception) {
            throw Class348_Sub17.method2929(runtimeexception, ("mfa.K(" + (fontData != null ? "{...}" : "null") + ',' + i + ',' + rightGlyphIndex + ',' + leftGlyphIndex + ',' + (rightGlyphData != null ? "{...}" : "null") + ',' + (leftGlyphData != null ? "{...}" : "null") + ',' + (leftOffsets != null ? "{...}" : "null") + ',' + (rightOffsets != null ? "{...}" : "null") + ')'));
        }
    }
}
