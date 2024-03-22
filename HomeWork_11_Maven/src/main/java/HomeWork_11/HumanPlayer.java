package HomeWork_11;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.Scanner;

public class HumanPlayer extends GamePlayer {
    private static final Logger logger = LogManager.getLogger(HumanPlayer.class);

    public HumanPlayer(String playerName) {
        super(playerName);
    }

    public void makeChoice(Scanner scanner) {
        logger.info("Player {} make your choice from the three proposed options (ROCK, PAPER, SCISSORS):", playerName);
        String input = scanner.nextLine().toUpperCase();

        try {
            gameItemsChoice = GameItems.valueOf(input);
        } catch (IllegalArgumentException e) {
            logger.error("Incorrect choice. Please, choose ROCK, PAPER or SCISSORS.");
            makeChoice(scanner);
        }
    }
}