/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sob_22;

import java.util.Scanner;

/**
 *
 * @author M00692913
 */
public class SOB_22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[] array = new double[10];

        for (int i = 0; i < array.length; i++) {
            System.out.printf("Enter %d st/nd Integer Variable: ", (i + 1));
            array[i] = input.nextDouble();
        }

        int response = indexOfLargestElement(array);

        System.out.printf("\n Largest Number's Index is %d \n", response);

    }

    public static int indexOfLargestElement(double[] array) {

        int j = 1;
        double largest = 1.0;

        for (int i = 0; i < array.length; i++) {
            if (largest < array[i]) {
                largest = array[i];
                j = i;
            }
        }

        return j;
    }

}
