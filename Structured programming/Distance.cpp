/*
----------------------------------------------------
    John Maher
    Gateway
    Structured Programming
    Mohammed Hanif
    2/8/2021
    Program chapter1_1 

    This program computes the
    distance between two points.
---------------------------------------------------- 
*/

#include <iostream>
#include <cmath>    //Required for sqrt()

using namespace std;

int main()
{
    // Declare and initialize objects.
    //double x1=1, y1=5, x2=4, y2=7, side1, side2, distance;
    double x1(1), y1(5), x2(4), y2(7), side1, side2, distance;

    // Compute sides of a right triangle.
    side1 = x2 - x1;
    side2 = y2 - y1;
    distance = sqrt(side1 * side1 + side2 * side2);
    // Print distance.
    cout << "The distance between the two points is " << distance << endl;

    cin >> side1;
    
    return 0;

}