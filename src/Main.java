import java.util.Scanner;

class Main {
  public static void main(String[] args) {

  // Pseudocode
  /**
  * The program is a game that consists of three dice rolls and involved getting a sum of 12 across three rolls of dice in each round.
  *
  *  do { //While The program has not been exited by user
  *    while(all three dice has not been rolled) {
  *      do { // While user input is valid
  *        if(user input is an integer) {
  *        
  *        	 try {
  *        		Attempt to convert the user input into an integer 
  *        	 } catch {
  *        		If the conversion fails (the string is not a valid number), handle the error
  *        		Set user input to a default value of 0 if the conversion is unsuccessful 
  *          }
  *          
  *          switch (user input) {
  *            case1:
  *              if(dice 1 has not been rolled) {
  *                randomize a value
  *              } else {
  *                Print message to user telling them the dice has already been rolled
  *                skip the rest of the code in the do-while loop
  *              }
  *            case2:
  *              if(dice 2 has not been rolled) {
  *                randomize a value
  *              } else {
  *                print message to user telling them the dice has already been rolled
  *                skip the rest of the code in the do-while loop
  *              }
  *            case3:
  *              if(dice 3 has not been rolled) {
  *                randomize a value
  *              } else {
  *                print message to user telling them the dice has already been rolled
  *                skip the rest of the code in the do-while loop
  *              }
  *            default:
  *              print message to user saying that the input is invalid
  *              skip the rest of the code in the do-while loop
  *          }
  *          calculate sum of the three dice
  *          if(all three dice has been rolled){
  *            if(check if the sum of all three dice equals to 12){
  *              increment the win counter
  *            } else if(check if the sum of all three dice is greater than 12)
  *              increment the lose counter
  *            }
  *          print dice1Value dice2Value dice3Value diceValueSum timesWin timesLost
  *        } else { //not an integer
  *          if(check if input is 'q'){
  *            exit program
  *          } else { //not 'q'
  *            print message to user saying that the input is invalid
  *        }
  *      } while (user input is invalid )
  *    }
  *    if(check if all dice are rolled) {
  *      if(check if its a win) {
  *        print winner message
  *      } else if(check if its a loss) {
  *        print lost message
  *      } else {
  *        print that is was neither a win or a loss
  *      }
  *    }
  *  } while (the program has not been exited by user)
  * print message to user saying that game is over
    *
    *@author Moa Burke
    * 15 Oct 2023
    *
    */

    // Declare constants
    final int DICE_MIN = 1; // Minimum value of the dice
    final int DICE_MAX = 6; // Maximum value of the dice
    final int WIN_SUM = 12; // Value of the sum of the tree dice if it is a win
    final String IS_Q = "q"; // Value to control if user input is "q"
  
    // Declare variables
    boolean exitGame = false; // Flag to control if the user want to exit the game 
    boolean validInput = false; // Flag to control if the user input is valid (1,2,3 or q)
    int timesWon = 0; // Counter for the amount of times the user win
    int timesLost = 0; // Counter for the amount of times the user lose
    int diceToRoll = 0; // Variable to store the user input deciding what dice to roll (dice1, dice2 or dice3)
  
    // Create an instance of scanner class to read user input
    Scanner userInput = new Scanner(System.in);
  
    //Welcome message to user
    System.out.println("Welcome to dice game 12. You must roll 1-3 dice and try to get the sum of 12 ...");
    System.out.println(""); //Empty line
  
    // Continue looping until user decides to exit the game
    do {
      // Variables for tracking which dice is rolled
      // Will unset in the beginning of new round
      boolean isDice1Rolled = false;
      boolean isDice2Rolled = false;
      boolean isDice3Rolled = false;
  
      // Variables to store the value of each rolls dice
      // Will unset in the beginning of new round
      int dice1Value = 0;
      int dice2Value = 0;
      int dice3Value = 0;
  
      // Variable to store the sum of the three dice after each round
      // Will unset in the beginning of new round
      int sumDice = 0;
  
      // Continue looping while all dice has been not been rolled and user do not want to exit program
      while ((!isDice1Rolled || !isDice2Rolled || !isDice3Rolled) && !exitGame) {
  
        // Continue looping until user input is valid
        do {
          // Prompt user for input
          System.out.print("Enter which dice you want to roll [1,2,3](exit with q): ");
  
          // Check if user input is an integer
          if(userInput.hasNextInt()) {
            String strDiceToRoll = userInput.nextLine(); // Get user input as string
            //diceToRoll = Integer.parseInt(strDiceToRoll); // Convert string to integer 
            
            try {
            	//Attempt to convert the string 'strDiceToRoll' into an integer
            	diceToRoll = Integer.parseInt(strDiceToRoll); // Convert string to integer
        	//If the conversion fails (the string is not a valid number), handle the error
            } catch (NumberFormatException e) {
            	//Set 'diceToRoll' to a default value of 0 if the conversion is unsuccessful
            	diceToRoll = 0;
            }
            
            switch(diceToRoll) {
              case 1: // If user input is 1
                // Check if dice 1 is rolled already
                if(!isDice1Rolled) { // Dice is not rolled
                  // Randomize a value between and including 1 to 6 (DICE_MAX - DICE_MIN)
                  // Math.random() * (DICE_MAX - DICE_MIN) does exclude the DICE_MAX value, we
                  // therefore need to add 1
                  // To get a value between and including 1 to 6 (DICE_MAX - DICE_MIN), we also
                  // need to add the subtracted DICE_MIN back
                  dice1Value = (int) (Math.random() * (DICE_MAX - DICE_MIN + 1) + DICE_MIN);
                  isDice1Rolled = true; // Marks dice 1 as rolled
                  validInput = true; // Marks user input as valid
                } else { // Dice is already rolled
                  validInput = false; //Marks user input as invalid
                  System.out.println("Sorry you have already rolled that dice. Try again");
                  continue; //Skip the code below until do-while loop is over
                }
                break;
              case 2: // If user input is 2
                // Check if dice 2 is rolled already
                if(!isDice2Rolled) { // Dice is not rolled
                  // Randomize a value between and including 1 to 6 (DICE_MAX - DICE_MIN)
                  // Math.random() * (DICE_MAX - DICE_MIN) does exclude the DICE_MAX value, we
                  // therefore need to add 1
                  // To get a value between and including 1 to 6 (DICE_MAX - DICE_MIN), we also
                  // need to add the subtracted DICE_MIN back
                  dice2Value = (int) (Math.random() * (DICE_MAX - DICE_MIN + 1) + DICE_MIN);
                  isDice2Rolled = true; // Marks dice 2 as rolled
                  validInput = true; // Marks user input as valid
                } else { // Dice is already rolled
                  validInput = false; //Marks user input as invalid
                  System.out.println("Sorry you have already rolled that dice. Try again");
                  continue; //Skip the code below until do-while loop is over
                }
                break;
              case 3: // If user input is 3
                // Check if dice 3 is rolled already
                if(!isDice3Rolled) { // Dice is not rolled
                  // Randomize a value between and including 1 to 6 (DICE_MAX - DICE_MIN)
                  // Math.random() * (DICE_MAX - DICE_MIN) does exclude the DICE_MAX value, we
                  // therefore need to add 1
                  // To get a value between and including 1 to 6 (DICE_MAX - DICE_MIN), we also
                  // need to add the subtracted DICE_MIN back
                  dice3Value = (int) (Math.random() * (DICE_MAX - DICE_MIN + 1) + DICE_MIN);
                  isDice3Rolled = true; // Marks dice 3 as rolled
                  validInput = true; // Marks user input as valid
                } else { // Dice is already rolled
                  validInput = false; //Marks user input as invalid
                  System.out.println("Sorry you have already rolled that dice. Try again");
                  continue; //Skip the code below until do-while loop is over
                }
                break;
              default: // If not 1, 2 or 3
                System.out.println("Sorry, that is an invalid entry. Try again. Valid entries are 1, 2, 3 and q");
                System.out.println(""); //Empty line
                validInput = false;
                continue; //Skip the code below until do-while loop is over
            }
            
            // Calculate the sum of the dice values
            sumDice = dice1Value + dice2Value + dice3Value;

            //If all three dice are rolled decide if round was a win, loss or neither
            if(isDice1Rolled && isDice2Rolled && isDice3Rolled) {
              if(sumDice == WIN_SUM) {  //Player wins if the sum of the dice equals to WIN_SUM (12)
                timesWon++; //The win count increments by 1
              } else if(sumDice > WIN_SUM) {  //Player loses if the sum of the dice is greater than WIN_SUM (12)
                timesLost++; //The loss count increments by 1
              }
            }
              
            // Formatted string displaying the values for each dice, the sum or the three
            // dice values, times won and times lost
            System.out.printf("%d %d %d sum: %d #win: %d #loss: %d \n", dice1Value, dice2Value, dice3Value, sumDice, timesWon, timesLost);
          } else { //User input it not an integer
            String userInuptExit = userInput.nextLine(); // Get user input as string
            // Check if user input is a 'q'
            if(userInuptExit.equalsIgnoreCase(IS_Q)) {
              validInput = true; // Marks user input as valid
              exitGame = true; // The program should exit
            } else {
              validInput = false; // Marks user input as invalid
              System.out.println("Sorry, that is an invalid entry. Try again. Valid entries are 1, 2, 3 and q");
              System.out.println(""); //Empty line
            }
          }
        } while (!validInput); // Continue looping until user input is valid
      }
  
      // Control if all dice has been rolled (If not it user has decided to exit)
      if(isDice1Rolled && isDice2Rolled && isDice3Rolled) {
        // Check if its a win, loss or neither, based on the sum of the three dice
        if(sumDice == WIN_SUM) { // It is a win because sum is equal to 12
          System.out.println("You won!");
        } else if(sumDice > WIN_SUM) { // It is a loss because sum is more than 12
          System.out.println("You lost!");
        } else { // It is neither a win or loss because sum is less than 12
          System.out.println("You neither won nor lost the game.");
        }
        System.out.println(); //Empty line
        System.out.println("Next round!");
        System.out.println(""); //Empty line 
      }
    } while(!exitGame); // Continue looping until user decides to exit the game
  
    //Tell user how many times they won and how many times they lost
    System.out.println("Results:");
    System.out.printf("#win: %d \n", timesWon);
    System.out.printf("#loss: %d \n", timesLost);
    // Message to user letting them know that the game is over
    System.out.println("Game Over!");
    
  }
}