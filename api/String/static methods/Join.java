
public class Join {
    public static void main(String[] args) {
        String input = "hello, join";
        System.out.println(input);

        String[] inputArray = input.split(", ");

        System.out.println(inputArray[0]);
        System.out.println(inputArray[1]);

        // join​(CharSequence delimiter, CharSequence... elements)
        String joinString = String.join("#", inputArray);
        System.out.println("joinString : " + joinString);
    }
}