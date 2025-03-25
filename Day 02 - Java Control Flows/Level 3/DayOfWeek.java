import java.util.Scanner;
public class DayOfWeek{
	public static void main(String[] Args){
		Scanner scanner = new Scanner(System.in);
		int day = scanner.nextInt();
		int month = scanner.nextInt();
		int year = scanner.nextInt();
		int a = year - (14-month)/12;
		int x = a + a/4 - a/100 + a/400;
		int b = month + 12*((14-month)/12) - 2;
		int d0 = (day + a + 31*b / 12)%7;
		switch(d0){
			case 0:
				System.out.println("The day is: Sunday");
				break;
			case 1:
				System.out.println("The day is: Monday");
				break;
			case 2:
				System.out.println("The day is: Tuesday");
				break;
			case 3:
				System.out.println("The day is: Wednesday");
				break;
			case 4:
				System.out.println("The day is: Thursday");
				break;
			case 5:
				System.out.println("The day is: Friday");
				break;
			case 6:
				System.out.println("The day is: Saturday");
				break;
			default:
				System.out.println("Invalid Choice.");
		}
		scanner.close();
	}
}