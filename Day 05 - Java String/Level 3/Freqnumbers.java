import java.util.Scanner;
public class Freqnumbers{
    public static String[][] getFreq(String string){
        int[] freq = new int[256];
        int len = string.length();
        for(int i=0; i<len; i++){
            freq[string.charAt(i)]++;
        }
        int uniqueCount = 0;
        for(int i=0; i<256; i++){
            if(freq[i]>0){
                uniqueCount++;
            }
        }
        String[][] result = new String[uniqueCount][2];
        int index = 0;
        for(int i=0; i<256; i++){
            if(freq[i]>0){
                result[index][0] = String.valueOf((char)i);
                result[index][1] = String.valueOf(freq[i]);
                index++;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        String[][] frequencies = getFreq(string);
        System.out.println("Character frequencies:");
        for(int i=0; i<frequencies.length; i++){
            System.out.println(frequencies[i][0] + ": " + frequencies[i][1]);
        }
        scanner.close();      
    }
}