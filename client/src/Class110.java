/* Class110 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.awt.*;
import java.lang.reflect.Field;

abstract class Class110 {
    static int anInt1699;
    static short aShort1700 = 256;
    static int anInt1701;
    static Class114 aClass114_1702;
    static int anInt1703;
    int anInt1704;
    static int anInt1705;
    static Sprite aSprite_1706;
    static int anInt1707;
    int anInt1708;
    static int anInt1709;
    static int anInt1710;
    int anInt1711;
    static boolean aBoolean1712 = false;
    /*synthetic*/ static Class aClass1713;
    /*synthetic*/ static Class aClass1714;

    final boolean method1029(boolean bool) {
        anInt1707++;
        if (bool != true) aBoolean1712 = false;
        return (this.anInt1708 & 0x1) != 0;
    }

    public static void method1030(int i) {
        aClass114_1702 = null;
        aSprite_1706 = null;
        if (i > -19) method1034(-89, null, null, -72);
    }

    final boolean method1031(int i) {
        int i_0_ = 101 / ((54 - i) / 47);
        anInt1699++;
        return (0x4 & this.anInt1708) != 0;
    }

    static final int method1032(int i) {
        anInt1701++;
        int i_1_ = 0;
        if (i != -1) method1034(117, null, null, 29);
        Field[] fields = (aClass1713 != null ? aClass1713 : (aClass1713 = Class348_Sub51.class)).getDeclaredFields();
        Field[] fields_2_ = fields;
        for (int i_3_ = 0; fields_2_.length > i_3_; i_3_++) {
            Field field = fields_2_[i_3_];
            if ((aClass1714 != null ? aClass1714 : (aClass1714 = Class239.class)).isAssignableFrom(field.getType())) i_1_++;
        }
        return i_1_ - -1;
    }

    final boolean method1033(int i) {
        anInt1703++;
        int i_4_ = -62 % ((i - -5) / 47);
        return (0x8 & this.anInt1708) != 0;
    }

    static final void method1034(int i, Class348_Sub49 class348_sub49, Class297 class297, int i_5_) {
        try {
            anInt1710++;
            Class348_Sub48 class348_sub48 = new Class348_Sub48();
            class348_sub48.anInt7126 = class348_sub49.readUnsignedByte(255);
            class348_sub48.anInt7130 = class348_sub49.readInt((byte) -126);
            class348_sub48.anIntArray7132 = new int[class348_sub48.anInt7126];
            class348_sub48.aByteArrayArrayArray7128 = new byte[class348_sub48.anInt7126][][];
            class348_sub48.aClass144Array7127 = new Class144[class348_sub48.anInt7126];
            if (i_5_ > 90) {
                class348_sub48.aClass144Array7135 = (new Class144
                        [class348_sub48.anInt7126]);
                class348_sub48.anIntArray7131 = new int[class348_sub48.anInt7126];
                class348_sub48.anIntArray7136 = new int[class348_sub48.anInt7126];
                for (int i_6_ = 0; i_6_ < class348_sub48.anInt7126; i_6_++) {
                    try {
                        int i_7_ = class348_sub49.readUnsignedByte(255);
                        if (i_7_ != 0 && i_7_ != 1 && i_7_ != 2) {
                            if (i_7_ == 3 || i_7_ == 4) {
                                String string = class348_sub49.readString((byte) 89);
                                String string_8_ = class348_sub49.readString((byte) -81);
                                int i_9_ = class348_sub49.readUnsignedByte(255);
                                String[] strings = new String[i_9_];
                                for (int i_10_ = 0; i_9_ > i_10_; i_10_++)
                                    strings[i_10_] = class348_sub49.readString((byte) -23);
                                byte[][] is = new byte[i_9_][];
                                if (i_7_ == 3) {
                                    for (int i_11_ = 0; i_11_ < i_9_; i_11_++) {
                                        int i_12_ = class348_sub49.readInt((byte) -126);
                                        is[i_11_] = new byte[i_12_];
                                        class348_sub49.method3389(2147483647, 0, i_12_, is[i_11_]);
                                    }
                                }
                                class348_sub48.anIntArray7132[i_6_] = i_7_;
                                Class[] var_classes = new Class[i_9_];
                                for (int i_13_ = 0; (i_13_ < i_9_); i_13_++)
                                    var_classes[i_13_] = (Class348_Sub40_Sub1.method3052(11012, strings[i_13_]));
                                class348_sub48.aClass144Array7127[i_6_] = (class297.method2230(var_classes, 76, Class348_Sub40_Sub1.method3052(11012, string), string_8_));
                                class348_sub48.aByteArrayArrayArray7128[i_6_] = is;
                            }
                        } else {
                            String string = class348_sub49.readString((byte) 103);
                            String string_14_ = class348_sub49.readString((byte) 109);
                            int i_15_ = 0;
                            if (i_7_ == 1) i_15_ = class348_sub49.readInt((byte) -126);
                            class348_sub48.anIntArray7132[i_6_] = i_7_;
                            class348_sub48.anIntArray7136[i_6_] = i_15_;
                            class348_sub48.aClass144Array7135[i_6_] = (class297.method2243(0, string_14_, Class348_Sub40_Sub1.method3052(11012, string)));
                        }
                    } catch (ClassNotFoundException classnotfoundexception) {
                        class348_sub48.anIntArray7131[i_6_] = -1;
                    } catch (SecurityException securityexception) {
                        class348_sub48.anIntArray7131[i_6_] = -2;
                    } catch (NullPointerException nullpointerexception) {
                        class348_sub48.anIntArray7131[i_6_] = -3;
                    } catch (Exception exception) {
                        class348_sub48.anIntArray7131[i_6_] = -4;
                    } catch (Throwable throwable) {
                        class348_sub48.anIntArray7131[i_6_] = -5;
                    }
                }
                Class348_Sub35.aClass262_6978.method1999(class348_sub48, -20180);
            }
        } catch (RuntimeException runtimeexception) {
            throw Class348_Sub17.method2929(runtimeexception, ("mr.E(" + i + ',' + (class348_sub49 != null ? "{...}" : "null") + ',' + (class297 != null ? "{...}" : "null") + ',' + i_5_ + ')'));
        }
    }

    static final Class348_Sub31 method1035(int i, int i_16_, Canvas canvas, int i_17_) {
        anInt1705++;
        if (i != 9029) return null;
        try {
            Class348_Sub31 class348_sub31 = new Class348_Sub31_Sub1();
            class348_sub31.method3008(canvas, i_17_, -90, i_16_);
            return class348_sub31;
        } catch (Throwable throwable) {
            Class348_Sub31_Sub2 class348_sub31_sub2 = new Class348_Sub31_Sub2();
            class348_sub31_sub2.method3008(canvas, i_17_, -128, i_16_);
            return class348_sub31_sub2;
        }
    }

    final boolean method1036(byte i) {
        anInt1709++;
        if (i != -35) method1034(11, null, null, -12);
        return (this.anInt1708 & 0x2) != 0;
    }

    public Class110() {
        /* empty */
    }

    static {
        aClass114_1702 = new Class114(24, 6);
    }
}
