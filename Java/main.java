/*
	John Maher
	Gateway - Java
	Dr Carrie Horvath
	final
	12/10/2020
	Due 12/15/2020
	
	BATTLESHIP
*/


import java.lang.Math;
import java.util.Scanner;
import java.util.stream.*;
import java.util.*;


class Ship {

  private String name;
  private int size;
  private int orientation;
  private int x;  //left
  private int y;  //top
  private boolean sunk;
  private String symbol;

  public Ship(String nameIn, int sizeIn, String symbolIn) {

    name = nameIn;
    size = sizeIn;
    symbol = symbolIn;
    
  }

  public String getName() {
        
    return name;
        
  }

  public boolean isSunk() {
        
    return sunk;
        
  }

  public String getSymbol() {
        
    return symbol;
        
  }

}

class Navy extends ArrayList<Ship> {
    
	// Required for base
	private static final long serialVersionUID = 0xC001D00D;   

  public boolean Sunk() {
  
    boolean sunk = true;

    for (Ship ship : this) {
      sunk = sunk && ship.isSunk();
    }
    return sunk;
    
}

}

class Player {

	final int Grid_open = 0;
	final int Grid_miss = 1;
	final int Grid_hit = 2;

  private String name;
  private int[][] myShips = new int[10][10];
  private int[][] myShots = new int[10][10];
  private Navy fleet;
  
  public Player(String nameIn) {

    name = nameIn;
    fleet = new Navy();
    InitialiazeBoard();
    
  }

  public Navy getFleet() {
        
    return fleet;
        
  }

  public int[][] getFleetDeployed() {
        
    return myShips;
        
  }

  public boolean HasShips() {
        
    return !fleet.Sunk();
        
  }

  public void InitialiazeBoard() {
    
    int x, y;


    for (x=0; x<10; x++) {
      for (y=0; y<10; y++) {
        myShips[x][y] = 0;
        myShots[x][y] = 0;
      }
    }
  }
}

class Main {

	private static Navy BuildNavy(Navy ships) {

    ships.add(new Ship("Carrier", 5, "A"));
    ships.add(new Ship("Battleship", 4, "B"));
    ships.add(new Ship("Crusier", 3, "C"));
    ships.add(new Ship("Submarine", 3, "S"));
    ships.add(new Ship("Destroyer", 2, "D"));

    return ships;

	}
  
	private static String ShipOptions(HashMap ships) {

    String options = "";
    Ship ship;

    //for (Object i : ships.keySet()) {
    for (Object option : ships.values()) {
      ship = (Ship)option;
      options += ship.getSymbol() + " - " + ship.getName() + ", ";
    }

    options = options.substring(0, options.length() - 2);
    return options;

  }

  private static void PlaceShipsComputer(Player player) {

    boolean placed;
    int x, y;


    for (Ship ship : ships) {
      
      placed = false;
      do {

      } while (!placed);

    }

  }

	private static void PlaceShipsPlayer(Player player) {

    boolean coords;
    int shipsToPlace, x, y;
    String choice;
    Navy ships;
    HashMap shipStock = new HashMap<String, Ship>();
    Scanner input = new Scanner(System.in);

    ships = player.getFleet();

    System.out.println("\nPlease place your ships");

    for (Ship ship : ships) {
      shipStock.put(ship.getSymbol(), ship);
    }
    shipsToPlace = ships.size();

    while (shipsToPlace > 0) { //size()?

      PrintBoard(player.getFleetDeployed(), ships);
      /*
      // choose a ship
      do {

				System.out.print("Choose a ship: " + ShipOptions(shipStock) + " -> ");
				choice = input.nextLine().toUpperCase();

				if (choice.length() > 0) {
					choice = choice.substring(0, 1);
				}        
        System.out.print("-" + choice + "-");
        System.out.println("-" + choice.length() + "-");
        //choice = "A";
        //choice = "W";
        System.out.print("-" + choice + "-");
        System.out.println("-" + choice.length() + "-");
      } while (choice != "A" && choice != "B" && choice != "C" && choice != "S" && choice != "D" && choice != "X");
      */
      /*
      // choose a ship
      choice = "";
      while (choice != "A" && choice != "B" && choice != "C" && choice != "S" && choice != "D" && choice != "X") {

				System.out.print("Choose a ship: " + ShipOptions(shipStock) + " -> ");
				choice = input.nextLine().toUpperCase();

				if (choice.length() > 0) {
					choice = choice.substring(0, 1);
				}        
        System.out.print("-" + choice + "-");
        System.out.println("-" + choice.length() + "-");
        //choice = "A";
        System.out.print("-" + choice + "-");
        System.out.println("-" + choice.length() + "-");
      }*/

      // choose a ship
      do {

				System.out.print("Choose a ship: " + ShipOptions(shipStock) + " -> ");
				choice = input.nextLine().toUpperCase();

				if (choice.length() > 0) {
					choice = choice.substring(0, 1);
				}        
        System.out.println("-" + choice + "-");
      } while (choice != "A" && choice != "B" && choice != "C" && choice != "S" && choice != "D" && choice != "X");

      // choose a location
      coords = false;
      while (!coords) {

				System.out.print("Choose a location: ");
				x = input.nextInt();
				y = input.nextInt();
        System.out.print("x= " + x + "; y= " + y);

				if (choice.length() > 0) {
					choice = choice.substring(0, 1);
				}

      }

    }

	}
  
	private static void PrintBoard(int[][] board, Navy ships) {

    int x, y;
    String point = "";


    System.out.println("   1 2 3 4 5 6 7 8 9 10");
    for (y=0; y<10; y++) {
      System.out.print(" " + (char)(y + 65));
      for (x=0; x<10; x++) {        
        switch (board[x][y]) {
          case 0 :{ // empty
            point = "."; 
            break;
          }
          case 1 :{ // miss
            point = "o"; 
            break;
          }
          case 2 :{ // hit
            point = "X"; 
            break;
          }
          default :{
            // ship index is stored in the board, negated and offset ny 1
            point = ships.get(Math.abs(board[x][y]) - 1).getSymbol(); 
            break;
          }
        }  
        System.out.print(" " + point)              ;
      }
      System.out.println();
    }

	}
  
  public static void main(String[] args) {

    System.out.println("B A T T L E   S H I P\n");

    Player human = new Player("Player 1");
    Player computer = new Player("Computer");
    BuildNavy(human.getFleet());
    BuildNavy(computer.getFleet());
    PlaceShipsPlayer(human);
    PlaceShipsComputer(computer);

    System.out.println("\nPlease fire");
    System.out.println(human.getFleet());

    /*while (!PlayerSunk && !ComputerSunk) {
        Playerfires();
        Computerfires();
    }*/
    
  }
}
