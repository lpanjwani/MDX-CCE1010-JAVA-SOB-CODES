/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package re.test;

import java.util.Scanner;

/**
 *
 * @author The
 */
public class RETEST {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number to start the calculator");
        int a = input.nextInt();
        System.out.println("Enter 2nd number ");
        int b = input.nextInt();

        System.out.println("Okay ma nigga what do you want?");
        System.out.println("1.Addition  (+)");
        System.out.println("2.Subtract (-)");
        System.out.println("3.Multiply  (*)");
        System.out.println("4.Divide    (/)");

        char menu = input.next().charAt(0);
        switch (menu) {
            case '+':
                Add(a, b);
                break;
            case '-':
                Sub(a, b);
                break;
            case '*':
                Mult(a, b);
                break;
            case '/':
                Div(a, b);
                break;
            default:
                System.out.println("Please enter the correct operator");

        }
    }

    public static void Add(int a, int b) {
        int c = a + b;
        System.out.println("Your answer is " + c);
       }

       public static void Sub(int a, int b) {
        int c = a - b;

        System.out.println("Your answer is " + c);



       }
       public static void Mult(int a, int b) {
        int c = a * b;

        System.out.println(
        "Your answer is " + c);

       }
       public static void Div(int a, int b) {
        int c = a / b;

        System.out.println( "Your answer is " + c);
       }
       }
