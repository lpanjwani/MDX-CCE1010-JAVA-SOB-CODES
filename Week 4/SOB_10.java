/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sob_10;
import java.util.Scanner;

/**
 *
 * @author M00692913
 */
public class SOB_10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Input User Choice
        System.out.println("Heads or Tails?: ");
        char Guess = input.next().charAt(0);
        
        // init Variable Choice
        int choice = 2;
        
        // Char to Int
        if(Guess=='H' || Guess=='h'){
            choice = 0;
        }
        else if(Guess=='T' || Guess=='t'){
            choice = 1;
        }
        else{
          System.out.println("Make Sure you enter Heads or Tails only");
        }

        // Math Random Library
        int flip = (int)(Math.random()*2);
        
        // Decision if User is Correct
        if(flip==choice){
            System.out.println("Your Choice was Correct.");
        }
        else{
            System.out.println("Your Choice was Wrong.");
        }
    }
}
