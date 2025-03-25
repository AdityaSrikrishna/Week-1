import java.util.Scanner;
public class Age{
	public static void main(String[] Args){
		Scanner scanner = new Scanner(System.in);
		int[] age = new int[10];
		for(int i=0; i<10;i++){
			System.out.print("Enter the age: \n");
			age[i] = scanner.nextInt();
		}
		for(int i=0; i<10;i++){
			if(age[i] >=18){
				System.out.println(age[i] + " is eligible to vote.");
			}
			else{
				System.out.println(age[i] + " is not eligible to vote.");
		}	
		scanner.close();
	}
}