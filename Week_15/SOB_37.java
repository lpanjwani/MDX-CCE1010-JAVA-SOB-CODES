package sob_37;

import java.util.*;
import java.lang.*;

/**
 *
 * @author M00692913
 */
public class SOB_37 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] response = null;
        int flag = 0;

        do {
            try {
                response = RequestInput();
                flag = 1;
            } catch (InputMismatchException ex) {
                System.out.println("Please Enter Integers only!");
                response = RequestInput();
                flag = 1;
            }
        } while (flag == 0);

        Product(response);
    }

    /**
     *
     * @throws InputMismatchException
     */
    public static int[] RequestInput() throws InputMismatchException {

        Scanner input = new Scanner(System.in);

        int[] Values = new int[2];

        System.out.println("Enter First Value: ");
        Values[0] = input.nextInt();

        System.out.println("Enter Second Value: ");
        Values[1] = input.nextInt();

        return Values;
    }

    public static void Product(int[] response) {
        System.out.println("Answer is " + (response[0] + response[1]));
    }

}
