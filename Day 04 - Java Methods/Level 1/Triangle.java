import java.util.Scanner;
public class Triangle{
	public int Perimeter(int sidea , int sideb, int sidec){
		int perimeter = sidea + sideb + sidec;
		int rounds = 5000/perimeter ;
		return rounds;
	}
	public static void main(String[] Args){
		Scanner scanner = new Scanner(System.in);
		int sidea = scanner.nextInt();
		int sideb = scanner.nextInt();
		int sidec = scanner.nextInt();
		Triangle tri = new Triangle();
		int peri = tri.Perimeter(sidea, sideb, sidec);
		System.out.println("The Number of rounds are: " + peri);
	}
}