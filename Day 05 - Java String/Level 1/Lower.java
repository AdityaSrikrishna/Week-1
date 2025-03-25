import java.util.Scanner;

public class Lower{
    public static String converttoLower(String string){
        StringBuilder result = new StringBuilder();
        for(int i=0; i<string.length(); i++){
            char ch = string.charAt(i);
            if(ch>='A' && ch<='Z'){
                ch = (char)(ch+32);
            }
            result.append(ch);
        }
        return result.toString();
    }
    public static boolean compareStrings(String manLower, String builtinLower){
        if(manLower.length() != builtinLower.length()){
            return false;
        }
        for(int i=0; i<manLower.length(); i++){
            if(manLower.charAt(i) != builtinLower.charAt(i)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] Args){
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        String manLower = converttoLower(string);
        String builtinLower = string.toLowerCase();
        System.out.println("The lowercase letters are: " + manLower);
        System.out.println("The lowercase letters are: " + builtinLower);
        boolean compare = compareStrings(manLower, builtinLower);
        if(compare){
            System.out.println("Both the results are same.");
        }
        else{
            System.out.println("Both the results are not same");
        }
        scanner.close();
    }
}