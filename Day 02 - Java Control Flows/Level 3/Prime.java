import java.util.Scanner;
public class Prime{
	public static void main(String[] Args){
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		int i=2;
		int t=0;
		int j=num;
		while(i!=num){
			if(num%i==0){
				System.out.println(num + " is not a prime number.");
				t=1;
				break;
			}
			i++;
		}
		if(t==0){
			System.out.println(num + " is a prime number.");
		}
		scanner.close();
	}
}