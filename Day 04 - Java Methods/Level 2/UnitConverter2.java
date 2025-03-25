import java.util.Scanner;
public class UnitConverter2{
		public static double convertfarhenheit2celsius(int f){
			double farhenheit2celsius = (f - 32) * 5 / 9;
			return f*farhenheit2celsius;
		}
		public static double convertcelsius2farhenheit(int c){
			double celsius2farhenheit = (c * 9 / 5) + 32;
			return c*celsius2farhenheit;
		}
		public static double convertpounds2Kilograms(int pounds){
			double pounds2kilograms = 0.453592;
			return pounds*pounds2kilograms;
		}
		public static double convertkilograms2pounds(int kg){
			double kilograms2pounds = 2.20462;
			return kg*kilograms2pounds;
		}
		public static double convertgallons2litres(int gallons){
			double gallons2liters = 3.78541;
			return gallons*gallons2liters;
		}
		public static double convertlitrestogallons(int litres){
			double liters2gallons = 0.264172;
			return litres*liters2gallons;
		}
		public static void main(String[] Args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter temperature in farhenheit: ");
		int f = scanner.nextInt();
		double conv1 = convertfarhenheit2celsius(f);
		System.out.println("Enter temperature in celsius: ");
		int c = scanner.nextInt();
		double conv2 = convertcelsius2farhenheit(c);
		System.out.println("Enter weight in pounds: ");
		int p = scanner.nextInt();
		double conv3 = convertpounds2Kilograms(p);
		System.out.println("Enter weight in kg: ");
		int kg = scanner.nextInt();
		double conv4 = convertkilograms2pounds(kg);
		System.out.println("Enter volume in gallons: ");
		int g = scanner.nextInt();
		double conv5 = convertgallons2litres(g);
		System.out.println("Enter volume in litres: ");
		int l = scanner.nextInt();
		double conv6 = convertlitrestogallons(l);
		System.out.println("Temperature from farhenheit to celsius: " + conv1);
		System.out.println("Temperature from celsius to farhenheit: " + conv2);
		System.out.println("Weight from pounds to kg: " + conv3);
		System.out.println("Weight from kg to pounds: " + conv4);
		System.out.println("Volume from gallons to litres: " + conv5);
		System.out.println("Volume from litres to gallons: " + conv6);
		scanner.close();
	}
}