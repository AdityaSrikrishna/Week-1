import java.util.Scanner;
public class shortestLength{
    public static int getlen(String string){
        int count = 0;
        for(int i=0; i<string.length(); i++){
            count++;
        }
        return count;
    }
    public static String[] Split(String string){
        int len = getlen(string);
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
    public static String[][] getArrayandLen(String[] words){
        String[][] result = new String[words.length][2];
        for(int i=0; i<words.length; i++){
            result[i][0] = words[i];
            result[i][1] = String.valueOf(getlen(words[i]));
        }
        return result;
    }
    public static String[] ShortLong(String[][] result){
        int minLength = Integer.MAX_VALUE, maxLength = Integer.MIN_VALUE;
        String shortestword = "";
        String longestword = "";
        for(int i=0; i<result.length; i++){
            int len = Integer.parseInt(result[i][1]);
            if(len>maxLength){
                maxLength = len;
                longestword = result[i][0];
            }
            if(len<minLength){
                minLength = len;
                shortestword = result[i][0];
            }
        }
        return new String[]{shortestword, String.valueOf(minLength), longestword, String.valueOf(maxLength)};
    }  
    public static void main(String[] Args){
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        String[] result1 = Split((string));
        String[][] result2 = getArrayandLen(result1);
        String[] result3 = ShortLong(result2);
        System.out.printf("%-15s %-10s\n", "Words","Length");
        System.out.println("--------------------------");
        for(int i=0; i<result2.length; i++){
            System.out.printf("%-15s %-10s\n" , result2[i][0] , result2[i][1]);
        }
        System.out.println("Shortest word: " + result3[0] + " Shortest word length: " + result3[1]);
        System.out.println("Longest word: " + result3[2] + " Longest word length: " + result3[3]);
        scanner.close();
    }
}