/*
----------------------------------------------------
    John Maher
    Gateway
    Structured Programming
    Mohammed Hanif
    4/4/2021

    Demonstrates reading data using a sentinel
---------------------------------------------------- 
*/
#include <iostream> //Required for cin, cout, cerr
#include <fstream>  //Required for ifstream, ofstream
#include <string>   //Required for string.
using namespace std;
int main()
{
    // Declare and initialize objects.
    int num_grades(0), k;
    double grade, sum(0), max(-1), min(101);
    string filename;
    ifstream grades;
    ofstream report;
    // Prompt user for name of input file.
    cout << "Enter the name of the input file: ";
    cin >> filename;
    // Open file.
    grades.open(filename.c_str());
    if (grades.fail())
    {
        cerr << "Error opening input file\n";
        exit(1);
    }
    // Open report file.
    report.open("CatReport.dat");
    // Update summary data until trailer record read.
    do
    {
        grades >> grade;
        if (grade > 0)
        {
            sum += grade;
            if (grade > max)
            {
                max = grade;
            }
            if (grade < min)
            {
                min = grade;
            }
            num_grades++;
        }
    } while (grade >= 0);
    // Set format flags.
    report.setf(ios::fixed);
    report.setf(ios::showpoint);
    report.precision(2);
    // Print summary information.
    report << "Number of grades: "
           << num_grades << endl
           << "Average grade: "
           << sum / num_grades << endl
           << "Maximum grade: "
           << max << endl
           << "Minimum grade: "
           << min << endl;
    // Close files and exit program.
    grades.close();
    report.close();
    return 0;
}