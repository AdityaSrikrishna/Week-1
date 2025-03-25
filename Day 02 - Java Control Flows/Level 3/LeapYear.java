import java.util.Scanner;
public class LeapYear{
	public static void main(String[] Args){
		Scanner scanner = new Scanner(System.in);
		int year = scanner.nextInt();
		if(year > 1582){
			if(year%400 == 0 || (year%4==0 && year%100!=0)){
				System.out.println(year + " is a leap year.");
			}
			else{
				System.out.println(year + " is not a leap year.");
			}
		}
		else{
			System.out.println("Invalid year.");
		}
	}
}