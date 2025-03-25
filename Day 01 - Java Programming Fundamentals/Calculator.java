import java.util.Scanner;
public class Calculator{
	public static void main(String[] Args){
		Scanner scanner = new Scanner(System.in);
		float a = scanner.nextFloat();
		float b = scanner.nextFloat();
		System.out.println("Addition is: " + (a+b));
		System.out.println("Subtraction is: " + (a-b));
		System.out.println("Multiplication is: " + (a*b));
		System.out.println("Division is: " + (a/b));
		System.out.println("Modulus is: " + (a%b));
		scanner.close();
	}
}