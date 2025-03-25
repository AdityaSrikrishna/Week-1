import java.util.Scanner;
public class Reverse{
	public static void main(String[] Args){
		Scanner scanner = new Scanner(System.in);
		int digit = scanner.nextInt();
		int x = digit;
		int[] digits = new int[50];
		int index = 0;
		for(int i=0; x!=0; i++){
			int temp = x%10;
			digits[i] = temp;
			index++;
			x = x/10;
		}
		for(int i=0; i<index; i++){
			System.out.print(digits[i]);
		}
	}
}