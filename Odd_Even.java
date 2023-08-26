// Program to check od even number.
package basic_programs; // Package Declaration

import java.util.Scanner; //importing Scanner library

// Declare the class named Odd_Even
public class Odd_Even {
    // The main method is the entry point of the program
    public static void main(String[] args) {
        // Create an instance of the Odd_Even class
        Odd_Even oddEven = new Odd_Even();
// Call the check() method to perform the check
        oddEven.check();
    }

    public void check() { // Method to check odd or even
        // Declare an integer variable named num
        int num;
        // Create an instance of Scanner to read input from the user
        Scanner scanner = new Scanner(System.in);
        // Prompt the user to enter a number
        System.out.println("Enter the number: ");
        // Read the entered number and store it in the num variable
        num = scanner.nextInt();

        // Check if the number is even or odd using the modulo operator (%)
        if (num % 2 == 0) {
            System.out.println("Even"); // Print "Even" if the condition is true
        } else {
            System.out.println("Odd");// Print "Odd" if the condition is false
        }
        // Close the scanner to release resources
        scanner.close();
    }
}
