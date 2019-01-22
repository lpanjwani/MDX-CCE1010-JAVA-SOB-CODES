package practice;

import java.util.Scanner;

public class Practice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Scanner Declearation
        Scanner in = new Scanner(System.in);

        // Get Number of Entries from User
        System.out.println("Enter Number of Entries: ");
        int n = in.nextInt();

        // Decleare Array
        double[] height = new double[n];
        double[] length = new double[n];
        
        // Decleare 2D Array
        double[][] response= new double[n][3];

        // Get Inputs from User
        for(int i=0;i<n;i++){
            // Ask User for Height
          System.out.println("Enter " + (i+1) + " Height: ");
          height[i] =  in.nextDouble();
            // Ask User for Length
          System.out.println("Enter " + (i+1) + " Length: ");
          length[i] =  in.nextDouble();
            // Call Methods for Calculation
          response[i][0] = rectarea(length[i],height[i]);
          response[i][1] = rectpermeter(length[i],height[i]);
          response[i][2] = rectdiagnol(length[i],height[i]);
            // Diplay Results to User
          System.out.printf("Area \t \t %f \n", response[i][0]);
          System.out.printf("Perimeter \t %f \n", response[i][1]);
          System.out.printf("Diagonal \t %f \n", response[i][2]);
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
