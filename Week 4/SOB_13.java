/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sob_13;

/**
 *
 * @author M00692913
 */
public class SOB_13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
         // Math Random Library
        int MonthNumber = (int)(1+Math.random()*12);
        
        switch(MonthNumber){
            case 1: 
                System.out.println("Month is January");
                break;
            case 2: 
                System.out.println("Month is Febuary");
                break;
            case 3: 
                System.out.println("Month is March");
                break;
            case 4: 
                System.out.println("Month is April");
                break;
            case 5: 
                System.out.println("Month is May");
                break;
            case 6: 
                System.out.println("Month is June");
                break;
            case 7: 
                System.out.println("Month is July");
                break;
            case 8: 
                System.out.println("Month is August");
                break;
            case 9: 
                System.out.println("Month is September");
                break;
            case 10: 
                System.out.println("Month is October");
                break;  
            case 11: 
                System.out.println("Month is November");
                break;
            case 12: 
                System.out.println("Month is December");
                break; 
            default:
                System.out.println("Error");
                break; 
        }
        
    }
    
}
