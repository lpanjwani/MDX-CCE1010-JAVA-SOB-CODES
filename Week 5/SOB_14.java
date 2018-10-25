/*
Write a program that prompts a student to enter a Java score. If the score is greater or equal
to 60 then display “you pass the exam”, otherwise display “you don’t pass the exam”. You program
ends with input -1.
 */
package sob_14;

import java.util.Scanner;

/**
 *
 * @author M00692913
 */
public class SOB_14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        for(int flag=0;flag!=1;){
            System.out.print("Enter Score: ");
            int score = input.nextInt();
            if(score==-1){
                System.out.println("Application Termination Request");
                break;
            }
            else if(score>=60){
                System.out.println("You Passed the Exam");
            }
            else{
                System.out.println("You Failed the Exam");
            }    
        }
    }
}
