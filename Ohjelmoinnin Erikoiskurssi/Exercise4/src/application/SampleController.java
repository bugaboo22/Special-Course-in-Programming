package application;

import javafx.event.ActionEvent;
import java.util.Random;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.MenuItem;


public class SampleController {
	
	@FXML private MenuItem OneWin, ThreeWins, FiveWins;

	@FXML private Button Paper, Rock, Sciccors;
	
	@FXML private Label Player, Computer, result;
	
	private int playerWins = 0;
    private int computerWins = 0;
    private int winsRequired = 0;
    private boolean gameStarted = false;
    private Random random = new Random();
    
    @FXML
    public void selectWinsRequired(ActionEvent event) {
        if (gameStarted) {
            // Check if the current game is already going.
            result.setText("Please finish the current game.");
        } else {
            // Choosing length of the game
            MenuItem selectedMenuItem = (MenuItem) event.getSource();
            switch (selectedMenuItem.getId()) {
                case "OneWin":
                    winsRequired = 1;
                    break;
                case "ThreeWins":
                    winsRequired = 3;
                    break;
                case "FiveWins":
                    winsRequired = 5;
                    break;
            }
            resetGame(); // Resets the game after choosing how many games
        }
    }

    private void resetGame() {
        playerWins = 0;
        computerWins = 0;
        updateLabels();
        disableGameButtons(false); // Activates player buttons after choosing length of the game
    }

    // Method, that handles the chooses of the player.
    @FXML
    void handlePlayerChoice(ActionEvent event) {
        if (winsRequired == 0) {
            result.setText("Please select the number of wins first.");
            return;
        }

        gameStarted = true;

        Button selectedButton = (Button) event.getSource();
        //selectedButton.setStyle("-fx-background-color: #ff0000; ");
        String playerChoice = selectedButton.getId(); // "Paper", "Rock", or "Scissors"
        String computerChoice = generateComputerChoice();
        determineWinner(playerChoice, computerChoice);
        updateLabels();
    }
    
    private String generateComputerChoice() {
        String[] choices = {"Paper", "Rock", "Sciccors"};
        int index = random.nextInt(choices.length);
        return choices[index];
    }

    void determineWinner(String player, String computer) {
        if (player.equals(computer)) {
            result.setText("It's a draw!");
        } else if ((player.equals("Rock") && computer.equals("Scissors")) ||
                   (player.equals("Scissors") && computer.equals("Paper")) ||
                   (player.equals("Paper") && computer.equals("Rock"))) {
            playerWins++;
            result.setText("You won!");
        } else {
            computerWins++;
            result.setText("You lost!");
        }

        // Checks if the game has ended
        if (playerWins >= winsRequired || computerWins >= winsRequired) {
            gameStarted = false; // Game ends
            disableGameButtons(true); // Deactivates the buttons after the game
            String winnerMessage = playerWins >= winsRequired ? "Congratulations! You've won the game." : "Game over! The computer wins the game.";
            result.setText(winnerMessage);
        } else {
            updateLabels(); // Updates wins only if the game continues
        }
    }

    // Update score to labels for player and computer
    void updateLabels() {
        Player.setText(String.valueOf(playerWins));
        Computer.setText(String.valueOf(computerWins));
    }
    
    // Disables the game buttons if the length of the game has not been chosen
    void disableGameButtons(boolean disable) {
        Paper.setDisable(disable);
        Rock.setDisable(disable);
        Sciccors.setDisable(disable);
    }
	    
}
