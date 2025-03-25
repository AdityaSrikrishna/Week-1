import java.util.Scanner;
public class Smallest{
	public static void main(String[] Args){
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		
		if(a<b && a<c){
			System.out.println("First number is the smallest");
		}
		else{
			System.out.println("First number is not the smallest");
		}
	}
}