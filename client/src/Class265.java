/* Class265 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class265 implements Interface1 {
    private Class120 aClass120_4687;
    private Class105 aClass105_4688;
    static Class74 aClass74_4689 = new Class74(2, 4);
    static int anInt4690;
    static int anInt4691;
    static int[] anIntArray4692;
    static boolean[][] aBooleanArrayArray4693
            = {new boolean[4], new boolean[4], {false, false, true, false},
            {false, false, true, false}, {false, false, true, false},
            {false, false, true, false}, {true, false, true, false},
            {true, false, false, true}, {true, false, false, true},
            new boolean[4], new boolean[4], new boolean[4], new boolean[4]};
    private Class45 aClass45_4694;
    static int anInt4695;
    static int anInt4696;

    public final void method7(int i) {
        aClass105_4688
                = Class369_Sub3_Sub1.method3577((((Class120) aClass120_4687)
                        .anInt4912),
                (byte) 116, aClass45_4694);
        if (i != 10286)
            aBooleanArrayArray4693 = null;
        anInt4695++;
    }

    static final Class50_Sub1 method2022(Class348_Sub49 class348_sub49,
                                         int i) {
        if (i != 0)
            return null;
        anInt4691++;
        return new Class50_Sub1(class348_sub49.method3372(13638),
                class348_sub49.method3372(13638),
                class348_sub49.method3372(i + 13638),
                class348_sub49.method3372(13638),
                class348_sub49.method3351(-1),
                class348_sub49.method3351(-1),
                class348_sub49.method3387(255));
    }

    public final void method9(byte i, boolean bool) {
        anInt4696++;
        if (i != -49)
            method2022(null, 101);
        if (bool) {
            int i_0_ = (Class321.anInt4017 > Class92.anInt1524
                    ? Class321.anInt4017 : Class92.anInt1524);
            int i_1_
                    = (((ha_Sub2.anInt7666 ^ 0xffffffff)
                    > (Class348_Sub42_Sub8_Sub2.anInt10432 ^ 0xffffffff))
                    ? Class348_Sub42_Sub8_Sub2.anInt10432 : ha_Sub2.anInt7666);
            int i_2_ = aClass105_4688.method966();
            int i_3_ = aClass105_4688.method980();
            int i_4_ = 0;
            int i_5_ = i_0_;
            int i_6_ = i_0_ * i_3_ / i_2_;
            int i_7_ = (i_1_ + -i_6_) / 2;
            if (i_1_ < i_6_) {
                i_6_ = i_1_;
                i_5_ = i_1_ * i_2_ / i_3_;
                i_7_ = 0;
                i_4_ = (i_0_ - i_5_) / 2;
            }
            aClass105_4688.method973(i_4_, i_7_, i_5_, i_6_);
        }
    }

    public static void method2023(byte i) {
        if (i > -13)
            aClass74_4689 = null;
        aClass74_4689 = null;
        anIntArray4692 = null;
        aBooleanArrayArray4693 = null;
    }

    Class265(Class45 class45, Class120 class120) {
        try {
            aClass45_4694 = class45;
            aClass120_4687 = class120;
        } catch (RuntimeException runtimeexception) {
            throw Class348_Sub17.method2929(runtimeexception,
                    ("uk.<init>("
                            + (class45 != null ? "{...}"
                            : "null")
                            + ','
                            + (class120 != null ? "{...}"
                            : "null")
                            + ')'));
        }
    }

    public final boolean method8(byte i) {
        int i_8_ = -105 % ((25 - i) / 52);
        anInt4690++;
        return aClass45_4694.method421(false,
                ((Class120) aClass120_4687).anInt4912);
    }
}
