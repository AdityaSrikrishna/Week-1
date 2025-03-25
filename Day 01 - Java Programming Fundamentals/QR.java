import java.util.Scanner;
public class QR{
	public static void main(String[] Args){
		Scanner scanner = new Scanner(System.in);
		float a = scanner.nextFloat();
		float b = scanner.nextFloat();
		System.out.println("Quotient is: " + (a/b));
		System.out.println("Remainder is: " + (a%b));
	}
}