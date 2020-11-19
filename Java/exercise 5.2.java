/*
	John Maher
	Gateway - Java
	Dr Carrie Horvath
	Exercise 5-2
	11/3/2020
*/

import java.util.Scanner;

public class AscendingAndDescending {

    public static void main(String[] args) {
    
        int highest;
        int lowest = 0;
        int middle = 0;
        int number1;
        int number2;
        int number3;
        Scanner input = new Scanner(System.in);


        System.out.print("Enter the first number - ");
        number1 = input.nextInt();
        System.out.print("Enter the first number - ");
        number2 = input.nextInt();
        System.out.print("Enter the first number - ");
        number3 = input.nextInt();

        if (number1 > number2 && number1 > number3) {
            highest = number1;
            if (number2 > number3) {
                middle = number2;
                lowest = number3;
            } else {
                middle = number3;
                lowest = number2;
            }
        } else if (number2 > number3) {
            highest = number2;
            if (number1 > number3) {
                middle = number1;
                lowest = number3;
            } else {
                middle = number3;
                lowest = number1;
            }
        } else {
            highest = number3;
            if (number2 > number1) {
                middle = number2;
                lowest = number1;
            } else {
                middle = number1;
                lowest = number2;
            }
        }

        System.out.println("Hi to lo : " + highest + ", " + middle + ", " + lowest);
        System.out.println(highest);
        System.out.println(middle);
        System.out.println(lowest);
        System.out.println("Lo to hi : " + lowest + ", " + middle + ", " + highest);
        System.out.println(lowest);
        System.out.println(middle);
        System.out.println(highest);        

    }

}
