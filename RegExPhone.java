import java.util.regex.*;

public class RegExPhone {
	// Function to validate the International Phone Numbers
	static String isValidPhoneNumber(String phoneNumber) {
		// Regex to check valid phone number.
		String pattern = "^[+]{1}(?:[0-9\\-\\(\\)\\/" +
						"\\.]\\s?){6,15}[0-9]{1}$";

		// If the phone number is empty return false
		if (phoneNumber.isEmpty()) {
			return "false";
		}

		// Return true if the phone number
		// matched the Regex
		if (Pattern.matches(pattern, phoneNumber)) {
			return "true";
		} else {
			return "false";
		}
	}

	// Driver Code
	public static void main(String[] args) {
		// Test Case 1:
		String str1 = "+919136812895";
		System.out.println(isValidPhoneNumber(str1));

		// Test Case 2:
		String str2 = "+91 9136812895";
		System.out.println(isValidPhoneNumber(str2));

		// Test Case 3:
		String str3 = "+123 123456";
		System.out.println(isValidPhoneNumber(str3));

		// Test Case 4:
		String str4 = "6542945632";
		System.out.println(isValidPhoneNumber(str4));
	}
}
