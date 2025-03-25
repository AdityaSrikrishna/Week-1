import java.util.Scanner;
public class FizzBuzz{
	public static void main(String[] Args){
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the number of elements: ");
		int x = scanner.nextInt();
		String[] num2 = new String[x];
		int index = 0;
		for(int i=0; i<x; i++){
			if((i+1)%15==0){
				num2[i] = "FizzBuzz";
			}
			else if((i+1)%3==0){
				num2[i] = "Fizz";
			}
			else if((i+1)%5==0){
				num2[i] = "Buzz";
			}
			else{
				num2[i] = String.valueOf(i+1);
			}
		}
		for(int i=0; i<x; i++){
			System.out.print(num2[i] + " ");
		}
		
		scanner.close();
	}
}					