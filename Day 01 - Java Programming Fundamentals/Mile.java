import java.util.Scanner;
public class Mile{
	public static void main(String[] Args){
		Scanner scanner = new Scanner(System.in);
		double km;
		km = scanner.nextDouble();
		double mile = km *1.6;
		System.out.println("Number of Km is: " + km + " Number of Miles is: " + mile);
		scanner.close();
	}
}