import java.util.Scanner;
public class Upper{
    public static String convertToUpper(String string){
        StringBuilder result = new StringBuilder();
        for(int i=0; i<string.length(); i++){
            char ch = string.charAt(i);
            if(ch>='a' && ch<='z'){
                ch = (char) (ch - 32);
            }
            result.append(ch);
        }
        return result.toString();
    }
    public static boolean compareStrings(String manUpper, String builtinUpper){
        if(manUpper.length() != builtinUpper.length()){
            return false;
        }
        for(int i=0; i<manUpper.length(); i++){
            if(manUpper.charAt(i) != builtinUpper.charAt(i)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] Args){
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        String manUpper = convertToUpper(string);
        String builtinUpper = string.toUpperCase();
        System.out.println("The Uppercase string is: " + manUpper);
        System.out.println("The Uppercase string is: " + builtinUpper);
        boolean compare = compareStrings(manUpper, builtinUpper);
        if(compare){
            System.out.println("Both results are same.");
        }
        else{
            System.out.println("Both results are not same.");
        }
    }
}