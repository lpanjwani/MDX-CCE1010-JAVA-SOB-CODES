/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test1;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Test1 {

 /**
  * @param args the command line arguments
  */
 public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  int flag = 0;
  while (flag == 0) {
   System.out.println("Enter number for variable x");
   int x = sc.nextInt();
   System.out.println("Enter number for variable y");
   int y = sc.nextInt();
   System.out.println("Enter number for variable z");
   int z = sc.nextInt();
   System.out.println("Choose the operator that is required: +, -, *, / ");
   char operator = sc.next().charAt(0);
   switch (operator) {
    case '+':
     add(x, y, z);
     break;
    case '-':
     subtract(x, y, z);
     break;
    case '*':
     product(x, y, z);
     break;
    case '/':
     verification(x, y, z);
     break;
    default:
     System.out.println("Please Pick The Right Operator!");
   }
   System.out.println("Would you like to continue? Y/N");
   int choice = sc.nextInt();
   switch (choice) {
    case 'Y':
     flag = 0;
     break;
    case 'N':
     flag = 1;
     break;
    default:
     flag = 0;
     System.out.println("Please Pick The Right Option!");
   }

  }
 }
 public static void add(int x, int y, int z) {
  int solution = x + y + z;
  System.out.println("This is your sum" + solution);
 }
 public static void subtract(int x, int y, int z) {
  int solution = x - y - z;
  System.out.println("This is your solution for subtraction" + solution);
 }
 public static void product(int x, int y, int z) {
  int solution = x * y * z;
  System.out.println("THis is your product" + solution);
 }
 public static void verification(int x, int y, int z) {
  while (y == 0) {
   System.out.println("Please Enter a valid Value for Second Number! (Zero is not Valid)");
   y = input.nextInt();
  }
  while (z == 0) {
   System.out.println("Please Enter a valid Value for Third Number! (Zero is not Valid)");
   z = input.nextInt();
  }
  divide(x, y, z);
 }
 public static void divide(int x, int y, int z) {
  int solution = x / y / z;
  System.out.println("This is your quotient" + solution);
 }
}
