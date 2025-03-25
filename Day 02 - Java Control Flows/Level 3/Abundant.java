import java.util.Scanner;
public class Abundant{
	public static void main(String[] Args){
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		int temp = num;
		int sum = 0;
		for(int i=1; i<num; i++){
			if(num%i==0){
				sum+=i;
			}
		}
		if(num<sum){
			System.out.println(num + " is an Abundant number.");
		}
		else{
			System.out.println(num + " is not an Abundant number.");
		}
		scanner.close();
	}
}