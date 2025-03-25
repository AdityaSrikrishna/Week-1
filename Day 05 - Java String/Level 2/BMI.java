import java.util.Scanner;
public class BMI{
    public static float[] BMIvalues(int[] weight, int[] height){
        float[] bmi = new float[weight.length];
        for(int i=0; i<weight.length; i++){
            bmi[i] = ((float)weight[i]/(height[i]*height[i]))*10000;
        }
        return bmi;
    }
    public static String[] Status(float[] bmi){
        String[] status = new String[10];
        for(int i=0; i<10; i++){
            if(bmi[i]<=18.4){
                status[i] = "Underweight";
            }
            else if(bmi[i]>18.4 && bmi[i]<=24.9){
                status[i] = "Normal";
            }
            else if(bmi[i]>24.9 && bmi[i]<=39.9){
                status[i] = "Overweight";
            }
            else if(bmi[i]>39.9){
                status[i] = "Obese";
            }
        }
        return status;
    }
    public static void main(String[] Args){
        Scanner scanner = new Scanner(System.in);
        int[] height = new int[10];
        int[] weight = new int[10];
        for(int i=0; i<height.length; i++){
            height[i] = scanner.nextInt();
        }
        for(int i=0; i<weight.length; i++){
            weight[i] = scanner.nextInt();
        }
        float[] a = BMIvalues(height, weight);
        String[] b = Status(a);
        for(int i=0; i<10; i++){
            System.out.println("BMI value of " + i + " is: " + a[i]);
            System.out.println("Status of the person " + i + "is: " + b[i]);
        }
        scanner.close();
    }
}
