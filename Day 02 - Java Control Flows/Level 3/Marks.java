import java.util.Scanner;
public class Marks{
	public static void main(String[] Args){
		Scanner scanner = new Scanner(System.in);
		int physics = scanner.nextInt();
		int chemistry = scanner.nextInt();
		int maths = scanner.nextInt();
		float average = (physics+chemistry+maths)/3f;
		if(average<=39){
			System.out.println("Remedial Standards");
		}
		else if(average>=40 && average<=49){
			System.out.println("Level 1: too below");
		}
		else if(average>=50 && average<=59){
			System.out.println("Level 1: well below");
		}
		else if(average>=60 && average<=69){
			System.out.println("Level 2");
		}
		else if(average>=70 && average<=79){
			System.out.println("Level 3");
		}
		else if(average>=80 && average<=100){
			System.out.println("Level 4");
		}
		else{
			System.out.println("Invalid Marks");
		}
	}
}