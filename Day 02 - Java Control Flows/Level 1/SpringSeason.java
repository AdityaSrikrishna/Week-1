import java.util.Scanner;
public class SpringSeason{
	public static void main(String[] Args){
		Scanner scanner = new Scanner(System.in);
		String month = scanner.nextLine();
		int day = scanner.nextInt();
		if((month.equals("March") && day>=20) || month.equals("April") || month.equals("May") || (month.equals("June") && day<=20)){
			System.out.println("Spring season is going on");
		}
		else{
			System.out.println("This is not the spring season");
		}
		scanner.close();
	}
}