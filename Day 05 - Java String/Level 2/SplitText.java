import java.util.Scanner;
public class SplitText{
    public static String[] Splitting(String string){
        int len = string.length();
        int spaceCount = 0;
        for(int i=0; i<len; i++){
            if(string.charAt(i) == ' '){
                spaceCount++;
            }
        }
        String[] words = new String[spaceCount+1];
        int start = 0, index = 0;
        for(int i=0; i<len; i++){
            if(string.charAt(i) == ' '){
                words[index++] = string.substring(start, i);
                start = i+1;
            }
        }
        words[index] = string.substring(start, len);
        return words;
    }
    public static void main(String[] Args){
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        String[] manword = Splitting(string);
        String[] builtinword = string.split(" ");
        for(int i=0; i<manword.length; i++){
            System.out.println("Manual split is: " + manword[i]);
        }
        for(int i=0; i<manword.length; i++){
            System.out.println("Built-in split is: " + builtinword[i]);
        }
        boolean equal = java.util.Arrays.equals(manword, builtinword);
        if(equal){
            System.out.println("Both methods produce the same result");
        }
        else{
            System.out.println("Both methods don't produce the same result");
        }
        scanner.close();
    }
}