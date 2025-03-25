import java.util.Scanner;
public class Factorial{
	public static void main(String[] Args){
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int k = n;
		int prod = 1;
		for(int i=k; i!=0; i--){
			prod*=i;
		}
		System.out.println("Sum of N numbers is: " + prod);
		scanner.close();
	}
}