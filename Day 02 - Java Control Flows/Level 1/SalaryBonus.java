import java.util.Scanner;
public class SalaryBonus{
	public static void main(String[] Args){
		Scanner scanner = new Scanner(System.in);
		float salary = scanner.nextFloat();
		int year = scanner.nextInt();
		float bonus = salary*(year/100f);
		System.out.println("Bonus is: " + bonus);
		System.out.println("Total salary is: " + (salary + bonus));	
		scanner.close();
	}
}