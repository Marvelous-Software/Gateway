
#include <iostream> //Required for cin, cerr.
using namespace std;

int main()
{
    // Declare objects.
    const int r = 3;
    const int c = 4;

    //int a[r][c] = {{1}, {2}, {3}};
    //int a[r][c] = {1, 2, 3, 4, 5, 6};
    //int a[][c] =  {{1,2,3,4}, {0,3,0,6}, {8,3,-6,-1}};
    int a[][c] =  {1,2,3,0,3,0,6,3,-6,-1};

    for (int x = 0; x < r; x++)
    {
        cout << "|";
        for (int y = 0; y < c; y++)
        {
            cout << a[x][y] << "|";
        }
        cout << endl;
    }

    return 0;
}