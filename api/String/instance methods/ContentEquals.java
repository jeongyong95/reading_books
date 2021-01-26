public class ContentEquals {
    public static void main(String[] args) {

        String input1 = "Hello, world!";
        String input2 = "Hello, world!";

        System.out.println("input1 : " + input1.hashCode());
        System.out.println("input2 : " + input2.hashCode());

        // 해시코드가 다르면 리터럴이 같더라도 false를 반환
        System.out.println(input1 == input2);

        // 해시코드가 다르더라도 리터럴이 같으면 true를 반환
        System.out.println(input1.contentEquals(input2));
    }
}