import java.util.Scanner;
public class Count{
	public static void main(String[] Args){
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		int temp = num;
		int count = 0;
		while(temp!=0){
			int digit = temp%10;
			temp = temp/10;
			count++;
		}
		System.out.println("Number of digits are: " + count);
		scanner.close();
	}
}