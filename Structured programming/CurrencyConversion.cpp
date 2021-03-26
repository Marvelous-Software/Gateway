/*
----------------------------------------------------
    John Maher
    Gateway
    Structured Programming
    Mohammed Hanif
    2/24/2021

    Currency Converter
        E => euros
        P => pesos
        S => pounds sterling
        T => taka

---------------------------------------------------- 
*/

#include <stdlib.h>
#include <iostream>

using namespace std;

const int NO_CONVERSION = -1;

const double EUROS_in_DOLLAR = .82;
const double PESOS_in_DOLLAR = 20.38;
const double POUNDSSTERLING_in_DOLLAR = .71;
const double TAKA_in_DOLLAR = 84.62;


int main()
{
    double dollars, currency;
    char currencyCode;
    string suffix;


    cout<<"This program converts some currencies to dollars.\n";
    cout<<"Please enter the currency amount -> ";
    cin>>currency;

    cout<<"\nAllowable currency codes:\n";
    cout<<"    E for euros\n";
    cout<<"    P for pesos\n";
    cout<<"    S for pounds sterling\n";
    cout<<"    T for taka\n";
    cout<<"Please enter the currency code -> ";
    cin>>currencyCode;


    switch(toupper(currencyCode))
    {
        case 'E':
            suffix = "euros";
            dollars = currency * EUROS_in_DOLLAR;
            break;
        case 'P':
            suffix = "pesos";
            dollars = currency * PESOS_in_DOLLAR;
            break;
        case 'S':
            suffix = "pounds sterling";
            dollars = currency * EUROS_in_DOLLAR;
            break;
        case 'T':
            suffix = "takas";
            dollars = currency * TAKA_in_DOLLAR;
            break;
        default:
            cout<<currencyCode<<" not supported at this time\n" ;
            dollars = NO_CONVERSION;
    }

    if (dollars != NO_CONVERSION)
        cout<<currency<<" "<<suffix<<" is equal to $"<<dollars<<endl;
    else 
        cout<<"Unable to convert\n";

    return 0;
}