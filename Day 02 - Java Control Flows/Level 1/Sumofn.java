import java.util.Scanner;
public class Sumofn{
	public static void main(String[] Args){
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int sumofn = (n*(n+1))/2;
		System.out.println("Sum of N numbers is: " + sumofn);
		scanner.close();
	}
}