/*
	John Maher
	Gateway - Java
	Dr Carrie Horvath
	Exercise 3-11
	9/30/2020
*/


import java.util.Scanner;

public class Sandwich
 {

    private double price;
    private String mainIngredient;
    private String bread;


    public String getBread() {

        return bread;

    }

    public void setBread(String selectedBread) {

        bread = selectedBread;

    }

    public String getMainIngredient() {

        return mainIngredient;

    }

    public void setMainIngredient(String selectedMainIngredient) {

        mainIngredient = selectedMainIngredient;

    }

    public double getPrice() {

        return price;

    }

    public void setPrice(double selectedPrice) {

        price = selectedPrice;

    }

}
