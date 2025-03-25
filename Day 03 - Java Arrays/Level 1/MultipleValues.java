import java.util.Scanner;
public class MultipleValues{
	public static void main(String[] Args){
		Scanner scanner = new Scanner(System.in);
		int[] num = new int[10];
		int i = 0;
		int sum = 0; 
		while(i!=10){
			num[i] = scanner.nextInt();
			if(num[i]==0 || num[i]<0){
				break;
			}
			i++;
		}
		System.out.println("The numbers are: ");
		for(i=0; i<10; i++){
			System.out.println(num[i]);
			sum += num[i];
		}
		System.out.println("The sum of the numbers is: " + sum);
		scanner.close();
	}
}
	