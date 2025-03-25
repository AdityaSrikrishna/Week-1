import java.util.Scanner;
public class VotingCheck{
	public static void isEligible(int[] age, int x){
		for(int i=0; i<x; i++){
			if(age[i]>=18){
				System.out.println("Student " + (i+1) + " can vote.");
			}
			else{
				System.out.println("Student " + (i+1) + " cannot vote.");
			}
	    }
	}
	
	public static void main(String[] Args){
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the number of children: ");
		int x = scanner.nextInt();
		int[] age = new int[x];
		for(int i=0; i<x; i++){
			age[i] = scanner.nextInt();
		}
		isEligible(age, x);
		scanner.close();
	}
}
		