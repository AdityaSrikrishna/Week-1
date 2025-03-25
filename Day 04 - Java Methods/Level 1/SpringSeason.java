import java.util.Scanner;
public class SpringSeason{
	public void Spring(int month, int day){
		if((month==3 && day>=20) || (month==4) || (month==5) || (month==6 && day<=20)){
			System.out.println("It is Spring Season");
		}
		else{
			System.out.println("It is not Spring Season");
		}
	}
	public static void main(String[] Args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the day: ");
		int day = scanner.nextInt();
		System.out.println("Enter the month: ");
		int month = scanner.nextInt();
		SpringSeason Day = new SpringSeason();
		Day.Spring(month, day);
	}
}