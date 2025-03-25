import java.util.Scanner;
public class Height{
	public static void main(String[] Args){
		Scanner scanner = new Scanner(System.in);
		int cm = scanner.nextInt();
		double inch = cm / 2.54;
		double feet = inch / 12;
		System.out.println("Height in cm: " + cm + "\n" + "Height in inch: " + inch + "\n" + "Height in feet: " + feet);
		scanner.close();
	}
}