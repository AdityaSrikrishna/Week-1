import java.util.Scanner;
public class Sum1{
	public static void main(String[] Args){
		Scanner scanner = new Scanner(System.in);
		int sum = 0;
		int num;
		for(num=scanner.nextInt(); num!=0; num=scanner.nextInt()){
			sum+=num;
		}
		System.out.println(sum);
		scanner.close();
	}
}