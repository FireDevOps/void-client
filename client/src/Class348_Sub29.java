/* Class348_Sub29 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class348_Sub29 extends Class348 {
    static Index ANIMATION_SKELETONS;
    static int anInt6910;
    short aShort6911;

    public static void method3003(int i) {
        ANIMATION_SKELETONS = null;
        if (i != -4587) method3003(-101);
    }

    public Class348_Sub29() {
        /* empty */
    }

    Class348_Sub29(short i) {
        this.aShort6911 = i;
    }

    static final void method3004(Index index, boolean bool, d var_d) {
        do {
            try {
                Class260.aIndex_3309 = index;
                anInt6910++;
                Class101_Sub1.aD5684 = var_d;
                if (bool == false) break;
                method3004(null, false, null);
            } catch (RuntimeException runtimeexception) {
                throw Class348_Sub17.method2929(runtimeexception, ("oia.B(" + (index != null ? "{...}" : "null") + ',' + bool + ',' + (var_d != null ? "{...}" : "null") + ')'));
            }
            break;
        } while (false);
    }
}
