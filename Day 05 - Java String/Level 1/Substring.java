import java.util.Scanner;
public class Substring{
    public static String getSubstring(String String1,int start,int end){
        StringBuilder substr = new StringBuilder();
        for(int i=start; i<end; i++){
            substr.append(String1.charAt(i));
        }
        return substr.toString();
    }
    
    public static void main(String[] Args){
        Scanner scanner = new Scanner(System.in);
        String String1 = scanner.nextLine();
        int start = scanner.nextInt();
        int end = scanner.nextInt();
        String mansubstr = getSubstring(String1, start, end);
        String builtinsubstr = String1.substring(start, end);
        System.out.println("Manually generated substring: " + mansubstr);
        System.out.println("Built-in function generated substring: " + builtinsubstr);
        if(mansubstr.equals(builtinsubstr)){
            System.out.println("Both comparisons are correct.");
        }
        else{
            System.out.println("Both comparisons are not correct.");
        }
        scanner.close();
    }
}