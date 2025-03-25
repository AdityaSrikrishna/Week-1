import java.util.Scanner;
public class Factors{
	public static void main(String[] Args){
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int x = scanner.nextInt();
		int[] factors = new int[x/2 +1];
		int y = x/2;
		int index = 0;
		int sum = 0;
		int sum1 = 0;
		int prod = 1;
		for(int i=2; i<=y; i++){
			if(x%i==0){
				factors[index++] = i;
			}
		}
		for(int i=0; i<index; i++){
			sum += factors[i];
			prod *= factors[i];
		}
		for(int i=0; i<index; i++){
			sum1 += Math.pow(factors[i], 2);
		}
		System.out.println("Sum of the numbers is: " + sum);
		System.out.println("Product of the numbers is: " + prod);
		System.out.println("Sum of the squares of the numbers are: " + sum1);
	}
}