
public class Format {
    public static void main(String[] args) {
        double input = 3.141592;
        String formattedString = String.format("", input);

        System.out.println(formattedString.isBlank());
        System.out.println(formattedString.isEmpty());
        System.out.println(formattedString == null);

        // format​(String format, Object... args)
        System.out.println(formattedString);
        System.out.println(String.format("%.1f", input));
        System.out.println(String.format("%.2f", input));
        System.out.println(String.format("%.3f", input));
        System.out.println(String.format("%.4f", input));
        System.out.println(String.format("%f", input));

    }
}