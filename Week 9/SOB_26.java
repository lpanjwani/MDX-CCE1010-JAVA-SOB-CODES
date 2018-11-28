/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sob_26;

/**
 *
 * @author M00692913
 */
public class SOB_26 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][] matrix = new int[5][5];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int) (Math.random() * 2);
                System.out.print(matrix[i][j]);
                if(j == matrix[i].length-1){
                    System.out.println();
                }
            }
        }

        int location[] = locateMost(matrix);
        
        System.out.printf("\n Most Value is in Row %d & Coloumn %d \n ", (location[0] + 1), (location[1] + 1));
    }

    public static int[] locateMost(int[][] matrix) {
        int[] location = new int[2];

        int row_most = 0;
        int coloumn_most = 0;

        for (int i = 0; i < matrix.length; i++) {
            int row_temp = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 1) {
                    ++row_temp;
                }
            }
            if (row_temp > row_most) {
                row_most = row_temp;
                location[0] = i;
            }
        }

        for (int j = 0; j <  matrix[0].length; j++) {
            int coloumn_temp = 0;
            for (int i = 0; i < matrix.length; i++) {
                if (matrix[i][j] == 1) {
                    ++coloumn_temp;
                }
            }
             if (coloumn_temp > coloumn_most) {
                coloumn_most = coloumn_temp;
                location[1] = j;
            }
        }

        return location;
    }
}
