/* Class226 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class226 {
    static Class356 aClass356_2959 = new Class356(512);
    private final Class60 aClass60_2960 = new Class60(64);
    private final Index aIndex_2961;
    static int anInt2962;
    static int anInt2963;
    static int anInt2964 = 64;
    private Index aIndex_2965;

    public static void method1624(int i) {
        aClass356_2959 = null;
        if (i != 28962) aClass356_2959 = null;
    }

    final Class348_Sub42_Sub11 method1625(int i, int i_0_) {
        anInt2963++;
        Class348_Sub42_Sub11 class348_sub42_sub11 = (Class348_Sub42_Sub11) aClass60_2960.method583(i_0_, -51);
        if (class348_sub42_sub11 != null) return class348_sub42_sub11;
        byte[] is;
        if (i_0_ < 32768) is = aIndex_2961.method410(-1860, 0, i_0_);
        else is = aIndex_2965.method410(-1860, 0, 0x7fff & i_0_);
        class348_sub42_sub11 = new Class348_Sub42_Sub11();
        if (is != null) class348_sub42_sub11.method3221(117, new Class348_Sub49(is));
        if (i_0_ >= 32768) class348_sub42_sub11.method3224((byte) 104);
        if (i != 0) aIndex_2965 = null;
        aClass60_2960.method582(class348_sub42_sub11, i_0_, (byte) -123);
        return class348_sub42_sub11;
    }

    static final void method1626(int i, boolean bool) {
        anInt2962++;
        int i_1_ = Class239_Sub19.anInt6043;
        int i_2_ = Class348_Sub33.anInt6964;
        if (i == 1) {
            if (bool && Class305.aBoolean3870) {
                i_1_ <<= 1;
                i_2_ = -i_1_;
            }
            Class348_Sub8.aHa6654.f(i_2_, i_1_);
        }
    }

    Class226(int i, Index index, Index index_3_) {
        do {
            try {
                aIndex_2961 = index;
                aIndex_2965 = index_3_;
                if (aIndex_2961 != null) aIndex_2961.method407(0, 0);
                if (aIndex_2965 == null) break;
                aIndex_2965.method407(0, 0);
            } catch (RuntimeException runtimeexception) {
                throw Class348_Sub17.method2929(runtimeexception, ("sga.<init>(" + i + ',' + (index != null ? "{...}" : "null") + ',' + (index_3_ != null ? "{...}" : "null") + ')'));
            }
            break;
        } while (false);
    }
}
