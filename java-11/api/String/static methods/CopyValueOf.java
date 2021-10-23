
/*  결과
    Hello : hello, World!
    newString : hello, World!
    newString2 : hello
 */
public class CopyValueOf {
    public static void main(String[] args) {

        String hello = "hello, World!";
        char[] data = hello.toCharArray();

        String newString = String.copyValueOf(data);
        String newString2 = String.copyValueOf(data, 0, 5);

        System.out.println("Hello : " + hello);
        System.out.println("newString : " + newString);
        System.out.println("newString2 : " + newString2);

    }
}
