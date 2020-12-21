//John Maher
//Gateway - C++
//Carrie Horvath
//Chapter 3 - Assignment 4

#include <iostream>

using namespace std;

int main()
{
    float weight, weightNew, price, bonus, bonusPrice;
    
    cout<<"Bonus calculator.  Calculates the percent bonus when a larger quantity sells for the same price.\n\n";
    cout<<"Enter the original weight in ounces - ";
    cin>>weight;
    cout<<"How much does "<<weight<<" ounces cost? ";
    cin>>price;
    cout<<"How much is the new weight in ounces - ";
    cin>>weightNew;

    bonus = 100 / (weightNew / (weightNew - weight));
    bonusPrice = price / (weightNew - weight);
    cout<<"You will get "<<bonus<<"% free saving $"<<bonusPrice<<".";
    return 0;
}