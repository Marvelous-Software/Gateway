/*
----------------------------------------------------
    John Maher
    Gateway
    Structured Programming
    Mohammed Hanif
    2/17/2021
    Chapter 5
    p91 # 21

    Converts miles to kilometers
---------------------------------------------------- 
*/

#include <iostream>

using namespace std;

const double KM_in_Mile = 1.6093440;


int main()
{
    double Kilometers;
    double Miles;


    cout<<"This program converts miles to kilometers.\n";
    cout<<"Please enter the amount in miles -> ";
    cin>>Miles;

    Kilometers = Miles * KM_in_Mile;

    cout<<Miles<<" miles = "<<Kilometers<<" kilometers\n";

}