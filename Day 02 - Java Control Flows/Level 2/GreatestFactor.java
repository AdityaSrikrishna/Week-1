import java.util.Scanner;
public class GreatestFactor{
	public static void main(String[] Args){
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		int min = 0;
		for(int i=1; i<num; i++){
			if(num%i==0 && i>min){
				min = i;
			}
		}
		System.out.println(min + " is the greatest factor of " + num);
		scanner.close();
	}
}