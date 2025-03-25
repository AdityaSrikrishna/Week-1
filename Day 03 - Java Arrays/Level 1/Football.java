import java.util.Scanner;
public class Football{
	public static void main(String[] Args){
		Scanner scanner = new Scanner(System.in);
		int[] num = new int[11];
		int i = 0;
		int sum = 0; 
		while(i!=11){
			num[i] = scanner.nextInt();
			i++;
		}
		for(i=0; i<11; i++){
			sum += num[i];
		}
		float mean = sum/11;
		System.out.println("The mean height of the players is: " + mean);
		scanner.close();
	}
}
	