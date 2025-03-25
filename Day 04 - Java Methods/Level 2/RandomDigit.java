import java.util.Arrays;
public class RandomDigit{
	public static void RandomGen(int size){
		int[] num = new int[size];
		int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE, sum = 0;
		for(int i=0; i<5; i++){
			num[i] = (int) (Math.random()*9000)+1000;
			sum += num[i];
			min = Math.min(min, num[i]);
			max = Math.max(max, num[i]);
		}
		System.out.println("Sum is: " + sum);
		System.out.println("Average is: " + sum/5f);
		System.out.println("Min is: " + min);
		System.out.println("Max is: " + max);
	}
	
	public static void main(String[] Args){
		RandomGen(5);
	}
}