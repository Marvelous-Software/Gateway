
/*
	John Maher
	Gateway - Java
	Dr Carrie Horvath
	Exercise 6-2
	11/30/2020
*/

import java.util.*;

public class EvenEntryLoop {
    public static void main (String args[]) {
        
        final int sentinel = 999;
        int number = -1;
        Scanner input = new Scanner(System.in);

        while (number != sentinel) {

            //day = this.getChoice();
            System.out.print("Type in an even number -> ");
            number = input.nextInt();

            if (number != sentinel) {
                if (number % 2 == 0) {
                    System.out.print("Good job!\n");
                } else {
                    System.out.print(number + " is not an even number\n");
                }
            }
        }

    }
}
