/*
----------------------------------------------------
    John Maher
    Gateway
    Structured Programming
    Mohammed Hanif
    2/24/2021

    Converts Celcius to Fahrenheit
---------------------------------------------------- 
*/

#include <iostream>

using namespace std;

const double FREEZING_in_FAHRENHEIT = 32;

int main()
{
    double Celcius;
    double Fahrenheit;


    cout<<"This program converts degrees Celcius to Fahrenheit.\n";
    cout<<"Please enter the temperature in Celcius -> ";
    cin>>Celcius;

    Fahrenheit = Celcius * 9/5 + FREEZING_in_FAHRENHEIT;

    cout<<Celcius<<" degrees Celcius = "<<Fahrenheit<<" degrees Fahrenheit\n";

}