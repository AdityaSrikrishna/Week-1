import java.util.Scanner;
public class GreatestFactor1{
	public static void main(String[] Args){
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		int min = 0;
		int i=1;
		while(i!=num){
			if(num%i==0 && i>min){
				min = i;
			}
			i++;
		}
		System.out.println(min + " is the greatest factor of " + num);
		scanner.close();
	}
}