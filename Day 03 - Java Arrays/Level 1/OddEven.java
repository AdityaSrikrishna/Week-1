import java.util.Scanner;
public class OddEven{
	public static void main(String[] Args){
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int x = scanner.nextInt();
		int evenIndex = 0;
		int oddIndex = 0;
		int i=0;
		int[] num = new int[x];
		int[] odd = new int[x];
		int[] even = new int[x];
		for(i=0; i<x; i++){
			num[i] = scanner.nextInt();
			i++;
		}
		for(i=0; i<x; i++){
			if(num[i]%2==0){
				even[evenIndex++] = num[i];
			}
			else{
				odd[oddIndex++] = num[i];
			}
		}
		for(i=0; i<x; i++){
			System.out.print(odd[i] + " ");
			i++;
		}
		for(i=0; i<x; i++){
			System.out.print(even[i] + " ");
			i++;
		}
		scanner.close();
	}
}