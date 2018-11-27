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

        for (int j = 0; j < new_list.length; j++) {
            if (new_list[j] == 0) {
                break;
            }
            System.out.printf("Result for %d Integer Variable: %d \n", (j + 1), new_list[j]);
        }
    }

    public static int[] eliminateDuplicates(int[] list) {

        for (int i = 1; i < list.length; i++) {
            if (list[i] == list[i - 1]) {
                list[i] = 0;
                for (int j = i + 1; j < list.length; j++) {
                    list[j - 1] = list[j];
                    if (j == list.length - 1) {
                        list[j] = 0;
                    }
                }
            }
        }
        int new_list_length = 0;
        for (; new_list_length < list.length; new_list_length++) {
            if (list[new_list_length] == 0) {
                break;
            }
        }

        int[] new_list = new int[new_list_length];

        for (int z = 0; z < list.length; z++) {
            if (list[z] == 0) {
                break;
            } else {
                new_list[z] = list[z];
            }
        }

        return list;
    }

}
