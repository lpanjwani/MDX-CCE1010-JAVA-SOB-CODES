/*
   Suppose that the tuition for a university is $10,000 this year and increases 6% every year. After a year, the tuition will be $10,600.
   Write a program that computes the tuition in ten years and the total cost of four years’ worth of tuition after the tenth year.
 */
package sob_17;

import java.time.Year;

/**
 *
 * @author M00692913
 */
public class SOB_17 {

/**
 * @param args the command line arguments
 */
public static void main(String[] args) {

        int current_year = 2018;
        int current_tution = 10000;
        int ten_years_later = current_year + 10;

        float four_study_year_fee = 0;
        float ten_years_later_tution = current_tution;

        for(int j=0; j<10; j++) {
                ten_years_later_tution = (float) (ten_years_later_tution * 1.06);
        }
        System.out.println("Ten Year Tution is " + ten_years_later_tution);

        float temp = (float) (ten_years_later_tution);

        for(int i=0; i<4; i++) {
                temp = (float) (temp1 * 1.06);
                four_study_year_fee = four_study_year_fee + temp1;
        }
        System.out.println("Four Year Collective Tution is " + four_study_year_fee);

}
}
