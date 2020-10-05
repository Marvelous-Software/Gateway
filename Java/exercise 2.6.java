/*
	John Maher
	Gateway - Java
	Dr Carrie Horvath
	Exercise 2-6
	9/9/2020
*/

class MileConversions {
    public static void main(String[] args) {

        final float INCHES_IN_MILE = 63360;
        final float FEET_IN_MILE = 5280;
        final float YARDS_IN_MILE = 1760;

        float miles = 4;

        System.out.print(String.valueOf(miles) + " miles is " + String.valueOf(INCHES_IN_MILE * miles) + " inches, or " + String.valueOf(FEET_IN_MILE * miles) + " feet, or " + String.valueOf(YARDS_IN_MILE * miles) + " yards");
    }
}
