#include <iostream>

using namespace std;


int main()
{

    int k = 0;
    int s[] = {3, 8, 15, 21, 30, 41};

    for (k = 0; k <= 5; k += 2)
    {
        cout << s[k] << ' ' << s[k + 1] << endl;
    }

    return 0;
}
