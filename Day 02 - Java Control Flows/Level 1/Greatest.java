import java.util.Scanner;
public class Greatest{
	public static void main(String[] Args){
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		int max = (a>b) ? ((a>c) ? a : c) : ((b>c) ? b : c);
		System.out.println("Greatest number is: " + max);
		scanner.close();
	}
}
		