import java.util.Scanner;
public class Perimeter{
	public static void main(String[] Args){
		Scanner scanner = new Scanner(System.in);
		float perimeter = scanner.nextFloat();
		float side = perimeter/4;
		System.out.println("Side in cm is: " + side);
	}
}