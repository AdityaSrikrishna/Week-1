import java.util.Scanner;
public class BMI{
	public static void main(String[] Args){
		Scanner scanner = new Scanner(System.in);
		double height = scanner.nextDouble();
		double weight = scanner.nextDouble();
		double BMI = (weight/(height*height))*10000;
		System.out.println("The BMI is: " + BMI);
		if(BMI<=18.4){
			System.out.println("Underweight");
		}
		else if(BMI>18.4 && BMI<=24.9){
			System.out.println("Normal");
		}
		else if(BMI>24.9 && BMI<=39.9){
			System.out.println("Overweight");
		}
		else{
			System.out.println("Obese");
		}
		scanner.close();
	}
}