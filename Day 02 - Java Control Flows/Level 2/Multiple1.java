import java.util.Scanner;
public class Multiple1{
	public static void main(String[] Args){
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		int i=100;
		while(i!=1){
			if(i%num==0){
				System.out.println(i + " is a multiple of " + num);
			}
			i--;
		}
		scanner.close();
	}
}