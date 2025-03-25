import java.util.Scanner;
public class Quadratic{
	public static void QuadEq(int a, int b, int c){
		double delta = Math.pow(b,2) - 4*a*c;
		if(delta>0){
			double root1 = (-b + Math.sqrt(delta))/(2*a);
			double root2 = (-b - Math.sqrt(delta))/(2*a);
			System.out.println("Root 1 is: " + root1);
			System.out.println("Root 2 is: " + root2);
		}
		else if(delta == 0){
			double root = -b/(2.0*a);
			System.out.print("Root 1 is: " + root);
		}
		else{
			double real_part = -b/(2.0*a);
			double imaginary_part = Math.sqrt(-delta)/(2*a);
			System.out.println("Root 1 is: " + real_part + " + " + imaginary_part + "i");
            System.out.println("Root 2 is: " + real_part + " - " + imaginary_part + "i");
		}
	}
	
	public static void main(String[] Args){
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		QuadEq(a, b, c);
		scanner.close();
	}
}
		
		