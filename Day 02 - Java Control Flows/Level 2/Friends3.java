import java.util.Scanner;
public class Friends3{
	public static void main(String[] Args){
		Scanner scanner = new Scanner(System.in);
		int AmarAge = scanner.nextInt();
		int AkbarAge = scanner.nextInt();
		int AnthonyAge = scanner.nextInt();
		int min = AmarAge<AkbarAge ? (AmarAge<AnthonyAge ? AmarAge : AnthonyAge) : (AkbarAge<AnthonyAge ? AkbarAge : AnthonyAge);
		if(min == AmarAge){
			System.out.println("Youngest is: Amar " + AmarAge);
		}
		else if(min == AkbarAge){
			System.out.println("Youngest is: Akbar " + AkbarAge);
		}
		else{
			System.out.println("Youngest is: Anthony " + AnthonyAge);
		}
		int AmarHeight = scanner.nextInt();
		int AkbarHeight = scanner.nextInt();
		int AnthonyHeight = scanner.nextInt();
		int max = AmarHeight>AkbarHeight ? (AmarHeight>AnthonyHeight ? AmarHeight : AnthonyHeight) : (AkbarHeight>AnthonyHeight ? AkbarHeight : AnthonyHeight);
		if(max == AmarHeight){
			System.out.println("Tallest is: Amar " + AmarHeight);
		}
		else if(max == AkbarHeight){
			System.out.println("Tallest is: Akbar " + AkbarHeight);
		}
		else{
			System.out.println("Tallest is: Anthony " + AnthonyHeight);
		}
		scanner.close();
	}
}