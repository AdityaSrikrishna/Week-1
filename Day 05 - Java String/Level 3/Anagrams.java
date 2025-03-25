import java.util.Scanner;

public class Anagrams{
    public static boolean anagrams(String string1, String string2){
        string1 = string1.toLowerCase();
        string2 = string2.toLowerCase();
        if(string1.length() != string2.length()){
            return false;
        }
        int[] freq1 = new int[256];
        int[] freq2 = new int[256];
        for(int i=0; i<string1.length(); i++){
            freq1[string1.charAt(i)]++;
            freq2[string2.charAt(i)]++;
        }
        for(int i=0; i<256; i++){
            if(freq1[i] != freq2[i]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string1 = scanner.nextLine();
        String string2 = scanner.nextLine();
        boolean an = anagrams(string1, string2);
        if(an){
            System.out.println("Both the strings are anagrams");
        }
        else{
            System.out.println("Both the strings are not anagrams");
        }
    }
}