/*Convert the following pseudocode to Java using an if...else if...else selection structure:

If student's grade is greater than or equal to 90
Print "A"
else if student's grade is greater than or equal to 80
Print "B"
else if student's grade is greater than or equal to 70
Print "C"
else if student's grade is greater than or equal to 60
Print "D"
else
Print "F"
Compile and run the program.*/

import java.util.Scanner;

public class GradeEvaluator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the student's grade
        System.out.print("Enter the students grade: ");
        int grade = scanner.nextInt();

        // Evaluate the grade and print the corresponding letter
        if (grade >= 90) {
            System.out.println("A");
        } else if (grade >= 80) {
            System.out.println("B");
        } else if (grade >= 70) {
            System.out.println("C");
        } else if (grade >= 60) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }

        scanner.close();
    }
}
