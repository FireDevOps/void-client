/* Class287 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.util.zip.CRC32;

final class Class287 {
    static int anInt3685;
    static int anInt3686;
    int anInt3687;
    Interface12[] anInterface12Array3688;
    static int anInt3689;
    int anInt3690;
    static CRC32 aCRC32_3691 = new CRC32();
    static int anInt3692;
    static int anInt3693;
    static int anInt3694;
    static int anInt3695 = 0;

    static final void method2178(Class318_Sub1 class318_sub1, int i, Class17 class17, int i_0_) {
        try {
            anInt3694++;
            if (Class147.anInt2021 < 50 && (class17 != null && class17.anIntArrayArray264 != null && (class17.anIntArrayArray264.length > i) && class17.anIntArrayArray264[i] != null)) {
                int i_1_ = class17.anIntArrayArray264[i][0];
                int i_2_ = i_1_ >> 8;
                int i_3_ = (i_1_ & 0xf1) >> 5;
                if (i_0_ > -13) anInt3695 = 0;
                if (class17.anIntArrayArray264[i].length > 1) {
                    int i_4_ = (int) ((double) (class17.anIntArrayArray264[i]).length * Math.random());
                    if (i_4_ > 0) i_2_ = class17.anIntArrayArray264[i][i_4_];
                }
                int i_5_ = i_1_ & 0x1f;
                int i_6_ = 256;
                if (class17.anIntArray236 != null && class17.anIntArray265 != null) i_6_ = ((int) (Math.random() * (double) (-(class17.anIntArray236[i]) + (class17.anIntArray265[i]))) + class17.anIntArray236[i]);
                int i_7_ = (class17.anIntArray253 == null ? 255 : class17.anIntArray253[i]);
                if (i_5_ == 0) {
                    if (Class132.aPlayer_1907 == class318_sub1) {
                        if (!class17.aBoolean268) Class348_Sub20.method2947(true, i_7_, i_2_, i_3_, 0, i_6_);
                        else Class279.method2090(i_3_, i_6_, false, (byte) -35, i_7_, 0, i_2_);
                    }
                } else if (Class316.aClass348_Sub51_3959.aClass239_Sub26_7234.method1838(-32350) != 0) {
                    int i_8_ = (class318_sub1.x + -256 >> 9);
                    int i_9_ = (class318_sub1.y - 256 >> 9);
                    int i_10_ = ((Class132.aPlayer_1907 != class318_sub1) ? ((class318_sub1.plane << 24) + ((i_8_ << 16) + (i_9_ << 8)) + i_5_) : 0);
                    Class258_Sub2.aClass10Array8531[Class147.anInt2021++] = new Class10((class17.aBoolean268 ? (byte) 2 : (byte) 1), i_2_, i_3_, 0, i_7_, i_10_, i_6_, class318_sub1);
                }
            }
        } catch (RuntimeException runtimeexception) {
            throw Class348_Sub17.method2929(runtimeexception, ("vp.A(" + (class318_sub1 != null ? "{...}" : "null") + ',' + i + ',' + (class17 != null ? "{...}" : "null") + ',' + i_0_ + ')'));
        }
    }

    static final long method2179(String string, byte i) {
        anInt3689++;
        int i_11_ = string.length();
        long l = 0L;
        if (i <= 98) method2184('\uffed', -66);
        for (int i_12_ = 0; i_12_ < i_11_; i_12_++)
            l = (l << 5) + -l + (long) string.charAt(i_12_);
        return l;
    }

    public static void method2180(byte i) {
        aCRC32_3691 = null;
        if (i > -70) anInt3695 = 92;
    }

    static final void method2181(long l, int i, int i_13_, int i_14_, int i_15_, Class46 class46, int i_16_, int i_17_, aa var_aa) {
        try {
            anInt3686++;
            int i_18_ = i_14_ * i_14_ + i_16_ * i_16_;
            if (l >= (long) i_18_) {
                if (i_13_ > -49) method2178(null, -119, null, 58);
                int i_19_ = Math.min(class46.anInt709 / 2, class46.anInt789 / 2);
                if (i_18_ > i_19_ * i_19_) {
                    i_19_ -= 10;
                    int i_20_;
                    if (Class348_Sub40_Sub21.anInt9282 == 4) i_20_ = (int) Class314.aFloat3938 & 0x3fff;
                    else i_20_ = 0x3fff & ((int) Class314.aFloat3938 + r_Sub2.anInt10483);
                    int i_21_ = Class70.anIntArray1207[i_20_];
                    int i_22_ = Class70.anIntArray1204[i_20_];
                    if (Class348_Sub40_Sub21.anInt9282 != 4) {
                        i_22_ = i_22_ * 256 / (Class348_Sub49_Sub1.anInt9750 - -256);
                        i_21_ = 256 * i_21_ / (Class348_Sub49_Sub1.anInt9750 - -256);
                    }
                    int i_23_ = i_22_ * i_16_ + i_21_ * i_14_ >> 14;
                    int i_24_ = i_22_ * i_14_ + -(i_21_ * i_16_) >> 14;
                    double d = Math.atan2(i_23_, i_24_);
                    int i_25_ = (int) ((double) i_19_ * Math.sin(d));
                    int i_26_ = (int) (Math.cos(d) * (double) i_19_);
                    Class200.aSpriteArray2640[i_17_].method981(((float) class46.anInt709 / 2.0F + (float) i_15_ + (float) i_25_), ((float) i + (float) class46.anInt789 / 2.0F - (float) i_26_), 4096, (int) (65535.0 * (-d / 6.283185307179586)));
                } else Class151.method1211(i, Class59_Sub1.aSpriteArray5294[i_17_], i_15_, class46, var_aa, i_14_, 2, i_16_);
            }
        } catch (RuntimeException runtimeexception) {
            throw Class348_Sub17.method2929(runtimeexception, ("vp.D(" + l + ',' + i + ',' + i_13_ + ',' + i_14_ + ',' + i_15_ + ',' + (class46 != null ? "{...}" : "null") + ',' + i_16_ + ',' + i_17_ + ',' + (var_aa != null ? "{...}" : "null") + ')'));
        }
    }

    public Class287() {
        /* empty */
    }

    private final Interface12 method2182(boolean bool, Class223 class223, Class348_Sub49 class348_sub49) {
        try {
            anInt3692++;
            if (Class219.aClass223_2868 == class223) return Class170.method1312((byte) 64, class348_sub49);
            if (Class348_Sub49.aClass223_7175 == class223) return Sprite_Sub1.method987(743571200, class348_sub49);
            if (Class101_Sub1.aClass223_5689 == class223) return Class303.method2287(class348_sub49, (byte) -112);
            if (class223 == Class28.aClass223_4997) return Class337.method2660((byte) 26, class348_sub49);
            if (bool != true) method2180((byte) -104);
            if (class223 == Class348_Sub40_Sub21.aClass223_9274) return Class288_Sub1.method2189(class348_sub49, 86);
            if (class223 == Class313.aClass223_3934) return Class5.method179(16533, class348_sub49);
            if (Class185.aClass223_2489 == class223) return Class348_Sub46.method3322(0, class348_sub49);
            if (class223 == Class174.aClass223_2307) return Class50_Sub4.method472(-27794, class348_sub49);
            if (Class149.aClass223_2045 == class223) return Class328_Sub2.method2612(class348_sub49, true);
            if (Class187.aClass223_2507 == class223) return Class285_Sub1.method2128(-1730, class348_sub49);
            return null;
        } catch (RuntimeException runtimeexception) {
            throw Class348_Sub17.method2929(runtimeexception, ("vp.F(" + bool + ',' + (class223 != null ? "{...}" : "null") + ',' + (class348_sub49 != null ? "{...}" : "null") + ')'));
        }
    }

    final void method2183(Class348_Sub49 class348_sub49, int i) {
        this.anInt3690 = class348_sub49.readMedium(-1);
        anInt3693++;
        this.anInt3687 = class348_sub49.readUnsignedShort(842397944);
        this.anInterface12Array3688 = new Interface12[class348_sub49.readUnsignedByte(i ^ 0x557d)];
        Class223[] class223s = Class19.method285(-99);
        int i_27_ = 0;
        if (i != 21890) method2180((byte) 25);
        for (/**/; this.anInterface12Array3688.length > i_27_; i_27_++)
            this.anInterface12Array3688[i_27_] = method2182(true, class223s[(class348_sub49.readUnsignedByte(Class348_Sub21.method2955(i, 21885)))], class348_sub49);
    }

    static final char method2184(char c, int i) {
        anInt3685++;
        if (i != -10072) anInt3695 = -123;
        int i_28_ = c;
        while_97_:
        do {
            while_96_:
            do {
                while_95_:
                do {
                    while_94_:
                    do {
                        while_93_:
                        do {
                            while_92_:
                            do {
                                while_91_:
                                do {
                                    while_90_:
                                    do {
                                        while_89_:
                                        do {
                                            do {
                                                if (i_28_ != 32 && (i_28_ != 160) && (i_28_ != 95) && i_28_ != 45) {
                                                    if ((i_28_ != 91) && (i_28_ != 93) && i_28_ != 35) {
                                                        if ((i_28_ != 224) && (i_28_ != 225) && i_28_ != 226 && (i_28_ != 228) && i_28_ != 227 && i_28_ != 192 && (i_28_ != 193) && (i_28_ != 194) && (i_28_ != 196) && i_28_ != 195) {
                                                            if (i_28_ != 232 && i_28_ != 233 && (i_28_ != 234) && (i_28_ != 235) && i_28_ != 200 && i_28_ != 201 && i_28_ != 202 && (i_28_ != 203)) {
                                                                if ((i_28_ != 237) && (i_28_ != 238) && (i_28_ != 239) && (i_28_ != 205) && (i_28_ != 206) && (i_28_ != 207)) {
                                                                    if ((i_28_ != 242) && (i_28_ != 243) && (i_28_ != 244) && (i_28_ != 246) && (i_28_ != 245) && (i_28_ != 210) && (i_28_ != 211) && (i_28_ != 212) && (i_28_ != 214) && (i_28_ != 213)) {
                                                                        if (i_28_ != 249 && i_28_ != 250 && i_28_ != 251 && i_28_ != 252 && i_28_ != 217 && i_28_ != 218 && i_28_ != 219 && i_28_ != 220) {
                                                                            if (i_28_ != 231 && i_28_ != 199) {
                                                                                if (i_28_ != 255 && i_28_ != 376) {
                                                                                    if (i_28_ != 241 && i_28_ != 209) {
                                                                                        if (i_28_ == 223) break while_96_;
                                                                                        break while_97_;
                                                                                    }
                                                                                } else break while_94_;
                                                                                break while_95_;
                                                                            }
                                                                        } else break while_92_;
                                                                        break while_93_;
                                                                    }
                                                                } else break while_90_;
                                                                break while_91_;
                                                            }
                                                        } else break;
                                                        break while_89_;
                                                    }
                                                } else return '_';
                                                return c;
                                            } while (false);
                                            return 'a';
                                        } while (false);
                                        return 'e';
                                    } while (false);
                                    return 'i';
                                } while (false);
                                return 'o';
                            } while (false);
                            return 'u';
                        } while (false);
                        return 'c';
                    } while (false);
                    return 'y';
                } while (false);
                return 'n';
            } while (false);
            return 'b';
        } while (false);
        return Character.toLowerCase(c);
    }
}
