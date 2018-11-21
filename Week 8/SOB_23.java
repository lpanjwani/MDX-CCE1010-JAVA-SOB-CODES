/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sob_23;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author M00692913
 */
public class SOB_23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] list = new int[10];

        for (int i = 0; i < list.length; i++) {
            System.out.printf("Enter %d st/nd Integer Variable: ", (i + 1));
            list[i] = input.nextInt();
        }
        Arrays.sort(list);
        int[] new_list = eliminateDuplicates(list);
        
        for (int j = 0; j < list.length; j++) {
        System.out.printf("Result for %d Integer Variable: %d \n", (j + 1),j);
        }
    }

    public static int[] eliminateDuplicates(int[] list) {

        int length = list.length;
        int new_length = list.length;

        for (int i = 1; i < length; i++) {
            if (list[i] == list[i - 1]) {
                new_length = new_length - 1;
                list[i] = 0;
            }
        }
        int[] temp = new int[list.length];

        for (int j = 1; j < length; j++) {
            if (list[j] == 0) {
                temp[j - 1] = list[j];
            }
        }
        int[] new_list = new int[new_length];
        for (int z = 0; z < new_length; z++) {
            new_list[z] = temp[z];
        }
        
        return new_list;
    }

}
