import java.util.Scanner;
public class TotalPrice{
	public static void main(String[] Args){
		Scanner scanner = new Scanner(System.in);
		float Price = scanner.nextFloat();
		float Quantity = scanner.nextFloat();
		float TotalPrice = Price * Quantity;
		System.out.println("Total Price is: " + TotalPrice);
	}
}