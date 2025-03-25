import java.util.Scanner;
public class chartoASCII{
    public static int[][] chartoASCII(String text){
        int[][] charASCIIvalues = new int[text.length()][2];
        for(int i=0; i<text.length(); i++){
            charASCIIvalues[i][0] = text.charAt(i);
            charASCIIvalues[i][1] = text.charAt(i);
        }
        return charASCIIvalues;
    }
    public static void DisplayASCII(String text, int[][] charASCIIvalues){
        for(int i=0; i<charASCIIvalues.length; i++){
            System.out.println("Character: " + (char)charASCIIvalues[i][0] + "-" + "ASCII Values: " + charASCIIvalues[i][1]);
        }
    }
    public static void main(String[] Args){
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        int[][] charascii = chartoASCII(text.trim());
        DisplayASCII(text, charascii);
        scanner.close();
    }
}
