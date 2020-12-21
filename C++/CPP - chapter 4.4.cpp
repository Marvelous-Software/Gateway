//John Maher
//Gateway - C++
//Carrie Horvath
//Chapter 4 - Assignment 4
//10/29/19


#include <iostream>

using namespace std;

int main()
{
    string ext, meaning;
    
    
    cout<<"Enter a graphics file type extension > ";
    cin>>ext;
    
    if (ext == "jpeg")
    {
        meaning = "Joint Photographic Experts Group";
    }
    else if (ext == "tiff")
    {
        meaning = "Tagged Image File Format";
    }
    else if (ext == "gif")
    {
        meaning = "Graphics Interchange Format";
    }
    else if (ext == "bmp")
    {
        meaning = "bitmap";
    }
    else if (ext == "png")
    {
        meaning = "Portable Network Graphics";
    }
    else if (ext == "ico")
    {
        meaning = "icon";
    }
    else 
    {
        meaning = "unknown";
    }

    cout<<ext<<" means "<<meaning;
    
    return 0;
}
