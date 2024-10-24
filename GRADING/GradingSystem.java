/*Modify the grading class to implement the following pseudocode:
if average marks is greater than 40 or equal to 60   then print "Passed"   else print "Failed"
Compile and run the program.*/

import java.util.Scanner;

public class GradingSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input for marks
        System.out.print("Enter the average marks: ");
        int averageMarks = scanner.nextInt();

        // Check the condition and print the result
        if (averageMarks >= 40 && averageMarks <= 60) {
            System.out.println("Passed");
        } else {
            System.out.println("Failed");
        }

        // Close the scanner
        scanner.close();

   }
}