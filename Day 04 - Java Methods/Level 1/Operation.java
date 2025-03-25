import java.util.Scanner;
public class Operation{
	public static int[] Division(int num1, int num2){
		int quotient = num1/num2;
		int remainder = num1%num2;
		return new int[]{quotient, remainder};
	}
	public static void main(String[] Args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the two numbers: ");
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		int[] division = Division(num1, num2);
		System.out.println("Quotient is: " + division[0]);
		System.out.println("Remainder is: " + division[1]);
	}
}