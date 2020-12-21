//John Maher
//Gateway - C++
//Carrie Horvath
//Chapter 3 - Assignment 3

#include <iostream>

using namespace std;

int main()
{
    string person1;
    string noun1, noun2, noun3;
    string verb1, verb2, verb3;
    string adjective1;
    
    cout<<"Enter a person - ";
    cin>>person1;
    cout<<"Enter a noun - ";
    cin>>noun1;
    cout<<"Enter another noun - ";
    cin>>noun2;
    cout<<"Enter one more noun - ";
    cin>>noun3;
    cout<<"Enter a verb - ";
    cin>>verb1;
    cout<<"Enter another verb - ";
    cin>>verb2;
    cout<<"Enter one more verb - ";
    cin>>verb3;
    cout<<"Enter a adjective - ";
    cin>>adjective1;
    
    cout<<"\n\nI like to play video games.\n";
    cout<<"My favorite is "<<verb2<<" the "<<noun3<<".\n";
    cout<<"The only problem is it bothers "<<person1<<".\n";
    cout<<"If I play too long it can make my "<<noun2<<" "<<adjective1<<".\n";
    cout<<"Sometimes I play "<<verb3<<" the "<<noun1<<".\n";
    cout<<"But that can make people "<<verb1<<" all over the place!";
    return 0;
}
