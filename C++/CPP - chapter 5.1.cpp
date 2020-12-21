//John Maher
//Gateway - C++
//Carrie Horvath
//Chapter 5 - Assignment 1
//10/29/19


#include <iostream>

using namespace std;

int main()
{
    int count, r;
    string space, text;
    
    
    cout<<"What shall I print? ";
    cin>>text;
    
    for (count=1; count<5; count++)
    {
        for (r=1; r<10; r++)
        {
            cout<<string(r, ' ')<<text<<"\n"; 
        }
        for (r=9; r>1; r--)
        {
            cout<<string(r, ' ')<<text<<"\n"; 
        }
    }
    
    return 0;
}
