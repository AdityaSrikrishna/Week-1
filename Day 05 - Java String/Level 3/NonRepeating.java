import java.util.Scanner;
public class NonRepeating{
    public static char nonRep(String string){
        int[] freq = new int[256];
        int len = string.length();
        string = string.toLowerCase();
        for(int i=0; i<len; i++){
            freq[string.charAt(i)]++;
        }
        for(int i=0; i<len; i++){
            if(freq[string.charAt(i)] == 1){
                return string.charAt(i);
            }
        }
        return '\0';
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        char nonrepeating = nonRep(string);
        if(nonrepeating != '\0'){
            System.out.println("First non repeating character is: " + nonrepeating);
        }
            else{
            System.out.println("No First non repeating character occuring.");
        }
        scanner.close();
    }
}