/* Class31 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class31 {
    int anInt420;
    private int anInt421;
    int anInt422;
    private String aString423;
    int anInt424;
    static int anInt425;
    int anInt426 = -1;
    static int anInt427;
    static int anInt428;
    private int anInt429 = -1;
    static Class113 aClass113_430;
    int anInt431;
    static int anInt432;
    private int anInt433;
    int anInt434;
    int anInt435;
    static int anInt436;
    static int anInt437;
    Class219 aClass219_438;
    private int anInt439;
    static int anInt440;
    static int anInt441;
    static int anInt442;
    static int anInt443 = 1;
    int anInt444;
    static int anInt445;
    static int anInt446;

    final Sprite method324(ha var_ha, boolean bool) {
        anInt440++;
        if (bool != true) return null;
        if (anInt429 < 0) return null;
        Sprite sprite = (Sprite) this.aClass219_438.aClass60_2862.method583(anInt429, -62);
        if (sprite == null) {
            method330(var_ha, -41);
            sprite = (Sprite) this.aClass219_438.aClass60_2862.method583(anInt429, 53);
        }
        return sprite;
    }

    final Sprite method325(ha var_ha, int i) {
        anInt428++;
        if (anInt439 < 0) return null;
        Sprite sprite = (Sprite) this.aClass219_438.aClass60_2862.method583(anInt439, -59);
        if (i < 23) return null;
        if (sprite == null) {
            method330(var_ha, -118);
            sprite = (Sprite) this.aClass219_438.aClass60_2862.method583(anInt439, 123);
        }
        return sprite;
    }

    static final void method326(byte i) {
        anInt442++;
        if (!Class50_Sub1.aBoolean5224) {
            Class369_Sub3_Sub1.aBoolean10174 = true;
            Class348_Sub27.aFloat6898 += (12.0F - Class348_Sub27.aFloat6898) / 2.0F;
            Class50_Sub1.aBoolean5224 = true;
            if (i != 68) aClass113_430 = null;
        }
    }

    final Sprite method327(ha var_ha, byte i) {
        anInt432++;
        if (anInt421 < 0) return null;
        Sprite sprite = (Sprite) this.aClass219_438.aClass60_2862.method583(anInt421, 118);
        if (sprite == null) {
            method330(var_ha, -66);
            sprite = (Sprite) this.aClass219_438.aClass60_2862.method583(anInt421, 119);
        }
        int i_0_ = 20 % ((i - 19) / 51);
        return sprite;
    }

    public static void method328(int i) {
        if (i != 0) anInt425 = -128;
        aClass113_430 = null;
    }

    private final void method329(Class348_Sub49 class348_sub49, int i, int i_1_) {
        if (i_1_ != 1) {
            if (i_1_ != 2) {
                if (i_1_ == 3) anInt421 = class348_sub49.readUnsignedShort(842397944);
                else if (i_1_ != 4) {
                    if (i_1_ == 5) anInt433 = class348_sub49.readUnsignedShort(842397944);
                    else if (i_1_ == 6) anInt439 = class348_sub49.readUnsignedShort(842397944);
                    else if (i_1_ != 7) {
                        if (i_1_ != 8) {
                            if (i_1_ != 9) {
                                if (i_1_ != 10) {
                                    if (i_1_ == 11) this.anInt426 = 0;
                                    else if (i_1_ == 12) this.anInt431 = class348_sub49.readUnsignedByte(255);
                                    else if (i_1_ == 13) this.anInt420 = class348_sub49.readShort(i ^ ~0x3547);
                                    else if (i_1_ == 14) this.anInt426 = class348_sub49.readUnsignedShort(842397944);
                                } else this.anInt422 = class348_sub49.readShort(13638);
                            } else this.anInt434 = class348_sub49.readUnsignedShort(842397944);
                        } else aString423 = class348_sub49.method3371(i ^ 0x34af);
                    } else this.anInt424 = class348_sub49.readShort(13638);
                } else anInt429 = class348_sub49.readUnsignedShort(842397944);
            } else this.anInt444 = class348_sub49.readMedium(-1);
        } else this.anInt435 = class348_sub49.readUnsignedShort(842397944);
        if (i != -2) method333(-112, 38);
        anInt437++;
    }

    private final void method330(ha var_ha, int i) {
        anInt446++;
        Index index = this.aClass219_438.aIndex_2873;
        if (anInt421 >= 0 && this.aClass219_438.aClass60_2862.method583(anInt421, 121) == null && index.method421(false, anInt421)) {
            Class207 class207 = Class207.method1512(index, anInt421);
            this.aClass219_438.aClass60_2862.method582(var_ha.method3691(class207, true), anInt421, (byte) -112);
        }
        if (anInt433 >= 0 && this.aClass219_438.aClass60_2862.method583(anInt433, -99) == null && index.method421(false, anInt433)) {
            Class207 class207 = Class207.method1512(index, anInt433);
            this.aClass219_438.aClass60_2862.method582(var_ha.method3691(class207, true), anInt433, (byte) -128);
        }
        if (anInt429 >= 0 && this.aClass219_438.aClass60_2862.method583(anInt429, 86) == null && index.method421(false, anInt429)) {
            Class207 class207 = Class207.method1512(index, anInt429);
            this.aClass219_438.aClass60_2862.method582(var_ha.method3691(class207, true), anInt429, (byte) -108);
        }
        if (i > -7) this.anInt434 = -14;
        if (anInt439 >= 0 && this.aClass219_438.aClass60_2862.method583(anInt439, -83) == null && index.method421(false, anInt439)) {
            Class207 class207 = Class207.method1512(index, anInt439);
            this.aClass219_438.aClass60_2862.method582(var_ha.method3691(class207, true), anInt439, (byte) -101);
        }
    }

    final Sprite method331(ha var_ha, byte i) {
        anInt441++;
        if (anInt433 < 0) return null;
        int i_2_ = -84 % ((i - 32) / 35);
        Sprite sprite = (Sprite) this.aClass219_438.aClass60_2862.method583(anInt433, -50);
        if (sprite == null) {
            method330(var_ha, -89);
            sprite = (Sprite) this.aClass219_438.aClass60_2862.method583(anInt433, -117);
        }
        return sprite;
    }

    final void method332(int i, Class348_Sub49 class348_sub49) {
        if (i > -119) method333(119, -71);
        for (; ; ) {
            int i_3_ = class348_sub49.readUnsignedByte(255);
            if (i_3_ == 0) break;
            method329(class348_sub49, -2, i_3_);
        }
        anInt427++;
    }

    final String method333(int i, int i_4_) {
        anInt445++;
        String string = aString423;
        if (i_4_ != 0) return null;
        for (; ; ) {
            int i_5_ = string.indexOf("%1");
            if (i_5_ < 0) break;
            string = (string.substring(0, i_5_) + Class140.method1171(i, 55, false) + string.substring(i_5_ - -2));
        }
        return string;
    }

    public Class31() {
        aString423 = "";
        this.anInt424 = 0;
        anInt433 = -1;
        this.anInt422 = 0;
        anInt439 = -1;
        this.anInt431 = -1;
        this.anInt434 = 70;
        this.anInt435 = -1;
        anInt421 = -1;
        this.anInt420 = 0;
        this.anInt444 = 16777215;
    }

    static {
        aClass113_430 = new Class113();
    }
}
