import java.util.Scanner;
public class Oddeven{
	public static void main(String[] Args){
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		System.out.print("Odd numbers are: ");
		for(int i=1; i<=num; i+=2){
			System.out.print(i + " ");
		}
    	System.out.print("\n");
		System.out.print("Even numbers are: ");			
		for(int i=2; i<=num; i+=2){
			System.out.print(i + " ");
		}
		scanner.close();
	}
}