import java.util.Scanner;
public class IntOperation{
	public static void main(String[] Args){
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		System.out.println("a + b * c is : " + (a + b * c));
		System.out.println("a * b + c is : " + (a * b + c));
		System.out.println("c + a / b is : " + (c + a / b));
		System.out.println("a % b + c is : " + (a % b + c));
	}
}