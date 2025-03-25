import java.util.Scanner;
public class Harshad{
	public static void main(String[] Args){
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		int temp = num;
		int sum = 0;
		while(temp!=0){
			int digit = temp % 10;
			sum+=digit;
			temp = temp/10;
		}
		if(num%sum==0){
			System.out.println(num + " is a Harshad number.");
		}
		else{
			System.out.println(num + " is not a Harshad number.");
		}
		scanner.close();
	}
}