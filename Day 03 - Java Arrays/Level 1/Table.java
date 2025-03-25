import java.util.Scanner;
public class Table{
	public static void main(String[] Args){
		Scanner scanner = new Scanner(System.in);
		int[] num = new int[10];
		int temp = scanner.nextInt();
		for(int i=0; i<10;i++){
			num[i] = temp*(i+1);
		}
		for(int i=0; i<10;i++){
			System.out.println(temp + " * " + (i+1) + " = " + num[i]);
		}
		
		scanner.close();
	}
}
	