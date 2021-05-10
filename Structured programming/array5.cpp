/*----------------------------------------------------*/
/* Program chapter8_2 */
/* */
/* This program computes power averages */
/* over a 10-week period. */
#include <iostream> //Required for cin, cout, cerr
#include <fstream>  //Required for ifstream
#include <string>   //Required for string
using namespace std;
int main()
{
    // Declare objects.
    const int NROWS = 6;
    const int NCOLS = 7;
    double power[NROWS][NCOLS], col_sum;
    string filename;
    ifstream data1;
    // Open file and read data into array.
    cout << "Enter name of input file.\n";
    cin >> filename;
    data1.open(filename.c_str());
    if (data1.fail())
    {
        cerr << "Error opening data file\n";
        exit(1);
    }
    // Set format flags.
    cout.setf(ios::fixed);
    cout.setf(ios::showpoint);
    cout.precision(1);
    for (int i = 0; i < NROWS; ++i)
    {
        for (int j = 0; j < NCOLS; ++j)
        {
            data1 >> power[i][j];
        }
    }
    // Compute and print daily averages.
        for (int j = 0; j < NCOLS; ++j)
    {
        col_sum = 0;
    for (int i = 0; i < NROWS; ++i)
        {
            col_sum += power[i][j];
        }
        cout << "Day" << j + 1 << ": Average = " << col_sum / NROWS << endl;
    }
    // Compute and print weekly averages.
    for (int i = 0; i < NROWS; ++i)
    {
        col_sum = 0;
        for (int j = 0; j < NCOLS; ++j)
        {
            col_sum += power[i][j];
        }
        cout << "Week" << i + 1 << ": Average = " << col_sum / NCOLS << endl;
    }
    // Close file and exit program.
    data1.close();
    return 0;
}
/*----------------------------------------------------------------*/