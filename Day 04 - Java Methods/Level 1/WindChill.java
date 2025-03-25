import java.util.Scanner;
public class WindChill{
	public static double calculateWindChill(double temperature, double windSpeed){
		double windChill = 35.74 + (0.6215 *temperature) + (0.4275*temperature - 35.75) * (Math.pow(windSpeed,0.16));
		return windChill;
	}
	public static void main(String[] Args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the temperature in Celsius: ");
		int temperature = scanner.nextInt();
		System.out.println("Enter the Wind Speed: ");
		int windSpeed = scanner.nextInt();
		double device = calculateWindChill(temperature, windSpeed);
		System.out.println("The Wind Chill temperature is: " + device);
	}
}