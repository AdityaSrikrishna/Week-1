import java.util.Scanner;
public class LeapYear{
	public static boolean Leap(int n){
		if(n%400 == 0 || (n%4==0 && n%100!=0)){
			return true;
		}
		else{
			return false;
		}
	}
	public static void main(String[] Args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter an year: ");
		int n = scanner.nextInt();
		boolean year = Leap(n);
		if(year){
			System.out.println(n + " is a Leap year.");
		}
		else{
			System.out.println(n + " is not a Leap year.");
		}
		scanner.close();
	}
}