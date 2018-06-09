public class NearbyURLSafeUtil {
    public NearbyURLSafeUtil() {
    }

    public static String encrypt(String var0) {
        String var1 = "*S1*" + Baze64.encrypt(var0.getBytes(), 11);
        return var1;
    }

    public static String decrypt(String var0) {
        var0 = new String(Baze64.decrypt(var0.substring("*S1*".length()), 11));
        return var0;
    }
}
