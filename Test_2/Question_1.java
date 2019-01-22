package practice;

import java.util.Scanner;

/**
 *
 * @author The
 */
public class Practice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Scanner Declearation
        Scanner in = new Scanner(System.in);

        // Get Number of Entries from User
        System.out.println("Enter Number of Entries");
        int n = in.nextInt();

        // Decleare Array
        double[] height = new double[n];
        double[] length = new double[n];

        // Get Inputs from User
        for(int i=0;i<n;i++){
          System.out.println("Enter " + (i+1) + " Height: ");
          height[i] =  in.nextDouble();
          System.out.println("Enter " + (i+1) + " Length: ");
          length[i] =  in.nextDouble();
          System.out.println("Area is " + rectarea(length[i],height[i]));
          System.out.println("Perimeter is " +rectpermeter(length[i],height[i]));
          System.out.println("Diagonal is " + rectdiagnol(length[i],height[i]));
        }

    }

    public static double rectarea(double l,double b) {
        return l*b;
    }

    public static double rectpermeter(double l, double b) {
      double value = (2*l)+(2*b);
        return value;

    }

    public static double rectdiagnol(double length, double width) {
        double value = Math.sqrt((Math.pow(length,2)+ Math.pow(width, 2)));
        return value;
    }
}
