/* Create a project named Exam. The program should ask the tutor to enter the student marks comprising of coursework
(Assignment 1, Assignment 2, CAT 1, and CAT 2).
The program should evaluate the coursework average and print the grade of a student using the following criteria:
Grade A: 40-50
Grade B: 30-39
Grade C: 20-29
Grade D: 10-19
Fail: 0-9
Write comments to explain your code.
*/

import java.util.Scanner;

public class Exam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input marks for coursework
        System.out.print("Enter marks for Assignment 1: ");
        double assignment1 = scanner.nextDouble();
        System.out.print("Enter marks for Assignment 2: ");
        double assignment2 = scanner.nextDouble();
        System.out.print("Enter marks for CAT 1: ");
        double cat1 = scanner.nextDouble();
        System.out.print("Enter marks for CAT 2: ");
        double cat2 = scanner.nextDouble();

        // Calculate average
        double average = (assignment1 + assignment2 + cat1 + cat2) / 4;

        // Determine grade using if...else if...else structure
        if (average >= 70 && average <= 100) {
            System.out.println("Grade: A");
        } else if (average >= 60 && average < 70) {
            System.out.println("Grade: B");
        } else if (average >= 50 && average < 60) {
            System.out.println("Grade: C");
        } else if (average >= 40 && average < 50) {
            System.out.println("Grade: D");
        } else if (average >= 0 && average < 40) {
            System.out.println("Grade: Fail");
        } else {
            System.out.println("Unknown value");
        }

        scanner.close();
    }
}
