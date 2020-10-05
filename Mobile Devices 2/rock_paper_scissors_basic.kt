/*
 * You can edit, run, and share this code. 
 * play.kotlinlang.org 
 */

fun main() {
    
  // this program will solve the R,P,S game
  // 
  // 	What data do we need ?
  // 	String => "rock, "paper", "scissors"
  // 	
  // 	
  // 	How do we implement the logic?
  // 	- use variables to represent the choice of each player
  // 	var player 1
  // 	var player2
  // 	
  // 	need to consider each possible combination including ties
  // 	9 possible combinations
  // 	each combination can be handled by a conditional statement
  // 	
  // 	
    
    var player1_choice = "rock"
    var player2_choice = "paper"
    
    // option 1 using nested if statement
    if ( player1_choice == "rock" ){
        if ( player2_choice == "paper" ){
            	println("Player 2 wins!")
        }else{
        }
    }else{
    }
    
    // option 2 using an if statement with logic operators in the condition (and => &&, or => ||)
    if ( player1_choice == "rock" && player2_choice == "paper" ){
         println("Player 2 wins!")
    }else{
    }
  
  
  	// option 3 using cascading/chained if statements
    if ( player1_choice == "rock" ){
        
    }else if ( player2_choice == "paper" ){
            	println("Player 2 wins!")
        
    }else{
        
        
    }
     
    
}