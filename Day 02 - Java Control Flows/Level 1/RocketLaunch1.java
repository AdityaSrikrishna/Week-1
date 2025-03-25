import java.util.Scanner;
public class RocketLaunch1{
	public static void main(String[] Args){
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		for(int i=num; i!=0; i--){
			System.out.println(i);
		}
		scanner.close();
	}
}