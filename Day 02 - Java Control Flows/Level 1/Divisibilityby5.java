import java.util.Scanner;
public class Divisibilityby5 {
	public static void main(String[] Args) {
		Scanner scanner = new Scanner(System.in);
		float a = scanner.nextFloat();
		if (a % 5 == 0) {
			System.out.println(a + "is divisible by 5.");
		} else {
			System.out.println(a + "is not divisible by 5.");
		}
	}
}