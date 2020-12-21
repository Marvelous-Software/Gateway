/*
	John Maher
	Gateway - Java
	Dr Carrie Horvath
	Exercise 7-4
	12/3/2020
*/

import java.util.*;

public class ValidatePassword {
    public static void main(String[] args) {
        
        final int requiredDigit = 1;
        final int requiredLower = 3;
        final int requiredUpper = 2;

        char chr;
        String error = "";
        int numDigits;
        int numLower;
        int numUpper;
        String password;
        int r;
        Scanner input = new Scanner(System.in);


        do 
        {
            if (error != "") {
                System.out.print("The password did not have enough of the following:\n" + error);
            }
            System.out.print("\nEnter a password ->");
            password = input.next();
            numDigits = 0;
            numLower = 0;
            numUpper = 0;
            for (r = 0; r < password.length(); r++) {
                chr = password.charAt(r);
                if (Character.isDigit(chr)) {
                    numDigits++;
                }
                if (Character.isLowerCase(chr)) {
                    numLower++;
                }
                if (Character.isUpperCase(chr)) {
                    numUpper++;
                }
            }
            error = "";
            if (numUpper < requiredUpper) {
                error += "uppercase letters\n";
            }
            if (numLower < requiredLower) {
                error += "lowercase letters\n";
            }
            if (numDigits < requiredDigit) {
                error += "digits\n";
            }

        } while(error != "");
        
        System.out.print("Valid password");
    }
}
