/*
	John Maher
	Gateway - Java
	Dr Carrie Horvath
	Practice 1
	9/3/2020
*/


class DataDemo
{
	public static void main(String[] args) {
		
		int STATES_IN_US = 50;
		
		int anInt = 12;
		byte aByte = 12;
		short aShort = 12;
		long aLong = 12;
		int aWholeNumber = 315;
		int anotherInt = 10000000;
		float aFloat = anotherInt * aWholeNumber;
		double aDouble = anotherInt * aWholeNumber;
		
        System.out.println("There are " + STATES_IN_US + " states.");
        System.out.println("The int is " + anInt);
		System.out.println("The byte is " + aByte);
		System.out.println("The short is " + aShort);
		System.out.println("The long is " + aLong);
		System.out.print("The number is ");
		System.out.println(aWholeNumber);
		System.out.println("The number of states is " + aWholeNumber);
		System.out.println(anotherInt + " x " + aWholeNumber + " = " + anotherInt * aWholeNumber + " ?");
		System.out.println("10000000 x 315 = " + aFloat + " ?");
		System.out.println("10000000 x 315 = " + aDouble + " ?");
		aFloat = 10000000L * 315L;
		aDouble = 10000000L * 315L;
		System.out.println("10000000 x 315 = " + aFloat);
		System.out.println("10000000 x 315 = " + aDouble);
		
	}
}
