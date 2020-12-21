//John Maher
//Gateway - C++
//Carrie Horvath
//Chapter 4 - Assignment 3
//10/15/19

#include <iostream>


using namespace std;

int main()
{
    int dec;
    string bin;
    

    cout<<"Enter a number to convert to binary between 0 and 65535 -> ";
    cin>>dec;
    
    if (dec >= 0 && dec < 65536)
    {
        if (dec >= 32768)
        {
            bin += "1";
            dec -= 32768;
        }
        else
        {
            bin += "0";
        }
        if (dec >= 16384)
        {
            bin += "1";
            dec -= 16384;
        }
        else
        {
            bin += "0";
        }
        if (dec >= 8192)
        {
            bin += "1";
            dec -= 8192;
        }
        else
        {
            bin += "0";
        }
        if (dec >= 4096)
        {
            bin += "1";
            dec -= 4096;
        }
        else
        {
            bin += "0";
        }
        if (dec >= 2048)
        {
            bin += "1";
            dec -= 2048;
        }
        else
        {
            bin += "0";
        }
        if (dec >= 1024)
        {
            bin += "1";
            dec -= 1024;
        }
        else
        {
            bin += "0";
        }
        if (dec >= 512)
        {
            bin += "1";
            dec -= 512;
        }
        else
        {
            bin += "0";
        }
        if (dec >= 256)
        {
            bin += "1";
            dec -= 256;
        }
        else
        {
            bin += "0";
        }
        if (dec >= 128)
        {
            bin += "1";
            dec -= 128;
        }
        else
        {
            bin += "0";
        }
        if (dec >= 64)
        {
            bin += "1";
            dec -= 64;
        }
        else
        {
            bin += "0";
        }
        if (dec >= 32)
        {
            bin += "1";
            dec -= 32;
        }
        else
        {
            bin += "0";
        }
        if (dec >= 16)
        {
            bin += "1";
            dec -= 16;
        }
        else
        {
            bin += "0";
        }
        if (dec >= 8)
        {
            bin += "1";
            dec -= 8;
        }
        else
        {
            bin += "0";
        }
        if (dec >= 4)
        {
            bin += "1";
            dec -= 4;
        }
        else
        {
            bin += "0";
        }
        if (dec >= 2)
        {
            bin += "1";
            dec -= 2;
        }
        else
        {
            bin += "0";
        }
        if (dec >= 1)
        {
            bin += "1";
        }
        else
        {
            bin += "0";
        }
        
        cout<<"The binary conversaion is \""<<bin<<"\"";
    }
    else
    {
        cout<<"\n\nCan not convert " << dec << " it is out of range.";
    }
    
    return 0;
}
