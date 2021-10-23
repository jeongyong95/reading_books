public class Equals {
    public static void main(String[] args) {

        String input = "Hello, world!";
        String sameInput = "Hello, world!";
        String uppperInput = "HELLO, WORLD!";
        String lowerInput = "hello, world!";

        // call by value
        // true
        System.out.println(input.equals(sameInput));

        // false
        System.out.println(input.equals(uppperInput));

        // true
        System.out.println(input.equalsIgnoreCase(uppperInput));
        System.out.println(uppperInput.equalsIgnoreCase(lowerInput));
    }
}