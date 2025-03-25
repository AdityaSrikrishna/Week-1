import java.util.Scanner;
public class OddEven{
	public static void main(String[] Args){
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int x = scanner.nextInt();
		int evenIndex = 0;
		int oddIndex = 0;
		int i;
		int[] odd = new int[(x+1)/2];
		int[] even = new int[x/2];
		for(i=1; i<=x; i++){
			if(i%2==0){
				even[evenIndex++] = i;
			}
			else{
				odd[oddIndex++] = i;
			}
		}
		System.out.print("Odd Numbers are: ");
		for(i=0; i<oddIndex; i++){
			System.out.print(odd[i] + " ");
			i++;
		}
		System.out.print("Even Numbers are: ");
		System.out.println();
		for(i=0; i<evenIndex; i++){
			System.out.print(even[i] + " ");
			i++;
		}
		scanner.close();
	}
}