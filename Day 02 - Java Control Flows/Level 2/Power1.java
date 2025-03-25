import java.util.Scanner;
public class Power1{
	public static void main(String[] Args){
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		int power = scanner.nextInt();
		int prod = 1;
		int i=power;
		while(i!=0){
			prod*=num;
			i--;
		}
		System.out.println("Power of " + num + " to " + power + " is " + prod);
		scanner.close();
	}
}