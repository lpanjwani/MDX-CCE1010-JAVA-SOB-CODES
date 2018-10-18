/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sob_12;

import java.util.Scanner;

/**
 *
 * @author M00692913
 */
public class SOB_12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Input User Choice
        System.out.print("Weight of Shipment (in pounds): ");
        double weight = input.nextDouble();
        
        if(weight>0 && weight<2){
            System.out.println("Cost is 2.5 Dollars");   
        }
        else if(weight>=2 && weight<4){
            System.out.println("Cost is 4.5 Dollars");  
        }
        else if(weight>=4 && weight<10){
            System.out.println("Cost is 7.5 Dollars");  
        }
        else if(weight>=10 && weight<20){
            System.out.println("Cost is 10.5 Dollars");  
        }
        else{
            System.out.println("The package cannot be shipped.");  
        }
    }
}
