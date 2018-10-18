/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sob6;

import java.util.Scanner;

/**
 *
 * @author M00692913
 */
public class SOB6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        String Text[]=new String[5];

        for(int i=0;i<3;i++){
            int value = i + 1;
            System.out.print("Enter " + value + "st Text: ");
            Scanner input = new Scanner(System.in);
            Text[i]= input.next();
        }
        System.out.print("String is ");
        for(int j=0;j<3;j++){
         System.out.print(Text[j] + " ");
        }
        System.out.println();
    }
}
