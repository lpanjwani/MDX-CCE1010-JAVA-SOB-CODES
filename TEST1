/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication8;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class JavaApplication8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int flag = 0;
        while(flag == 0){
            System.out.println("Enter number for variable x");
        int x = sc.nextInt();
        System.out.println("Enter number for variable y");
        int y = sc.nextInt();
        System.out.println("Enter number for variable z");
        int z = sc.nextInt();
            System.out.println("Choose the operator that is required: +, -, *, / ");
            char operator = sc.next().charAt(0);
            switch (operator){
                case '+': 
                    add(x,y,z);
                    break;
                case '-':
                    subtract(x,y,z);
                    break;
                case '*':
                    product(x,y,z);
                    break;
                case '/':
                    divide(x,y,z);
                    break;
                default:
                    System.out.println("Please pick the right fucking operator, stop being a retard smfh");
            }
            System.out.println("Would you like to continue? 1/0");
            int choice = sc.nextInt();
             switch(choice){
                 case 1:
                     flag = 0;
                     break;
                 case 2:
                     flag = 1;
                     break;
                   
             }
             
        }
    }
    public static void add(int x, int y, int z){
        int solution = x + y + z;
        System.out.println("This is your sum" + solution);
    }
    public static void subtract(int x, int y, int z){
        int solution = x - y - z;
        System.out.println("This is your solution for subtraction"+ solution);
    } 
    public static void product(int x, int y, int z){
        int solution = x * y *z;
        System.out.println("THis is your product"+ solution);
    }
    public static void divide(int x, int y, int z){
        int solution = x/y/z;
        System.out.println("This is your quotient"+solution);
    }
}   



// TODO code application logic here
