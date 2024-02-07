# Rock, Paper, Scissors Game

## Overview

This Java program allows you to play the classic Rock, Paper, Scissors game against a computer opponent. The game continues until the player decides not to play anymore.

## How to Play

1. Run the program.
2. Enter your move by typing 'r' for Rock, 'p' for Paper, or 's' for Scissors.
3. The computer will randomly generate its move.
4. The winner of the round will be determined based on the game rules:
   - Rock crushes Scissors (Rock wins against Scissors)
   - Scissors cuts Paper (Scissors wins against Paper)
   - Paper covers Rock (Paper wins against Rock)
   - If both the player and the computer choose the same move, the game is a tie.

## Example Gameplay

```
Please enter your move (r, p, s): p
Computer played: r
Yah, you win!

Do you want to play again? (y/n) y

Please enter your move (r, p, s): s
Computer played: s
Game is a tie

Do you want to play again? (y/n) n
```

## Notes

- The program ensures that the player's input is valid (either 'r', 'p', or 's').
- After each round, the player is prompted to play again. Entering 'y' will start a new round while entering 'n' will exit the game.
- The game loop continues until the player decides not to play anymore.

Feel free to enjoy the game, and if you have any questions or encounter issues, please reach out to the author. Have fun playing Rock, Paper, Scissors!
