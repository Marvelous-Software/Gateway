//John Maher
//Gateway - C++
//Carrie Horvath
//Chapter 4 - Assignment 2

#include <iostream>

using namespace std;

int main()
{
    string feeling, response;
    
    cout << "Hello, I am a computerized psychiatrist.\n\n";
    cout << "Please enter how you feel > ";

    cin >> feeling;
    
    if (feeling == "happy" || feeling == "glad")
    {
        response = "Good for you, that will be $50 please.";
    }
    else if (feeling == "sad" || feeling == "miserable")
    {
        response = "Sorry to hear that, we will need to schedule more sessions.";
    }
    else if (feeling == "mad" || feeling == "angry")
    {
        response = "Please take a deep breath and count to 10.";
    }
    else
    {
        response = "That is interesting, please elaborate.";
    }

    cout << response;
    
    return 0;
}
