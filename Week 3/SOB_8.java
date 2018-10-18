/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sob8;

import java.util.Scanner;

/**
 *
 * @author M00692913
 */
public class SOB8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double PI = 3.14159;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter Radius: ");
        double R = input.nextDouble();
       
        double A = PI * (R*R);
      
        System.out.println("Area is: " + A);
    }
    
}
