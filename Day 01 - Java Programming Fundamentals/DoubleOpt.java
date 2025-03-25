import java.util.Scanner;
public class DoubleOpt{
	public static void main(String[] Args){
		Scanner scanner = new Scanner(System.in);
		double a = scanner.nextDouble();
		double b = scanner.nextDouble();
		double c = scanner.nextDouble();
		System.out.println("a + b * c is : " + (a + b * c));
		System.out.println("a * b + c is : " + (a * b + c));
		System.out.println("c + a / b is : " + (c + a / b));
		System.out.println("a % b + c is : " + (a % b + c));
	}
}