import java.util.Arrays;
import java.util.Scanner;
public class CharArray{
    public static char[] Arraychar(String String1){
        char[] temp = new char[String1.length()];
        for(int i=0; i<String1.length(); i++){
            temp[i] = String1.charAt(i);
        }
        return temp;
    }
    
    public static void main(String[] Args){
        Scanner scanner = new Scanner(System.in);
        String String1 = scanner.nextLine();
        char[] mancharArray = Arraychar(String1);
        char[] builtincharArray = String1.toCharArray();
        System.out.println("Manually generated substring: " + String.valueOf(mancharArray));
        System.out.println("Built-in function generated substring: " + String.valueOf(builtincharArray));
        if(Arrays.equals(mancharArray, builtincharArray)){
            System.out.println("Both comparisons are correct.");
        }
        else{
            System.out.println("Both comparisons are not correct.");
        }
        scanner.close();
    }
}