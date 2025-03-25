import java.util.Scanner;
public class Compare{
    public static boolean compareStr(String String1, String String2){
        int len1 = String1.length();
        int len2 = String2.length();
        if(len1!=len2){
            return false;
        }
        for(int i=0; i<len1; i++){
            if(String1.charAt(i) != String2.charAt(i)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] Args){
        Scanner scanner = new Scanner(System.in);
        String String1 = scanner.nextLine();
        String String2 = scanner.nextLine();
        boolean Manualcomp = compareStr(String1, String2);
        boolean Builtincomp = String1.equals(String2);
        System.out.println("Manual Comparison is: " + Manualcomp);
        System.out.println("Built in Comparison is: " + Builtincomp);
        if(Manualcomp == Builtincomp){
            System.out.println("Both comparisons are correct.");
        }
        else{
            System.out.println("Both comparisons are not correct.");
        }
    }
}
