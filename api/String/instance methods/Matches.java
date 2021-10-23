public class Matches {
    public static void main(String[] args) {

        String input = "Hello, world!";
        String numbers = "0123456789";

        // 정규 표현식을 사용하여 문자열에 해당 패턴이 있는지 확인
        // 정규식 외에는 오직 원본을 대입해야만 true가 나온다
        System.out.println(input.matches("^.e.$"));
        System.out.println(input.matches("Hello"));
        System.out.println(input.matches("Hello, world!"));
        System.out.println(numbers.matches("012"));
        System.out.println(numbers.matches("0123456789"));
    }
}