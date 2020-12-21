//John Maher
//Gateway - C++
//Carrie Horvath
//Chapter 5 - Assignment 3
//12/03/19


#include <iostream>

using namespace std;

int main()
{
    int r;
    string space;
    
    for (r = 1; r < 26; r++)
    {
        if (r < 13)
        {
            if (r != 1)
            {
                cout<<string((13 - r), ' ')<<'/'<<string((r * 2 - 3), ' ')<<'\\'<<endl;
            }
            else
            {
                cout<<string(12, ' ')<<'^'<<endl;
            }
        }
        else if (r > 13)
        {
            if (r != 25)
            {
                cout<<string((r - 13), ' ')<<'\\'<<string(((23 - r) * 2 + 3), ' ')<<'/'<<endl;
            }
            else
            {
                cout<<string(12, ' ')<<'V'<<endl;
            }
        }
        else
        {
            cout<<'|'<<string(23, ' ')<<'|'<<endl;
        }
    }

    return 0;
}
