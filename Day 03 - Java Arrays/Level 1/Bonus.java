import java.util.Scanner;
public class Bonus{
	public static void main(String[] Args){
		Scanner scanner = new Scanner(System.in);
		float[][] employees = new float[10][10];
		float bonus;
		float bonusamount;
		float[] newsalary = new float[10];
		for(int i=0; i<10; i++){
			for(int j=0; j<2; j++){
				employees[i][j] = scanner.nextInt();
			}
		}
		for(int i=0; i<10; i++){
			for(int j=0; j<2; j++){
				if(employees[i][1] < 5){
					bonus = 2;
					bonusamount = (bonus/100f)*employees[i][0];
				}
				else{
					bonus = 5;
					bonusamount = (bonus/100f)*employees[i][0];
				}
				newsalary[i] = employees[i][0] + (bonusamount);
			}
			System.out.println("New salary of " + i + "is: " + newsalary[i]);
		}
	}
}