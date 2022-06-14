import java.util.Scanner;
import java.text.DecimalFormat;


/***************************************************************
 Filename: Tax3
 Created by: melat semereab
 Created on: 10/4/2021
 Comment: a program to prompt and read a user’s gross pay, and calculate their tax,
 and then print out their gross pay, tax and net pay.
 the formula for our calculation is :
 Up to £10,000 – NO TAX
 20% tax on all earnings greater than £10,000, up to and including £40,000
 40% tax on all earnings greater than £40,000
 ***************************************************************/
 public class Main
{
   public static void main(String[] args)
   {
      //our constants
      final double TAX1 = 0.2, TAX2 = 0.4;
      final int MINSALARY = 10000, MAXSALARY = 40000;

      //import statement needed and declare all variables
      Scanner keyboard = new Scanner(System.in);
      DecimalFormat df = new DecimalFormat("00.00");

      double grossPay, netPay, tax=0, tax1, tax2;
      

      //Prompt and read in grossPay
      System.out.println("Please enter your Gross Pay: £");
      grossPay = keyboard.nextDouble();
      netPay = grossPay; // we have to initiate our netPay to avoid error


        //using if-else loop to calculate the tax and net payment of the user.
        if (grossPay > MINSALARY && grossPay <= MAXSALARY)
        {
          //if user gross salary is between 10000 and 40000
          tax = (grossPay - MINSALARY) * TAX1;
          netPay = grossPay - tax;

        }
        else if (grossPay < MINSALARY)
        {
          // if user has a gross salary of less than 10000
          
          tax = 0;
          netPay = grossPay;
        }
        else if (grossPay > MAXSALARY)
        {
          //if user has gross salary more than 40000
          //tax1 is for a tax between 10000 and 40000
          tax1 = (MAXSALARY -MINSALARY) * TAX1;

          //tax2 is for a tax more than 40000
          tax2 = (grossPay - MAXSALARY ) * TAX2;
          tax = tax1 + tax2;
          netPay = grossPay - (tax);
        }

        //out print statements
          System.out.println("Gross Pay:\t\t£" + df.format(grossPay));
          System.out.println("Tax:\t\t\t£" + df.format(tax));
          System.out.println("Net Pay:\t\t£" + df.format(netPay));
   }//main
}//class