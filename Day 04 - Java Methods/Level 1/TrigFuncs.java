import java.util.Scanner;
public class TrigFuncs{
	public static double[] calculateTrigonometricFunctions(double angle){
		double radians = Math.toRadians(angle);
		double sin = Math.sin(radians);
		double cos = Math.cos(radians);
		double tan = Math.tan(radians);
		return new double[]{sin,cos,tan};
	}
	public static void main(String[] Args){
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the angle in degrees: ");
		double angle = scanner.nextDouble();
		double result[] = calculateTrigonometricFunctions(angle);
		System.out.println("Sin ( " + angle + " ) is: " + result[0]);
		System.out.println("Cos ( " + angle + " ) is: " + result[1]);
		System.out.println("Tan ( " + angle + " ) is: " + result[2]);
	}
}