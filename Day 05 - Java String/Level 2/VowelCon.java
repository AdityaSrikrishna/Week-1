import java.util.Scanner;
public class VowelCon{
    public static int[] isVowelCon(String string){
        int vowel = 0, cons = 0;
        for(int i=0; i<string.length(); i++){
            char ch = Character.toLowerCase(string.charAt(i));
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch =='u'){
                vowel++;
            }
            else if(Character.isLetter(ch)){
                cons++;
            }
        }
        return new int[]{vowel, cons};
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        int[] values = isVowelCon(string);
        System.out.println("Number of vowels are: " + values[0]);
        System.out.println("Number of values are: " + values[1]);
        scanner.close();
    }
}
