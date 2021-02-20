/*
----------------------------------------------------
    John Maher
    Gateway
    Structured Programming
    Mohammed Hanif
    2/17/2021
    Chapter 5
    p91 # 23

    Converts pounds to kilograms
---------------------------------------------------- 
*/

#include <iostream>

using namespace std;

const double LB_in_KG = 2.205;


int main()
{
    double Kilograms;
    double Pounds;


    cout<<"This program converts pounds to kilograms.\n";
    cout<<"Please enter the amount of pounds -> ";
    cin>>Pounds;

    Kilograms = Pounds / LB_in_KG;

    cout<<Pounds<<"pounds = "<<Kilograms<<" kilograms\n";

}