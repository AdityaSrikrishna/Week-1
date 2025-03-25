import java.util.Scanner;
public class UnitConverter{
		private static double km2miles = 0.621371;
		private static double miles2km = 1.60934;
		private static double meters2feet = 3.28084;
		private static double feet2meters = 0.3048;
		public static double convertKmtoMiles(int km){
			return km*km2miles;
		}
		public static double convertMilestoKm(int miles){
			return miles*miles2km;
		}
		public static double convertmtofeet(int m){
			return m*meters2feet;
		}
		public static double convertfeettom(int feet){
			return feet*feet2meters;
		}
		public static void main(String[] Args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter distance in km: ");
		int km = scanner.nextInt();
		double conv1 = convertKmtoMiles(km);
		System.out.println("Enter distance in miles: ");
		int miles = scanner.nextInt();
		double conv2 = convertMilestoKm(miles);
		System.out.println("Enter distance in m: ");
		int m = scanner.nextInt();
		double conv3 = convertmtofeet(m);
		System.out.println("Enter distance in feet: ");
		int feet = scanner.nextInt();
		double conv4 = convertfeettom(km);
		System.out.println("Distance from km to miles: " + conv1);
		System.out.println("Distance from miles to km: " + conv2);
		System.out.println("Distance from m to feet: " + conv3);
		System.out.println("Distance from feet to m: " + conv4);
		scanner.close();
	}
}