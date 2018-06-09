import java.io.UnsupportedEncodingException;

public class Baze64 {

    public static boolean a;

    static {
        boolean var0;
        if (!Baze64.class.desiredAssertionStatus()) {
            var0 = true;
        } else {
            var0 = false;
        }

        a = var0;
    }

    private Baze64() {
    }

    public static String encrypt(byte[] var0, int var1) {
        try {
            String var3 = new String(b(var0, var1), "US-ASCII");
            return var3;
        } catch (UnsupportedEncodingException var2) {
            throw new AssertionError(var2);
        }
    }

    public static byte[] decrypt(String var0, int var1) {
        return a(var0.getBytes(), var1);
    }

    public static byte[] a(byte[] var0, int var1) {
        return a(var0, 0, var0.length, var1);
    }

    public static byte[] a(byte[] var0, int var1, int var2, int var3) {
        akgp var4 = new akgp(var3, new byte[var2 * 3 / 4]);
        if (!var4.a(var0, var1, var2, true)) {
            throw new IllegalArgumentException("bad base-64");
        } else if (var4.length == var4.info.length) {
            return var4.info;
        } else {
            var0 = new byte[var4.length];
            System.arraycopy(var4.length, 0, var0, 0, var4.length);
            return var0;
        }
    }

    public static byte[] b(byte[] var0, int var1) {
        return b(var0, 0, var0.length, var1);
    }

    public static byte[] b(byte[] var0, int var1, int var2, int var3) {
        akgq var6 = new akgq(var3, (byte[]) null);
        int var4 = var2 / 3 * 4;
        if (var6.boola) {
            var3 = var4;
            if (var2 % 3 > 0) {
                var3 = var4 + 4;
            }
        } else {
            var3 = var4;
            switch (var2 % 3) {
                case 0:
                    break;
                case 1:
                    var3 = var4 + 2;
                    break;
                case 2:
                    var3 = var4 + 3;
                    break;
                default:
                    var3 = var4;
            }
        }

        var4 = var3;
        if (var6.boolb) {
            var4 = var3;
            if (var2 > 0) {
                int var5 = (var2 - 1) / 57;
                byte var7;
                if (var6.boolc) {
                    var7 = 2;
                } else {
                    var7 = 1;
                }

                var4 = var3 + var7 * (var5 + 1);
            }
        }

        var6.info = new byte[var4];
        var6.a(var0, var1, var2, true);
        if (!a && var6.length != var4) {
            throw new AssertionError();
        } else {
            return var6.info;
        }
    }
}
