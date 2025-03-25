import java.util.Scanner;
public class Calculator{
	public static void main(String[] Args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter two number: \n");
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		System.out.print("Enter a operation (+, -, *, /, %): ");
		char choice = scanner.next().charAt(0);
		switch(choice){
			case '+':
				System.out.print(a + " + " + b + " = " + (a+b));
				break;
			
			case '-':
				System.out.print(a + " - " + b + " = " + (a-b));
				break;
			
			case '*':
				System.out.print(a + " * " + b + " = " + (a*b));
				break;
			
			case '/':
				System.out.print(a + " / " + b + " = " + (a/b));
				break;
			
			case '%':
				System.out.print(a + " % " + b + " = " + (a%b));
				break;
			
			default:
				System.out.print("Invalid choice.");
		}
		scanner.close();
	}
}