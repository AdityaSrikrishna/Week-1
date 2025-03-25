import java.util.Scanner;
public class Sum{
	public static void main(String[] Args){
		Scanner scanner = new Scanner(System.in);
		int sum = 0;
		int num;
		num = scanner.nextInt();
		while(num!=0){
			sum = sum + num;
			num = scanner.nextInt();
		}
		System.out.println(sum);
		scanner.close();
	}
}