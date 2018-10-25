/*
   Write a program that prompts the user to enter the number of students and each student’s
   name and score, and finally displays the student with the lowest score and the student with the
   second-lowest score.
 */
package sob_15;

import java.util.Scanner;

/**
 *
 * @author M00692913
 */
public class SOB_15 {

/**
 * @param args the command line arguments
 */
public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Input Number of Students: ");
        int number_of_students = input.nextInt();

        int lowest_score=0,second_lowest_score=0;
        String lowest_name=null,second_lowest_name=null;


        for(int i=0; i<number_of_students; i++) {

                System.out.print("Enter Name of Student: ");
                String student_name = input.next();

                System.out.print("Enter Score of Student: ");
                int student_score = input.nextInt();

                if(i==0) {
                        lowest_name = student_name;
                        lowest_score = student_score;
                }

                if(lowest_score>student_score) {
                        // Assign Earlier Value to 2nd Lowest Value
                        second_lowest_name = lowest_name;
                        second_lowest_score = lowest_score;

                        // Assign New Value to Lowest Value
                        lowest_name = student_name;
                        lowest_score = student_score;
                }
        }

        System.out.println("Name of Lowest Students: " + lowest_name + " Grade: " + lowest_score);
        System.out.println("Name of 2nd Lowest Students: " + second_lowest_name + " Grade: " + second_lowest_score);

}
}
