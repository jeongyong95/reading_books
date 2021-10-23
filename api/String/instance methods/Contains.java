public class Contains {
    public static void main(String[] args) {

        String input = "Hello, world!";

        System.out.println(input.contains("Hello"));
        System.out.println(input.contains("l"));

        // 정규 표현식이 안먹힌다.
        System.out.println(input.contains(".e..."));
    }
}