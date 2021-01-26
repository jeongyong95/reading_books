public class IsEmpty {

    public static void main(String[] args) {

        String blankString = " ";
        String emptyString = new String();
        String nullString = null;

        System.out.println(blankString.isEmpty());
        System.out.println(emptyString.isEmpty());

        // NullPointerException 발생
        System.out.println(nullString.isEmpty());
    }
}