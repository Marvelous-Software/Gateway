/*
	John Maher
	Gateway - Java
	Dr Carrie Horvath
	Exercise 6-7
	11/30/2020
*/

class TriangleWithLoops {
    public static void main(String[] args) {

       int t, c;


        for (t = 7; t > 0; t--) {

            for (c = 1; c < t; c++) {
                System.out.print(" ");
            }

            for (c = 0; c < 15 - (t * 2); c++) {
                System.out.print("T");
            }
            System.out.print("\n");
            
        }
    }
}
