import java.util.Scanner;
public class Handshakes{
	public int shakes(int n){
		int z = (n*(n-1))/2;
		return z;
	}
	public static void main(String[] Args){
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the Number of students:  ");
		int n = scanner.nextInt();
		Handshakes A1 = new Handshakes();
		int handshakes = A1.shakes(n);
		System.out.println("The Number of Handshakes are: " + handshakes);
		scanner.close();
	}
}