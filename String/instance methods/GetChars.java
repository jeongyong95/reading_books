public class GetChars {
    public static void main(String[] args) {

        String input = "Hello";
        char[] arr = new char[20];
        arr[10] = 'ㅋ';

        input.getChars(0, input.length(), arr, 11);
        input.getChars(0, input.length() - 3, arr, 8);

        System.out.println(arr);
    }
}