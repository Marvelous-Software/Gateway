
/*
	John Maher
	Gateway - Java
	Dr Carrie Horvath
	Exercise 6-6
	11/30/2020
*/

public class DiagonalOs {
    public static void main(String[] args) {

       int r, c;


        for (r = 1; r <= 10; r++) {

            for (c = 1; c < r; c++) {
                System.out.print(" ");
            }
            System.out.print("O\n");
            
        }
    }
}
