public class IndexOf {
    public static void main(String[] args) {

        String input = "Hello, world!";

        System.out.println("-----indexOf-----");
        System.out.println(input.indexOf("l"));
        System.out.println(input.indexOf("l", 2));
        System.out.println(input.indexOf("l", 3));
        System.out.println(input.indexOf("l", 4));

        System.out.println("-----유니코드를 인자로 받는 indexOf-----");
        // 유니코드에 해당하는 문자가 처음 나타나는 인덱스를 반환
        System.out.println(input.indexOf("l".codePointAt(0)));
        System.out.println(input.indexOf("l".codePointAt(0), 2));
        System.out.println(input.indexOf("l".codePointAt(0), 3));
        System.out.println(input.indexOf("dl".codePointAt(0), 4));
        System.out.println(input.indexOf("dl".codePointAt(0), 4));

        System.out.println("-----lastIndexOf-----");
        System.out.println(input.lastIndexOf("l"));
        System.out.println(input.lastIndexOf("l", 12));
        System.out.println(input.lastIndexOf("l", 9));
        System.out.println(input.lastIndexOf("l", 3));
        System.out.println(input.lastIndexOf("l", 2));

        System.out.println("-----유니코드를 인자로 받는 lastIndexOf-----");
        System.out.println(input.lastIndexOf("l".codePointAt(0)));
        System.out.println(input.lastIndexOf("dl".codePointAt(0)));
        System.out.println(input.lastIndexOf("dl".codePointAt(0), 10));
    }
}