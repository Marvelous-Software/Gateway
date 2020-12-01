
/*
	John Maher
	Gateway - Java
	Dr Carrie Horvath
	Exercise 5-10
	11/30/2020
*/

import java.util.*;


public class TwelveDays {

    //Scanner input = new Scanner(System.in);

    public static void main (String args[]) {
        
        int day;
        String song = "";
        String suffix = "";
        Scanner input = new Scanner(System.in); //moved

        //day = this.getChoice();
        System.out.print("Day to start -> ");
        day = input.nextInt();


        switch (day)
        {
            case 12 : 
            {
                suffix = "th";
                song += "Twelve drummers drumming\n";
            }
            case 11 : 
            {
                suffix = "th";
                song += "Eleven pipers piping\n";
            }
            case 10 : 
            {
                suffix = "th";
                song += "Ten lords a-leaping\n";
            }
            case 9 : 
            {
                suffix = "th";
                song += "Nine ladies dancing\n";
            }
            case 8 : 
            {
                suffix = "th";
                song += "Eight maids a-milking\n";
            }
            case 7 : 
            {
                suffix = "th";
                song += "Seven swans a-swimming\n";
            }
            case 6 : 
            {
                suffix = "th";
                song += "Six geese a-laying\n";
            }
            case 5 : 
            {
                suffix = "th";
                song += "Five golden rings\n";
            }
            case 4 : 
            {
                suffix = "th";
                song += "Four calling birds\n";
            }
            case 3 : 
            {
                if (suffix == "") {
                    suffix = "rd";
                }
                song += "Three French hens\n";
            }
            case 2 : 
            {
                if (suffix == "") {
                    suffix = "nd";
                }
                song += "Two turtle doves and\n";
            }
            case 1 : 
            {
                if (suffix == "") {
                    suffix = "st";
                }
                song += "A partridge in a pear tree\n";
            }
        }

        System.out.print("On the " + day + suffix + " day of Christmas");        
        System.out.print("My true love gave to me");        
        System.out.print(song);        

    }

/*    public static int getChoice() {
                
        System.out.print("Day to start -> ");
        return input.nextInt();

    }*/
}


