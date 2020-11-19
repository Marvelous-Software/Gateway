/*
	John Maher
	Gateway - Java
	Dr Carrie Horvath
	Exercise 5-5A
	11/3/2020
*/

import java.time.*;

public class TenThousandDaysOld {
    public static void main(String[] args) {
       
    LocalDate dob = LocalDate.of(1969, 3, 5);
    System.out.println("I will be 10000 days old on " + dob.plusDays(10000));

    }
}
