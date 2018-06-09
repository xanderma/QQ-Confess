
public class akgq extends akgo {
    private static final byte[] b;
    private static final byte[] c;
    private static final byte[] d;
    public final boolean boola;
    int intb;
    public final boolean boolb;
    private int intc;
    public final boolean boolc;
    private final byte[] e;
    private final byte[] f;
    private static boolean boold;

    static {
        boolean var0;
        if (!Baze64.class.desiredAssertionStatus()) {
            var0 = true;
        } else {
            var0 = false;
        }

        boold = var0;
        b = new byte[]{65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};
        c = new byte[]{65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 45, 95};
        d = new byte[]{110, 76, 95, 101, 54, 114, 89, 117, 45, 73, 120, 112, 111, 55, 78, 68, 118, 97, 48, 75, 52, 50, 57, 104, 67, 81, 72, 79, 83, 86, 85, 74, 99, 109, 106, 119, 69, 49, 84, 56, 116, 51, 121, 98, 103, 90, 71, 66, 122, 53, 65, 105, 80, 107, 115, 108, 70, 113, 82, 102, 87, 77, 100, 88};
    }

    public akgq(int var1, byte[] var2) {
        boolean var4 = true;
        this.info = var2;
        boolean var3;
        if ((var1 & 1) == 0) {
            var3 = true;
        } else {
            var3 = false;
        }

        this.boola = var3;
        if ((var1 & 2) == 0) {
            var3 = true;
        } else {
            var3 = false;
        }

        this.boolb = var3;
        if ((var1 & 4) != 0) {
            var3 = var4;
        } else {
            var3 = false;
        }

        this.boolc = var3;
        if ((var1 & 8) == 0) {
            var2 = b;
        } else {
            var2 = d;
        }

        this.f = var2;
        this.e = new byte[2];
        this.intb = 0;
        byte var5;
        if (this.boolb) {
            var5 = 19;
        } else {
            var5 = -1;
        }

        this.intc = var5;
    }

    public boolean a(byte[] var1, int var2, int var3, boolean var4) {
        byte var5;
        int var7;
        int var8;
        int var10;
        byte[] var11;
        byte[] var12;
        byte var17;
        label115:
        {
            var11 = this.f;
            var12 = this.info;
            var5 = 0;
            var8 = this.intc;
            var10 = var3 + var2;
            var7 = -1;
            byte var6;
            switch (this.intb) {
                case 0:
                    var3 = var2;
                    break label115;
                case 1:
                    if (var2 + 2 <= var10) {
                        var6 = this.e[0];
                        var3 = var2 + 1;
                        var7 = (var6 & 255) << 16 | (var1[var2] & 255) << 8 | var1[var3] & 255;
                        this.intb = 0;
                        ++var3;
                        break label115;
                    }
                    break;
                case 2:
                    if (var2 + 1 <= var10) {
                        var6 = this.e[0];
                        var17 = this.e[1];
                        var3 = var2 + 1;
                        var7 = (var6 & 255) << 16 | (var17 & 255) << 8 | var1[var2] & 255;
                        this.intb = 0;
                        break label115;
                    }
            }

            var3 = var2;
        }

        int var16;
        if (var7 != -1) {
            var12[0] = var11[var7 >> 18 & 63];
            var12[1] = var11[var7 >> 12 & 63];
            var12[2] = var11[var7 >> 6 & 63];
            var5 = 4;
            var12[3] = var11[var7 & 63];
            var7 = var8 - 1;
            if (var7 == 0) {
                byte var14;
                if (this.boolc) {
                    var14 = 5;
                    var12[4] = 13;
                } else {
                    var14 = 4;
                }

                var12[var14] = 10;
                var16 = 19;
                var2 = var14 + 1;
            } else {
                var2 = var5;
                var3 = var3;
                var16 = var7;
            }
        } else {
            var2 = var5;
            var3 = var3;
            var16 = var8;
        }

        int var15;
        while (var3 + 3 <= var10) {
            var15 = (var1[var3] & 255) << 16 | (var1[var3 + 1] & 255) << 8 | var1[var3 + 2] & 255;
            var12[var2] = var11[var15 >> 18 & 63];
            var12[var2 + 1] = var11[var15 >> 12 & 63];
            var12[var2 + 2] = var11[var15 >> 6 & 63];
            var12[var2 + 3] = var11[var15 & 63];
            var3 += 3;
            var7 = var2 + 4;
            var8 = var16 - 1;
            if (var8 == 0) {
                if (this.boolc) {
                    var2 = var7 + 1;
                    var12[var7] = 13;
                } else {
                    var2 = var7;
                }

                var12[var2] = 10;
                var16 = 19;
                ++var2;
            } else {
                var2 = var7;
                var3 = var3;
                var16 = var8;
            }
        }

        if (var4) {
            if (var3 - this.intb == var10 - 1) {
                if (this.intb > 0) {
                    var1 = this.e;
                    var5 = 1;
                    var17 = var1[0];
                } else {
                    var17 = var1[var3];
                    ++var3;
                    var5 = 0;
                }

                var7 = (var17 & 255) << 4;
                this.intb -= var5;
                var8 = var2 + 1;
                var12[var2] = var11[var7 >> 6 & 63];
                var15 = var8 + 1;
                var12[var8] = var11[var7 & 63];
                var2 = var15;
                if (this.boola) {
                    var7 = var15 + 1;
                    var12[var15] = 61;
                    var2 = var7 + 1;
                    var12[var7] = 61;
                }

                var15 = var2;
                if (this.boolb) {
                    var15 = var2;
                    if (this.boolc) {
                        var12[var2] = 13;
                        var15 = var2 + 1;
                    }

                    var12[var15] = 10;
                    ++var15;
                }

                var7 = var3;
            } else if (var3 - this.intb == var10 - 2) {
                byte var18;
                if (this.intb > 1) {
                    byte[] var13 = this.e;
                    byte var19 = 1;
                    var17 = var13[0];
                    var15 = var3;
                    var18 = var19;
                } else {
                    var17 = var1[var3];
                    var15 = var3 + 1;
                    var18 = 0;
                }

                int var9;
                byte var20;
                if (this.intb > 0) {
                    var20 = this.e[var18];
                    var9 = var18 + 1;
                    var3 = var15;
                    var15 = var9;
                } else {
                    var20 = var1[var15];
                    var9 = var15 + 1;
                    var15 = var18;
                    var3 = var9;
                }

                var7 = (var20 & 255) << 2 | (var17 & 255) << 10;
                this.intb -= var15;
                var15 = var2 + 1;
                var12[var2] = var11[var7 >> 12 & 63];
                var8 = var15 + 1;
                var12[var15] = var11[var7 >> 6 & 63];
                var2 = var8 + 1;
                var12[var8] = var11[var7 & 63];
                if (this.boola) {
                    var15 = var2 + 1;
                    var12[var2] = 61;
                    var2 = var15;
                }

                var15 = var2;
                if (this.boolb) {
                    var15 = var2;
                    if (this.boolc) {
                        var12[var2] = 13;
                        var15 = var2 + 1;
                    }

                    var12[var15] = 10;
                    ++var15;
                }

                var7 = var3;
            } else {
                var7 = var3;
                var15 = var2;
                if (this.boolb) {
                    var7 = var3;
                    var15 = var2;
                    if (var2 > 0) {
                        var7 = var3;
                        var15 = var2;
                        if (var16 != 19) {
                            if (this.boolc) {
                                var15 = var2 + 1;
                                var12[var2] = 13;
                                var2 = var15;
                            }

                            var15 = var2 + 1;
                            var12[var2] = 10;
                            var7 = var3;
                        }
                    }
                }
            }

            if (!boold && this.intb != 0) {
                throw new AssertionError();
            }

            var8 = var15;
            if (!boold) {
                var8 = var15;
                if (var7 != var10) {
                    throw new AssertionError();
                }
            }
        } else if (var3 == var10 - 1) {
            var11 = this.e;
            var15 = this.intb;
            this.intb = var15 + 1;
            var11[var15] = var1[var3];
            var8 = var2;
        } else {
            var8 = var2;
            if (var3 == var10 - 2) {
                var11 = this.e;
                var15 = this.intb;
                this.intb = var15 + 1;
                var11[var15] = var1[var3];
                var11 = this.e;
                var15 = this.intb;
                this.intb = var15 + 1;
                var11[var15] = var1[var3 + 1];
                var8 = var2;
            }
        }

        this.length = var8;
        this.intc = var16;
        return true;
    }
}
