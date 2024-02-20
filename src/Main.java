/**
 * @author Ahmet Batuhan YÜRÜDÜR
 * @since 2024
 */


import java.util.Scanner;

class Main{

    public static void main(String[] args) {
        // Average grade calculator, works with the inputs from the user.
        // Value assignments.
        // Variables and store grades and averageGrade
        float grade1,grade2, grade3, grade4, grade5, averageGrade;
        int divider = 5;
        
        Scanner input = new Scanner(System.in);

        // Taking input for each lecture and validate status
        System.out.print("Please Enter Math Grade: ");
        grade1 = input.nextFloat();
        if(grade1<=0 || grade1>100){
            System.out.println("This grade will be counted as zero.");
            grade1 = 0;
            divider-=1;
        }
        System.out.print("Please Enter Physics Grade: ");
        grade2 = input.nextFloat();
        if(grade2<=0 || grade2>100){
            System.out.println("This grade will be counted as zero.");
            grade2 = 0;
            divider-=1;
        }
        System.out.print("Please Enter Turkish Grade: ");
        grade3 = input.nextFloat();
        if(grade3<=0 || grade3>100){
            System.out.println("This grade will be counted as zero.");
            grade3 = 0;
            divider-=1;
        }
        System.out.print("Please Enter History Grade: ");
        grade4 = input.nextFloat();
        if(grade4<=0 || grade4>100){
            System.out.println("This grade will be counted as zero.");
            grade4 = 0;
            divider-=1;
        }
        System.out.print("Please Enter Music Grade: ");
        grade5 = input.nextFloat();
        if(grade5<=0 || grade5>100){
            System.out.println("This grade will be counted as zero.");
            grade5 = 0;
            divider-=1;
        }

        // Calculating the average grade
        if(divider<=0) {
            averageGrade = (grade1 + grade2 + grade3 + grade4 + grade5);
        }else{
            averageGrade = (grade1 + grade2 + grade3 + grade4 + grade5) / divider;
        }

        // Giving outputs
        if(averageGrade >= 55){
            System.out.println("You have passed the class.");
            System.out.println("Your average is: "+ averageGrade);
        }else{
            System.out.println("You failed!. Your average grade is lower than 55");
            System.out.println("Your average is "+ averageGrade);
        }
    }
}