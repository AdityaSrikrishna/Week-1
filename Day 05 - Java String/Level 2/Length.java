import java.util.Scanner;

public class Length{
    public static int len(String string){
        int count = 0;
        try {
            while (true) { 
                string.charAt(count);
                count++;
            }
        } catch (IndexOutOfBoundsException e) {

        }
        return count;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        int a = len(string);
        int b = string.length();
        System.out.println("The manually length of string " + string + " is: " + a);
        System.out.println("The built-in length of string " + string + " is: " + b);
        if(a==b){
            System.out.println("Both results are same.");
        }
        else{
            System.out.println("Both results are not same.");
        }
        scanner.close();
    }
}