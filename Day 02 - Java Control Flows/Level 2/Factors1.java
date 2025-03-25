import java.util.Scanner;
public class Factors1{
	public static void main(String[] Args){
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		int i=1;
		while(i<=num){
			if(num%i==0){
				System.out.println(i + " is a factor of " + num + ".");
		    }
			i++;
		}
		scanner.close();
	}
}