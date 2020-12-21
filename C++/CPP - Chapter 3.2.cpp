//John Maher
//Gateway - C++
//Carrie Horvath
//Chapter 3 - Assignment 2

#include <iostream>

using namespace std;

int main()
{
    string which;
    float weight, weightConverted;
    
    cout<<"Killogram - Pounds converter\n\n";
    cout<<"Enter your weight - ";
    cin>>weight;
    cout<<"Enter 'K' for killogram to pounds and 'P' for pounds to killogram\n";
    cin>>which;
    
    if (which == "k" || which == "K") {
        weightConverted = weight * 2.2;
        cout<<weight<<" kgs equals "<<weightConverted<<" lbs.";
    }
    else if (which == "p" || which == "P") {
        weightConverted = weight / 2.2;
        cout<<weight<<" lbs equals "<<weightConverted<<" kgs.";
    }
    else {
        cout<<"Bye!";
    }
    
    return 0;
}
