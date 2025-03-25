import java.util.Scanner;
public class Factors{
	public static void main(String[] Args){
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the length: ");
		int x = scanner.nextInt();
		int[] num = new int[x];
		int[] factors = new int[100];
		int index = 0;
		for(int i=0; i<x; i++){
			num[i] = scanner.nextInt();
		}
		for(int i=0; i<x; i++){
			if(num[i]==0){
				System.out.println("Factors of 0: All the numbers can divide 0");
				continue;
			}
			else if(num[i]==1){
				System.out.println("Factors of 1: Only 1");
				continue;
			}
			for(int j=2; j<num[i]; j++){
				if(num[i]%j==0){
					factors[index++] = j;
				}
			}
		}
		for(int i=0; i<index; i++){
			System.out.print(factors[i] + " ");
		}
		scanner.close();
	}
}					