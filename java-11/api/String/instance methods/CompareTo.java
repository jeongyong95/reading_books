public class CompareTo {
    public static void main(String[] args) {

        String input = "Hello, world!";
        String SameInput = "Hello, world!";
        String uppperInput = "HELLO, WORLD!";
        String lowerInput = "hello, world!";

        System.out.println(input.compareTo(SameInput));
        System.out.println(input.compareTo(uppperInput));
        System.out.println("대소문자를 무시하고 비교 : " + uppperInput.compareToIgnoreCase(lowerInput));
        System.out.println("a".compareTo("c"));

    }
}