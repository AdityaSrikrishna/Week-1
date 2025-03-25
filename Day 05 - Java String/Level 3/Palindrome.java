import java.util.Scanner;

public class Palindrome{
    public static boolean palIterative(String string){
        int start = 0, end = string.length()-1;
        while(start<end){
            if(string.charAt(start) != string.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
    public static boolean palRecursive(String string, int start, int end){
        if(start>=end){
            return true;
        }
        if(string.charAt(start) != string.charAt(end)){
            return false;
        }
        return palRecursive(string, start+1, end-1);
    }
    public static boolean palArray(String string){
        char[] origArray = string.toCharArray();
        char[] revArray = new char[string.length()];
        for(int i=0; i<string.length(); i++){
            revArray[i] = origArray[string.length() -1 -i];
        }
        return new String(origArray).equals(new String (revArray));
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine().toLowerCase();
        boolean result1 = palIterative(string);
        int start = 0;
        int end = string.length()-1;
        boolean result2 = palRecursive(string, start, end);
        boolean result3 = palArray(string);
        System.out.println("Using Iterative Check: " + (result1 ? "Yes" : "No"));
        System.out.println("Using Recursive Check: " + (result2 ? "Yes" : "No"));
        System.out.println("Using Array Check: " + (result3 ? "Yes" : "No"));
        scanner.close();
    }
}