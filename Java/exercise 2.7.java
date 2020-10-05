/*
	John Maher
	Gateway - Java
	Dr Carrie Horvath
	Exercise 2-7
	9/9/2020
*/

import java.util.Scanner; 


class MileConversionsInteractive
{
   public static void main(String[] args) {
      
      final double INCHES_IN_MILE = 63360;
      final double FEET_IN_MILE = 5280;
      final double YARDS_IN_MILE = 1760;

      double miles;
      double in, ft, yds;


      System.out.print("How many miles to convery - ");
      Scanner inMiles = new Scanner(System.in);
      miles = inMiles.nextDouble(); 

      in = miles * INCHES_IN_MILE;
      ft = miles * FEET_IN_MILE;
      yds = miles * YARDS_IN_MILE;

      System.out.println(miles + " miles is " + in + 
         " inches, or " + ft + " feet, or " + 
         yds + " yards");
   }
}
