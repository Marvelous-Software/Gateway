/*
	John Maher
	Gateway - Java
	Dr Carrie Horvath
	Exercise 5-5A
	11/3/2020
*/

import java.util.*;
import java.time.*;

public class PastPresentFuture {
    public static void main (String args[]) {
    
        int month;
        int day;
        int year;
        int thisMonth;
        Calendar calendar = new GregorianCalendar();
        Scanner input = new Scanner(System.in);


        System.out.print("Enter the month - ");
        month = input.nextInt();
        System.out.print("Enter the day - ");
        day = input.nextInt();
        System.out.print("Enter the year - ");
        year = input.nextInt();

        thisMonth = calendar.get(Calendar.MONTH) + 1;

        if (year != calendar.get(Calendar.YEAR)) {
            System.out.print(year + " is not this year\n");
        } else {
            if (month < thisMonth) {
                System.out.print(month + " was a month earlier this year\n");
            }
            if (month > thisMonth) {
                System.out.print(month + " was a month later this year\n");
            }
            System.out.print(thisMonth + " is this month\n");
        }

    }
}


