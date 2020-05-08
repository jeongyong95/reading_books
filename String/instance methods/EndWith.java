public class EndWith {
    public static void main(String[] args) {

        String input = "Hello, world!";

        // true
        System.out.println(input.endsWith("!"));

        // true
        System.out.println(input.endsWith("ld!"));

        // false
        System.out.println(input.endsWith("ld"));
    }
}