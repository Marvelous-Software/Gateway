//John Maher
//Gateway - C++
//Carrie Horvath
//Chapter 4 - Assignment 1

#include <iostream>

using namespace std;

int main()
{
    const int Max = 3999;
    
    int num, count;
    string roman;
    
    cout << "This will convert an arabic numeral to a roman numeral.\n";
    cout << "Please enter a number between 1 and 3999 > ";
    cin >> num;
    
    if (num > 0 && num < 4000)
    {
        if (num > 999)
        {
            count = num / 1000;
            roman = string(count, 'M');
            num -= count * 1000;
        }
        if (num > 899)
        {
            roman += "CM";
            num -= 900;
        }
        if (num > 499)
        {
            count = (num - 500) / 100;
            roman += "D" + string(count, 'C');
            num -= count * 100 + 500;
        }
        if (num > 399)
        {
            roman += "CD";
            num -= 400;
        }
        if (num > 99)
        {
            count = num / 100;
            roman += string(count, 'C');
            num -= count * 100;
        }
        if (num > 89)
        {
            roman += "XC";
            num -= 90;
        }
        if (num > 49)
        {
            count = (num - 50) / 10;
            roman += "L" + string(count, 'X');
            num -= count * 10 + 50;
        }
        if (num > 39)
        {
            roman += "XL";
            num -= 40;
        }
        if (num > 9)
        {
            count = num / 10;
            roman += string(count, 'X');
            num -= count * 10;
        }
        if (num > 8)
        {
            roman += "IX";
            num -= count * 10;
        }
        if (num > 4)
        {
            count = num - 5;
            roman += "V" + string(count, 'I');
            num -= count + 5;
        }
        if (num > 3)
        {
            roman += "IV";
            num -= 4;
        }
        if (num > 0)
        {
            roman += string(num, 'I');
        }
    cout << roman;
    }
    else
        cout << "Out of range.";

    return 0;
}
