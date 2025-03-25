import java.util.Scanner;
public class Triangle{
	public static void main(String[] Args){
		Scanner scanner = new Scanner(System.in);
		float base = scanner.nextFloat();
		float height = scanner.nextFloat();
		double AreainCm = (1.0/2.0)*base*height;
		double AreainInch = (1.0/2.0)*(base/2.54)*(height/2.54);
		System.out.println("Area in cm: " + AreainCm + "\n" + "Area in Inches: " + AreainInch);
	}
}