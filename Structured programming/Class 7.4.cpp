/*-----------------------------------------------------*/
/* Program chapter7_4 */
/* */
/* This program reads values from a data file and */
/* calls a function to determine the maximum value, */
/* the minimum value and the average with functions. */
#include <iostream> //Required for cin, cerr.
#include <fstream>  //Required for ifstream.
#include <string>   //Required for string.
using namespace std;
// Define function prototypes.
double average(const double x[], int n);
double maxval(const double x[], int n);
double median(const double x[], int n);
double minval(const double x[], int n);
double *selectionsort(const double x[], int n);
int main()
{
    // Declare objects.
    const int N = 11;
    int npts = 0, i;
    double y[N], sorted[N];
    double lowest, temp;
    string filename;
    ifstream lab;
    // Prompt user for file name and open data file.
    cout << "Enter the name of the data file:";
    cin >> filename;
    if (filename == "x")
    {
        filename = "scores2.dat";
    }
    lab.open(filename.c_str());
    if (lab.fail())
    {
        cerr << "Error opening input file\n";
        exit(1);
    }
    // Read a data value from the file.
    lab >> temp;
    // While there is room in the array and
    // and end of file was not encountered,
    // assign the value to the array and
    // input the next value.
    while (npts < N && !lab.eof())
    {
        y[npts] = temp; // Assign data value to array.
        ++npts;         // Increment npts.
        lab >> temp;    // Input next value
    }
    // Find and print the average.
    cout << "Average value: " << average(y, npts) << endl;
    // Find and print the maximum value.
    cout << "Maximum value: " << maxval(y, npts) << endl;
    // Find and print the minimum value.
    cout << "Minimum value: " << minval(y, npts) << endl;

    //sorted = selectionsort(y, npts);
    /*
    cout << "\n\nPre sort\n";
    for (int r = 0; r < npts; r++)
    {
        cout << r << ": " << y[r] << endl;
    }
    */
    //Sort
    for (int r = 0; r < npts - 1; r++) //Last one is automatically correct when all the other values have been set
    {
        lowest = y[r];
        i = r;
        for (int s = r + 1; s < npts; s++)
        {
            if (y[s] < lowest)
            {
                //cout << "Found - " << r << ":" << s << ", " << y[s] << "-" << lowest << endl;
                lowest = y[s];
                i = s;
            }
            //cout << r << ":" << s << endl;
        }
        y[i] = y[r];
        y[r] = lowest;
    }
    
    cout << "\n\nPost sort\n";
    for (int r = 0; r < npts; r++)
    {
        cout << r << ": " << y[r] << endl;
    }
    

    // Find and print the median.
    cout << "Median: " << median(y, npts) << endl;

    // Close file and exit program.
    lab.close();
    return 0;
}
/*-----------------------------------------------------*/
/* This function returns the average */
/* value in the array x with n elements. */
double average(const double x[], int n)
{
    // Declare local objects.
    double sum = 0;
    // Determine average of the array.
    for (int k = 0; k < n; ++k)
    {
        sum += x[k];
    }
    // Return average value. /
    return sum / n;
}
/*-----------------------------------------------------*/
/* This function returns the maximum */
/* value in the array x with n elements. */
double maxval(const double x[], int n)
{
    // Declare local objects.
    double maxVal;
    // Determine maximum value in the array.
    maxVal = x[0];
    for (int k = 1; k < n; ++k)
    {
        if (x[k] > maxVal)
            maxVal = x[k];
    }
    // Return maximum value. /
    return maxVal;
}
/*-----------------------------------------------------*/
/* This function returns the median */
/* value in the array x with n elements. */
double median(const double x[], int n)
{
    // Declare local objects.
    double median;
    // Determine median value in the array.
    if (n % 2 == 0)
    {
        median = (x[int(n / 2)] + x[int(n / 2 - 1)]) / 2;
    }
    else
    { //odd
        median = x[int(n / 2)];
    }
    // Return median. /
    return median;
}
/*-----------------------------------------------------*/
/* This function returns the minimum */
/* value in the array x with n elements. */
double minval(const double x[], int n)
{
    // Declare local objects.
    double minVal;
    // Determine minimum value in the array.
    minVal = x[0];
    for (int k = 1; k < n; ++k)
    {
        if (x[k] < minVal)
            minVal = x[k];
    }
    // Return minimum value. /
    return minVal;
}
/*-----------------------------------------------------*/
/* This function will sort an array */
double *selectionsort(const double x[], int n)
{
    // Declare local objects.
    double lowest;
    double *arr = new double[n];

    for (int r = 0; r < n - 1; r++) //Last one is automatically correct when all the other values have been set
    {
        lowest = x[r];
        for (int s = r + 1; s < n; s++)
        {
            if (x[s] < lowest)
            {
                lowest = x[s];
            }
        }
        *arr++ = lowest;
    }
    // Return minimum value. /
    return arr;
}
/*-----------------------------------------------------*/
