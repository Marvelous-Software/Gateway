
/*
	John Maher
	Gateway - Java
	Dr Carrie Horvath
	Exercise 6-3
	11/30/2020
*/


public class Factorials
{
   public static void main (String args[])
   {
       int factorial;
       int r, n;


        for (r = 1; r <= 10; r++) {

            factorial = r;

            for (n = r - 1; n > 0; n--) {
                factorial *= n;
            }

            System.out.print("The factorial of " + r + " is " + factorial + "\n");
        }
   }
}
