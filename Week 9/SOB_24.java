/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sob_24;

import java.util.Scanner;

/**
 *
 * @author M00692913
 */
public class SOB_24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[][] m = new double[3][4];
        int rowIndex = -1;
        int x = 0;

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.printf("\n Enter Value for Cell %dx%d:", (i + 1), (j + 1));
//                m[i][j] = input.nextDouble();
                m[i][j] = x;
                x++;
            }
        }
        while (rowIndex > m.length || rowIndex < 0) {
            System.out.println("\n Enter Row Index: ");
            rowIndex = input.nextInt() - 1;
        }

        double sum[] = sumRow(m, rowIndex);

//        for (int i = 0; i < m.length; i++) {
//            for (int j = 0; j < m[i].length; j++) {
//                System.out.print(m[i][j]);
//                if (j == m[i].length - 1) {
//                    System.out.println(sum[i]);
//                }
//            }
//        }
        
        double sum_most = 0;
        for (int i = 0; i < sum.length; i++) {
            if (sum[i] > sum_most) {
                sum_most = sum[i];
            }
        }
        System.out.printf("\n Sum of Row %d: %f \n", (rowIndex + 1), sum_most);
    }

    public static double[] sumRow(double[][] m, int rowIndex) {
        double[] sum = new double[m.length];
        for (int i = rowIndex; i <= rowIndex; i++) {
            double sum_temp = 0;
            for (int j = 0; j < m[i].length; j++) {
                sum_temp = sum_temp + m[i][j];
                if (j == m[i].length - 1) {
                    sum[i] = sum_temp;
                }
            }
        }

        return sum;
    }
}
