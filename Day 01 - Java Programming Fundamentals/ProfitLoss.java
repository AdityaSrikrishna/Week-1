public class ProfitLoss{
	public static void main(String[] Args){
		int CP = 129;
		int SP = 191;
		int profit = SP - CP;
		float perc = ((float)profit/CP) * 100;
		System.out.println("Profit is: " + profit + "\nProfit percentage is: " + perc);
	}
}