import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {

        // Creating a scanner to read user input
        Scanner scanner = new Scanner(System.in);

        // Run the program run while the user wants to
        while (true) {
            // Declaring a list of possible moves for the computer
            String[] rps = {"r", "p", "s"};

            // Generating a random move for the computer
            String computerMove = rps[new Random().nextInt(rps.length)];

            // Declaring a variable to store the player's move
            String playerMove;

            // Validation loop to check the player's input
            while (true){
                // Prompting the player to enter their move
                System.out.println("Please enter your move (r, p ,s)");

                // Storing the player's move
                playerMove = scanner.nextLine();


                // Checking if the player's move is valid and breaking out of the loop
                if (playerMove.equals("r") || playerMove.equals("s") || playerMove.equals("p")) {
                    break;                
                }

                // If the player's move is not valid, print an error message
                System.out.println(playerMove + " is not a valid move.");
            }

            // Printing the computer's move
            System.out.println("Computer played: " + computerMove);

            // Determining the winner of the game
            if (playerMove.equals(computerMove)) {
                System.out.println("Game is a tie");
            }
            else if (playerMove.equals("r")) {
                if (computerMove.equals("p")) {
                    System.out.println("Sorry, you lose!"); 
                }
                else if (computerMove.equals("s")) {
                    System.out.println("Yah, you win!");
                }
            }
            else if (playerMove.equals("p")) {
                if (computerMove.equals("s")) {
                    System.out.println("Sorry, you lose!"); 
                }
                else if (computerMove.equals("r")) {
                    System.out.println("Yah, you win!");
                }
            }
            else {
                if (computerMove.equals("r")) {
                    System.out.println("Sorry, you lose!"); 
                }
                else if (computerMove.equals("p")) {
                    System.out.println("Yah, you win!");
                }
            }
            
            System.out.println();

            // Prompting the player if they want to play again
            System.out.println("Do you want to play again? (y/n)");
            String playAgain = scanner.nextLine();
            
            // Checking if the player wants to play again
            if (!playAgain.equals("y")) {
                break;
            }

            System.out.println();
        }

        // Closing the scannerp
        scanner.close();
    
    }
        
}
