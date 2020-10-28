/*
	John Maher
	Gateway - Java
	Dr Carrie Horvath
	Exercise 4-7
	10/14/2020
*/
import static java.lang.Math.*;

public class MathTest {
    public static void main(String[] args) {
        
        System.out.println("The square root of 37 is " + sqrt(37));
        System.out.println("The sine of 300 is " + sin(300));
        System.out.println("The cosine of 300 is " + cos(300));
        System.out.println("\n22.8 floored is " + floor(22.8));
        System.out.println("22.8 ceilinged is " + ceil(22.8));
        System.out.println("22.8 rounded is " + round(22.8));
        System.out.println("\nThe largest of 'D' and 71 is " + max('D', 71));
        System.out.println("The smallest of 'D' and 71 is " + min('D', 71));
        System.out.println("A random number between 0 and 20 is " + floor(random() * 21));

    }
}
