import java.util.Scanner;
public class FizzBuzz1{
	public static void main(String[] Args){
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		int i=1;
		if(num>0){
			while(i<=num){
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
				i++;
			}
		}
		scanner.close();
	}
}