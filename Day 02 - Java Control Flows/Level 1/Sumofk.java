import java.util.Scanner;
public class Sumofk{
	public static void main(String[] Args){
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int k = n;
		int sum =0;
		for(int i=0; i<=k; i++){
			sum+=i;
		}
		int sumofn = (n*(n+1))/2;
		System.out.println("Sum of N numbers is: " + sumofn);
		System.out.println("Sum of n Numbers is: " + sum);
		scanner.close();
	}
}