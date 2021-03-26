/*
----------------------------------------------------
    John Maher
    Gateway
    Structured Programming
    Mohammed Hanif
    3/3/2021

    Demonstrates conversions using switch
---------------------------------------------------- 
*/

#include <iostream>
#include <math.h>

using namespace std;

const double FREEZING_in_FAHRENHEIT = 32;
const double KG_in_LB = .453515;
const double KM_in_Mile = 1.6093440;

const char FAHRENHEIT = 'F';
const char MILES = 'M';
const char POUNDS = 'L';


int main()
{
    char choice;
    double input;
    double Celsius, Kilograms, Kilometers;
    string source;


    cout<<"This program performs different conversions.\n";
    cout<<"    L) Enter pounds and display kilograms\n";
    cout<<"    M) Enter miles and display kilograms\n";
    cout<<"    F) Enter fahrenheit and display celsius\n";
    cout<<"Please choose your input:";
    cin>>choice;
    choice=toupper(choice);

    // Get appropriate text for query 
    switch (choice) {
        case FAHRENHEIT:
            source = "degrees fahrenheit";
            break;
        case MILES:
            source = "miles";
            break;
        case POUNDS:
            source = "pounds";
            break;
        default:
            source = "";
            break;
    }

    if (source != "") {
        cout<<"\nPlease enter the "<<source<<" -> ";
        cin>>input;
    }

    // Perform appropriate calculation 
    switch (choice) {
        case FAHRENHEIT:
            Celsius = (input - FREEZING_in_FAHRENHEIT) * 5/9;
            cout<<input<<" degrees fahrenheit = "<<Celsius<<" celsius.\n";
            break;
        case MILES:
            Kilometers = input * KM_in_Mile;
            cout<<input<<" miles = "<<Kilometers<<" kilometers.\n";
            break;
        case POUNDS:
            Kilograms = input * KG_in_LB;
            cout<<input<<" lbs. = "<<Kilograms<<" kilograms.\n";
            break;
        default:
            cout<<source<<" NOT SUPPORTED\n";
            break;
    }

}