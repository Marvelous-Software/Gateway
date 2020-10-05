/*
	John Maher
	Gateway - Java
	Dr Carrie Horvath
	Exercise 3-7
	9/23/2020
*/


import java.util.Scanner;
public class InchConversion {
    public static void main (String args[]) {

        float inches;
        Scanner input = new Scanner(System.in);

        System.out.print("How many inches - ");
        inches = input.nextFloat();
        convertToFeet(inches);
        convertToYards(inches);

    }

    public static void convertToFeet(float inches) {
        System.out.print("That is " + String.valueOf(inches / 12) + " feet.");
    }
    public static void convertToYards(float inches) {
        System.out.print("That is " + String.valueOf(inches / 36) + " yards.");
    }
}
