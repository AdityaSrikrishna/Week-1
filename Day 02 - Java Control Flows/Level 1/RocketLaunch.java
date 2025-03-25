import java.util.Scanner;
public class RocketLaunch{
	public static void main(String[] Args){
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		while(num!=0){
			System.out.println(num);
			num--;
		}
		scanner.close();
	}
}