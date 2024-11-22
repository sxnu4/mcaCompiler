

public class StringLengthConcat {
    public static int findLength(String str){
            int length=0;
            for(char ch: str.toCharArray()){
            length++;
        } return length;
        
    }
    public static String concat(String str1, String str2){
        char[] result = new char[findLength(str1)+findLength(str2)];
        int index=0;
        for(char ch: str1.toCharArray()){
            result[index++]=ch;
        }
        for(char ch: str2.toCharArray()){
            result[index++]=ch;
        }
        return new String(result);
    }
    public static void main(String[] args) {
        String str1 = "Spark";
        String str2 = "Ruthless";
        String result = concat(str1,str2);
       int length = findLength(str1);
       System.out.println("Length of the string str1 is :" + length);
       int length2 = findLength(str2);
       System.out.println("Length of the string str1 is :" + length2);
        System.out.println("And the Concatenated String will be :"+result);
    } 
}
