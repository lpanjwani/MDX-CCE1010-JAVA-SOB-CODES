/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sob_11;
import java.util.Scanner;

/**
 *
 * @author M00692913
 */
public class SOB_11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Input User Choice
        System.out.print("Input Integer for Multiplication: ");
        int number = input.nextInt();

        // Normal Method
        System.out.println("Normal Method");
        System.out.println(number + " x " + "1"+ " = " + (number*1));
        System.out.println(number + " x " + "2" + " = " + (number*2));
        System.out.println(number + " x " + "3" + " = " + (number*3));
        System.out.println(number + " x " + "4" + " = " + (number*4));
        System.out.println(number + " x " + "5" + " = " + (number*5));
        
        // FOR Loop Method
        System.out.println("FOR Loop Method");
        for(int i = 0; i<6;i++){
            int answer = number*i; 
            System.out.println( number + " x " + i + " = " + answer);
        }
        
    }
    
}
