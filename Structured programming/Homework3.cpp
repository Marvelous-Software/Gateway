/*
----------------------------------------------------
    John Maher
    Gateway
    Structured Programming
    Mohammed Hanif
    3/3/2021

    Demonstrates conversions using if
---------------------------------------------------- 
*/

#include <iostream>
#include <math.h>

using namespace std;

const double FREEZING_in_FAHRENHEIT = 32;

const char CELCIUS = 'C';
const char FARENHEIT = 'F';



int main()
{
    char choice;
    double input;
    double Celcius, Fahrenheit;
    string source = "";


    cout<<"This program converts degrees from either Fahrenheit or Celcius.\n";
    cout<<"    C) Enter degrees Celcius to convert to Fahrenheit\n";
    cout<<"    F) Enter degrees Fahrenheit to convert to Celcius\n";
    cout<<"Please choose your input:";
    cin>>choice;
    choice=toupper(choice);

    // Get appropriate text for query 
    if (choice == CELCIUS) {
        source = "Celius";
    } else if (choice == FARENHEIT) {
        source = "Fahrenheit";
    }

    cout<<"\nPlease enter the temperature in degrees "<<source<<" -> ";
    cin>>input;

    // Perform appropriate calculation 
    if (choice == CELCIUS) {
        Fahrenheit = input * 9/5 + FREEZING_in_FAHRENHEIT;
        cout<<floor(100*Celcius)/100<<" degrees Celcius is equal to "<<floor(100*Fahrenheit)/100<<" degrees Fahrenheit.\n";
    } else if (choice == FARENHEIT) {
        Celcius = (input - FREEZING_in_FAHRENHEIT) * 5/9;
        cout<<floor(100*Fahrenheit)/100<<" degrees Fahrenheit is equal to "<<floor(100*Celcius)/100<<" degrees Celcius.\n";
    } else {
        cout<<source<<" NOT SUPPORTED\n";
    }

}