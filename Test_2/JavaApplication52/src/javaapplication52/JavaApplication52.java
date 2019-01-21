/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication52;

import java.math;

/**
 *
 * @author The
 */
public class JavaApplication52 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here


    }


    public double rectarea(double l,double b) {
        return l*b;
    }

    public double rectpermeter(double l, double b) {
      double value = (2*l)+(2*b);
        return value;

    }

    public double rectdiagnol(double length, double width) {
        double value = Math.sqrt((length^2) + (width^2));
        return value;
    }
}
