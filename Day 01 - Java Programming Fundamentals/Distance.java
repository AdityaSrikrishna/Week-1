import java.util.Scanner;
public class Distance{
	public static void main(String[] Args){
		Scanner scanner = new Scanner(System.in);
		int feet = scanner.nextInt();
		int yards = feet/3;
		int miles = yards/1760;
		System.out.println("Feet is: " + feet + "\n" + "Yards is: " + yards + "\n" + "Miles is: " + miles);
    }
}