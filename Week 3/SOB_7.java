/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sob7;

import java.util.Scanner;

/**
 *
 * @author M00692913
 */
public class SOB7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter Value in Miles: ");
        double miles = input.nextDouble();
        
        double km = miles*1.6;
        
        System.out.println("Miles to KM: " + km);
        
    }
    
}
