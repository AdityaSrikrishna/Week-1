import java.util.Scanner;
public class SplitText1{
    public static int getLen(String string){
        int count = 0;
        for(int i=0; i<string.length(); i++){
            char in = string.charAt(i);
            count++;
        }
        return count;
    }
    public static String[] Split(String string){
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
            if(string.charAt(i)==' '){
                words[index++] = string.substring(start, i);
                start = i+1;
            }
        }
        words[index] = string.substring(start, len);
        return words;
    }
    public static String[][] getArrayandLength(String[] words){
        String[][] xyz = new String[words.length][2];
        for(int i=0; i<words.length; i++){
            xyz[i][0] = words[i];
            xyz[i][1] = String.valueOf(getLen(words[i]));
        }
        return xyz;
    }
    public static void main(String[] Args){
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        String[] custom = Split(string);
        String[][] temp = getArrayandLength(custom);
        System.out.printf("%-15s %-10s%n", "Word", "Length");
        System.out.println("--------------------------");
        for(int i=0; i<temp.length; i++){
            String word = temp[i][0];
            int num = Integer.parseInt(temp[i][1]);
            System.out.printf("%-15s %-10d\n", word, num);
        } 
    }
}