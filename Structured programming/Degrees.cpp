/*
----------------------------------------------------
    John Maher
    Gateway
    Structured Programming
    Mohammed Hanif
    3/1/2021

    Converts Fahrenheit to Celcius and Celcius to Fahrenheit
---------------------------------------------------- 
*/

#include <iostream>
#include <math.h>

using namespace std;

const double CELCIUS_KELVIN_OFFSET = 273.15;
const double FAHRENHEIT_RANKIN_OFFSET = 459.67;
const double FREEZING_in_FAHRENHEIT = 32;

const char CELCIUS = 'C';
const char FARENHEIT = 'F';
const char KELVIN = 'K';
const char RANKINE = 'R';


int main()
{
    char choice;
    double input;
    double Celcius, Fahrenheit, Kelvin, Rankine;
    string source;


    cout<<"This program converts degrees from either Fahrenheit or Celcius.\n";
    cout<<"    C) Enter degrees Celcius\n";
    cout<<"    F) Enter degrees Fahrenheit\n";
    //cout<<"    K) Enter degrees Kelvin\n";
    //cout<<"    R) Enter degrees Rankine\n";
    cout<<"Please choose your input:";
    cin>>choice;
    choice=toupper(choice);

    // Get appropriate text for query 
    switch (choice) {
        case CELCIUS:
            source = "Celius";
            break;
        case FARENHEIT:
            source = "Fahrenheit";
            break;
        case KELVIN:
            source = "Kelvin";
            break;
        case RANKINE:
            source = "Rankine";
            break;
        default:
            source = "";
            break;
    }


    cout<<"\nPlease enter the temperature in degrees "<<source<<" -> ";
    cin>>input;

    // Perform appropriate calculation 
    /*

    */
    switch (choice) {
        case CELCIUS:
            Celcius = input;
            Fahrenheit = input * 9/5 + FREEZING_in_FAHRENHEIT;
            Kelvin = Celcius + CELCIUS_KELVIN_OFFSET;
            Rankine = Fahrenheit + FAHRENHEIT_RANKIN_OFFSET;
            break;
        case FARENHEIT:
            Celcius = (input - FREEZING_in_FAHRENHEIT) * 5/9;
            Fahrenheit = input;
            Kelvin = Celcius + CELCIUS_KELVIN_OFFSET;
            Rankine = Fahrenheit + FAHRENHEIT_RANKIN_OFFSET;
            break;
        case KELVIN:
            Celcius = input - CELCIUS_KELVIN_OFFSET;
            Fahrenheit = Celcius * 9/5 + FREEZING_in_FAHRENHEIT;
            Kelvin = input;
            Rankine = Fahrenheit + FAHRENHEIT_RANKIN_OFFSET;
            break;
        case RANKINE:
            Celcius =  (input - FAHRENHEIT_RANKIN_OFFSET - FREEZING_in_FAHRENHEIT) * 5/9;
            Fahrenheit = input - FAHRENHEIT_RANKIN_OFFSET;
            Kelvin = Celcius + CELCIUS_KELVIN_OFFSET;
            Rankine = input;
            break;
        default:
            source = "";
            break;
    }

    if (source != "") {

        cout<<Celcius<<" degrees Celcius\n";
        cout<<Fahrenheit<<" degrees Fahrenheit\n";
        cout<<floor(100*Kelvin)/100<<" degrees Kelvin\n";
        cout<<floor(100*Rankine)/100<<" degrees Rankine\n";

    }

}