import java.util.Scanner;
public class Fee{
	public static void main(String[] Args){
		Scanner scanner = new Scanner(System.in);
		int coursefee = scanner.nextInt();
		int perc = scanner.nextInt();
		float discountAmount = coursefee * (perc/100f);
		float finalPrice = coursefee - discountAmount;
		float profperc = (discountAmount/coursefee) * 100;
		System.out.println("Discount amount is: " + discountAmount + "\n" + "Discount percentage is: " + profperc);
	}
}