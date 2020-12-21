/*
	John Maher
	Gateway - Java
	Dr Carrie Horvath
	final
	12/10/2020
	Due 12/15/2020
	
	BATTLESHIP


  hunt fails to change on a miss
  hunt overflows board
  
*/


import java.lang.Math;
import java.util.Scanner;
//import java.util.stream.*;
import java.util.*;


class Ship {

  public enum Orientation {UNKNOWN, VERTICLE, HORIZONTAL}

  private int hits;
  private String name;
  private int size;
  private String symbol;

  public Ship(String nameIn, int sizeIn, String symbolIn) {

    name = nameIn;
    size = sizeIn;
    symbol = symbolIn;
    hits = 0;
    
  }

  public void Hit() {
        
    hits++;
        
  }

  public String getName() {
        
    return name;
        
  }

  public int getSize() {
        
    return size;
        
  }

  public boolean isSunk() {
        
    return hits >= size;
        
  }

  public String getSymbol() {
        
    return symbol;
        
  }

}

class Navy extends ArrayList<Ship> {
    
	// Required for base
	private static final long serialVersionUID = 0xC001D00D;   


  public int ShipsLeft() {
  
    int count = 0;

    for (Ship ship : this) {
      if (!ship.isSunk()) {
        count++;
      }
    }
    return count;
    
  }

  public boolean Sunk() {
  
    boolean sunk = true;

    for (Ship ship : this) {
      sunk = sunk && ship.isSunk();
    }
    return sunk;
    
  }

}

class Player {

  public enum Direction {UNKNOWN, RIGHT, DOWN, LEFT, UP}

  final int BOARD_SIZE = 10;
	final int GRID_OPEN = 0;
	final int GRID_MISS = 1;
	final int GRID_HIT = 2;

  private String name;
  private String symbol;
  private int[][] myShips = new int[BOARD_SIZE][BOARD_SIZE];
  private Navy fleet;
  private Direction directionLast;
  private int xLast = -1;
  private int yLast = -1;
  

  public Player(String nameIn, String symbolIn) {

    name = nameIn;
    symbol = symbolIn;
    fleet = new Navy();
    InitialiazeBoard();
    
  }

  public Navy getFleet() {
        
    return fleet;
        
  }

  public String getName() {
        
    return name;
        
  }

  public int[][] getFleetDeployed() {
        
    return myShips;
        
  }

  public void InitialiazeBoard() {
    
    int x, y;


    for (x=0; x<BOARD_SIZE; x++) {
      for (y=0; y<BOARD_SIZE; y++) {
        myShips[x][y] = 0;
      }
    }
  }

  public boolean hasLast() {
        
    return xLast != -1;
        
  }

  public boolean hasShips() {
        
    return !fleet.Sunk();
        
  }

  public void ShipSunk() {
        
    directionLast = Direction.UNKNOWN;
    xLast = -1;
    yLast = -1;
        
  }

  public String getSymbol() {
        
    return symbol;
        
  }
  // set when hunting a ship and the ship direction is determined.
  public Player.Direction getDirectionLast() {
        
    return directionLast;
        
  }
  public void setDirectionLast(Player.Direction newDirectionLast) {
        
    this.directionLast = newDirectionLast;
        
  }
  // set to the x cord when a ship is found
  public int getXLast() {
        
    return xLast;
        
  }
  public void setXLast(int newXLast) {
        
    this.xLast = newXLast;
        
  }
  // set to the y cord when a ship is found
  public int getYLast() {
        
    return yLast;
        
  }
  public void setYLast(int newYLast) {
        
    this.yLast = newYLast;
        
  }

}

class Main {

  // next 3 duplicated from Player Class
  public static final int BOARD_SIZE = 10;
	public static final int GRID_MISS = 1;
	public static final int GRID_HIT = 2;

  public static final int GRID_INVALID = 4;
  public static final int SHIP_SUNK = 16;

  public static final String[] YCORDS = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J"};

  public static Scanner input = new Scanner(System.in);

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


    for (Object option : ships.values()) {
      ship = (Ship)option;
      options += ship.getSymbol() + " - " + ship.getName() + ", ";
    }

    options = options.substring(0, options.length() - 2); // remove last comma
    return options;

  }

	private static int PlaceShip(int[][] board, Ship ship, int x, int y, Ship.Orientation whichWay) {

    int blockage = 0; // returns 0 if it fits
    HashMap index_link = new HashMap<String, Integer>();


    // links the indexes with the ship symbols
    index_link.put("A", 1); 
    index_link.put("B", 2); 
    index_link.put("C", 3); 
    index_link.put("S", 4); 
    index_link.put("D", 5); 

    for (int r = 0; r < ship.getSize(); r++) {
      switch (whichWay) {
        case HORIZONTAL :{
          blockage += Math.abs(board[x + r][y]); 
          break;
        }
        case VERTICLE :{
          blockage += Math.abs(board[x][y  + r]); 
          break;
        }
      }  
    }

    if (blockage == 0) {
      // it fits
      for (int r = 0; r < ship.getSize(); r++) {
        switch (whichWay) {
          case HORIZONTAL :{
            board[x + r][y] = -(int)(index_link.get(ship.getSymbol()));
            break;
          }
          case VERTICLE :{
            board[x][y + r] = -(int)(index_link.get(ship.getSymbol())); 
            break;
          }
        }  
      }
    }

    return blockage;

  }

  private static void PlaceShipsComputer(Player player) {

    Ship.Orientation orientation;
    boolean placed;
    int x, y, xOffset, yOffset;


    for (Ship ship : player.getFleet()) {
      
      placed = false;
      x = 1;
      y = 1;
      orientation = Ship.Orientation.HORIZONTAL;
      do {
        
        xOffset = 0;
        yOffset = 0;
        if (Math.random() > .5) {
          orientation = Ship.Orientation.HORIZONTAL;
          xOffset = ship.getSize();
        } else {
          orientation = Ship.Orientation.VERTICLE;
          yOffset = ship.getSize();
        }
        x = (int)(Math.random() * (BOARD_SIZE - xOffset));
        y = (int)(Math.random() * (BOARD_SIZE - yOffset));
        placed = PlaceShip(player.getFleetDeployed(), ship, x, y, orientation) == 0;
      } while (!placed);
    }

  }

  private static void PlaceShipsPlayer(Player player) {

    Ship.Orientation orientation;
    boolean placed = false;
    int x, y;
    int index, limit;
    String choice;
    String[] inputOptions = {"A", "B", "C", "S", "D", "X"};
    String[] inputOptionsAvailable;
    Ship currentShip, shipOption;
    Navy ships;
    HashMap shipStock = new HashMap<String, Ship>();

    ships = player.getFleet();
    inputOptionsAvailable = inputOptions;

    System.out.println("\nPlease place your ships");

    for (Ship ship : ships) {
      shipStock.put(ship.getSymbol(), ship);
    }

    while (shipStock.size() > 0) { 

      PrintBoard(player, false);
      
      // choose a ship
      choice = "";
      do {
				System.out.print("Choose a ship: " + ShipOptions(shipStock) + " -> ");
				choice = input.nextLine().toUpperCase();
				if (choice.length() > 0) {
					choice = choice.substring(0, 1);
				}
      } while (!Arrays.asList(inputOptionsAvailable).contains(choice));

//*** automate

      // ship chosen
      if (choice.equals("X")) {
				System.out.println("Fleet automatically deployed.\n");
        PlaceShipsComputer(player);        
        break;
      }
      currentShip = ((Ship)(shipStock.get(choice)));
			System.out.println(currentShip.getName() + " selected.");
      shipStock.remove(choice);
      // remove the chosen ship from the options and will also disallow automatic placing by removing the "X"
      inputOptionsAvailable =  new String[shipStock.size()];
      index = 0;
      for (Object option : shipStock.values()) {
        shipOption = (Ship)option;
        inputOptionsAvailable[index] = shipOption.getSymbol();
        index++;
      }

      // choose orientation
      do {

				System.out.println("Choose orientation (H for horizontal; V for vertical -> ");
				choice = input.nextLine().toUpperCase();

				if (choice.length() > 0) {
					choice = choice.substring(0, 1);
				}        
      } while (!choice.equals("H") && !choice.equals("V"));
      if (choice.equals("H")) {
        orientation = Ship.Orientation.HORIZONTAL;
      } else {
        orientation = Ship.Orientation.VERTICLE;
      }

      // choose a location
      System.out.println("Choose a location (top left): ");
      placed = false;
      while (!placed) {
        y = -1; // flag as required
        limit = BOARD_SIZE;
        if (orientation == Ship.Orientation.VERTICLE) {
          limit -= currentShip.getSize();
        }
        while (y < 0) {
          System.out.print("\nEnter a letter -> ");
          choice = input.nextLine().toUpperCase();
          if (choice.length() > 0) {
            choice = choice.substring(0, 1);
          }        
          if (Arrays.asList(YCORDS).contains(choice)) {
            y = choice.codePointAt(0) - 65;// -65 = A:0, B:1, ect.
            if (y > limit) {
              System.out.println("Your ship wont fit on the board.  Please move up by at least " + Math.abs(limit - y));
              y = -1; // flag as required
            }
          } else {
            System.out.println("Please enter a letter from A to J");
          }
        }
        x = -1; // flag as required
        limit = BOARD_SIZE;
        if (orientation == Ship.Orientation.HORIZONTAL) {
          limit -= currentShip.getSize() - 1;
        }
        while (x < 0) {
          System.out.print("\nEnter a number -> ");
          x = input.nextInt();  
          input.nextLine();       
          if (x < 0 || x > limit) {
            System.out.println("Please enter a number from 1 to " + limit);
            x = -1; // flag as required
          }          
        }

        x--;// we minus 1 because the board is 0 based
        placed = PlaceShip(player.getFleetDeployed(), currentShip, x, y, orientation) == 0;

        if (!placed) {
          System.out.println("Two ships can not occupy the same space.  Please select a new location.");
        }

      }

    System.out.println(currentShip.getName() + " deployed.");  

    }

    PrintBoard(player, false);
    System.out.println("Fleet deployed and ready for battle!");    

  }

  private static int Fire(Player player, int x, int y) {
    // returns True if valid (never checked) cords are passed
    boolean sunk;
    int rc = -1;
    int shipsLeft;
    int[][] board;
    Navy ships;

    
    sunk = false;
    board = player.getFleetDeployed();
    ships = player.getFleet();
    if (board[x][y] < 1) {
      // new cords
      if (board[x][y] < 0) {
        // found a ship
        if (player.getXLast() == -1) {
          // save cords to finish off the ship nect turn(s)
          player.setDirectionLast(Player.Direction.RIGHT);
          player.setXLast(x);
          player.setYLast(y);
        }
        shipsLeft = ships.ShipsLeft();

        ships.get(Math.abs(board[x][y]) - 1).Hit();

        if (shipsLeft > ships.ShipsLeft()) {
          // sunk; reset pointer
          player.ShipSunk();
          sunk = true;
        }
        //check if sunk
        board[x][y] = GRID_HIT;
        rc = GRID_HIT;
      } else {
        // nothing
        board[x][y] = GRID_MISS;
        rc = GRID_MISS;
      }
    } else {
      // already tried these cords
      rc = GRID_INVALID;
    }

    if (sunk) {
      rc = rc | SHIP_SUNK; // sunk flag
    }

    return rc;

  }

  private static int Computerfires(Player attacker, Player defender) {

    boolean found = false;
    boolean sunk = false;
    int x, y, direction, xCheck = 0, yCheck = 0;
    int[][] board;


    board = defender.getFleetDeployed();
    do {
      if (!defender.hasLast()) {
        // choose randomly
        x = (int)(Math.random() * 10);
        y = (int)(Math.random() * 10);
      } else {
        direction = 0;
        x = defender.getXLast();
        y = defender.getYLast();
        while (direction < 5 && !found) {
          direction++;
          xCheck = x;          
          yCheck = y;
          switch (Player.Direction.values()[direction]) {
            case RIGHT : {
              // go right
              if (xCheck < BOARD_SIZE - 1)
              {
                while(xCheck < BOARD_SIZE && board[xCheck][yCheck] > 0) {
                  if (board[xCheck][yCheck] != GRID_MISS) {
                    xCheck++;
                  } else {
                    // found a miss, change direction
                    break;
                  }
                }
                if (board[xCheck][yCheck] < 1) { 
                  found = true;
                }
              }
              break;
            }
            case DOWN: {
              // go down
              if (yCheck < BOARD_SIZE - 1)
              {
                while(yCheck < BOARD_SIZE && board[xCheck][yCheck] > 0) {
                  if (board[xCheck][yCheck] != GRID_MISS) {
                    yCheck++;
                  } else {
                    // found a miss, change direction
                    break;
                  }
                }
                if (board[xCheck][yCheck] < 1) {
                  found = true;
                }
              }
              break;
            }
            case LEFT: {
              // go left
              if (xCheck > 0)
              {
                while(xCheck > 0 && board[xCheck][yCheck] > 0) {
                  if (board[xCheck][yCheck] != GRID_MISS) {
                    xCheck--;
                  } else {
                    // found a miss, change direction
                    break;
                  }
                }
                if (board[xCheck][yCheck] < 1) {
                  found = true;
                }
              }
              break;
            }
            case UP: {
              // go up
              if (yCheck > 0)
              {
                while(yCheck > 0 && board[xCheck][yCheck] > 0) {
                  if (board[xCheck][yCheck] != GRID_MISS) {
                    yCheck--;
                  } else {
                    // found a miss, change direction
                    break;
                  }
                }
                if (board[xCheck][yCheck] < 1) {
                  found = true;
                }
              }
              break;
            }
            case UNKNOWN: {
              // go up
              throw new java.lang.RuntimeException("bad direction (not set)");
            }
          }
        }
        if (!found) {
          // if the logic fails then we just pick a random point.
          x = (int)(Math.random() * 10);
          y = (int)(Math.random() * 10);
        } else {
          x = xCheck;
          y = yCheck;
        }
      }
    } while (board[x][y] > 0);

    System.out.println("Computer selects (" + (char)(y + 65) + ":" + (x + 1) + ")");    
    if (board[x][y] < 0) {
      System.out.println("Computer gets a hit.");
    } else {
      System.out.println("Computer misses.");
    }

    System.out.println();    
    return Fire(defender, x, y);
    
  }

  private static void PrintBoard(Player player, boolean hideShips) {

    String which;
    Navy ships;
    int[][] board;


    which = player.getSymbol();
    board = player.getFleetDeployed();
    ships = player.getFleet();
    PrintBoard(which, board, ships, hideShips);

  }

	private static void PrintBoard(String which, int[][] board, Navy ships, boolean 	hideShips) {
    // @ border 1 player, + border the other
    int x, y;
    String point = "";


    System.out.print(which + "  ");
    for (x=1; x<=BOARD_SIZE; x++){
      System.out.print(x + " ");
    }
    System.out.println();
    for (y=0; y<BOARD_SIZE; y++) {
      System.out.print(" " + (char)(y + 65));
      for (x=0; x<BOARD_SIZE; x++) {        
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
            if (hideShips) {
              point = "."; 
            } else {
              point = ships.get(Math.abs(board[x][y]) - 1).getSymbol(); 
            }
            break;
          }
        }  
        System.out.print(" " + point);
      }
      System.out.println();
    }

	}
  
	private static void DebugBoard(int[][] board) {

    int x, y;


    System.out.print("   ");
    for (x=1; x<=BOARD_SIZE; x++){
      System.out.print(x + " ");
    }
    System.out.println();
    for (y=0; y<BOARD_SIZE; y++) {
      System.out.print(" " + (char)(y + 65));
      for (x=0; x<BOARD_SIZE; x++) {        
        System.out.print(" " + board[x][y]);
      }  
      System.out.println();
    }
    System.out.println();
	}
  
  public static void main(String[] args) {

    boolean fired;
    boolean automatic = false;
    int x, y, hitOrMiss;
    String choice = "";
    String priorTurn = "";


    System.out.println("\n        *** B A T T L E   S H I P ***\n");
    System.out.println("\nSink the enemies fleet before losing yours.");
    System.out.println("The winner is the last one who retains at least");
    System.out.println("one ship still afloat.");
    System.out.println("Each player possess the following ships:");
    System.out.println("A - Aircraft Carrier or just Carrier");
    System.out.println("B - Battleship");
    System.out.println("C - Crusier");
    System.out.println("S - Submarine");
    System.out.println("D - Destroyer");
    System.out.println("\nHint: while deploying your fleet you can");
    System.out.println("enter 'X' when selecting your first ship for");
    System.out.println("automatic placement.");

    Player human = new Player("Player 1", "+");
    Player computer = new Player("Computer", "*");
    BuildNavy(human.getFleet());
    BuildNavy(computer.getFleet());
    PlaceShipsPlayer(human);
    System.out.println("\nPlacing computer's fleet");
    PlaceShipsComputer(computer);

    System.out.println("Begin the battle!");

    while (human.hasShips() && computer.hasShips() && !choice.equals("Q")) {      
      System.out.println("\n" + priorTurn);
      System.out.println("Choose a target: ");
      PrintBoard(computer, true);
      fired = false;
      while (!fired) {
        y = -1;
        if (!automatic ){
          while (y < 0) {
            System.out.print("\nEnter a letter -> ");
            choice = Main.input.nextLine().toUpperCase();
            if (choice.length() > 0) {
              choice = choice.substring(0, 1);
              if (choice.equals("X")) {
                automatic = true;
              }
            }        
            if (Arrays.asList(YCORDS).contains(choice)) {
              y = choice.codePointAt(0) - 65;// -65 = A:0, B:1, ect.
            } else {
              System.out.println("Please enter a letter from A to J");
            }
          }
          x = -1;
          while (x < 0) {
            System.out.print("\nEnter a number -> ");
            x = Main.input.nextInt();  
            Main.input.nextLine();       
            if (x < 0 || x > BOARD_SIZE) {
              System.out.println("Please enter a number from 1 to " + BOARD_SIZE);
              x = -1;
            }          
          }

          x--;// we minus 1 because the board is 0 based
          hitOrMiss = Fire(computer, x, y);
        } else { 
          // automate         
          hitOrMiss = Computerfires(human, computer);
        }

        if ((hitOrMiss & GRID_MISS) == GRID_MISS) {        
          priorTurn = "Missed";
          fired = true;
        }
        if ((hitOrMiss & GRID_HIT) == GRID_HIT) {
          priorTurn = "* BOOM *\n** HIT **";
          fired = true;
        }
        if ((hitOrMiss & GRID_INVALID) == GRID_INVALID) {
          System.out.println("Already fired at that location, please choose another."); 
        }

        if ((hitOrMiss & SHIP_SUNK) == SHIP_SUNK) {
          priorTurn += "\n*** SUNK ***"; 
        }
      }

      PrintBoard(computer, true);
      System.out.println("\nYour fleet is under attack!");
      Computerfires(computer, human);
      PrintBoard(human, false);
    }

    input.close();
    System.out.println(priorTurn);

    if (human.hasShips() && computer.hasShips()) {
      System.out.println("We'll call it a draw."); 
      PrintBoard(computer, false);
      System.out.println("Here's where my ships were hiding."); 
    } else if (human.hasShips() && !computer.hasShips()) {
      System.out.println("CONGRATULATIONS!! You win!"); 
    } else if (!human.hasShips() && computer.hasShips()) {
      System.out.println("Sorry, all your ships have been sunk.  Better luck next time."); 
      PrintBoard(computer, false);
      System.out.println("Here's where my ships were hiding."); 
    } else { // total massacre
      System.out.println("Well there is no winner and no draw because there are no survivors."); 
    }
  }
}
