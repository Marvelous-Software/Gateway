/*
	John Maher
	Gateway - Java
	Dr Carrie Horvath
	Exercise 2-14
	9/16/2020
*/


import java.util.Scanner;


class Dollars {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        System.out.print("Enter total");
        int currency = input.nextInt();
        int twenties = (int)currency / 20;
        int leftover = (currency % twenties);
        int tens = leftover / 10;
        leftover = leftover % 10;
        int fives = leftover / 5; 
        int ones = leftover % 5;

        System.out.println("$" + currency + " converted is " + twenties + " $20s, " + tens + " $10s, " + fives + " $5s, and " + ones + " $1s"); 
        input.close();
    
        }
}
