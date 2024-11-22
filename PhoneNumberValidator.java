import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNumberValidator {

    // Method to validate an Indian phone number
    public static boolean validatePhoneNumber(String phoneNumber) {
        // Regular expression to match the specified patterns
        String regex = "^(\\+91|91|0|\\+)?[6-9][0-9]{9}$";
        
        // Compile the regular expression
        Pattern pattern = Pattern.compile(regex);
        
        // Match the input phone number with the regular expression
        Matcher matcher = pattern.matcher(phoneNumber);
        
        // Return whether the phone number matches the pattern
        return matcher.matches();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input phone number
        System.out.print("Enter the phone number: ");
        String phoneNumber = scanner.nextLine();

        // Validate the phone number
        if (validatePhoneNumber(phoneNumber)) {
            System.out.println("The phone number is valid.");
        } else {
            System.out.println("The phone number is invalid.");
        }

        scanner.close();
    }
}
