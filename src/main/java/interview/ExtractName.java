package interview;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractName {
    public static String extractName(String input) {
        Pattern pattern = Pattern.compile("Name:\\s*([A-Za-z]+)\\d*\\s+([A-Za-z]+)");
        Matcher matcher = pattern.matcher(input);
        if (matcher.find()) {
            return matcher.group(1) + " " + matcher.group(2);
        }
        return "";
    }

    public static void main(String[] args) {
        String input = "Name: John123 Doe";
        System.out.println("Extracted Name: " + extractName(input)); // Output: John
    }
}
