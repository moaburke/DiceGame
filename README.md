# Dice Game 12

This is a console-based dice game written in Java. The objective of the game is to roll 1-3 dice and try to achieve a sum of 12. Players can choose which dice to roll, and the game keeps track of wins and losses.

## Features

- Roll dice 1, 2, and 3 dice at a time.
- Try to achieve a sum of 12 to win.
- Input validation to handle invalid entries.
- Game statistics display the number of wins and losses.

## How to Play

1. **Start the Game**: Upon starting, you'll be prompted to roll 1, 2, or 3 dice, or exit the game.
2. **Input Choices**:
   - Enter `1` to roll the first dice.
   - Enter `2` to roll the second dice.
   - Enter `3` to roll the third dice.
   - Enter `q` to quit the game.
3. **Win or Lose**: If the sum of the rolled dice equals 12, you win. If the sum is more than 12, you lose.
4. **Game Results**: After each round, the game will display the dice values, sum, and the current win/loss count.
5. **Exit the Game**: To quit the game, enter `q` at any prompt.

## Example

Welcome to dice game 12. You must roll 1-3 dice and try to get the sum of 12 ...

Enter which dice you want to roll [1,2,3](exit with q): 1  
4 0 0 sum: 4 #win: 0 #loss: 0   
Enter which dice you want to roll [1,2,3](exit with q): 2  
4 3 0 sum: 7 #win: 0 #loss: 0   
Enter which dice you want to roll [1,2,3](exit with q): 3  
4 3 6 sum: 13 #win: 0 #loss: 1   
You lost!  

Next round!

Enter which dice you want to roll [1,2,3](exit with q): 3  
0 0 6 sum: 6 #win: 0 #loss: 1  
Enter which dice you want to roll [1,2,3](exit with q): 2  
0 2 6 sum: 8 #win: 0 #loss: 1  
Enter which dice you want to roll [1,2,3](exit with q): 1  
2 2 6 sum: 10 #win: 0 #loss: 1  
You neither won nor lost the game.  

Next round!

Enter which dice you want to roll [1,2,3](exit with q): q  
Results:  
#win: 0  
#loss: 1  
Game Over!

## How to Run

1. **Clone the Repository**: `git clone https://github.com/moaburke/dice-game-12.git`
2. **Compile the Code**: Use `javac Main.java` to compile.
3. **Run the Program**: Execute the program using `java Main`.
