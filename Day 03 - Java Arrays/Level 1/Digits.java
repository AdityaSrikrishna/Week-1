import java.util.Scanner;
public class Digits{
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
		int max = Integer.MIN_VALUE;
		int max2 = Integer.MIN_VALUE;
		for(int i=0; i<index; i++){
			if(digits[i]>max){
				max2 = max;
				max = digits[i];
			}
			else if(digits[i]>max2 && digits[i]<max){
				max2 = digits[i];
			}
		}
		System.out.println("The Largest element is: " + max);
		System.out.println("The Second largest element is: " + max2);
	}
}