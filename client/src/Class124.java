/* Class124 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.awt.*;
import java.util.Random;

final class Class124 {
    int[] anIntArray1816;
    int anInt1817;
    int anInt1818;
    static int anInt1819;
    byte[] aByteArray1820;
    int anInt1821;
    short[] aShortArray1822;
    byte[] aByteArray1823;
    int[] anIntArray1824;
    short[] aShortArray1825;
    static int anInt1826;
    static int anInt1827;
    static int anInt1828;
    short[] aShortArray1829;
    int anInt1830 = 12;
    static int anInt1831;
    Class162[] aClass162Array1832;
    byte[] aByteArray1833;
    byte[] aByteArray1834;
    short[] aShortArray1835;
    int anInt1836 = 0;
    static int anInt1837;
    static int anInt1838;
    byte[] aByteArray1839;
    static int anInt1840;
    int[] anIntArray1841;
    short[] aShortArray1842;
    byte[] aByteArray1843;
    int[] anIntArray1844;
    static int anInt1845;
    Class129[] aClass129Array1846;
    int[] anIntArray1847;
    static Class45 aClass45_1848;
    short[] aShortArray1849;
    static int anInt1850;
    byte aByte1851;
    int[] anIntArray1852;
    byte[] aByteArray1853;
    static int anInt1854;
    short[] aShortArray1855;
    short[] aShortArray1856;
    int[] anIntArray1857;
    static int anInt1858;
    int[] anIntArray1859;
    static int anInt1860;
    static int anInt1861;
    short[] aShortArray1862;
    short[] aShortArray1863;
    static int anInt1864;
    int[] anIntArray1865;
    Class342[] aClass342Array1866;
    int[] anIntArray1867;
    int[] anIntArray1868;
    static int anInt1869;

    final void method1092(int i, int i_0_) {
        anInt1819++;
        for (int i_1_ = 0; ((Class124) this).anInt1836 > i_1_; i_1_++) {
            ((Class124) this).anIntArray1841[i_1_] <<= i;
            ((Class124) this).anIntArray1847[i_1_] <<= i;
            ((Class124) this).anIntArray1852[i_1_] <<= i;
        }
        if (i_0_ <= 39)
            method1107(40, -7, -80, -24);
        if ((((Class124) this).anInt1818 ^ 0xffffffff) < -1
                && ((Class124) this).anIntArray1859 != null) {
            for (int i_2_ = 0; i_2_ < ((Class124) this).anIntArray1859.length;
                 i_2_++) {
                ((Class124) this).anIntArray1859[i_2_] <<= i;
                ((Class124) this).anIntArray1816[i_2_] <<= i;
                if ((((Class124) this).aByteArray1823[i_2_] ^ 0xffffffff)
                        != -2)
                    ((Class124) this).anIntArray1844[i_2_] <<= i;
            }
        }
    }

    final int[][] method1093(byte i) {
        anInt1854++;
        int[] is = new int[256];
        int i_3_ = 0;
        for (int i_4_ = 0; ((Class124) this).aClass162Array1832.length > i_4_;
             i_4_++) {
            int i_5_ = (((Class162) ((Class124) this).aClass162Array1832[i_4_])
                    .anInt2156);
            if (i_5_ >= 0) {
                is[i_5_]++;
                if (i_3_ < i_5_)
                    i_3_ = i_5_;
            }
        }
        int[][] is_6_ = new int[1 + i_3_][];
        for (int i_7_ = 0; (i_3_ ^ 0xffffffff) <= (i_7_ ^ 0xffffffff);
             i_7_++) {
            is_6_[i_7_] = new int[is[i_7_]];
            is[i_7_] = 0;
        }
        if (i > -68)
            return null;
        for (int i_8_ = 0; i_8_ < ((Class124) this).aClass162Array1832.length;
             i_8_++) {
            int i_9_ = (((Class162) ((Class124) this).aClass162Array1832[i_8_])
                    .anInt2156);
            if (i_9_ >= 0)
                is_6_[i_9_][is[i_9_]++] = i_8_;
        }
        return is_6_;
    }

    final int[][] method1094(byte i) {
        anInt1864++;
        int[] is = new int[256];
        int i_10_ = 0;
        for (int i_11_ = 0; i_11_ < ((Class124) this).anInt1817; i_11_++) {
            int i_12_ = ((Class124) this).anIntArray1824[i_11_];
            if ((i_12_ ^ 0xffffffff) <= -1) {
                if (i_10_ < i_12_)
                    i_10_ = i_12_;
                is[i_12_]++;
            }
        }
        int[][] is_13_ = new int[i_10_ - -1][];
        if (i <= 13)
            method1102(-65, (byte) -8, (byte) 94, (short) -89, (byte) 6,
                    (short) -117, 21, (byte) 21, -31);
        for (int i_14_ = 0; (i_14_ ^ 0xffffffff) >= (i_10_ ^ 0xffffffff);
             i_14_++) {
            is_13_[i_14_] = new int[is[i_14_]];
            is[i_14_] = 0;
        }
        for (int i_15_ = 0;
             (((Class124) this).anInt1817 ^ 0xffffffff) < (i_15_ ^ 0xffffffff);
             i_15_++) {
            int i_16_ = ((Class124) this).anIntArray1824[i_15_];
            if ((i_16_ ^ 0xffffffff) <= -1)
                is_13_[i_16_][is[i_16_]++] = i_15_;
        }
        return is_13_;
    }

    final void method1095(short i, int i_17_, short i_18_) {
        anInt1869++;
        if (((Class124) this).aShortArray1822 != null) {
            for (int i_19_ = i_17_; ((Class124) this).anInt1817 > i_19_;
                 i_19_++) {
                if (i == ((Class124) this).aShortArray1822[i_19_])
                    ((Class124) this).aShortArray1822[i_19_] = i_18_;
            }
        }
    }

    public static void method1096(int i) {
        if (i >= 88)
            aClass45_1848 = null;
    }

    static final int method1097(byte i, int i_20_, Random random) {
        anInt1861++;
        if (i_20_ <= 0)
            throw new IllegalArgumentException();
        if (Class192.method1436(-19, i_20_))
            return (int) ((long) i_20_ * (0xffffffffL
                    & (long) random.nextInt())
                    >> -945125600);
        int i_21_ = -2147483648 + -(int) (4294967296L % (long) i_20_);
        if (i < 78)
            aClass45_1848 = null;
        int i_22_;
        do
            i_22_ = random.nextInt();
        while ((i_21_ ^ 0xffffffff) >= (i_22_ ^ 0xffffffff));
        return Class350.method3452(i_22_, (byte) -15, i_20_);
    }

    final void method1098(short i, byte i_23_, short i_24_) {
        if (i_23_ == 126) {
            for (int i_25_ = 0; i_25_ < ((Class124) this).anInt1817; i_25_++) {
                if ((((Class124) this).aShortArray1862[i_25_] ^ 0xffffffff)
                        == (i ^ 0xffffffff))
                    ((Class124) this).aShortArray1862[i_25_] = i_24_;
            }
            anInt1826++;
        }
    }

    final void method1099(byte i, int i_26_, int i_27_, int i_28_) {
        int i_29_ = 0;
        int i_30_ = 19 % ((-40 - i) / 33);
        for (/**/;
                 (i_29_ ^ 0xffffffff) > (((Class124) this).anInt1836 ^ 0xffffffff);
                 i_29_++) {
            ((Class124) this).anIntArray1841[i_29_] += i_27_;
            ((Class124) this).anIntArray1847[i_29_] += i_28_;
            ((Class124) this).anIntArray1852[i_29_] += i_26_;
        }
        anInt1840++;
    }

    final int[][] method1100(boolean bool, int i) {
        anInt1845++;
        int[] is = new int[256];
        int i_31_ = 0;
        int i_32_ = (!bool ? ((Class124) this).anInt1821
                : ((Class124) this).anInt1836);
        for (int i_33_ = 0; i_33_ < i_32_; i_33_++) {
            int i_34_ = ((Class124) this).anIntArray1868[i_33_];
            if ((i_34_ ^ 0xffffffff) <= -1) {
                is[i_34_]++;
                if (i_31_ < i_34_)
                    i_31_ = i_34_;
            }
        }
        int[][] is_35_ = new int[1 + i_31_][];
        for (int i_36_ = 0; (i_31_ ^ 0xffffffff) <= (i_36_ ^ 0xffffffff);
             i_36_++) {
            is_35_[i_36_] = new int[is[i_36_]];
            is[i_36_] = 0;
        }
        for (int i_37_ = 0; i_32_ > i_37_; i_37_++) {
            int i_38_ = ((Class124) this).anIntArray1868[i_37_];
            if ((i_38_ ^ 0xffffffff) <= -1)
                is_35_[i_38_][is[i_38_]++] = i_37_;
        }
        if (i > -14)
            method1098((short) 9, (byte) 80, (short) -118);
        return is_35_;
    }

    final int method1101(int i, int i_39_, int i_40_, int i_41_) {
        anInt1827++;
        int i_42_ = 0;
        int i_43_ = 120 / ((38 - i_41_) / 61);
        for (/**/; i_42_ < ((Class124) this).anInt1836; i_42_++) {
            if (((Class124) this).anIntArray1841[i_42_] == i_40_
                    && i == ((Class124) this).anIntArray1847[i_42_]
                    && ((Class124) this).anIntArray1852[i_42_] == i_39_)
                return i_42_;
        }
        ((Class124) this).anIntArray1841[((Class124) this).anInt1836] = i_40_;
        ((Class124) this).anIntArray1847[((Class124) this).anInt1836] = i;
        ((Class124) this).anIntArray1852[((Class124) this).anInt1836] = i_39_;
        ((Class124) this).anInt1821 = 1 + ((Class124) this).anInt1836;
        return ((Class124) this).anInt1836++;
    }

    final int method1102(int i, byte i_44_, byte i_45_, short i_46_,
                         byte i_47_, short i_48_, int i_49_, byte i_50_,
                         int i_51_) {
        ((Class124) this).aShortArray1863[((Class124) this).anInt1817]
                = (short) i;
        anInt1860++;
        ((Class124) this).aShortArray1835[((Class124) this).anInt1817]
                = (short) i_49_;
        ((Class124) this).aShortArray1855[((Class124) this).anInt1817]
                = (short) i_51_;
        if (i_47_ < 30)
            return -92;
        ((Class124) this).aByteArray1843[((Class124) this).anInt1817] = i_44_;
        ((Class124) this).aByteArray1820[((Class124) this).anInt1817] = i_45_;
        ((Class124) this).aShortArray1862[((Class124) this).anInt1817] = i_48_;
        ((Class124) this).aByteArray1834[((Class124) this).anInt1817] = i_50_;
        ((Class124) this).aShortArray1822[((Class124) this).anInt1817] = i_46_;
        return ((Class124) this).anInt1817++;
    }

    private final void method1103(int i, byte[] is) {
        anInt1831++;
        boolean bool = false;
        boolean bool_52_ = false;
        Class348_Sub49 class348_sub49 = new Class348_Sub49(is);
        Class348_Sub49 class348_sub49_53_ = new Class348_Sub49(is);
        Class348_Sub49 class348_sub49_54_ = new Class348_Sub49(is);
        Class348_Sub49 class348_sub49_55_ = new Class348_Sub49(is);
        Class348_Sub49 class348_sub49_56_ = new Class348_Sub49(is);
        ((Class348_Sub49) class348_sub49).anInt7197 = -18 + is.length;
        ((Class124) this).anInt1836
                = class348_sub49.method3330(i ^ 0x3235f8f9);
        ((Class124) this).anInt1817 = class348_sub49.method3330(842397944);
        ((Class124) this).anInt1818 = class348_sub49.method3387(255);
        int i_57_ = class348_sub49.method3387(255);
        int i_58_ = class348_sub49.method3387(255);
        int i_59_ = class348_sub49.method3387(255);
        int i_60_ = class348_sub49.method3387(255);
        int i_61_ = class348_sub49.method3387(255);
        int i_62_ = class348_sub49.method3330(842397944);
        int i_63_ = class348_sub49.method3330(842397944);
        int i_64_ = class348_sub49.method3330(842397944);
        int i_65_ = class348_sub49.method3330(842397944);
        int i_66_ = 0;
        int i_67_ = i_66_;
        i_66_ += ((Class124) this).anInt1836;
        int i_68_ = i_66_;
        i_66_ += ((Class124) this).anInt1817;
        int i_69_ = i_66_;
        if ((i_58_ ^ 0xffffffff) == -256)
            i_66_ += ((Class124) this).anInt1817;
        int i_70_ = i_66_;
        if ((i_60_ ^ 0xffffffff) == -2)
            i_66_ += ((Class124) this).anInt1817;
        int i_71_ = i_66_;
        if (i_57_ == 1)
            i_66_ += ((Class124) this).anInt1817;
        int i_72_ = i_66_;
        if (i_61_ == 1)
            i_66_ += ((Class124) this).anInt1836;
        int i_73_ = i_66_;
        if (i == i_59_)
            i_66_ += ((Class124) this).anInt1817;
        int i_74_ = i_66_;
        i_66_ += i_65_;
        int i_75_ = i_66_;
        i_66_ += ((Class124) this).anInt1817 * 2;
        int i_76_ = i_66_;
        i_66_ += ((Class124) this).anInt1818 * 6;
        int i_77_ = i_66_;
        i_66_ += i_62_;
        int i_78_ = i_66_;
        i_66_ += i_63_;
        int i_79_ = i_66_;
        ((Class124) this).aShortArray1862
                = new short[((Class124) this).anInt1817];
        if ((i_58_ ^ 0xffffffff) == -256)
            ((Class124) this).aByteArray1839
                    = new byte[((Class124) this).anInt1817];
        else
            ((Class124) this).aByte1851 = (byte) i_58_;
        if (i_61_ == 1)
            ((Class124) this).anIntArray1868
                    = new int[((Class124) this).anInt1836];
        if (i_59_ == 1)
            ((Class124) this).aByteArray1834
                    = new byte[((Class124) this).anInt1817];
        ((Class124) this).aShortArray1863
                = new short[((Class124) this).anInt1817];
        if ((i_57_ ^ 0xffffffff) == -2) {
            ((Class124) this).aShortArray1822
                    = new short[((Class124) this).anInt1817];
            ((Class124) this).aByteArray1820
                    = new byte[((Class124) this).anInt1817];
            ((Class124) this).aByteArray1843
                    = new byte[((Class124) this).anInt1817];
        }
        ((Class124) this).anIntArray1847
                = new int[((Class124) this).anInt1836];
        if ((i_60_ ^ 0xffffffff) == -2)
            ((Class124) this).anIntArray1824
                    = new int[((Class124) this).anInt1817];
        ((Class124) this).aShortArray1855
                = new short[((Class124) this).anInt1817];
        if (((Class124) this).anInt1818 > 0) {
            ((Class124) this).aByteArray1823
                    = new byte[((Class124) this).anInt1818];
            ((Class124) this).aShortArray1829
                    = new short[((Class124) this).anInt1818];
            ((Class124) this).aShortArray1849
                    = new short[((Class124) this).anInt1818];
            ((Class124) this).aShortArray1825
                    = new short[((Class124) this).anInt1818];
        }
        ((Class124) this).aShortArray1835
                = new short[((Class124) this).anInt1817];
        ((Class124) this).anIntArray1852
                = new int[((Class124) this).anInt1836];
        ((Class124) this).anIntArray1841
                = new int[((Class124) this).anInt1836];
        ((Class348_Sub49) class348_sub49).anInt7197 = i_67_;
        i_66_ += i_64_;
        ((Class348_Sub49) class348_sub49_53_).anInt7197 = i_77_;
        ((Class348_Sub49) class348_sub49_54_).anInt7197 = i_78_;
        ((Class348_Sub49) class348_sub49_55_).anInt7197 = i_79_;
        ((Class348_Sub49) class348_sub49_56_).anInt7197 = i_72_;
        int i_80_ = 0;
        int i_81_ = 0;
        int i_82_ = 0;
        for (int i_83_ = 0; i_83_ < ((Class124) this).anInt1836; i_83_++) {
            int i_84_ = class348_sub49.method3387(255);
            int i_85_ = 0;
            if ((i_84_ & 0x1) != 0)
                i_85_ = class348_sub49_53_.method3362((byte) 77);
            int i_86_ = 0;
            if ((i_84_ & 0x2 ^ 0xffffffff) != -1)
                i_86_ = class348_sub49_54_.method3362((byte) 77);
            int i_87_ = 0;
            if ((0x4 & i_84_) != 0)
                i_87_ = class348_sub49_55_.method3362((byte) 77);
            ((Class124) this).anIntArray1841[i_83_] = i_85_ + i_80_;
            ((Class124) this).anIntArray1847[i_83_] = i_81_ - -i_86_;
            ((Class124) this).anIntArray1852[i_83_] = i_82_ + i_87_;
            i_82_ = ((Class124) this).anIntArray1852[i_83_];
            i_81_ = ((Class124) this).anIntArray1847[i_83_];
            i_80_ = ((Class124) this).anIntArray1841[i_83_];
            if (i_61_ == 1)
                ((Class124) this).anIntArray1868[i_83_]
                        = class348_sub49_56_
                        .method3387(Class348_Sub21.method2955(i, 254));
        }
        ((Class348_Sub49) class348_sub49).anInt7197 = i_75_;
        ((Class348_Sub49) class348_sub49_53_).anInt7197 = i_71_;
        ((Class348_Sub49) class348_sub49_54_).anInt7197 = i_69_;
        ((Class348_Sub49) class348_sub49_55_).anInt7197 = i_73_;
        ((Class348_Sub49) class348_sub49_56_).anInt7197 = i_70_;
        for (int i_88_ = 0; i_88_ < ((Class124) this).anInt1817; i_88_++) {
            ((Class124) this).aShortArray1862[i_88_]
                    = (short) class348_sub49.method3330(842397944);
            if ((i_57_ ^ 0xffffffff) == -2) {
                int i_89_ = class348_sub49_53_.method3387(255);
                if ((0x1 & i_89_) != 1)
                    ((Class124) this).aByteArray1843[i_88_] = (byte) 0;
                else {
                    ((Class124) this).aByteArray1843[i_88_] = (byte) 1;
                    bool = true;
                }
                if ((i_89_ & 0x2) != 2) {
                    ((Class124) this).aByteArray1820[i_88_] = (byte) -1;
                    ((Class124) this).aShortArray1822[i_88_] = (short) -1;
                } else {
                    ((Class124) this).aByteArray1820[i_88_]
                            = (byte) (i_89_ >> -231090654);
                    ((Class124) this).aShortArray1822[i_88_]
                            = ((Class124) this).aShortArray1862[i_88_];
                    ((Class124) this).aShortArray1862[i_88_] = (short) 127;
                    if ((((Class124) this).aShortArray1822[i_88_] ^ 0xffffffff)
                            != 0)
                        bool_52_ = true;
                }
            }
            if ((i_58_ ^ 0xffffffff) == -256)
                ((Class124) this).aByteArray1839[i_88_]
                        = class348_sub49_54_.method3388(-108);
            if ((i_59_ ^ 0xffffffff) == -2)
                ((Class124) this).aByteArray1834[i_88_]
                        = class348_sub49_55_
                        .method3388(Class348_Sub21.method2955(i, -120));
            if (i_60_ == 1)
                ((Class124) this).anIntArray1824[i_88_]
                        = class348_sub49_56_.method3387(255);
        }
        ((Class348_Sub49) class348_sub49).anInt7197 = i_74_;
        ((Class124) this).anInt1821 = -1;
        ((Class348_Sub49) class348_sub49_53_).anInt7197 = i_68_;
        short i_90_ = 0;
        short i_91_ = 0;
        short i_92_ = 0;
        int i_93_ = 0;
        for (int i_94_ = 0;
             (((Class124) this).anInt1817 ^ 0xffffffff) < (i_94_ ^ 0xffffffff);
             i_94_++) {
            int i_95_ = class348_sub49_53_.method3387(255);
            if ((i_95_ ^ 0xffffffff) == -2) {
                i_90_ = (short) (i_93_ + class348_sub49.method3362((byte) 77));
                i_93_ = i_90_;
                i_91_ = (short) (class348_sub49.method3362((byte) 77) + i_93_);
                i_93_ = i_91_;
                i_92_ = (short) (i_93_ + class348_sub49.method3362((byte) 77));
                ((Class124) this).aShortArray1863[i_94_] = i_90_;
                i_93_ = i_92_;
                ((Class124) this).aShortArray1835[i_94_] = i_91_;
                ((Class124) this).aShortArray1855[i_94_] = i_92_;
                if ((((Class124) this).anInt1821 ^ 0xffffffff)
                        > (i_90_ ^ 0xffffffff))
                    ((Class124) this).anInt1821 = i_90_;
                if ((i_91_ ^ 0xffffffff)
                        < (((Class124) this).anInt1821 ^ 0xffffffff))
                    ((Class124) this).anInt1821 = i_91_;
                if ((i_92_ ^ 0xffffffff)
                        < (((Class124) this).anInt1821 ^ 0xffffffff))
                    ((Class124) this).anInt1821 = i_92_;
            }
            if ((i_95_ ^ 0xffffffff) == -3) {
                i_91_ = i_92_;
                i_92_ = (short) (class348_sub49.method3362((byte) 77) + i_93_);
                ((Class124) this).aShortArray1863[i_94_] = i_90_;
                i_93_ = i_92_;
                ((Class124) this).aShortArray1835[i_94_] = i_91_;
                ((Class124) this).aShortArray1855[i_94_] = i_92_;
                if (i_92_ > ((Class124) this).anInt1821)
                    ((Class124) this).anInt1821 = i_92_;
            }
            if (i_95_ == 3) {
                i_90_ = i_92_;
                i_92_ = (short) (class348_sub49.method3362((byte) 77) + i_93_);
                i_93_ = i_92_;
                ((Class124) this).aShortArray1863[i_94_] = i_90_;
                ((Class124) this).aShortArray1835[i_94_] = i_91_;
                ((Class124) this).aShortArray1855[i_94_] = i_92_;
                if (((Class124) this).anInt1821 < i_92_)
                    ((Class124) this).anInt1821 = i_92_;
            }
            if (i_95_ == 4) {
                short i_96_ = i_90_;
                i_90_ = i_91_;
                i_92_ = (short) (class348_sub49.method3362((byte) 77) + i_93_);
                i_91_ = i_96_;
                i_93_ = i_92_;
                ((Class124) this).aShortArray1863[i_94_] = i_90_;
                ((Class124) this).aShortArray1835[i_94_] = i_91_;
                ((Class124) this).aShortArray1855[i_94_] = i_92_;
                if (((Class124) this).anInt1821 < i_92_)
                    ((Class124) this).anInt1821 = i_92_;
            }
        }
        ((Class124) this).anInt1821++;
        ((Class348_Sub49) class348_sub49).anInt7197 = i_76_;
        for (int i_97_ = 0;
             (((Class124) this).anInt1818 ^ 0xffffffff) < (i_97_ ^ 0xffffffff);
             i_97_++) {
            ((Class124) this).aByteArray1823[i_97_] = (byte) 0;
            ((Class124) this).aShortArray1829[i_97_]
                    = (short) class348_sub49.method3330(842397944);
            ((Class124) this).aShortArray1849[i_97_]
                    = (short) class348_sub49.method3330(842397944);
            ((Class124) this).aShortArray1825[i_97_]
                    = (short) class348_sub49.method3330(842397944);
        }
        if (((Class124) this).aByteArray1820 != null) {
            boolean bool_98_ = false;
            for (int i_99_ = 0; i_99_ < ((Class124) this).anInt1817; i_99_++) {
                int i_100_ = ((Class124) this).aByteArray1820[i_99_] & 0xff;
                if ((i_100_ ^ 0xffffffff) != -256) {
                    if (((0xffff & ((Class124) this).aShortArray1829[i_100_])
                            != ((Class124) this).aShortArray1863[i_99_])
                            || (((Class124) this).aShortArray1835[i_99_]
                            != (0xffff
                            & ((Class124) this).aShortArray1849[i_100_]))
                            || ((0xffff
                            & ((Class124) this).aShortArray1825[i_100_])
                            != ((Class124) this).aShortArray1855[i_99_]))
                        bool_98_ = true;
                    else
                        ((Class124) this).aByteArray1820[i_99_] = (byte) -1;
                }
            }
            if (!bool_98_)
                ((Class124) this).aByteArray1820 = null;
        }
        if (!bool)
            ((Class124) this).aByteArray1843 = null;
        if (!bool_52_)
            ((Class124) this).aShortArray1822 = null;
    }

    private final int method1104(Class124 class124_101_, int i, int i_102_,
                                 short i_103_) {
        anInt1858++;
        int i_104_ = ((Class124) class124_101_).anIntArray1841[i_102_];
        int i_105_ = ((Class124) class124_101_).anIntArray1847[i_102_];
        int i_106_ = ((Class124) class124_101_).anIntArray1852[i_102_];
        for (int i_107_ = i; i_107_ < ((Class124) this).anInt1836; i_107_++) {
            if (((Class124) this).anIntArray1841[i_107_] == i_104_
                    && i_105_ == ((Class124) this).anIntArray1847[i_107_]
                    && ((((Class124) this).anIntArray1852[i_107_] ^ 0xffffffff)
                    == (i_106_ ^ 0xffffffff))) {
                ((Class124) this).aShortArray1842[i_107_]
                        = (short) Class273.method2057((((Class124) this)
                                .aShortArray1842[i_107_]),
                        i_103_);
                return i_107_;
            }
        }
        ((Class124) this).anIntArray1841[((Class124) this).anInt1836] = i_104_;
        ((Class124) this).anIntArray1847[((Class124) this).anInt1836] = i_105_;
        ((Class124) this).anIntArray1852[((Class124) this).anInt1836] = i_106_;
        ((Class124) this).aShortArray1842[((Class124) this).anInt1836]
                = i_103_;
        ((Class124) this).anIntArray1868[((Class124) this).anInt1836]
                = (((Class124) class124_101_).anIntArray1868 != null
                ? ((Class124) class124_101_).anIntArray1868[i_102_] : -1);
        return ((Class124) this).anInt1836++;
    }

    final byte method1105(int i, byte i_108_, byte i_109_, short i_110_,
                          short i_111_, byte i_112_, short i_113_,
                          short i_114_, short i_115_, short i_116_) {
        anInt1838++;
        if (((Class124) this).anInt1818 >= 255)
            throw new IllegalStateException();
        ((Class124) this).aByteArray1823[((Class124) this).anInt1818]
                = (byte) 3;
        ((Class124) this).aShortArray1829[((Class124) this).anInt1818]
                = i_110_;
        ((Class124) this).aShortArray1849[((Class124) this).anInt1818]
                = i_114_;
        ((Class124) this).aShortArray1825[((Class124) this).anInt1818]
                = i_113_;
        ((Class124) this).anIntArray1859[((Class124) this).anInt1818] = i_115_;
        ((Class124) this).anIntArray1816[((Class124) this).anInt1818] = i_111_;
        ((Class124) this).anIntArray1844[((Class124) this).anInt1818] = i_116_;
        ((Class124) this).aByteArray1833[((Class124) this).anInt1818] = i_108_;
        ((Class124) this).aByteArray1853[((Class124) this).anInt1818] = i_112_;
        ((Class124) this).anIntArray1867[((Class124) this).anInt1818] = i_109_;
        int i_117_ = 93 % ((i - -19) / 56);
        return (byte) ((Class124) this).anInt1818++;
    }

    private final void method1106(byte[] is, byte i) {
        anInt1828++;
        Class348_Sub49 class348_sub49 = new Class348_Sub49(is);
        Class348_Sub49 class348_sub49_118_ = new Class348_Sub49(is);
        Class348_Sub49 class348_sub49_119_ = new Class348_Sub49(is);
        Class348_Sub49 class348_sub49_120_ = new Class348_Sub49(is);
        Class348_Sub49 class348_sub49_121_ = new Class348_Sub49(is);
        Class348_Sub49 class348_sub49_122_ = new Class348_Sub49(is);
        Class348_Sub49 class348_sub49_123_ = new Class348_Sub49(is);
        ((Class348_Sub49) class348_sub49).anInt7197 = -23 + is.length;
        ((Class124) this).anInt1836 = class348_sub49.method3330(842397944);
        ((Class124) this).anInt1817 = class348_sub49.method3330(842397944);
        ((Class124) this).anInt1818 = class348_sub49.method3387(255);
        int i_124_ = class348_sub49.method3387(255);
        boolean bool = (0x1 & i_124_ ^ 0xffffffff) == -2;
        boolean bool_125_ = (i_124_ & 0x2) == 2;
        boolean bool_126_ = (i_124_ & 0x4 ^ 0xffffffff) == -5;
        boolean bool_127_ = (i_124_ & 0x8) == 8;
        if (bool_127_) {
            ((Class348_Sub49) class348_sub49).anInt7197 -= 7;
            ((Class124) this).anInt1830 = class348_sub49.method3387(255);
            ((Class348_Sub49) class348_sub49).anInt7197 += 6;
        }
        int i_128_ = class348_sub49.method3387(255);
        int i_129_ = class348_sub49.method3387(255);
        int i_130_ = class348_sub49.method3387(255);
        int i_131_ = class348_sub49.method3387(255);
        int i_132_ = class348_sub49.method3387(255);
        int i_133_ = class348_sub49.method3330(842397944);
        int i_134_ = class348_sub49.method3330(842397944);
        int i_135_ = class348_sub49.method3330(842397944);
        int i_136_ = class348_sub49.method3330(842397944);
        int i_137_ = class348_sub49.method3330(842397944);
        int i_138_ = 0;
        int i_139_ = 0;
        int i_140_ = 0;
        if ((((Class124) this).anInt1818 ^ 0xffffffff) < -1) {
            ((Class348_Sub49) class348_sub49).anInt7197 = 0;
            ((Class124) this).aByteArray1823
                    = new byte[((Class124) this).anInt1818];
            for (int i_141_ = 0; ((((Class124) this).anInt1818 ^ 0xffffffff)
                    < (i_141_ ^ 0xffffffff)); i_141_++) {
                byte i_142_ = (((Class124) this).aByteArray1823[i_141_]
                        = class348_sub49.method3388(-124));
                if (i_142_ >= 1 && (i_142_ ^ 0xffffffff) >= -4)
                    i_139_++;
                if (i_142_ == 2)
                    i_140_++;
                if (i_142_ == 0)
                    i_138_++;
            }
        }
        int i_143_ = ((Class124) this).anInt1818;
        int i_144_ = i_143_;
        i_143_ += ((Class124) this).anInt1836;
        int i_145_ = i_143_;
        if (bool)
            i_143_ += ((Class124) this).anInt1817;
        int i_146_ = i_143_;
        i_143_ += ((Class124) this).anInt1817;
        int i_147_ = i_143_;
        if ((i_128_ ^ 0xffffffff) == -256)
            i_143_ += ((Class124) this).anInt1817;
        int i_148_ = i_143_;
        if ((i_130_ ^ 0xffffffff) == -2)
            i_143_ += ((Class124) this).anInt1817;
        int i_149_ = i_143_;
        if (i_132_ == 1)
            i_143_ += ((Class124) this).anInt1836;
        int i_150_ = i_143_;
        if (i_129_ == 1)
            i_143_ += ((Class124) this).anInt1817;
        if (i <= 68)
            ((Class124) this).anInt1821 = 85;
        int i_151_ = i_143_;
        i_143_ += i_136_;
        int i_152_ = i_143_;
        if (i_131_ == 1)
            i_143_ += 2 * ((Class124) this).anInt1817;
        int i_153_ = i_143_;
        i_143_ += i_137_;
        int i_154_ = i_143_;
        i_143_ += 2 * ((Class124) this).anInt1817;
        int i_155_ = i_143_;
        i_143_ += i_133_;
        int i_156_ = i_143_;
        i_143_ += i_134_;
        int i_157_ = i_143_;
        i_143_ += i_135_;
        int i_158_ = i_143_;
        i_143_ += i_138_ * 6;
        int i_159_ = i_143_;
        i_143_ += 6 * i_139_;
        int i_160_ = 6;
        if (((Class124) this).anInt1830 == 14)
            i_160_ = 7;
        else if (((Class124) this).anInt1830 >= 15)
            i_160_ = 9;
        int i_161_ = i_143_;
        i_143_ += i_160_ * i_139_;
        int i_162_ = i_143_;
        i_143_ += i_139_;
        int i_163_ = i_143_;
        i_143_ += i_139_;
        int i_164_ = i_143_;
        i_143_ += 2 * i_140_ + i_139_;
        ((Class124) this).aShortArray1835
                = new short[((Class124) this).anInt1817];
        ((Class124) this).aShortArray1862
                = new short[((Class124) this).anInt1817];
        if ((i_130_ ^ 0xffffffff) == -2)
            ((Class124) this).anIntArray1824
                    = new int[((Class124) this).anInt1817];
        if (((Class124) this).anInt1818 > 0) {
            if (i_140_ > 0) {
                ((Class124) this).anIntArray1857 = new int[i_140_];
                ((Class124) this).anIntArray1865 = new int[i_140_];
            }
            ((Class124) this).aShortArray1849
                    = new short[((Class124) this).anInt1818];
            ((Class124) this).aShortArray1829
                    = new short[((Class124) this).anInt1818];
            if ((i_139_ ^ 0xffffffff) < -1) {
                ((Class124) this).anIntArray1867 = new int[i_139_];
                ((Class124) this).aByteArray1853 = new byte[i_139_];
                ((Class124) this).anIntArray1816 = new int[i_139_];
                ((Class124) this).aByteArray1833 = new byte[i_139_];
                ((Class124) this).anIntArray1844 = new int[i_139_];
                ((Class124) this).anIntArray1859 = new int[i_139_];
            }
            ((Class124) this).aShortArray1825
                    = new short[((Class124) this).anInt1818];
        }
        if (bool)
            ((Class124) this).aByteArray1843
                    = new byte[((Class124) this).anInt1817];
        if ((i_129_ ^ 0xffffffff) == -2)
            ((Class124) this).aByteArray1834
                    = new byte[((Class124) this).anInt1817];
        if ((i_128_ ^ 0xffffffff) == -256)
            ((Class124) this).aByteArray1839
                    = new byte[((Class124) this).anInt1817];
        else
            ((Class124) this).aByte1851 = (byte) i_128_;
        ((Class124) this).aShortArray1855
                = new short[((Class124) this).anInt1817];
        ((Class124) this).anIntArray1847
                = new int[((Class124) this).anInt1836];
        ((Class124) this).aShortArray1863
                = new short[((Class124) this).anInt1817];
        if ((i_131_ ^ 0xffffffff) == -2
                && (((Class124) this).anInt1818 ^ 0xffffffff) < -1)
            ((Class124) this).aByteArray1820
                    = new byte[((Class124) this).anInt1817];
        int i_165_ = i_143_;
        ((Class124) this).anIntArray1852
                = new int[((Class124) this).anInt1836];
        ((Class124) this).anIntArray1841
                = new int[((Class124) this).anInt1836];
        if ((i_132_ ^ 0xffffffff) == -2)
            ((Class124) this).anIntArray1868
                    = new int[((Class124) this).anInt1836];
        ((Class348_Sub49) class348_sub49).anInt7197 = i_144_;
        if ((i_131_ ^ 0xffffffff) == -2)
            ((Class124) this).aShortArray1822
                    = new short[((Class124) this).anInt1817];
        ((Class348_Sub49) class348_sub49_118_).anInt7197 = i_155_;
        ((Class348_Sub49) class348_sub49_119_).anInt7197 = i_156_;
        ((Class348_Sub49) class348_sub49_120_).anInt7197 = i_157_;
        ((Class348_Sub49) class348_sub49_121_).anInt7197 = i_149_;
        int i_166_ = 0;
        int i_167_ = 0;
        int i_168_ = 0;
        for (int i_169_ = 0; ((Class124) this).anInt1836 > i_169_; i_169_++) {
            int i_170_ = class348_sub49.method3387(255);
            int i_171_ = 0;
            if ((i_170_ & 0x1 ^ 0xffffffff) != -1)
                i_171_ = class348_sub49_118_.method3362((byte) 77);
            int i_172_ = 0;
            if ((i_170_ & 0x2 ^ 0xffffffff) != -1)
                i_172_ = class348_sub49_119_.method3362((byte) 77);
            int i_173_ = 0;
            if ((0x4 & i_170_ ^ 0xffffffff) != -1)
                i_173_ = class348_sub49_120_.method3362((byte) 77);
            ((Class124) this).anIntArray1841[i_169_] = i_171_ + i_166_;
            ((Class124) this).anIntArray1847[i_169_] = i_172_ + i_167_;
            ((Class124) this).anIntArray1852[i_169_] = i_168_ + i_173_;
            i_167_ = ((Class124) this).anIntArray1847[i_169_];
            i_166_ = ((Class124) this).anIntArray1841[i_169_];
            i_168_ = ((Class124) this).anIntArray1852[i_169_];
            if ((i_132_ ^ 0xffffffff) == -2)
                ((Class124) this).anIntArray1868[i_169_]
                        = class348_sub49_121_.method3387(255);
        }
        ((Class348_Sub49) class348_sub49).anInt7197 = i_154_;
        ((Class348_Sub49) class348_sub49_118_).anInt7197 = i_145_;
        ((Class348_Sub49) class348_sub49_119_).anInt7197 = i_147_;
        ((Class348_Sub49) class348_sub49_120_).anInt7197 = i_150_;
        ((Class348_Sub49) class348_sub49_121_).anInt7197 = i_148_;
        ((Class348_Sub49) class348_sub49_122_).anInt7197 = i_152_;
        ((Class348_Sub49) class348_sub49_123_).anInt7197 = i_153_;
        for (int i_174_ = 0;
             ((i_174_ ^ 0xffffffff)
                     > (((Class124) this).anInt1817 ^ 0xffffffff));
             i_174_++) {
            ((Class124) this).aShortArray1862[i_174_]
                    = (short) class348_sub49.method3330(842397944);
            if (bool)
                ((Class124) this).aByteArray1843[i_174_]
                        = class348_sub49_118_.method3388(-98);
            if ((i_128_ ^ 0xffffffff) == -256)
                ((Class124) this).aByteArray1839[i_174_]
                        = class348_sub49_119_.method3388(-78);
            if (i_129_ == 1)
                ((Class124) this).aByteArray1834[i_174_]
                        = class348_sub49_120_.method3388(-99);
            if (i_130_ == 1)
                ((Class124) this).anIntArray1824[i_174_]
                        = class348_sub49_121_.method3387(255);
            if (i_131_ == 1)
                ((Class124) this).aShortArray1822[i_174_]
                        = (short) (class348_sub49_122_.method3330(842397944) + -1);
            if (((Class124) this).aByteArray1820 != null) {
                if (((Class124) this).aShortArray1822[i_174_] == -1)
                    ((Class124) this).aByteArray1820[i_174_] = (byte) -1;
                else
                    ((Class124) this).aByteArray1820[i_174_]
                            = (byte) (-1 + class348_sub49_123_.method3387(255));
            }
        }
        ((Class348_Sub49) class348_sub49).anInt7197 = i_151_;
        ((Class124) this).anInt1821 = -1;
        ((Class348_Sub49) class348_sub49_118_).anInt7197 = i_146_;
        short i_175_ = 0;
        short i_176_ = 0;
        short i_177_ = 0;
        int i_178_ = 0;
        for (int i_179_ = 0; ((((Class124) this).anInt1817 ^ 0xffffffff)
                < (i_179_ ^ 0xffffffff)); i_179_++) {
            int i_180_ = class348_sub49_118_.method3387(255);
            if ((i_180_ ^ 0xffffffff) == -2) {
                i_175_
                        = (short) (class348_sub49.method3362((byte) 77) + i_178_);
                i_178_ = i_175_;
                i_176_
                        = (short) (class348_sub49.method3362((byte) 77) + i_178_);
                i_178_ = i_176_;
                i_177_
                        = (short) (i_178_ + class348_sub49.method3362((byte) 77));
                i_178_ = i_177_;
                ((Class124) this).aShortArray1863[i_179_] = i_175_;
                ((Class124) this).aShortArray1835[i_179_] = i_176_;
                ((Class124) this).aShortArray1855[i_179_] = i_177_;
                if ((((Class124) this).anInt1821 ^ 0xffffffff)
                        > (i_175_ ^ 0xffffffff))
                    ((Class124) this).anInt1821 = i_175_;
                if (((Class124) this).anInt1821 < i_176_)
                    ((Class124) this).anInt1821 = i_176_;
                if (i_177_ > ((Class124) this).anInt1821)
                    ((Class124) this).anInt1821 = i_177_;
            }
            if ((i_180_ ^ 0xffffffff) == -3) {
                i_176_ = i_177_;
                i_177_
                        = (short) (class348_sub49.method3362((byte) 77) + i_178_);
                ((Class124) this).aShortArray1863[i_179_] = i_175_;
                i_178_ = i_177_;
                ((Class124) this).aShortArray1835[i_179_] = i_176_;
                ((Class124) this).aShortArray1855[i_179_] = i_177_;
                if (((Class124) this).anInt1821 < i_177_)
                    ((Class124) this).anInt1821 = i_177_;
            }
            if (i_180_ == 3) {
                i_175_ = i_177_;
                i_177_
                        = (short) (class348_sub49.method3362((byte) 77) + i_178_);
                i_178_ = i_177_;
                ((Class124) this).aShortArray1863[i_179_] = i_175_;
                ((Class124) this).aShortArray1835[i_179_] = i_176_;
                ((Class124) this).aShortArray1855[i_179_] = i_177_;
                if (((Class124) this).anInt1821 < i_177_)
                    ((Class124) this).anInt1821 = i_177_;
            }
            if (i_180_ == 4) {
                short i_181_ = i_175_;
                i_175_ = i_176_;
                i_177_
                        = (short) (i_178_ + class348_sub49.method3362((byte) 77));
                i_176_ = i_181_;
                ((Class124) this).aShortArray1863[i_179_] = i_175_;
                i_178_ = i_177_;
                ((Class124) this).aShortArray1835[i_179_] = i_176_;
                ((Class124) this).aShortArray1855[i_179_] = i_177_;
                if (((Class124) this).anInt1821 < i_177_)
                    ((Class124) this).anInt1821 = i_177_;
            }
        }
        ((Class348_Sub49) class348_sub49).anInt7197 = i_158_;
        ((Class124) this).anInt1821++;
        ((Class348_Sub49) class348_sub49_118_).anInt7197 = i_159_;
        ((Class348_Sub49) class348_sub49_119_).anInt7197 = i_161_;
        ((Class348_Sub49) class348_sub49_120_).anInt7197 = i_162_;
        ((Class348_Sub49) class348_sub49_121_).anInt7197 = i_163_;
        ((Class348_Sub49) class348_sub49_122_).anInt7197 = i_164_;
        for (int i_182_ = 0; ((Class124) this).anInt1818 > i_182_; i_182_++) {
            int i_183_ = ((Class124) this).aByteArray1823[i_182_] & 0xff;
            if (i_183_ == 0) {
                ((Class124) this).aShortArray1829[i_182_]
                        = (short) class348_sub49.method3330(842397944);
                ((Class124) this).aShortArray1849[i_182_]
                        = (short) class348_sub49.method3330(842397944);
                ((Class124) this).aShortArray1825[i_182_]
                        = (short) class348_sub49.method3330(842397944);
            }
            if ((i_183_ ^ 0xffffffff) == -2) {
                ((Class124) this).aShortArray1829[i_182_]
                        = (short) class348_sub49_118_.method3330(842397944);
                ((Class124) this).aShortArray1849[i_182_]
                        = (short) class348_sub49_118_.method3330(842397944);
                ((Class124) this).aShortArray1825[i_182_]
                        = (short) class348_sub49_118_.method3330(842397944);
                if (((Class124) this).anInt1830 >= 15) {
                    ((Class124) this).anIntArray1859[i_182_]
                            = class348_sub49_119_.method3351(-1);
                    ((Class124) this).anIntArray1816[i_182_]
                            = class348_sub49_119_.method3351(-1);
                    ((Class124) this).anIntArray1844[i_182_]
                            = class348_sub49_119_.method3351(-1);
                } else {
                    ((Class124) this).anIntArray1859[i_182_]
                            = class348_sub49_119_.method3330(842397944);
                    if ((((Class124) this).anInt1830 ^ 0xffffffff) <= -15)
                        ((Class124) this).anIntArray1816[i_182_]
                                = class348_sub49_119_.method3351(-1);
                    else
                        ((Class124) this).anIntArray1816[i_182_]
                                = class348_sub49_119_.method3330(842397944);
                    ((Class124) this).anIntArray1844[i_182_]
                            = class348_sub49_119_.method3330(842397944);
                }
                ((Class124) this).aByteArray1833[i_182_]
                        = class348_sub49_120_.method3388(-86);
                ((Class124) this).aByteArray1853[i_182_]
                        = class348_sub49_121_.method3388(-116);
                ((Class124) this).anIntArray1867[i_182_]
                        = class348_sub49_122_.method3388(-79);
            }
            if (i_183_ == 2) {
                ((Class124) this).aShortArray1829[i_182_]
                        = (short) class348_sub49_118_.method3330(842397944);
                ((Class124) this).aShortArray1849[i_182_]
                        = (short) class348_sub49_118_.method3330(842397944);
                ((Class124) this).aShortArray1825[i_182_]
                        = (short) class348_sub49_118_.method3330(842397944);
                if ((((Class124) this).anInt1830 ^ 0xffffffff) <= -16) {
                    ((Class124) this).anIntArray1859[i_182_]
                            = class348_sub49_119_.method3351(-1);
                    ((Class124) this).anIntArray1816[i_182_]
                            = class348_sub49_119_.method3351(-1);
                    ((Class124) this).anIntArray1844[i_182_]
                            = class348_sub49_119_.method3351(-1);
                } else {
                    ((Class124) this).anIntArray1859[i_182_]
                            = class348_sub49_119_.method3330(842397944);
                    if ((((Class124) this).anInt1830 ^ 0xffffffff) > -15)
                        ((Class124) this).anIntArray1816[i_182_]
                                = class348_sub49_119_.method3330(842397944);
                    else
                        ((Class124) this).anIntArray1816[i_182_]
                                = class348_sub49_119_.method3351(-1);
                    ((Class124) this).anIntArray1844[i_182_]
                            = class348_sub49_119_.method3330(842397944);
                }
                ((Class124) this).aByteArray1833[i_182_]
                        = class348_sub49_120_.method3388(-97);
                ((Class124) this).aByteArray1853[i_182_]
                        = class348_sub49_121_.method3388(-100);
                ((Class124) this).anIntArray1867[i_182_]
                        = class348_sub49_122_.method3388(-124);
                ((Class124) this).anIntArray1857[i_182_]
                        = class348_sub49_122_.method3388(-112);
                ((Class124) this).anIntArray1865[i_182_]
                        = class348_sub49_122_.method3388(-114);
            }
            if (i_183_ == 3) {
                ((Class124) this).aShortArray1829[i_182_]
                        = (short) class348_sub49_118_.method3330(842397944);
                ((Class124) this).aShortArray1849[i_182_]
                        = (short) class348_sub49_118_.method3330(842397944);
                ((Class124) this).aShortArray1825[i_182_]
                        = (short) class348_sub49_118_.method3330(842397944);
                if ((((Class124) this).anInt1830 ^ 0xffffffff) > -16) {
                    ((Class124) this).anIntArray1859[i_182_]
                            = class348_sub49_119_.method3330(842397944);
                    if ((((Class124) this).anInt1830 ^ 0xffffffff) > -15)
                        ((Class124) this).anIntArray1816[i_182_]
                                = class348_sub49_119_.method3330(842397944);
                    else
                        ((Class124) this).anIntArray1816[i_182_]
                                = class348_sub49_119_.method3351(-1);
                    ((Class124) this).anIntArray1844[i_182_]
                            = class348_sub49_119_.method3330(842397944);
                } else {
                    ((Class124) this).anIntArray1859[i_182_]
                            = class348_sub49_119_.method3351(-1);
                    ((Class124) this).anIntArray1816[i_182_]
                            = class348_sub49_119_.method3351(-1);
                    ((Class124) this).anIntArray1844[i_182_]
                            = class348_sub49_119_.method3351(-1);
                }
                ((Class124) this).aByteArray1833[i_182_]
                        = class348_sub49_120_.method3388(-104);
                ((Class124) this).aByteArray1853[i_182_]
                        = class348_sub49_121_.method3388(-127);
                ((Class124) this).anIntArray1867[i_182_]
                        = class348_sub49_122_.method3388(-109);
            }
        }
        ((Class348_Sub49) class348_sub49).anInt7197 = i_165_;
        if (bool_125_) {
            int i_184_ = class348_sub49.method3387(255);
            if ((i_184_ ^ 0xffffffff) < -1) {
                ((Class124) this).aClass129Array1846 = new Class129[i_184_];
                for (int i_185_ = 0; i_184_ > i_185_; i_185_++) {
                    int i_186_ = class348_sub49.method3330(842397944);
                    int i_187_ = class348_sub49.method3330(842397944);
                    byte i_188_;
                    if ((i_128_ ^ 0xffffffff) != -256)
                        i_188_ = (byte) i_128_;
                    else
                        i_188_ = ((Class124) this).aByteArray1839[i_187_];
                    ((Class124) this).aClass129Array1846[i_185_]
                            = (new Class129
                            (i_186_, ((Class124) this).aShortArray1863[i_187_],
                                    ((Class124) this).aShortArray1835[i_187_],
                                    ((Class124) this).aShortArray1855[i_187_],
                                    i_188_));
                }
            }
            int i_189_ = class348_sub49.method3387(255);
            if ((i_189_ ^ 0xffffffff) < -1) {
                ((Class124) this).aClass342Array1866 = new Class342[i_189_];
                for (int i_190_ = 0; i_189_ > i_190_; i_190_++) {
                    int i_191_ = class348_sub49.method3330(842397944);
                    int i_192_ = class348_sub49.method3330(842397944);
                    ((Class124) this).aClass342Array1866[i_190_]
                            = new Class342(i_191_, i_192_);
                }
            }
        }
        if (bool_126_) {
            int i_193_ = class348_sub49.method3387(255);
            if ((i_193_ ^ 0xffffffff) < -1) {
                ((Class124) this).aClass162Array1832 = new Class162[i_193_];
                for (int i_194_ = 0;
                     (i_194_ ^ 0xffffffff) > (i_193_ ^ 0xffffffff); i_194_++) {
                    int i_195_ = class348_sub49.method3330(842397944);
                    int i_196_ = class348_sub49.method3330(842397944);
                    int i_197_ = class348_sub49.method3387(255);
                    byte i_198_ = class348_sub49.method3388(-127);
                    ((Class124) this).aClass162Array1832[i_194_]
                            = new Class162(i_195_, i_196_, i_197_, i_198_);
                }
            }
        }
    }

    final void method1107(int i, int i_199_, int i_200_, int i_201_) {
        if ((i_200_ ^ 0xffffffff) != -1) {
            int i_202_ = Class70.anIntArray1207[i_200_];
            int i_203_ = Class70.anIntArray1204[i_200_];
            for (int i_204_ = 0; i_204_ < ((Class124) this).anInt1836;
                 i_204_++) {
                int i_205_
                        = ((i_203_ * ((Class124) this).anIntArray1841[i_204_]
                        + ((Class124) this).anIntArray1847[i_204_] * i_202_)
                        >> 53081646);
                ((Class124) this).anIntArray1847[i_204_]
                        = ((-(((Class124) this).anIntArray1841[i_204_] * i_202_)
                        + ((Class124) this).anIntArray1847[i_204_] * i_203_)
                        >> 788620462);
                ((Class124) this).anIntArray1841[i_204_] = i_205_;
            }
        }
        if (i != 6875)
            ((Class124) this).aShortArray1835 = null;
        anInt1837++;
        if (i_201_ != 0) {
            int i_206_ = Class70.anIntArray1207[i_201_];
            int i_207_ = Class70.anIntArray1204[i_201_];
            for (int i_208_ = 0; i_208_ < ((Class124) this).anInt1836;
                 i_208_++) {
                int i_209_
                        = ((((Class124) this).anIntArray1847[i_208_] * i_207_
                        + -(i_206_ * ((Class124) this).anIntArray1852[i_208_]))
                        >> -723657074);
                ((Class124) this).anIntArray1852[i_208_]
                        = ((((Class124) this).anIntArray1847[i_208_] * i_206_
                        - -(i_207_ * ((Class124) this).anIntArray1852[i_208_]))
                        >> 1866464078);
                ((Class124) this).anIntArray1847[i_208_] = i_209_;
            }
        }
        if (i_199_ != 0) {
            int i_210_ = Class70.anIntArray1207[i_199_];
            int i_211_ = Class70.anIntArray1204[i_199_];
            for (int i_212_ = 0; ((Class124) this).anInt1836 > i_212_;
                 i_212_++) {
                int i_213_
                        = ((i_211_ * ((Class124) this).anIntArray1841[i_212_]
                        + ((Class124) this).anIntArray1852[i_212_] * i_210_)
                        >> -1869821682);
                ((Class124) this).anIntArray1852[i_212_]
                        = ((i_211_ * ((Class124) this).anIntArray1852[i_212_]
                        + -(((Class124) this).anIntArray1841[i_212_] * i_210_))
                        >> -1993052722);
                ((Class124) this).anIntArray1841[i_212_] = i_213_;
            }
        }
    }

    public Class124() {
        ((Class124) this).anInt1817 = 0;
        ((Class124) this).aByte1851 = (byte) 0;
        ((Class124) this).anInt1821 = 0;
        ((Class124) this).anInt1818 = 0;
    }

    Class124(byte[] is) {
        ((Class124) this).anInt1817 = 0;
        ((Class124) this).aByte1851 = (byte) 0;
        ((Class124) this).anInt1821 = 0;
        ((Class124) this).anInt1818 = 0;
        if ((is[is.length + -1] ^ 0xffffffff) == 0
                && (is[-2 + is.length] ^ 0xffffffff) == 0)
            method1106(is, (byte) 93);
        else
            method1103(1, is);
    }

    static final void method1108(byte i, Canvas canvas) {
        anInt1850++;
        Dimension dimension = canvas.getSize();
        if (i != -99)
            method1096(57);
        Class85.method828((byte) 38, dimension.height, dimension.width);
        if (Class348_Sub49.anInt7207 != 1)
            Class21.aHa326.method3643(canvas, Class59_Sub1.anInt5283,
                    Class107.anInt1651);
        else
            Class21.aHa326.method3643(canvas, Class348_Sub16_Sub1.anInt8854,
                    Class239_Sub16.anInt6008);
    }

    Class124(int i, int i_214_, int i_215_) {
        ((Class124) this).anInt1817 = 0;
        ((Class124) this).aByte1851 = (byte) 0;
        ((Class124) this).anInt1821 = 0;
        ((Class124) this).anInt1818 = 0;
        ((Class124) this).aByteArray1820 = new byte[i_214_];
        ((Class124) this).aShortArray1863 = new short[i_214_];
        ((Class124) this).aShortArray1862 = new short[i_214_];
        ((Class124) this).anIntArray1868 = new int[i];
        ((Class124) this).anIntArray1824 = new int[i_214_];
        ((Class124) this).anIntArray1852 = new int[i];
        if ((i_215_ ^ 0xffffffff) < -1) {
            ((Class124) this).anIntArray1857 = new int[i_215_];
            ((Class124) this).anIntArray1867 = new int[i_215_];
            ((Class124) this).aShortArray1849 = new short[i_215_];
            ((Class124) this).anIntArray1844 = new int[i_215_];
            ((Class124) this).aShortArray1825 = new short[i_215_];
            ((Class124) this).anIntArray1865 = new int[i_215_];
            ((Class124) this).aByteArray1833 = new byte[i_215_];
            ((Class124) this).anIntArray1859 = new int[i_215_];
            ((Class124) this).aShortArray1829 = new short[i_215_];
            ((Class124) this).aByteArray1823 = new byte[i_215_];
            ((Class124) this).anIntArray1816 = new int[i_215_];
            ((Class124) this).aByteArray1853 = new byte[i_215_];
        }
        ((Class124) this).aShortArray1822 = new short[i_214_];
        ((Class124) this).aByteArray1839 = new byte[i_214_];
        ((Class124) this).aShortArray1855 = new short[i_214_];
        ((Class124) this).aShortArray1835 = new short[i_214_];
        ((Class124) this).anIntArray1841 = new int[i];
        ((Class124) this).aByteArray1843 = new byte[i_214_];
        ((Class124) this).anIntArray1847 = new int[i];
        ((Class124) this).aByteArray1834 = new byte[i_214_];
    }

    Class124(Class124[] class124s, int i) {
        ((Class124) this).anInt1817 = 0;
        ((Class124) this).aByte1851 = (byte) 0;
        ((Class124) this).anInt1821 = 0;
        ((Class124) this).anInt1818 = 0;
        ((Class124) this).anInt1818 = 0;
        ((Class124) this).anInt1817 = 0;
        ((Class124) this).anInt1836 = 0;
        int i_216_ = 0;
        int i_217_ = 0;
        int i_218_ = 0;
        boolean bool = false;
        boolean bool_219_ = false;
        boolean bool_220_ = false;
        boolean bool_221_ = false;
        boolean bool_222_ = false;
        ((Class124) this).aByte1851 = (byte) -1;
        boolean bool_223_ = false;
        for (int i_224_ = 0; i > i_224_; i_224_++) {
            Class124 class124_225_ = class124s[i_224_];
            if (class124_225_ != null) {
                ((Class124) this).anInt1817
                        += ((Class124) class124_225_).anInt1817;
                ((Class124) this).anInt1836
                        += ((Class124) class124_225_).anInt1836;
                ((Class124) this).anInt1818
                        += ((Class124) class124_225_).anInt1818;
                bool
                        = bool | ((Class124) class124_225_).aByteArray1843 != null;
                if (((Class124) class124_225_).aClass162Array1832 != null)
                    i_218_ += (((Class124) class124_225_)
                            .aClass162Array1832).length;
                if (((Class124) class124_225_).aClass129Array1846 != null)
                    i_216_ += (((Class124) class124_225_)
                            .aClass129Array1846).length;
                if (((Class124) class124_225_).aClass342Array1866 != null)
                    i_217_ += (((Class124) class124_225_)
                            .aClass342Array1866).length;
                bool_222_
                        = (bool_222_
                        | ((Class124) class124_225_).aShortArray1822 != null);
                bool_221_
                        = (bool_221_
                        | ((Class124) class124_225_).aByteArray1820 != null);
                if (((Class124) class124_225_).aByteArray1839 != null)
                    bool_219_ = true;
                else {
                    if (((Class124) this).aByte1851 == -1)
                        ((Class124) this).aByte1851
                                = ((Class124) class124_225_).aByte1851;
                    if ((((Class124) class124_225_).aByte1851 ^ 0xffffffff)
                            != (((Class124) this).aByte1851 ^ 0xffffffff))
                        bool_219_ = true;
                }
                bool_220_
                        = (bool_220_
                        | ((Class124) class124_225_).aByteArray1834 != null);
                bool_223_
                        = (bool_223_
                        | ((Class124) class124_225_).anIntArray1824 != null);
            }
        }
        ((Class124) this).aShortArray1835
                = new short[((Class124) this).anInt1817];
        if ((((Class124) this).anInt1818 ^ 0xffffffff) < -1) {
            ((Class124) this).aShortArray1829
                    = new short[((Class124) this).anInt1818];
            ((Class124) this).aByteArray1823
                    = new byte[((Class124) this).anInt1818];
            ((Class124) this).anIntArray1867
                    = new int[((Class124) this).anInt1818];
            ((Class124) this).anIntArray1844
                    = new int[((Class124) this).anInt1818];
            ((Class124) this).aByteArray1833
                    = new byte[((Class124) this).anInt1818];
            ((Class124) this).anIntArray1857
                    = new int[((Class124) this).anInt1818];
            ((Class124) this).anIntArray1865
                    = new int[((Class124) this).anInt1818];
            ((Class124) this).anIntArray1859
                    = new int[((Class124) this).anInt1818];
            ((Class124) this).aByteArray1853
                    = new byte[((Class124) this).anInt1818];
            ((Class124) this).aShortArray1849
                    = new short[((Class124) this).anInt1818];
            ((Class124) this).anIntArray1816
                    = new int[((Class124) this).anInt1818];
            ((Class124) this).aShortArray1825
                    = new short[((Class124) this).anInt1818];
        }
        ((Class124) this).aShortArray1856
                = new short[((Class124) this).anInt1817];
        if (bool_222_)
            ((Class124) this).aShortArray1822
                    = new short[((Class124) this).anInt1817];
        ((Class124) this).aShortArray1863
                = new short[((Class124) this).anInt1817];
        if (bool_223_)
            ((Class124) this).anIntArray1824
                    = new int[((Class124) this).anInt1817];
        if (bool_219_)
            ((Class124) this).aByteArray1839
                    = new byte[((Class124) this).anInt1817];
        if (bool)
            ((Class124) this).aByteArray1843
                    = new byte[((Class124) this).anInt1817];
        if ((i_218_ ^ 0xffffffff) < -1)
            ((Class124) this).aClass162Array1832 = new Class162[i_218_];
        if ((i_217_ ^ 0xffffffff) < -1)
            ((Class124) this).aClass342Array1866 = new Class342[i_217_];
        ((Class124) this).anIntArray1868
                = new int[((Class124) this).anInt1836];
        if (bool_221_)
            ((Class124) this).aByteArray1820
                    = new byte[((Class124) this).anInt1817];
        ((Class124) this).anIntArray1852
                = new int[((Class124) this).anInt1836];
        ((Class124) this).aShortArray1862
                = new short[((Class124) this).anInt1817];
        ((Class124) this).anIntArray1841
                = new int[((Class124) this).anInt1836];
        ((Class124) this).anIntArray1847
                = new int[((Class124) this).anInt1836];
        if (i_216_ > 0)
            ((Class124) this).aClass129Array1846 = new Class129[i_216_];
        ((Class124) this).aShortArray1855
                = new short[((Class124) this).anInt1817];
        if (bool_220_)
            ((Class124) this).aByteArray1834
                    = new byte[((Class124) this).anInt1817];
        ((Class124) this).aShortArray1842
                = new short[((Class124) this).anInt1836];
        ((Class124) this).anInt1818 = 0;
        i_217_ = 0;
        i_218_ = 0;
        i_216_ = 0;
        ((Class124) this).anInt1817 = 0;
        ((Class124) this).anInt1836 = 0;
        for (int i_226_ = 0; (i_226_ ^ 0xffffffff) > (i ^ 0xffffffff);
             i_226_++) {
            short i_227_ = (short) (1 << i_226_);
            Class124 class124_228_ = class124s[i_226_];
            if (class124_228_ != null) {
                if (((Class124) class124_228_).aClass162Array1832 != null) {
                    for (int i_229_ = 0;
                         (((Class124) class124_228_).aClass162Array1832.length
                                 > i_229_);
                         i_229_++) {
                        Class162 class162 = (((Class124) class124_228_)
                                .aClass162Array1832[i_229_]);
                        ((Class124) this).aClass162Array1832[i_218_++]
                                = class162.method1266(5, ((((Class162) class162)
                                .anInt2155)
                                - -(((Class124) this)
                                .anInt1817)));
                    }
                }
                for (int i_230_ = 0;
                     ((Class124) class124_228_).anInt1817 > i_230_; i_230_++) {
                    if (bool
                            && ((Class124) class124_228_).aByteArray1843 != null)
                        ((Class124) this).aByteArray1843[(((Class124) this)
                                .anInt1817)]
                                = (((Class124) class124_228_).aByteArray1843
                                [i_230_]);
                    if (bool_219_) {
                        if (((Class124) class124_228_).aByteArray1839 != null)
                            ((Class124) this).aByteArray1839[(((Class124) this)
                                    .anInt1817)]
                                    = (((Class124) class124_228_).aByteArray1839
                                    [i_230_]);
                        else
                            ((Class124) this).aByteArray1839[(((Class124) this)
                                    .anInt1817)]
                                    = ((Class124) class124_228_).aByte1851;
                    }
                    if (bool_220_
                            && ((Class124) class124_228_).aByteArray1834 != null)
                        ((Class124) this).aByteArray1834[(((Class124) this)
                                .anInt1817)]
                                = (((Class124) class124_228_).aByteArray1834
                                [i_230_]);
                    if (bool_222_) {
                        if (((Class124) class124_228_).aShortArray1822 == null)
                            ((Class124) this).aShortArray1822
                                    [((Class124) this).anInt1817]
                                    = (short) -1;
                        else
                            ((Class124) this).aShortArray1822
                                    [((Class124) this).anInt1817]
                                    = (((Class124) class124_228_).aShortArray1822
                                    [i_230_]);
                    }
                    if (bool_223_) {
                        if (((Class124) class124_228_).anIntArray1824 == null)
                            ((Class124) this).anIntArray1824[(((Class124) this)
                                    .anInt1817)]
                                    = -1;
                        else
                            ((Class124) this).anIntArray1824[(((Class124) this)
                                    .anInt1817)]
                                    = (((Class124) class124_228_).anIntArray1824
                                    [i_230_]);
                    }
                    ((Class124) this).aShortArray1863[(((Class124) this)
                            .anInt1817)]
                            = (short) method1104(class124_228_, 0,
                            (((Class124) class124_228_)
                                    .aShortArray1863[i_230_]),
                            i_227_);
                    ((Class124) this).aShortArray1835[(((Class124) this)
                            .anInt1817)]
                            = (short) method1104(class124_228_, 0,
                            (((Class124) class124_228_)
                                    .aShortArray1835[i_230_]),
                            i_227_);
                    ((Class124) this).aShortArray1855[(((Class124) this)
                            .anInt1817)]
                            = (short) method1104(class124_228_, 0,
                            (((Class124) class124_228_)
                                    .aShortArray1855[i_230_]),
                            i_227_);
                    ((Class124) this).aShortArray1856[(((Class124) this)
                            .anInt1817)]
                            = i_227_;
                    ((Class124) this).aShortArray1862[(((Class124) this)
                            .anInt1817)]
                            = ((Class124) class124_228_).aShortArray1862[i_230_];
                    ((Class124) this).anInt1817++;
                }
                if (((Class124) class124_228_).aClass129Array1846 != null) {
                    for (int i_231_ = 0;
                         (((Class124) class124_228_).aClass129Array1846.length
                                 > i_231_);
                         i_231_++) {
                        int i_232_ = method1104(class124_228_, 0,
                                ((Class129)
                                        (((Class124) class124_228_)
                                                .aClass129Array1846
                                                [i_231_])).anInt1881,
                                i_227_);
                        int i_233_ = method1104(class124_228_, 0,
                                ((Class129)
                                        (((Class124) class124_228_)
                                                .aClass129Array1846
                                                [i_231_])).anInt1877,
                                i_227_);
                        int i_234_ = method1104(class124_228_, 0,
                                ((Class129)
                                        (((Class124) class124_228_)
                                                .aClass129Array1846
                                                [i_231_])).anInt1892,
                                i_227_);
                        ((Class124) this).aClass129Array1846[i_216_]
                                = ((Class124) class124_228_).aClass129Array1846
                                [i_231_]
                                .method1124(i_233_, -1, i_234_, i_232_);
                        i_216_++;
                    }
                }
                if (((Class124) class124_228_).aClass342Array1866 != null) {
                    for (int i_235_ = 0;
                         (i_235_ ^ 0xffffffff) > ((((Class124) class124_228_)
                                 .aClass342Array1866).length
                                 ^ 0xffffffff);
                         i_235_++) {
                        int i_236_ = method1104(class124_228_, 0,
                                ((Class342)
                                        (((Class124) class124_228_)
                                                .aClass342Array1866
                                                [i_235_])).anInt4244,
                                i_227_);
                        ((Class124) this).aClass342Array1866[i_217_]
                                = ((Class124) class124_228_).aClass342Array1866
                                [i_235_].method2687((byte) 94, i_236_);
                        i_217_++;
                    }
                }
            }
        }
        int i_237_ = 0;
        ((Class124) this).anInt1821 = ((Class124) this).anInt1836;
        for (int i_238_ = 0; (i_238_ ^ 0xffffffff) > (i ^ 0xffffffff);
             i_238_++) {
            short i_239_ = (short) (1 << i_238_);
            Class124 class124_240_ = class124s[i_238_];
            if (class124_240_ != null) {
                for (int i_241_ = 0;
                     ((Class124) class124_240_).anInt1817 > i_241_; i_241_++) {
                    if (bool_221_)
                        ((Class124) this).aByteArray1820[i_237_++]
                                = (byte) (((((Class124) class124_240_)
                                .aByteArray1820) != null
                                && ((((Class124) class124_240_)
                                .aByteArray1820[i_241_])
                                ^ 0xffffffff) != 0)
                                ? ((((Class124) class124_240_)
                                .aByteArray1820[i_241_])
                                + ((Class124) this).anInt1818)
                                : -1);
                }
                for (int i_242_ = 0;
                     ((i_242_ ^ 0xffffffff)
                             > (((Class124) class124_240_).anInt1818 ^ 0xffffffff));
                     i_242_++) {
                    byte i_243_
                            = (((Class124) this).aByteArray1823[(((Class124) this)
                            .anInt1818)]
                            = (((Class124) class124_240_).aByteArray1823
                            [i_242_]));
                    if ((i_243_ ^ 0xffffffff) == -1) {
                        ((Class124) this).aShortArray1829[(((Class124) this)
                                .anInt1818)]
                                = (short) method1104(class124_240_, 0,
                                (((Class124) class124_240_)
                                        .aShortArray1829[i_242_]),
                                i_239_);
                        ((Class124) this).aShortArray1849[(((Class124) this)
                                .anInt1818)]
                                = (short) method1104(class124_240_, 0,
                                (((Class124) class124_240_)
                                        .aShortArray1849[i_242_]),
                                i_239_);
                        ((Class124) this).aShortArray1825[(((Class124) this)
                                .anInt1818)]
                                = (short) method1104(class124_240_, 0,
                                (((Class124) class124_240_)
                                        .aShortArray1825[i_242_]),
                                i_239_);
                    }
                    if ((i_243_ ^ 0xffffffff) <= -2
                            && (i_243_ ^ 0xffffffff) >= -4) {
                        ((Class124) this).aShortArray1829[(((Class124) this)
                                .anInt1818)]
                                = (((Class124) class124_240_).aShortArray1829
                                [i_242_]);
                        ((Class124) this).aShortArray1849[(((Class124) this)
                                .anInt1818)]
                                = (((Class124) class124_240_).aShortArray1849
                                [i_242_]);
                        ((Class124) this).aShortArray1825[(((Class124) this)
                                .anInt1818)]
                                = (((Class124) class124_240_).aShortArray1825
                                [i_242_]);
                        ((Class124) this).anIntArray1859[(((Class124) this)
                                .anInt1818)]
                                = (((Class124) class124_240_).anIntArray1859
                                [i_242_]);
                        ((Class124) this).anIntArray1816[(((Class124) this)
                                .anInt1818)]
                                = (((Class124) class124_240_).anIntArray1816
                                [i_242_]);
                        ((Class124) this).anIntArray1844[(((Class124) this)
                                .anInt1818)]
                                = (((Class124) class124_240_).anIntArray1844
                                [i_242_]);
                        ((Class124) this).aByteArray1833[(((Class124) this)
                                .anInt1818)]
                                = (((Class124) class124_240_).aByteArray1833
                                [i_242_]);
                        ((Class124) this).aByteArray1853[(((Class124) this)
                                .anInt1818)]
                                = (((Class124) class124_240_).aByteArray1853
                                [i_242_]);
                        ((Class124) this).anIntArray1867[(((Class124) this)
                                .anInt1818)]
                                = (((Class124) class124_240_).anIntArray1867
                                [i_242_]);
                    }
                    if (i_243_ == 2) {
                        ((Class124) this).anIntArray1857[(((Class124) this)
                                .anInt1818)]
                                = (((Class124) class124_240_).anIntArray1857
                                [i_242_]);
                        ((Class124) this).anIntArray1865[(((Class124) this)
                                .anInt1818)]
                                = (((Class124) class124_240_).anIntArray1865
                                [i_242_]);
                    }
                    ((Class124) this).anInt1818++;
                }
            }
        }
    }
}
