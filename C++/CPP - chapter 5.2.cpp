//John Maher
//Gateway - C++
//Carrie Horvath
//Chapter 5 - Assignment 2
//10/29/19


#include <iostream>
#include <fstream>

using namespace std;

int main () 
{
  string condition;
  bool conditionfound;
  int conditionlength;
  int conditionstart;
  string conditiontoprint;
  string data;
  string message = "";
  string mint;
  bool mintfound;
  string mintin;
  string minttocheck;
  ifstream myfile;
  string value;
  string year;
  bool yearfound;
  string yearin;

  cout<<"This program will determine the value of your Peace silver dollar.\n";
  cout<<"You will need to enter the year, mint and condition.\n";

  cout<<"\nEnter the year (1921-1935 or 'A' to see all) >";
  cin>>year;
  cout<<"\nEnter the mint (P, D or S) >";
  cin>>mint;
  cout<<"\nEnter the condition; (G)ood, (F)ine, (E)xtremely fine or (U)ncirculated >";
  cin>>condition;

  minttocheck = mint;
  if (mint == "P" || mint == "p")
  {
    minttocheck = "\t";
  }
  if (mint == "d")
  {
    minttocheck = "D";
  }
  if (mint == "s")
  {
    minttocheck = "S";
  }

  //G - 8:6; F - 16:6; EF - 24:6; Unc - 32:7
  if (condition == "G" || condition == "g")
  {
    condition = "G";
    conditiontoprint = "Good-4";
    conditionstart = 8;
    conditionlength = 6;
    conditionfound = true;
  }
  else if (condition == "F" || condition == "f")
  {
    condition = "F";
    conditiontoprint = "Fine-12";
    conditionstart = 16;
    conditionlength = 6;
    conditionfound = true;
  }
  else if (condition == "E" || condition == "e")
  {
    condition = "E";
    conditiontoprint = "Extremely Fine-40";
    conditionstart = 24;
    conditionlength = 6;
    conditionfound = true;
  }
  else if (condition == "U" || condition == "u")
  {
    condition = "U";
    conditiontoprint = "Mint State-60";
    conditionstart = 32;
    conditionlength = 7;
    conditionfound = true;
  }
  else
  {
    message = "\nInvalid condition.";
  }


  myfile.open ("Peace Dollars.txt", ios_base::app);
  while(getline(myfile, data))
  {
    if (year == "A" || year == "a")
    {
      cout << data << "\n";
    }
    else
    {
      yearin = data.substr(0, 4);
      mintin = data.substr(5, 1);
      
      if (yearin == year)
      {        
        yearfound = true;
        if (mintin == minttocheck)
        {
          mintfound = true;
          value = data.substr(conditionstart, conditionlength);
        }
      }
    }
  }
  myfile.close();
  if (!yearfound)
  {
    message += "\nYear not found.";
  }
  if (!mintfound)
  {
    if (yearfound)
    {
      message += "\nMint not found.";
    }
    else
    {
      message += "\nMint requires valid year.";
    }
  }
  if (conditionfound && yearfound && mintfound)
  {
    message = "\nYour " + year + " " + mint + " in " + conditiontoprint + " is worth $" + value + ".";
  }

  cout<<message;

  return 0;
}