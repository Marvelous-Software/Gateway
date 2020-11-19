/*
	John Maher
	Gateway - Java
	Dr Carrie Horvath
	Exercise 5-1
	11/3/2020
*/

import java.util.Scanner;

class EvenOdd {
    
    public static void main(String[] args) {

        int number;
        Scanner input = new Scanner(System.in);


        System.out.print("Enter an integer - ");
        number = input.nextInt();
        if (isEven(number)) {
            System.out.print(number + " is even.");
        } else {
            System.out.print(number + " is odd.");
        }

    }

    public static boolean isEven(int number) {

        return number % 2 == 0;
    }
}
