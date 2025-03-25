import java.util.Scanner;
public class SumofN{
	public int sumofn(int num){
		int i=num;
		int sum =0;
		while(i>0){
			sum+=i;
			i--;
		}
		return sum;
	}
	public static void main(String[] Args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = scanner.nextInt();
		SumofN number = new SumofN();
		int result = number.sumofn(num);
		System.out.println("The sum of " + num + " numbers is: " + result);
	}
}