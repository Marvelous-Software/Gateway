/*
	John Maher
	Gateway - Java
	Dr Carrie Horvath
	midterm
	9/10/2020
	Due 10/20/2020
	
	BLACKJACK
	Note: displays in modes
	    Color           - default
	    Black and white - for the visually impaired
	    Text            - for user that require screen readers
*/


import java.util.Scanner;
import java.util.stream.*;
import java.util.*;


class Card {

	final String CLUBS_DARK = "\u2663"; 	// ♣
	final String CLUBS_LIGHT = "\u2667";    // ♧
	final String DIAMONDS_DARK = "\u2666";  // ♦
	final String DIAMONDS_LIGHT = "\u2662"; // ♢
	final String HEARTS_DARK = "\u2665";    // ♥
	final String HEARTS_LIGHT = "\u2661"; 	// ♡
	final String SPADES_DARK = "\u2660";    // ♠
	final String SPADES_LIGHT = "\u2664";   // ♤
		
    private int rank;
    private String suit;

	
	Card (int card) {

		rank = (card % 13) + 1;   // returns 0 - 12 without the plus 1
		switch ((card - 1) / 13 ) {// - 1 turns 1-54 to 0-53 otherwise 54 / 13 = 4 (suits are 0 to 3)
			case 0: {
				suit = "C";
				break;
			}
			case 1: {
				suit = "D";
				break;
			}
			case 2: {
				suit = "H";
				break;
			}
			case 3: {
				suit = "S";
				break;
			}

		}
	}

    public int getOrdinal() {
        
        return rank;
        
    }
    public String getRank() {
       
        String Rank;
        
        switch (rank) {
            case 1: {
                Rank = "A";
                break;
            }
			case 11: {
				Rank = "J";
				break;
			}
				case 12: {
                Rank = "Q";
                break;
            }
            case 13: {
                Rank = "K";
                break;
            }
            default: {
                Rank = String.valueOf(rank);
                break;
            }
        }
        
        return Rank;
    }
    
    public String getSuit() {

		return suit;
		
    }
    
    public String getSuitGraphic() {

        String suitGraphic = "";
        
        
        switch (suit) {
            case "C" :{
                suitGraphic = CLUBS_DARK;
                break;
            }
            case "D" :{
                suitGraphic = DIAMONDS_DARK;
                break;
            }
            case "H" :{
                suitGraphic = HEARTS_DARK;
                break;
            }
            case "S" :{
                suitGraphic = SPADES_DARK;
                break;
            }
        }
        
		return suitGraphic;
		
    }
    
    public String getSuitGraphicBW() {

        String suitGraphic = "";
        
        
        switch (suit) {
            case "C" :{
                suitGraphic = CLUBS_LIGHT;
                break;
            }
            case "D" :{
                suitGraphic = DIAMONDS_DARK;
                break;
            }
            case "H" :{
                suitGraphic = HEARTS_DARK;
                break;
            }
            case "S" :{
                suitGraphic = SPADES_LIGHT;
                break;
            }
        }
        
		return suitGraphic;
		
    }
    
    public String getSuitText() {

        String suitText = "";
        
        
        switch (suit) {
            case "C" :{
                suitText = "clubs";
                break;
            }
            case "D" :{
                suitText = "diamonds";
                break;
            }
            case "H" :{
                suitText = "hearts";
                break;
            }
            case "S" :{
                suitText = "spades";
                break;
            }
        }
        
		return suitText;
		
    }
    
    public int getValue() {
       
        int value;
        
        switch (rank) {
            case 1: {
                value = 11;
                break;
            }
            case 11: {
                value = 10;
                break;
            }
            case 12: {
                value = 10;
                break;
            }
            case 13: {
                value = 10;
                break;
            }
            default: {
                value = rank;
                break;
            }
        }
        
        return value;
    }
    
    public boolean isAce() {

		return rank == 1;
		
    }
    
    public String toString() {

		return getRank() + " of " + suit;
		
    }
    
}

class Deck {

    final int TOP_CARD = 0;
    
    ArrayList<Card> cards;
	
	
    Deck() {
	
		cards = new ArrayList<Card>();
				
    }
    
    public boolean hasCards() {

		return cards.size() > 0;
		
    }
    
    public int Count() {

		return cards.size();
		
    }
    
    public void Shuffle() {

		int card;
		int which;

		//https://stackoverflow.com/questions/10242380/how-can-i-generate-a-list-or-array-of-sequential-integers-in-java
		List<Integer> unshuffeled = IntStream.rangeClosed(1, 52).boxed().collect(Collectors.toList());
		while (unshuffeled.size() > 0) {

			which = (int)(Math.random() * unshuffeled.size());
			card = unshuffeled.get(which);
			unshuffeled.remove(which);
			cards.add(new Card(card));

		}

	}
    
    public Card Deal() {
        
        Card card;

		card = cards.get(TOP_CARD);
        cards.remove(TOP_CARD);

		return card;

    }

}

class Hand extends ArrayList<Card> {

	private final int DONT_GO_OVER = 21;
    private final int WENT_OVER = -1;

	// Required for base
	private static final long serialVersionUID = 0xC001D00D;   


    public void AddNewCard(Card newCard) {

		this.add(newCard);
		
    }

    public void DiscardAll() {

		this.clear();
		
    }

	private int Points() {

    	int aces = 0;
    	int points = 0;
    	
    	for (Card card : this) {
			if (card.isAce()) {
				aces += 1;
			}
    	    points += card.getValue();
		}
		
		while (aces > 0 && points > DONT_GO_OVER) {
			aces -= 1;
			points -= 10;
		}

        if (points > DONT_GO_OVER) {
            points = WENT_OVER;
        }

    	return points;

	}

    public boolean isBusted() {

		return Points() == WENT_OVER;
		
    }
	
    public int getPoints() {
    	
		return Points();
		
    }

}

class Player {

  private boolean dealer = false;
	private Hand cards;
	private int score;
  private boolean turn; // if true then it is this players turn
	
  public String Name;
	
	Player() {

		score = 0;
		cards = new Hand();

	}

	Player(boolean makeDealer) {

        dealer = makeDealer;
        score = 0;
        cards = new Hand();

	}

    public void AddWin() {
    	
		score++;
		
    }
    
    public Hand Cards() {
    	
		return cards;
		
    }

	public void FinishHand() {
		
		cards.DiscardAll();

    }
    
    public int getPoints() {
    	
        return cards.getPoints();
    }
    
    public int getScore() {
    	
		return score;
		
    }
    
    public int hasBlackjack() {
    	
		return score;
		
    }
    
    public boolean isBusted() {
    	
		return cards.isBusted();
		
    }
    
    public boolean isDealer() {
    	
		return dealer;
		
    }
    
    public boolean isUp() {
    	
		return turn;
		
    }
    
    public void TurnEnd() {
    	
		turn = false;
		
    }
    
    public void TurnStart() {
    	
		turn = true;
		
    }
    
}

class midterm {
	
    // Visibility
    enum Display { COLOR, 
                    BW,     // black and white
                    TEXT }; // default

    static Display display = Display.COLOR;
    
    // ANSI
    static final String RESET = "\033[0m";  // Text Reset
    static final String SUIT_BLACK = "\033[1;90;107m";  // black w/ bright white background
    static final String SUIT_RED = "\033[1;91;107m";  // hi intensity red w/ bright white background


    static final int HOUSE_STAND = 17;
    static final int MINIMUM_HAND = 4;
    static final String HIT = "H";
    static final String STAND = "S";
    static final String QUIT = "Q";
	
	static boolean ShownComputerCards = false;


	private static void SetComputerTurn(Player user, Player computer) {

        user.TurnEnd();
        computer.TurnStart();

	}
		
	private static void SetPlayerTurn(Player user, Player computer) {

        computer.TurnEnd();
        user.TurnStart();

	}
		
    private static String DrawScreenANSI(String suit) {

        String color = "";


        switch (suit) {
            case "C" :{
                color = SUIT_BLACK; 
                break;
            }
            case "D" :{
                color = SUIT_RED;
                break;
            }
            case "H" :{
                color = SUIT_RED; 
                break;
            }
            case "S" :{
                color = SUIT_BLACK;
                break;
            }
        }
        
        return color;
	}
	
	private static void DrawScreenCards(Player who) {

        final String CARD_BACK = "\u2592";
        final String CARD_BACK_COLOR = "\033[0;94;107m";// blue w/ bright white background
        final String CARD_TOP_LEFT = "\u250D";
        final String CARD_TOP_RIGHT = "\u2511";
        final String CARD_BOTTOM_LEFT = "\u2515";
        final String CARD_BOTTOM_RIGHT = "\u2519";
        final String CARD_SIDE_HORIZONTAL = "\u2501";
        final String CARD_SIDE_VERTICLE = "\u2502";
        
        final int WENT_OVER = -1;


        boolean firstCard = true;
        int points;
        int rank = 0;
        String ansi;
        String cardBack = CARD_BACK + CARD_BACK + CARD_BACK + CARD_BACK + CARD_BACK;
        String cardSpacer = "   ";
        String row0 = "";
        String row1 = "";
        String row2 = "";
        String row3 = "";
        String row4 = "";
        String row5 = "";        
        String row6 = "";        
        String rankDisplayed;
        String suit;

        
		for (Card card : who.Cards()) {

            switch (display) {

                case COLOR : {
                    
                    cardSpacer = RESET + "   ";

                    if (!firstCard || !(who.isDealer() && !who.isUp())) {

                        rankDisplayed = card.getRank();
                        
                        // check for Integer
                        if (rankDisplayed.compareTo("0") > 0 && rankDisplayed.compareTo(":") < 0) {
                            rank = Integer.parseInt(rankDisplayed);
                        } else if (rankDisplayed == "A") {
                            rank = 1;
                        } else {
                            rank = 0;
                        }

                        suit = card.getSuitGraphic();
                        ansi = DrawScreenANSI(card.getSuit());
                        if (rank != 10) {
                            row1 += ansi + rankDisplayed + "      " + cardSpacer; 
                        } else { // 10
                            row1 += ansi + rankDisplayed + suit + " " + suit + "  " + cardSpacer; 
                        }
                        if (rank > 3 && rank < 11) { // 4-10
                            row2 += ansi + suit + " " + suit + " " + suit + "  " + cardSpacer;
                        } else if (rank > 1 && rank < 4) { // 2 and 3
                            row2 += ansi + suit + "  " + suit + "   " + cardSpacer; 
                        } else { // Ace or face card
                            row2 += ansi + suit + "      " + cardSpacer; 
                        }
                        if (rank % 2 == 1) { // odd
                            if (rank < 7) { // 1, 3 & 5
                                row3 += ansi + "   " + suit + "   " + cardSpacer;
                            } else { // 7 & 9
                                row3 += ansi + "  " + suit + suit + suit + "  " + cardSpacer;
                            }                    
                        } else if (rank > 5) { // 6, 8 & 10
                            row3 += ansi + "  " + suit + " " + suit + "  " + cardSpacer; 
                        } else { // Face card
                            row3 += ansi + "       " + cardSpacer; 
                        }
                        if (rank > 3 && rank < 11) { // 4-10
                            row4 += ansi + "  " + suit + " " + suit + " " + suit + cardSpacer;
                        } else if (rank > 1 && rank < 4) { // 2 and 3
                            row4 += ansi + "   " + suit + "  " + suit + cardSpacer; 
                        } else { // Ace or face card
                            row4 += ansi + "      " + suit + cardSpacer; 
                        }
                        if (rank > 7 && rank < 10) { // 7-10
                            row5 += ansi + "  " + suit + " " + suit + " " + rankDisplayed + cardSpacer;
                        } else if (rank == 10) { // 10
                            row5 += ansi + "  " + suit + " " + suit + rankDisplayed + cardSpacer;
                        } else { // A-3 or Face card
                            row5 += ansi + "      " + rankDisplayed + cardSpacer; 
                        }
                    } else {
                        ansi = CARD_BACK_COLOR;
                        row1 += ansi + "       " + cardSpacer; 
                        row2 += ansi + " " + cardBack + " " + cardSpacer; 
                        row3 += ansi + " " + cardBack + " " + cardSpacer; 
                        row4 += ansi + " " + cardBack + " " + cardSpacer; 
                        row5 += ansi + "       " + cardSpacer;
                        firstCard = false;
                    }
                    break;
                }                    
                case BW : {

                    row0 += CARD_TOP_LEFT + CARD_SIDE_HORIZONTAL + CARD_SIDE_HORIZONTAL + CARD_SIDE_HORIZONTAL + CARD_SIDE_HORIZONTAL + CARD_SIDE_HORIZONTAL + CARD_SIDE_HORIZONTAL + CARD_SIDE_HORIZONTAL + CARD_TOP_RIGHT + "   ";
                    row6 += CARD_BOTTOM_LEFT + CARD_SIDE_HORIZONTAL + CARD_SIDE_HORIZONTAL + CARD_SIDE_HORIZONTAL + CARD_SIDE_HORIZONTAL + CARD_SIDE_HORIZONTAL + CARD_SIDE_HORIZONTAL + CARD_SIDE_HORIZONTAL + CARD_BOTTOM_RIGHT + "   ";

                    cardSpacer = CARD_SIDE_VERTICLE + "   ";

                    if (!firstCard || !(who.isDealer() && !who.isUp())) {
 
                        rankDisplayed = card.getRank();
                        
                        // check for Integer
                        if (rankDisplayed.compareTo("0") > 0 && rankDisplayed.compareTo(":") < 0) {
                            rank = Integer.parseInt(rankDisplayed);
                        } else if (rankDisplayed == "A") {
                            rank = 1;
                        } else {
                            rank = 0;
                        }

                        suit = card.getSuitGraphicBW();
                        if (rank != 10) {
                            row1 += CARD_SIDE_VERTICLE + rankDisplayed + "      " + cardSpacer; 
                        } else { // 10
                            row1 += CARD_SIDE_VERTICLE + rankDisplayed + suit + " " + suit + "  " + cardSpacer; 
                        }
                        if (rank > 3 && rank < 11) { // 4-10
                            row2 += CARD_SIDE_VERTICLE + suit + " " + suit + " " + suit + "  " + cardSpacer;
                        } else if (rank > 1 && rank < 4) { // 2 and 3
                            row2 += CARD_SIDE_VERTICLE + suit + "  " + suit + "   " + cardSpacer; 
                        } else { // Ace or face card
                            row2 += CARD_SIDE_VERTICLE + suit + "      " + cardSpacer; 
                        }
                        if (rank % 2 == 1) { // odd
                            if (rank < 7) { // 1, 3 & 5
                                row3 += CARD_SIDE_VERTICLE + "   " + suit + "   " + cardSpacer;
                            } else { // 7 & 9
                                row3 += CARD_SIDE_VERTICLE + "  " + suit + suit + suit + "  " + cardSpacer;
                            }                    
                        } else if (rank > 5) { // 6, 8 & 10
                            row3 += CARD_SIDE_VERTICLE + "  " + suit + " " + suit + "  " + cardSpacer; 
                        } else { // Face card
                            row3 += CARD_SIDE_VERTICLE + "       " + cardSpacer; 
                        }
                        if (rank > 3 && rank < 11) { // 4-10
                            row4 += CARD_SIDE_VERTICLE + "  " + suit + " " + suit + " " + suit + cardSpacer;
                        } else if (rank > 1 && rank < 4) { // 2 and 3
                            row4 += CARD_SIDE_VERTICLE + "   " + suit + "  " + suit + cardSpacer; 
                        } else { // Ace or face card
                            row4 += CARD_SIDE_VERTICLE + "      " + suit + cardSpacer; 
                        }
                        if (rank > 7 && rank < 10) { // 7-10
                            row5 += CARD_SIDE_VERTICLE + "  " + suit + " " + suit + " " + rankDisplayed + cardSpacer;
                        } else if (rank == 10) { // 10
                            row5 += CARD_SIDE_VERTICLE + "  " + suit + " " + suit + rankDisplayed + cardSpacer;
                        } else { // A-3 or Face card
                            row5 += CARD_SIDE_VERTICLE + "      " + rankDisplayed + cardSpacer; 
                        }
                    } else {
                        row1 += CARD_SIDE_VERTICLE + "       " + cardSpacer; 
                        row2 += CARD_SIDE_VERTICLE + " " + cardBack + " " + cardSpacer; 
                        row3 += CARD_SIDE_VERTICLE + " " + cardBack + " " + cardSpacer; 
                        row4 += CARD_SIDE_VERTICLE + " " + cardBack + " " + cardSpacer; 
                        row5 += CARD_SIDE_VERTICLE + "       " + cardSpacer;
                        firstCard = false;
                    }
                    break;
                }                    
                case TEXT : {

                    cardSpacer = ", ";

                    if (!firstCard || !(who.isDealer() && !who.isUp())) {

                        rankDisplayed = card.getRank();                    
                        suit = card.getSuitText();
                        row1 += rankDisplayed + " of " + suit + cardSpacer; 
                    } else {
                        row1 += "hole card" + cardSpacer; 
                        firstCard = false;
                    }
                    break;
                }                    
    	    }
        }

        if (display == Display.TEXT){
            row1 = row1.substring(0, row1.length() - 2);
            points = who.getPoints();
            if (points != WENT_OVER){
                row2 = "Total of " + String.valueOf(points);
            } else {
                
            }
        }

        DrawScreenPrintRow(row0);  //BW only
        DrawScreenPrintRow(row1);
		DrawScreenPrintRow(row2);
		DrawScreenPrintRow(row3);
		DrawScreenPrintRow(row4);
		DrawScreenPrintRow(row5);
		DrawScreenPrintRow(row6);  //BW only

    }

	private static void DrawScreenPrintRow(String row) {

        if (!row.equals("")) {
            System.out.println(row);
        }
    }

	private static void DrawScreen(Player user, Player computer) {

        System.out.println(RESET + "\nComputer has:");
        DrawScreenCards(computer);
		System.out.println(RESET + "\nPlayer has");
        DrawScreenCards(user);
		
	}
	
	public static void main(String[] args) {
		
		final String BUST = "bust";

		boolean deckOut = false;
		boolean gameOver = false;
		boolean handOver = false;
		int computerScore;
		int opponentScore;
		int tie = 0;
		String computerHand;
		String opponentHand;
		String choice;
		
		Player opponent = new Player();
		Player computer = new Player(true);
		
		Deck stock = new Deck();
		stock.Shuffle();
		
		Scanner input = new Scanner(System.in);
		
		while (!gameOver && stock.Count() >= MINIMUM_HAND) {

			//Deal
			opponent.Cards().AddNewCard(stock.Deal());
			computer.Cards().AddNewCard(stock.Deal());
			opponent.Cards().AddNewCard(stock.Deal());
			computer.Cards().AddNewCard(stock.Deal());
      SetPlayerTurn(opponent, computer);
      ShownComputerCards = false;

			while (!handOver) {

				DrawScreen(opponent, computer);
				
				System.out.print("\nPlayer Hit or Stand or Quit: ");
				choice = input.nextLine().toUpperCase();

				if (choice.length() > 0) {
					choice = choice.substring(0, 1);
				}

				switch (choice){
 
					case HIT :{
						if (stock.hasCards()) {
              System.out.println("Dealing a card");
							opponent.Cards().AddNewCard(stock.Deal());
							if (opponent.isBusted()) {
                System.out.println("Busted!");
                DrawScreen(opponent, computer);
								handOver = true;
							}
						} else {
							deckOut = true;
						}
						break;
 
					}
 
					case STAND :{
 
						handOver = true;
						break;
 
					}
 
					case QUIT :{
 
						handOver = true;
						gameOver = true;
						break;
 
					}
 
					default :{
 
						// NOP
						break;
 
					}
				}										
			}
						
            
      SetComputerTurn(opponent, computer);
			if (!opponent.isBusted() && !deckOut) {
				// Computer Decides
				while (computer.getPoints() < HOUSE_STAND && !computer.isBusted()) {
					if (stock.hasCards()) {
						computer.Cards().AddNewCard(stock.Deal());
            System.out.println("Computer takes a hit");
						DrawScreen(opponent, computer);
            ShownComputerCards = true;
					} else {
						deckOut = true;
						handOver = true;
						gameOver = true;
					}
				}
                System.out.println("Computer stands");
			}

            //Show the computer's face down card if not already rankDisplayed
            if (!ShownComputerCards) {
                DrawScreen(opponent, computer);
            }
			computerHand = String.valueOf(computer.getPoints());
			opponentHand = String.valueOf(opponent.getPoints());

			if (opponent.isBusted()) {
				opponentHand = BUST;
			}
			if (computer.isBusted()) {
				computerHand = BUST;
			}

			if (computer.getPoints() > opponent.getPoints()) {
				System.out.println("Computer wins!  Your " + opponentHand + " didn't beat my " + computerHand);
				computer.AddWin();
			} else if (opponent.getPoints() > computer.getPoints()) {
				System.out.println("You win!  Your " + opponentHand + " beats my " + computerHand);
				opponent.AddWin();
			} else {
				System.out.println("Push.  Your " + String.valueOf(opponentHand) + " equals my " + String.valueOf(computerHand));
				tie++;
			}
			
			handOver = false;
			computer.FinishHand();
			opponent.FinishHand();
			System.out.println();

		}
		
		input.close();

		computerScore = computer.getScore();
		opponentScore = opponent.getScore();
		System.out.printf("%10s %10s %8s", "\n      ", "Computer", "Player");
		System.out.printf("%10s %10s %8s", "\n------", "--------", "------");
		System.out.printf("%10s %10s %8s", "\nScore", computerScore, opponentScore);
		System.out.println();
		
        if (computerScore > opponentScore) {
            System.out.println("Computer wins the game!");
        } else if (opponentScore > computerScore) {
            System.out.println("Player wins the game!");
        } else {
            System.out.println("Its a tie!");
        }

	}
	
}
