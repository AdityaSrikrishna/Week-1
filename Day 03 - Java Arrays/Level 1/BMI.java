import java.util.Scanner;
public class BMI{
	public static void main(String[] Args){
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the number of people: ");
		int x = scanner.nextInt();
		float[] height = new float[50];
		float[] weight = new float[50];
		float[] BMI = new float[50];
		float bmi;
		String[] status = new String[50];
		int index = 0;
		for(int i=0; i<x; i++){
			height[i] = scanner.nextInt();
			weight[i] = scanner.nextInt();
		}
		for(int i=0; i<x; i++){
			bmi = (weight[i]/(height[i]*height[i]))*10000;
			BMI[i] = bmi;
			if(BMI[i]<=18.4){
				status[i] = "Underweight";
			}
			else if(BMI[i]>18.4 && BMI[i]<=24.9){
				status[i] = "Normal";
			}
			else if(BMI[i]>24.9 && BMI[i]<=39.9){
				status[i] = "Overweight";
			}
			else{
				status[i] = "Obese";
			}
		}
		for(int i=0; i<x; i++){
			System.out.print("BMI is: " + BMI[i]);
			System.out.println("Weight status is: " + status[i]);
		}
	}
}