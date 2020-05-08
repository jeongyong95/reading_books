public class CodePoint {
    public static void main(String[] args) {

        String input = "Hello, world!";

        // 해당 인덱스의 문자를 유니코드로 표현
        System.out.println("A".codePointAt(0));
        System.out.println(input.codePointAt(1));

        // 해당 인덱스 직전의 문자를 유니코드로 표현
        System.out.println(input.codePointBefore(2));
        System.out.println(input.codePointBefore(1));

        // 유니코드를 가지고 있는 문자의 개수 출력?(시작 포함, 끝 미포함)
        System.out.println(input.codePointCount(0, 0));
        System.out.println(input.codePointCount(0, 1));
    }
}