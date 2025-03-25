import java.util.Scanner;
public class Children{
	public static int[] Distribution(int children, int chocolates){
		int distributed = chocolates / children;
		int remaining = chocolates % children;
		return new int[]{distributed, remaining};
	}
	public static void main(String[] Args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of children: ");
		int children = scanner.nextInt();
		System.out.println("Enter the number of chocolates: ");
		int chocolates = scanner.nextInt();
		int[] party = Distribution(children, chocolates);
		System.out.println("Number of chocolates distributed per child is/are: " + party[0]);
		System.out.println("Number of chocolates remaining are: " + party[1]);
	}
}