import java.util.Scanner;
public class TwoDArray{
	public static void main(String[] Args){
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the rows: ");
		int rows = scanner.nextInt();
		System.out.print("Enter the columns: ");
		int columns = scanner.nextInt();
		int[][] num = new int[rows][columns];
		for(int i=0; i<rows; i++){
			for(int j=0; j<columns; j++){
				num[i][j] = scanner.nextInt();
			}
		}
		int[] num2 = new int[rows*columns];
		int index = 0;
		for(int i=0; i<rows; i++){
			for(int j=0; j<columns; j++){
				num2[index++] = num[i][j];
			}
		}
		for(int i=0; i<index; i++){
			System.out.println(num2[i]);
		}
		
		scanner.close();
	}
}					