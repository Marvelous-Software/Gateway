/*
----------------------------------------------------
    John Maher
    Gateway
    Structured Programming
    Mohammed Hanif
    2/7/2021
    Chapter 5
    p91 # 22

    Converts meters to miles
---------------------------------------------------- 
*/

#include <iostream>

using namespace std;

//const double Meters_in_Mile = 1609.3440;
const double Miles_in_Meter = .00062137119;


int main()
{
    double Meters;
    double Miles;


    cout<<"This program converts meters to miles.\n";
    cout<<"Please enter the amount in meters -> ";
    cin>>Meters;

    //Miles = Meters / Meters_in_Mile;
    Miles = Meters * Miles_in_Meter;

    cout<<Meters<<" meters = "<<Miles<<" miles\n";

}