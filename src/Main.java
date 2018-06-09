public class Main {

    public static void main(String[] args) {
        System.out.println(NearbyURLSafeUtil.encrypt("123456789"));
        System.out.println(NearbyURLSafeUtil.decrypt("*S1*oK-i7e4s7icq"));
        System.out.println(NearbyURLSafeUtil.decrypt("*S1*oKvPoK6kow6zNKSi7wcP7wvl"));
        System.out.println(NearbyURLSafeUtil.decrypt("*S1*oKvPoK6kow6zNeEiNenlNe6i"));
        System.out.println(NearbyURLSafeUtil.decrypt("*S1*oKvPoK6kow6zNeEiNe-FNKo5"));
    }
}