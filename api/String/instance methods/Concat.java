public class Concat {
    public static void main(String[] args) {

        String input1 = "Hello";
        String input2 = "world";

        System.out.println(input1.concat(input2));
        System.out.println(input2.concat(input1));
        System.out.println(input1.concat(", ").concat(input2).concat("!"));
    }
}