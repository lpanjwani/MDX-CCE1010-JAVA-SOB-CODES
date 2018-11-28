/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sob_25;

import java.util.Scanner;

/**
 *
 * @author M00692913
 */
public class SOB_25 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.printf("Enter Number of Rows: \n ");
        int rows = input.nextInt();
        System.out.printf("Enter Number of Coloumns: \n ");
        int coloums = input.nextInt();

        double[][] a = new double[rows][coloums];
        int x = 0;

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.printf("\n Enter Value for Cell %dx%d:", (i + 1), (j + 1));
                a[i][j] = x;
                x++;
//                a[i][j] = input.nextDouble();
            }
        }

        int response[] = locateSmallest(a);
        
         for (int i = response[0]; i <= response[0]; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.printf("\n Value for Cell %dx%d: %f", (i + 1), (j + 1),a[i][j]);
//                a[i][j] = input.nextDouble();
            }
        }
        
        System.out.printf("\n Smallest Value is in Cell %dx%d \n ", (response[0] + 1), (response[1] + 1));
    }

    public static int[] locateSmallest(double[][] a) {
        double smallest_value = a[0][0];
        int[] smallest_location = new int[2];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (smallest_value > a[i][j]) {
                    smallest_value = a[i][j];
                    smallest_location[0] = i;
                    smallest_location[1] = j;
                }
            }
        }

        return smallest_location;
    }

}
