public class Course{
	public static void main(String[] Args){
		int coursefee = 125000;
		float discountAmount = coursefee * (10f/100);
		float finalPrice = coursefee - discountAmount;
		float perc = (discountAmount/coursefee) * 100;
		System.out.println("Discount amount is: " + discountAmount + "\n" + "Discount percentage is: " + perc);
	}
}