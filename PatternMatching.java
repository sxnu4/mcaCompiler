import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatching {

    // Method to match a pattern with a string
    public static boolean matchPattern(String pattern, String str) {
        // Compile the regular expression pattern
        Pattern compiledPattern = Pattern.compile(pattern);
        
        // Match the input string with the compiled pattern
        Matcher matcher = compiledPattern.matcher(str);
        
        // Return whether the string matches the pattern
        return matcher.matches();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the regular expression pattern
        System.out.print("Enter the pattern: ");
        String pattern = scanner.nextLine();

        // Input the string to match
        System.out.print("Enter the string to match: ");
        String str = scanner.nextLine();

        // Validate the pattern matching
        if (matchPattern(pattern, str)) {
            System.out.println("The string matches the pattern.");
        } else {
            System.out.println("The string does not match the pattern.");
        }

        scanner.close();
    }
}
//^[a-zA-Z0-9]+$  (matches any alphanumeric string)
