
/*****************************************************/ 
/* Program chapter4_1 */ 
/* This program computes ands prints a velocity */ 
/* for time values in the range of: 0 <= time <= 10 */ 

#include<iostream> 
//required for cout 
using namespace std; 

int main() { 
    // Declare and initialize objects 
    const double V0(0.0);
    //initial velocity m/s 
    const double A(2.537); 
    //constant acceleration m/s*s 
    double time, velocity;

    //print heading 
    cout << " Time, s\t\tVelocity, m/s\n"; 
    time = 0; 
    while(time <= 100.0) { 
        velocity = A*time + V0; 
        cout << time << "\t\t" << velocity << endl; 
        ++time; 
    } 
    return 0;
}