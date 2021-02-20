//John Maher
//Gateway - C++
//Carrie Horvath
//Chapter 6 - Assignment 2
//12/5/19

#include <time.h>
#include <string>
#include <iostream>
#include <fstream>
//#include <cstdlib>

using namespace std;

void draw(int);

int main () 
{
  int r, asc;
  int guess = 0;
  bool guesses[26] = {0};
  bool found;
  string word, playerword, letter;
  ifstream words;

  cout<<"Welcome to Hangman\n";
  cout<<"Try to guess the word before the man gets hung.\n";

  srand((unsigned) time(0));
  words.open ("Words.txt", ios_base::app);
  
  for (r=1; r<=(rand() % 5) + 1; r++)
  {
    getline(words, word);   
  }

  playerword = string(word.length(), '_');

  //cout<< "G:" << guess <<endl;
  //cout<< "word:" << word << endl;
  //cout<< "player:" << playerword << endl;
  //cout<< "------" << endl;


  while (guess < 6 && word != playerword)
  {
    draw(guess);

    cout<<endl;
    for (r=0; r<playerword.length(); r++)
      cout<<playerword[r]<<" ";

    cout<<endl;

    for (r=65; r<91; r++)
      if (!guesses[r-64])
        cout<<(char)r<<" ";
      else
        cout<<"- ";
    do
    {
      cout<<"\nChoose a letter - ";
      cin>>letter;
      asc = (int)letter[0];
      if (asc > 96 && asc < 123)
        asc = asc - 31;
    } while (guesses[((int)letter[0])-64]);

    guesses[((int)letter[0])-64] = true;
    
    found = false;
    for (r=0; r<word.length(); r++)
      if ((int)word[r] == asc)
      {
        found = true;
        playerword[r] = word[r];
      }
        
    if (found)
      cout<<"Good guess!\n";
    else
    {
      cout<<"Oh dear!\n";
      guess += 1;
    }
    
    if (word == playerword)
    {
        cout<<"You win!!!!!";
    }
    else
    {
        cout<<"You died!  The word was "<<word;
    }
  }
}

void draw(int guess)
{
  cout<<"   __________\n";
  cout<<"   |        |\n";
  cout<<"   |        -\n";
  cout<<"   |        ";
  if (guess > 0)
    cout<<"O";
  cout<<"\n   |      ";
  if (guess > 2)
    cout<<"/";
  else
    cout<<" ";
  if (guess > 1)
    cout<<"|";
  else
    cout<<" ";
  if (guess > 3)
    cout<<"\\";
  cout<<"\n   |       ";
  cout<<"\n   |       ";
  if (guess > 4)
    cout<<"/";
  if (guess > 5)
    cout<<"\\";
  cout<<"\n   |";
  cout<<"\n  _|_";
  cout<<"\n _|  |_";
  cout<<"\n_|     |_";

  return;
}


