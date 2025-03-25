import java.util.Scanner;
public class Armstrong{
	public static void main(String[] Args){
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		int temp = num;
		int sum = 0;
		while(temp!=0){
			int digit = temp%10;
			sum+=digit*digit*digit;
			temp/=10;
		}
		System.out.println(sum);
		if(sum==num){
			System.out.println(num + " is an Armstrong Number.");
		}
		else{
			System.out.println(num + " is not an Armstrong Number.");
		}
		scanner.close();
	}
}