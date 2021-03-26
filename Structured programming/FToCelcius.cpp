/*
----------------------------------------------------
    John Maher
    Gateway
    Structured Programming
    Mohammed Hanif
    3/1/2021

    Converts Fahrenheit to Celcius
---------------------------------------------------- 
*/

#include <iostream>

using namespace std;

const double FREEZING_in_FAHRENHEIT = 32;

int main()
{
    double Celcius;
    double Fahrenheit;


    cout<<"This program converts degrees Fahrenheit to Celcius.\n";
    cout<<"Please enter the temperature in Fahrenheit -> ";
    cin>>Fahrenheit;

    Celcius = (Fahrenheit - FREEZING_in_FAHRENHEIT) * 5/9 ;

    cout<<Fahrenheit<<" degrees Fahrenheit = "<<Celcius<<" degrees Celcius\n";

}