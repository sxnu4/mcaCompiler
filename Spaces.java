public class Spaces {
    public static void main(String[] args) {
        String input = "Hello,  My      name is Sonu.";
        int singleSpaceCount = 0;
        int doubleSpaceCount = 0;
        int multiSpaceCount = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == ' ') {
                int spaceCount=1;
                while(i+1<input.length() && input.charAt(i+1)==' '){
                    spaceCount++;
                    i++;
                }
                if(spaceCount==1){
                    singleSpaceCount++;
                } else if (spaceCount==2){
                    doubleSpaceCount++;
                } else{
                    multiSpaceCount++;
                }
            }
        }
        String result = input.replaceAll("\\s{2,}", " ");
        System.out.println("Single Spaces: " + singleSpaceCount);
        System.out.println("Double Spaces: " + doubleSpaceCount);
        System.out.println("Multiple Spaces: " + multiSpaceCount);
        System.out.println("Resulted String: " + result);

    }
}
