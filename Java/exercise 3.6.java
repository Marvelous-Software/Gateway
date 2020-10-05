/*
	John Maher
	Gateway - Java
	Dr Carrie Horvath
	Exercise 3-6
	9/23/2020
*/


import java.util.Scanner;


class BookstoreCredit {
    public static void main(String[] args) {

        String name;
        float gpa;
        float award;
        Scanner input = new Scanner(System.in);


        System.out.print("Enter your name - ");
        name = input.nextLine();
        System.out.print("Enter your GPA - ");
        gpa = input.nextFloat();
        award = gpa * 10;
        System.out.print("The award for " + name + " is $" + award);
        input.close();
    }
}
