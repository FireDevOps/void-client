/* Class255 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class255 {
    static Class114 aClass114_3265;
    static int anInt3266;
    private final Class45 aClass45_3267;
    Class45 aClass45_3268;
    private boolean aBoolean3269;
    static int anInt3270;
    int anInt3271;
    static int anInt3272;
    static int[] anIntArray3273 = new int[5];
    static int anInt3274;
    static int anInt3275;
    static int anInt3276;
    static int anInt3277;
    private final Class60 aClass60_3278 = new Class60(64);
    static int anInt3279;
    static int anInt3280;
    static int anInt3281;
    static int anInt3282;
    static int anInt3283;
    static int anInt3284;
    static Class161 gameLobby;
    int anInt3286;
    Class60 aClass60_3287 = new Class60(50);
    Class175 aClass175_3288 = new Class175(250);
    private Class126 aClass126_3289 = new Class126();
    private final String[] aStringArray3290;
    int anInt3291;
    private Class326 aClass326_3292;
    private final String[] aStringArray3293;

    static final Class74[] method1929(byte i) {
        if (i != -19) method1933(null, null, false);
        anInt3280++;
        return (new Class74[]{Class348_Sub42_Sub8_Sub2.aClass74_10437, Class348_Sub26.aClass74_6891, Class265.aClass74_4689, Class374.aClass74_4537, Class327.aClass74_4098, Class162.aClass74_2157, Class59_Sub1_Sub2.aClass74_8662, Class39.aClass74_515, Class348_Sub35.aClass74_6977, Class286_Sub1.aClass74_6201, Class91.aClass74_1519, Class348_Sub16_Sub1.aClass74_8853, Class348_Sub40_Sub38.aClass74_9475, Class186.aClass74_2491});
    }

    final void method1930(int i) {
        synchronized (this.aClass60_3287) {
            this.aClass60_3287.method590(0);
            if (i != -21804) method1930(-35);
        }
        anInt3275++;
    }

    public static void method1931(boolean bool) {
        anIntArray3273 = null;
        if (bool != true) aClass114_3265 = null;
        aClass114_3265 = null;
        gameLobby = null;
    }

    final Class105 method1932(ha var_ha, int i, int i_0_, Class324 class324, Class154 class154, int i_1_, boolean bool, byte i_2_, ha var_ha_3_, int i_4_, boolean bool_5_, int i_6_) {
        try {
            anInt3266++;
            Class105 class105 = method1941(i_6_, (byte) -74, i_4_, i_0_, i, i_1_, var_ha_3_, class154);
            if (class105 != null) return class105;
            Class213 class213 = method1940(90, i_4_);
            if (i_0_ > 1 && class213.anIntArray2762 != null) {
                int i_7_ = -1;
                for (int i_8_ = 0; i_8_ < 10; i_8_++) {
                    if ((class213.anIntArray2831[i_8_] <= i_0_) && class213.anIntArray2831[i_8_] != 0) i_7_ = class213.anIntArray2762[i_8_];
                }
                if (i_7_ != -1) class213 = method1940(127, i_7_);
            }
            if (i_2_ != 83) method1935(-83, -37, null, null, false, -49);
            int[] is = class213.method1562(i_0_, bool_5_, i, var_ha_3_, var_ha, class324, class154, i_1_, (byte) -102, i_6_);
            if (is == null) return null;
            Class105 class105_9_;
            if (bool) class105_9_ = var_ha.method3662(36, is, (byte) 94, 0, 36, 32);
            else class105_9_ = var_ha_3_.method3662(36, is, (byte) 94, 0, 36, 32);
            if (!bool) {
                Class126 class126 = new Class126();
                class126.anInt4982 = i;
                class126.aBoolean4990 = class154 != null;
                class126.anInt4989 = i_0_;
                class126.anInt4992 = i_4_;
                class126.anInt4981 = i_1_;
                class126.anInt4991 = var_ha_3_.anInt4567;
                class126.anInt4993 = i_6_;
                this.aClass175_3288.method1348(70, class105_9_, class126);
            }
            return class105_9_;
        } catch (RuntimeException runtimeexception) {
            throw Class348_Sub17.method2929(runtimeexception, ("ub.C(" + (var_ha != null ? "{...}" : "null") + ',' + i + ',' + i_0_ + ',' + (class324 != null ? "{...}" : "null") + ',' + (class154 != null ? "{...}" : "null") + ',' + i_1_ + ',' + bool + ',' + i_2_ + ',' + (var_ha_3_ != null ? "{...}" : "null") + ',' + i_4_ + ',' + bool_5_ + ',' + i_6_ + ')'));
        }
    }

    static final void method1933(Class45 class45, ha var_ha, boolean bool) {
        try {
            anInt3279++;
            Class207[] class207s = Class207.method1519(class45, Class348_Sub22.anInt6862, 0);
            Class169.aClass105Array2260 = new Class105[class207s.length];
            for (int i = 0; class207s.length > i; i++)
                Class169.aClass105Array2260[i] = var_ha.method3691(class207s[i], true);
            class207s = Class207.method1519(class45, Class106.anInt1639, 0);
            Class348_Sub45.aClass105Array7107 = new Class105[class207s.length];
            for (int i = 0; class207s.length > i; i++)
                Class348_Sub45.aClass105Array7107[i] = var_ha.method3691(class207s[i], true);
            class207s = Class207.method1519(class45, Class373_Sub2.anInt7429, 0);
            Class239_Sub2.aClass105Array5857 = new Class105[class207s.length];
            for (int i = 0; class207s.length > i; i++)
                Class239_Sub2.aClass105Array5857[i] = var_ha.method3691(class207s[i], true);
            class207s = Class207.method1519(class45, ha.anInt4562, 0);
            Class318_Sub1_Sub1_Sub1.aClass105Array9959 = new Class105[class207s.length];
            for (int i = 0; class207s.length > i; i++)
                Class318_Sub1_Sub1_Sub1.aClass105Array9959[i] = var_ha.method3691(class207s[i], true);
            class207s = Class207.method1519(class45, Class82.anInt1435, 0);
            Class264.aClass105Array3378 = new Class105[class207s.length];
            for (int i = 0; class207s.length > i; i++)
                Class264.aClass105Array3378[i] = var_ha.method3691(class207s[i], true);
            class207s = Class207.method1519(class45, Class115.anInt1756, 0);
            Class239_Sub9.aClass105Array5933 = new Class105[class207s.length];
            for (int i = 0; i < class207s.length; i++)
                Class239_Sub9.aClass105Array5933[i] = var_ha.method3691(class207s[i], true);
            class207s = Class207.method1519(class45, Class291.anInt3739, 0);
            Class59_Sub1.aClass105Array5294 = new Class105[class207s.length];
            for (int i = 0; class207s.length > i; i++)
                Class59_Sub1.aClass105Array5294[i] = var_ha.method3691(class207s[i], true);
            class207s = Class207.method1519(class45, Class86.anInt1481, 0);
            Class25.aClass105Array367 = new Class105[class207s.length];
            for (int i = 0; class207s.length > i; i++)
                Class25.aClass105Array367[i] = var_ha.method3691(class207s[i], true);
            class207s = Class207.method1519(class45, Class239_Sub10.anInt5948, 0);
            Class348_Sub40_Sub37.aClass105Array9467 = new Class105[class207s.length];
            for (int i = 0; i < class207s.length; i++)
                Class348_Sub40_Sub37.aClass105Array9467[i] = var_ha.method3691(class207s[i], true);
            class207s = Class207.method1519(class45, Class113.anInt1742, 0);
            Class348_Sub12.aClass105Array6742 = new Class105[class207s.length];
            for (int i = 0; class207s.length > i; i++)
                Class348_Sub12.aClass105Array6742[i] = var_ha.method3691(class207s[i], true);
            class207s = Class207.method1519(class45, WhereMode.anInt4469, 0);
            Class240.aClass105Array4679 = new Class105[class207s.length];
            for (int i = 0; i < class207s.length; i++)
                Class240.aClass105Array4679[i] = var_ha.method3691(class207s[i], true);
            class207s = Class207.method1519(class45, Class348_Sub40_Sub38.anInt9473, 0);
            Class113.aClass105Array1744 = new Class105[class207s.length];
            for (int i = 0; class207s.length > i; i++)
                Class113.aClass105Array1744[i] = var_ha.method3691(class207s[i], true);
            Class79.aClass105_1365 = var_ha.method3691(Class207.method1521(class45, Class52.anInt4895, 0), bool);
            Class239_Sub24.aClass105_6097 = var_ha.method3691(Class207.method1521(class45, (Class186_Sub1.anInt5814), 0), true);
            class207s = Class207.method1519(class45, Class5_Sub3.anInt8370, 0);
            Class200.aClass105Array2640 = new Class105[class207s.length];
            for (int i = 0; i < class207s.length; i++)
                Class200.aClass105Array2640[i] = var_ha.method3691(class207s[i], true);
        } catch (RuntimeException runtimeexception) {
            throw Class348_Sub17.method2929(runtimeexception, ("ub.N(" + (class45 != null ? "{...}" : "null") + ',' + (var_ha != null ? "{...}" : "null") + ',' + bool + ')'));
        }
    }

    final void method1934(byte i, boolean bool) {
        if (i != 11) method1935(97, -31, null, null, false, 53);
        anInt3276++;
        if (!aBoolean3269 != !bool) {
            aBoolean3269 = bool;
            method1939(i ^ ~0x14);
        }
    }

    static final void method1935(int i, int i_10_, Class30 class30, Class64 class64, boolean bool, int i_11_) {
        try {
            anInt3270++;
            if (class64 != null) {
                if (bool != false) method1929((byte) 106);
                class30.method320(class64.EA(), class64.fa(), (byte) -4, i_11_, class64.na(), i, class64.V(), class64.G(), class64.HA(), i_10_, class64.RA());
            }
        } catch (RuntimeException runtimeexception) {
            throw Class348_Sub17.method2929(runtimeexception, ("ub.H(" + i + ',' + i_10_ + ',' + (class30 != null ? "{...}" : "null") + ',' + (class64 != null ? "{...}" : "null") + ',' + bool + ',' + i_11_ + ')'));
        }
    }

    final void method1936(int i) {
        anInt3281++;
        synchronized (this.aClass175_3288) {
            this.aClass175_3288.method1345((byte) -126);
            int i_12_ = -63 / ((21 - i) / 50);
        }
    }

    final void method1937(int i, boolean bool) {
        anInt3274++;
        synchronized (aClass60_3278) {
            aClass60_3278.method578(2, i);
        }
        synchronized (this.aClass60_3287) {
            if (bool != false) method1939(-11);
            this.aClass60_3287.method578(2, i);
        }
        synchronized (this.aClass175_3288) {
            this.aClass175_3288.method1346(-1491, i);
        }
    }

    final void method1938(int i) {
        anInt3272++;
        synchronized (aClass60_3278) {
            aClass60_3278.method587(-88);
        }
        synchronized (this.aClass60_3287) {
            this.aClass60_3287.method587(-85);
        }
        synchronized (this.aClass175_3288) {
            this.aClass175_3288.method1344((byte) -124);
        }
        if (i < 105) this.aClass45_3268 = null;
    }

    final void method1939(int i) {
        synchronized (aClass60_3278) {
            if (i > -28) aClass326_3292 = null;
            aClass60_3278.method590(0);
        }
        anInt3277++;
        synchronized (this.aClass60_3287) {
            this.aClass60_3287.method590(0);
        }
        synchronized (this.aClass175_3288) {
            this.aClass175_3288.method1345((byte) 47);
        }
    }

    final Class213 method1940(int i, int i_13_) {
        anInt3283++;
        Class213 class213;
        synchronized (aClass60_3278) {
            class213 = (Class213) aClass60_3278.method583(i_13_, 90);
        }
        if (class213 != null) return class213;
        byte[] is;
        synchronized (aClass45_3267) {
            is = aClass45_3267.method410(-1860, Class54.method500(7, i_13_), Class251.method1914(-23590, i_13_));
        }
        class213 = new Class213();
        class213.aClass255_2761 = this;
        class213.anInt2769 = i_13_;
        class213.aStringArray2811 = new String[]{null, null, Class274.aClass274_3490.method2063(this.anInt3286, 544), null, null};
        class213.aStringArray2763 = (new String[]{null, null, null, null, Class274.aClass274_3491.method2063(this.anInt3286, 544)});
        if (is != null) class213.method1569(768, new Class348_Sub49(is));
        class213.method1563((byte) 92);
        int i_14_ = 4 / ((i - 13) / 59);
        if (class213.anInt2833 != -1) class213.method1570(1, method1940(90, class213.anInt2758), method1940(101, class213.anInt2833));
        if (class213.anInt2812 != -1) class213.method1556(method1940(-58, class213.anInt2778), (byte) -29, method1940(-82, class213.anInt2812));
        if (!aBoolean3269 && class213.aBoolean2783) {
            class213.aString2795 = Class274.aClass274_3488.method2063(this.anInt3286, 544);
            class213.anInt2827 = 0;
            class213.aStringArray2811 = aStringArray3290;
            class213.aStringArray2763 = aStringArray3293;
            class213.aBoolean2755 = false;
            class213.anIntArray2772 = null;
            if (class213.aClass356_2757 != null) {
                boolean bool = false;
                for (Class348 class348 = class213.aClass356_2757.method3484(0); class348 != null; class348 = class213.aClass356_2757.method3482(0)) {
                    Class254 class254 = aClass326_3292.method2600((int) class348.aLong4291, 28364);
                    if (class254.aBoolean3261) class348.method2715((byte) 60);
                    else bool = true;
                }
                if (!bool) class213.aClass356_2757 = null;
            }
        }
        synchronized (aClass60_3278) {
            aClass60_3278.method582(class213, i_13_, (byte) -118);
        }
        return class213;
    }

    final Class105 method1941(int i, byte i_15_, int i_16_, int i_17_, int i_18_, int i_19_, ha var_ha, Class154 class154) {
        try {
            aClass126_3289.anInt4992 = i_16_;
            aClass126_3289.anInt4989 = i_17_;
            aClass126_3289.anInt4991 = var_ha.anInt4567;
            aClass126_3289.anInt4981 = i_19_;
            if (i_15_ != -74) aClass126_3289 = null;
            aClass126_3289.aBoolean4990 = class154 != null;
            aClass126_3289.anInt4982 = i_18_;
            anInt3282++;
            aClass126_3289.anInt4993 = i;
            return (Class105) this.aClass175_3288.method1340(123, aClass126_3289);
        } catch (RuntimeException runtimeexception) {
            throw Class348_Sub17.method2929(runtimeexception, ("ub.D(" + i + ',' + i_15_ + ',' + i_16_ + ',' + i_17_ + ',' + i_18_ + ',' + i_19_ + ',' + (var_ha != null ? "{...}" : "null") + ',' + (class154 != null ? "{...}" : "null") + ')'));
        }
    }

    final void method1942(int i, byte i_20_) {
        this.anInt3291 = i;
        anInt3284++;
        synchronized (this.aClass60_3287) {
            this.aClass60_3287.method590(0);
            int i_21_ = 89 % ((-65 - i_20_) / 60);
        }
    }

    Class255(Game game, int i, boolean bool, Class326 class326, Class45 class45, Class45 class45_22_) {
        try {
            aBoolean3269 = bool;
            aClass326_3292 = class326;
            this.aClass45_3268 = class45_22_;
            this.anInt3286 = i;
            aClass45_3267 = class45;
            if (aClass45_3267 != null) {
                int i_23_ = -1 + aClass45_3267.method414(-1);
                this.anInt3271 = aClass45_3267.method407(0, i_23_) + i_23_ * 256;
            } else this.anInt3271 = 0;
            aStringArray3290 = (new String[]{null, null, Class274.aClass274_3490.method2063(this.anInt3286, 544), null, null});
            aStringArray3293 = (new String[]{null, null, null, null, Class274.aClass274_3491.method2063(this.anInt3286, 544)});
        } catch (RuntimeException runtimeexception) {
            throw Class348_Sub17.method2929(runtimeexception, ("ub.<init>(" + (game != null ? "{...}" : "null") + ',' + i + ',' + bool + ',' + (class326 != null ? "{...}" : "null") + ',' + (class45 != null ? "{...}" : "null") + ',' + (class45_22_ != null ? "{...}" : "null") + ')'));
        }
    }

    static {
        aClass114_3265 = new Class114(48, -2);
    }
}
