import java.util.Scanner;
public class SumofN{
	public static int Sum(int n){
		if(n==1){
			return 1;
		}
		return (n + Sum(n-1));
	}
	public static int Sumofn(int n){
		int result = (n*(n+1))/2;
		return result;
	}
	public static void main(String[] Args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int x = scanner.nextInt();
		int sum = Sum(x);
		int add = Sumofn(x);
		System.out.println("The Sum is: " + sum);
		System.out.println("The Sum is: " + add);
		scanner.close();
	}
}