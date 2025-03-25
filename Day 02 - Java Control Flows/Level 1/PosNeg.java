import java.util.Scanner;
public class PosNeg{
	public static void main(String[] Args){
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		if(num>0){
			System.out.println("The number is positive.");
		}
		else if(num<0){
			System.out.println("The number is negative.");
		}
		else{
			System.out.println("The number is 0.");
		}
		scanner.close();
	}
}