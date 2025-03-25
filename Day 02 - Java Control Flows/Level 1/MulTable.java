import java.util.Scanner;
public class MulTable{
	public static void main(String[] Args){
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		for(int i=6; i<10; i++){
			System.out.println(num + "*" + i + "=" + num*i);
		}
		scanner.close();
	}
}