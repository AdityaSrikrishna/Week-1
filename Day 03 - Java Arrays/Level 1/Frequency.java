import java.util.Scanner;

public class Frequency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Get the number input
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        // Array to store frequency of each digit (0-9)
        int[] count = new int[10];  

        // Count frequency of digits
        int temp = num;
        while (temp > 0) {
            int digit = temp % 10;  // Extract last digit
            count[digit]++;         // Increment frequency
            temp /= 10;             // Remove last digit
        }

        // Display results
        System.out.println("Digit Frequencies:");
        for (int i = 0; i < 10; i++) {
            if (count[i] > 0) {  // Only print digits that exist in the number
                System.out.println("Digit " + i + " appears " + count[i] + " times.");
            }
        }

        scanner.close();
    }
}
