//John Maher
//Gateway - C++
//Carrie Horvath
//Chapter 6 - Assignment 1
//12/3/19


#include <iostream>

using namespace std;

const int ROCK = 0;
const int PAPER = 1;
const int SCISSORS = 2;

const int TIE = 0;
const int COMPUTER = 1;
const int PLAYER = 2;


int
winner (int computer, int player)
{
  int win;

    switch (computer)
    {
        case ROCK:
            switch (player)
	        {
                case ROCK:
                    win = TIE;
                    break;
                case PAPER:
                    win = PLAYER;
                    break;
                case SCISSORS:
                    win = COMPUTER;
                    break;
	        }
	        break;
        case PAPER:
            switch (player)
	        {
                case ROCK:
                    win = COMPUTER;
                    break;
                case PAPER:
                    win = TIE;
                    break;
                case SCISSORS:
                    win = PLAYER;
                    break;
            }
	        break;
        case SCISSORS:
            switch (player)
	        {
                case ROCK:
                    win = PLAYER;
                    break;
                case PAPER:
                    win = COMPUTER;
                    break;
                case SCISSORS:
                    win = TIE;
                    break;
	    }
    }

  return win;
}

int
main ()
{
  int r;
  int choiceComputer, choicePlayer;
  int scoreComputer = 0, scorePlayer = 0;
  string choice;

  cout << "Rock, Paper, Scissors\n\n";
  cout << "Battle the computer\n";
  cout << "First one to win 3 is the winner!\n\n";

  srand (time (NULL));

  while (scoreComputer < 3 && scorePlayer < 3)
    {
        cout << "\nPlayer - " << scorePlayer << " and Computer - " << scoreComputer << endl;
        
        choiceComputer = rand () % 3;

        cout << "Choose (R)ock, (P)aper or (S)cissors - ";
        cin >> choice;
        cout << "\nThe computer chooses ";
        
        switch (choiceComputer)
        {
            case ROCK:
                cout << "Rock";
                break;
            case PAPER:
                cout << "Paper";
                break;
            case SCISSORS:
                cout << "Scissors";
                break;
        }
        
        if (choice != "r" && choice != "R" && choice != "p" && choice != "P" && choice != "s" && choice != "S")
        {
            cout << "\nPlease choose R for rock or P for paper or S for Scissors\n";
        }
        else
        {
            if (choice == "R" || choice == "r")
                choicePlayer = ROCK;
            if (choice == "P" || choice == "p")
                choicePlayer = PAPER;
            if (choice == "S" || choice == "s")
                choicePlayer = SCISSORS;
                
            switch (winner(choiceComputer, choicePlayer))
            {
                case PLAYER:
                    scorePlayer++;
                    cout << "\nPlayer scores!\n";
                    break;
                case COMPUTER:
                    scoreComputer++;
                    cout << "\nComputer scores!\n";
                    break;
            }
        }
    }
    
    if (scoreComputer > scorePlayer)
        cout << "Computer wins!";
    else
        cout << "Player wins!";

  return 0;
}