import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class zad4 {
    public static void main(String[] args) {
        String input = "aeeea aeea aea axa axxa axxxa";
        String regex = "a(e|x)a";

        Pattern pattern = Pattern.compile(regex);

        Matcher matcher = pattern.matcher(input);

        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}