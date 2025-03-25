import java.util.Scanner;
public class BMI2{
	public static void main(String[] Args){
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the number of people: ");
		int x = scanner.nextInt();
		float[] height = new float[50];
		float[] weight = new float[50];
		float[] BMI = new float[50];
		float[][] container = new float[x][3];
		float bmi;
		for(int i=0; i<x; i++){
			height[i] = scanner.nextInt();
			weight[i] = scanner.nextInt();
		}
		for(int i=0; i<x; i++){
			bmi = (weight[i]/(height[i]*height[i]))*10000;
			BMI[i] = bmi;
		}
		for(int i=0; i<x; i++){
			container[i][0] = height[i];
			container[i][1] = weight[i];
			container[i][2] = BMI[i];
		}
		for(int i=0; i<x; i++){
			System.out.println("The Height is: " + container[i][0]);
			System.out.println("The Weight is: " + container[i][1]);
			System.out.println("The BMI is: " + container[i][2]);
	    }
	}
}