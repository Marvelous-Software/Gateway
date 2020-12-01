
/*
	John Maher
	Gateway - Java
	Dr Carrie Horvath
	Exercise 5-5B
	11/30/2020
*/

import java.util.*;
import java.time.*;
public class PastPresentFuture2
{
  public static void main (String args[]) 
  {
    LocalDate today = LocalDate.now();
    LocalDate enteredDate;
    int mo, da, yr;
    int todayMo, todayDa, todayYr;
    Scanner input = new Scanner(System.in);


    System.out.print("Enter a month >> ");
    mo = input.nextInt();
    System.out.print("Enter a day >> ");
    da = input.nextInt();
    System.out.print("Enter a year (four digits) >> ");
    yr = input.nextInt();

    LocalDate entered = LocalDate.of(yr, mo, da);

    if (entered.isBefore(today)) {
        System.out.print("is in the past\n");
    } else if (entered.isAfter(today)) {
        System.out.print("is in the future\n");
    } else if (entered.equals(today)) {
        System.out.print("is today\n");
    }
  }
}

