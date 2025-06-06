import java.util.Scanner;
public class MinMaxFinder{
	public static void main(String[] Args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the three numbers: ");
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		int num3 = scanner.nextInt();
		int[] result = findSmallLarge(num1, num2, num3);
		System.out.println("Smallest is: " + result[0]);
		System.out.println("Largest is: " + result[1]);
		scanner.close();
	}
	public static int[] findSmallLarge(int num1, int num2, int num3){
		int smallest = Math.min(num1, Math.min(num2, num3));
		int largest = Math.max(num1, Math.max(num2, num3));
		return new int[]{smallest, largest};
	}
}