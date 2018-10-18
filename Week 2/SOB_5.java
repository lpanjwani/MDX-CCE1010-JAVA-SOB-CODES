/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sob5;

import java.util.Scanner;

/**
 *
 * @author M00692913
 */
public class SOB5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        char name[]=new char[5];

        for(int i = 0;i<5;i++){
        int value = i + 1;
        System.out.print("Enter " + value + "st Letter: ");
        Scanner input = new Scanner(System.in);
        name[i] = input.next().charAt(0);
        }
        System.out.print("Word is ");
        for(int j = 0;j<5;j++){
        System.out.print(name[j]);
        }
        System.out.println();
    }

}
