import java.util.Scanner;
public class Sumofq{
	public static void main(String[] Args){
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int q = n;
		int sum =0;
		while(q!=0){
			sum+=q;
			q--;
		}
		int sumofn = (n*(n+1))/2;
		System.out.println("Sum of N numbers is: " + sumofn);
		System.out.println("Sum of n Numbers is: " + sum);
		scanner.close();
	}
}