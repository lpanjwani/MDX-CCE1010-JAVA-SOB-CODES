/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sob_21;

import java.util.Scanner;

/**
 *
 * @author M00692913
 */
public class SOB_21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] array1 = new int[10];
        double[] array2 = new double[10];

        for (int i = 0; i < array1.length; i++) {
            System.out.printf("Enter %d st/nd Integer Variable: ", (i + 1));
            array1[i] = input.nextInt();
        }
        int response_1 = sum(array1);

        for (int j = 0; j < array2.length; j++) {
            System.out.printf("Enter %d st/nd Double Variable: ", (j + 1));
            array2[j] = input.nextDouble();
        }

        double response_2 = sum(array2);

        System.out.printf("\n Sum of Array 1 is %d & Array 2 is %f \n", response_1, response_2);

    }

    public static int sum(int[] array) {

        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }

        return sum;
    }

    public static double sum(double[] array) {

        double sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        return sum;

    }
}
