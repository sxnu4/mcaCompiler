public class StringOperations {
    public static int stringLength(String str) {
        int length = 0;
        for (char c : str.toCharArray()) {
            length++;
        }
        return length;
    }
    
    public static String stringConcatenate(String str1, String str2) {
        char[] result = new char[stringLength(str1) + stringLength(str2)];
        int i = 0;
        for (char c : str1.toCharArray()) {
            result[i++] = c;
        }
        for (char c : str2.toCharArray()) {
            result[i++] = c;
        }

        return new String(result);
    }

    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "World";
        System.out.println("Length of str1: " + stringLength(str1));
        System.out.println("Length of str2: " + stringLength(str2));
        System.out.println("Concatenated String: " + stringConcatenate(str1, str2));
    }
}
