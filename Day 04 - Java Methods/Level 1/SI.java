import java.util.Scanner;
public class SI{
	public float Simple(float p, float r, float t){
		float si = (p*r*t)/100;
		return si;
	}
	public static void main(String[] Args){
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the Principal Amount: ");
		float p = scanner.nextFloat();
		System.out.print("Enter the Interest rate: ");
		float r = scanner.nextFloat();
		System.out.print("Enter the number of years: ");
		float t = scanner.nextFloat();
		SI Bank1 = new SI();
		float interest = Bank1.Simple(p, r, t);
		System.out.println("The Simple Interest is: " + interest);
		scanner.close();
	}
}