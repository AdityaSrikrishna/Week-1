import java.util.Scanner;
public class SplitterText{
    public static int[] splitIndex(String string){
        int start = 0, end = string.length()-1;
        while(start<=end && string.charAt(start) == ' '){
            start++;
        }
        while(end>=start && string.charAt(end) == ' '){
            end--;
        }
        return new int[]{start, end};
    }
    public static String SplitString(String string, int start, int end){
        StringBuilder sb = new StringBuilder();
        for(int i=start; i<=end; i++){
            sb.append(string.charAt(i));
        }
        return sb.toString();
    }
    public static boolean compareStrings(String result1, String result2){
        if(result1.length() != result2.length()){
            return false;
        }
        for(int i=0; i<result1.length(); i++){
            if(result1.charAt(i) != result2.charAt(i)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] Args){
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        int[] a = splitIndex(string);
        int beg = a[0];
        int last = a[1];
        String result1 = SplitString(string, beg, last);
        String result2 = string.trim();
        boolean compare = compareStrings(result1, result2);
        if(compare){
            System.out.println("Both results are the same");
        }
        else{
            System.out.println("Both results are not the same");
        }
        scanner.close();
    }
}