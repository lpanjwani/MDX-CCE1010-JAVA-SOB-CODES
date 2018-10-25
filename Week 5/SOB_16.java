/*
    Write a program that displays the following table (note that Fahrenheit = Celsius * 9/5 + 3.2):
 */
package sob_16;

import java.util.Scanner;

/**
 *
 * @author M00692913
 */
public class SOB_16 {

/**
 * @param args the command line arguments
 */
public static void main(String[] args) {

        for(int Celsius=0; Celsius<101; Celsius++) {
                float temp = (float) (Celsius * 1.8);
                float Fahrenheit = (float) (temp + 3.2);

                System.out.println("Celsius " + Celsius + " Fahrenheit " + Fahrenheit);
        }
}

}
