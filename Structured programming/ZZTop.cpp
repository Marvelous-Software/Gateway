/*
----------------------------------------------------
    John Maher
    Gateway
    Structured Programming
    Mohammed Hanif
    4/4/2021

    Demonstrates reading data using a counter
---------------------------------------------------- 
*/
#include <iostream> //Required for cerr, cin, cout.
#include <fstream>  //Required for ifstream, ofstream.
#include <string>   //Required for string.
using namespace std;
int main()
{
    // Declare and initialize objects.
    int num_grades, r;
    double grade, sum = 0, max(-1), min(101);
    string filename;
    ifstream grades;
    ofstream report;
    // Prompt user for name of input file.
    cout << "Enter the name of the input file: ";
    cin >> filename;
    // Open file and read the number of grades
    grades.open(filename.c_str());
    if (grades.fail())
    {
        cerr << "Error opening input file" << filename << endl;
        exit(1);
    }
    // Open report file.
    report.open("ZZTopReport.dat");
    grades >> num_grades;
    // Read data and compute summary information.
    for (r = 1; r <= num_grades; r++)
    {
        grades >> grade;
        sum += grade;
        if (grade > max)
        {
            max = grade;
        }
        if (grade < min)
        {
            min = grade;
        }
    }
    // Set format flags.
    report.setf(ios::fixed);
    report.setf(ios::showpoint);
    report.precision(2);
    // Print summary information.
    report << "Number of grades: "
           << num_grades << endl;
    report << "Average grade: "
           << sum / num_grades << endl;
    report << "Maximum grade: "
           << max << endl;
    report << "Minimum grade: "
           << min << endl;
    // Close files and exit programm.
    grades.close();
    report.close();
    return 0;
}