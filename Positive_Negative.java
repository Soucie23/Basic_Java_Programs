package basic_programs;
//Java Program to Check Whether a Number is Positive or Negative

import java.util.Scanner;

public class Positive_Negative {
    private int num;

    public void checkNum() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number: ");
        num = scanner.nextInt();
        if (num > 0) {
            System.out.println("The number is positive.");
        } else if (num < 0) {
            System.out.println("The number is negative.");
        } else {
            System.out.println("The number is zero.");
        }
       scanner.close();
    }

    public static void main(String[] args) {
        Positive_Negative positiveNegative = new Positive_Negative();
        positiveNegative.checkNum();
    }
}
