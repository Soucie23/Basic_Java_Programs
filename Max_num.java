package basic_programs;
//Java Program to Find the Largest Number Among Three Numbers
import java.util.Scanner;

public class Max_num {
    private int max = Integer.MIN_VALUE; // Initialize to the smallest possible integer value
    private int[] num = new int[3];

    private void checkNum() {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            num[i] = scanner.nextInt();
            if (num[i] > max) {
                max = num[i];
            }
        }
        scanner.close(); // Close the scanner after using it

        System.out.println("Largest number is: " + max);
    }

    public static void main(String[] args) {
        Max_num maxNum = new Max_num();
        maxNum.checkNum();
    }
}
