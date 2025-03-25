import java.util.Scanner;
public class Multiple{
	public static void main(String[] Args){
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		for(int i=100; i>0; i--){
			if(i%num==0){
				System.out.println(i + " is a multiple of " + num);
			}
		}
		scanner.close();
	}
}