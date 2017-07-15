public class HelloWorld {
    public static String hello(String name) {

        return String.format("Hello, %s!", getName(name));
    }

    private static String getName(String name) {
        return isEmpty(name) ? "World": name;
    }

    private static boolean isEmpty(String str) {
        return str == null || str.isEmpty();
    }
}
