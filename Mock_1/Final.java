package test1mock;

import java.util.Scanner;

public class Test1Mock {

 public static void main(String[] args) {
   Scanner input = new Scanner(System.in);
   while (flag == 0)
   {
    System.out.println("Please enter the 1st word word: ");
    x = input.nextLine();
    System.out.println("Please enter the 2nd word word: ");
    y = input.nextLine();
    System.out.println("Please enter the 3rd word word: ");
    z = input.nextLine();
    boolean same = CheckForSameWords(x, y, z);

    if (same == true) {
     System.out.printf("You have entered same word twice \n");
     System.exit(0);
    }

    System.out.println("Please enter the letter to be replaced: ");
    char replace_temp = input.next().charAt(0);
    String replace = String.valueOf(replace_temp);
    System.out.printf(" Select from the following options (Select Option Number) \n  1. Concatenate Words \n  2. Count the number of letters in words \n" +
     "   3. Remove a letter from words \n 4. Find if the word contains a selected letter.");
    int option = input.nextInt();
    switch (option) {
     case 1:
      concatenate(x, y, z);
      break;
     case 2:
      countWordsLenght(x, y, z);
      break;
     case 3:
      findIfStringContainsLetter(x, y, z, replace);
      break;
     case 4:
      removeLetter(x, y, z, replace);
      break;
     default:
      System.out.println("Please Enter a Valid Option");
    }
    System.out.printf("\n Do you want to re-run program? Press Y to Continue or N to Exit.");         
    char choice = input.next().charAt(0);
     switch (choice) {
      case 'Y':
       flag = 0;
       break;
      case 'N':
       flag = 1;
       break;
      default:
       System.out.println("Please Enter a Valid Option");
     }

    }
    }

    public static void concatenate(String x, String y, String z) {
     String a = x.concat(y);
     String b = a.concat(z);
     System.out.printf("Result of concatination of %s and %s and %s is %s \n", x, y, z, a);
    }

    public static void countWordsLenght(String x, String y, String z) {
     int XLength = x.length();
     int YLength = y.length();
     int ZLength = z.length();
     System.out.printf("Lenth of Word %s is %d and %s is %d and %s is %s \n", x, XLength, y, YLength, z, ZLength);
    }

    public static void removeLetter(String x, String y, String z, String replace) {

     String NewX = x.replace(replace, "");
     String NewY = y.replace(replace, "");
     String NewZ = z.replace(replace, "");
     System.out.printf("New Word are %s & %s & %s \n", NewX, NewY, NewZ);
    }

    public static void findIfStringContainsLetter(String x, String y, String z, String replace) {
     boolean XContains = x.contains(replace);
     boolean yContains = y.contains(replace);
     boolean ZContains = z.contains(replace);
     System.out.printf("First Word - %b & Second Word - %b & Second Word - %b \n", XContains, yContains, ZContains);
    }
    public static boolean CheckForSameWords(String x, String y, String z) {
     if (x.equals(y) || y.equals(z) || x.equals(z)) {
      return true;
     } else {
      return false;
     }
    }
   }
