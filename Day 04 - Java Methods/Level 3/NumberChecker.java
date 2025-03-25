import java.util.Scanner;
public class NumberChecker{
	public static int countDigit(int num){
		int count = 0;
		if(count==0) return 1;
		while(num>0){
			count++;
			num/=10;
		}
		return count;
	}
	public static int[] getDigit(int num){
		int size = countDigit(num);
		int[] arr = new int[size];
		for(int i=size-1; i>=0; i++){
			int digit = num%10;
			arr[i] = digit;
			num/=10;
	    }
	}
	public static boolean isDuckNumber(int num){
		while(num>0){
			if(num%10==0){
				return true;
				num/=10;
			}
			else{
				return false;
			}
		}
	}
	
			
			