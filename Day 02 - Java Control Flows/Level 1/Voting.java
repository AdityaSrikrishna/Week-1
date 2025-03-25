import java.util.Scanner;
public class Voting{
	public static void main(String[] Args){
		Scanner scanner = new Scanner(System.in);
		int age = scanner.nextInt();
		if(age>=18){
			System.out.println("The person is eligible for voting.");
		}
		else{
			System.out.println("The person is not eligible for voting.");
		}
		scanner.close();
	}
}