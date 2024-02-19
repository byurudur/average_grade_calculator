/**
 * @author Ahmet Batuhan YÜRÜDÜR
 * @since 2024
 */

import java.util.Scanner;

class Main{

    public static void main(String[] args) {
        // Average grade calculator, works with the inputs from the user.
        // Value assignments.
        Scanner input = new Scanner(System.in);
        double grade1, grade2, grade3, grade4, grade5, averageGrade ;

        // Taking the needed values.
        System.out.println("Please enter your Math grade: ");
        grade1 = input.nextDouble();
        System.out.println("Please enter your Physics grade: ");
        grade2 = input.nextDouble();
        System.out.println("Please enter your Turkish grade: ");
        grade3 = input.nextDouble();
        System.out.println("Please enter your History grade: ");
        grade4 = input.nextDouble();
        System.out.println("Please enter your Music grade: ");
        grade5 = input.nextDouble();

        // For average value, we determine the "averageGrade" and calculate.
        averageGrade = (grade1 + grade2 + grade3 + grade4 + grade5) / 5;

        //Tell if it is a success or a fail.
        System.out.println("Your average is " + averageGrade);
        System.out.println((averageGrade < 60) ? "You have failed the class." : "You have passed the class!" );
    }
}