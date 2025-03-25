import java.util.Scanner;
public class Numbers{
	public static void main(String[] Args){
		Scanner scanner = new Scanner(System.in);
		int[] num = new int[5];
		for(int i=0; i<5;i++){
			num[i] = scanner.nextInt();
		}
		for(int i=0; i<5;i++){
			if(num[i] > 0){
				if(num[i]%2==0){
					System.out.println("Even number.");
				}
				else{
					System.out.println("Odd Number");
				}
			}
			else if(num[i] < 0){
				System.out.println("Negative Number.");
			}
			else{
				System.out.println("Number is 0.");
			}
		}
		if(num[0]<num[4]){
			System.out.println(num[0] + " is lesser than " + num[4]);
		}
		else if(num[0]>num[4]){
			System.out.println(num[0] + " is greater than " + num[4]);
		}
		else{
			System.out.println(num[0] + " is equal to " + num[4]);
		}
		scanner.close();
	}
}
	