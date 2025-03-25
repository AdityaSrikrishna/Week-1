import java.util.Scanner;
public class ThreeFriends{
	public static void main(String[] Args){
		Scanner scanner = new Scanner(System.in);
		int[] ages = new int[3];
		int[] heights = new int[3];
		for(int i=0; i<3; i++){
			ages[i] = scanner.nextInt();
		}
		for(int i=0; i<3; i++){
			heights[i] = scanner.nextInt();
		}
		int young = ages[0];
		int tallest = heights[0];
		for(int i=1; i<3; i++){
			if(ages[i]<young){
				young = ages[i];
			}
			else if(heights[i] > tallest){
				tallest = heights[i];
			}
		}
		System.out.println("Youngest is: " + young);
		System.out.print("Tallest is: " + tallest);
	}
}