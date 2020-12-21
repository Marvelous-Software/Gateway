//John Maher
//Gateway - C++
//Carrie Horvath
//Chapter 5 - Assignment 4
//12/03/19


#include <iostream>
#include <cstdlib>

using namespace std;

int main()
{
    int number, guess = 1, answer;
    string tryagain = "";
    
    cout<<"I will think of a number between 1 and 100"<<endl;
    cout<<"You willhave 7 guesses to guess it.\n\n"<<endl;

    srand(time(NULL));
    number = rand() % 100 + 1;
    
    while (guess <= 7 && answer != number)
    {
        cout<<tryagain<<endl;
        cout<<"What is your guess #"<<guess<<"? ";
        guess += 1;
        cin>>answer;
        
        if (answer > number)
        {
            cout<<"Too big";
        }
        else if (answer < number)
        {
            cout<<"Too small";
        }
        tryagain = ", try again.";
    }
    
    if (answer == number)
    {
        cout<<"You win!!!!!";
    }
    else
    {
        cout<<"The number was "<<number;
    }
    
    return 0;
}
