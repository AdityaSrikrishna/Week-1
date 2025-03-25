import java.util.Scanner;
public class FizzBuzz{
	public static void main(String[] Args){
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		if(num>0){
			for(int i=1; i<=num; i++){
				if(i%15==0){
					System.out.print("FizzBuzz");
					System.out.print(" ");
				}
				else if(i%3==0){
					System.out.print("Fizz");
					System.out.print(" ");
				}
				else if(i%5==0){
					System.out.print("Buzz");
					System.out.print(" ");
				}
				else{
					System.out.print(i);
					System.out.print(" ");
				}
			}
		}
		scanner.close();
	}
}