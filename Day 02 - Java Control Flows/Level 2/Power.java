import java.util.Scanner;
public class Power{
	public static void main(String[] Args){
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		int power = scanner.nextInt();
		int prod = 1;
		for(int i=power; i!=0; i--){
			prod*=num;
		}
		System.out.println("Power of " + num + " to " + power + " is " + prod);
		scanner.close();
	}
}