package HomeWork_11;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;

import java.util.Scanner;

public class HumanPlayer extends GamePlayer {       //Класс наследования
    private static final Logger logger = (Logger) LogManager.getLogger(HumanPlayer.class);
    public HumanPlayer(String playerName) {
        super(playerName);
    }

    public void makeChoice(Scanner scanner) {
        logger.info("Player {} make your choice from the three proposed options (ROCK, PAPER, SCISSORS):", playerName);
        String input = scanner.nextLine().toUpperCase();    //Предлагаем сделать выбор из enum констант
        //toUpperCase() - Преобразуем в верхний регистр, чтоб константа не чувствовала дискомфорт при вводе

        try {
            gameItemsChoice = GameItems.valueOf(input);
        } catch (IllegalArgumentException e) {
            logger.error("Incorrect choice. Please, choose ROCK, PAPER or SCISSORS.");
            makeChoice(scanner);
        }   // При помощи конструкции (try - catch) просим ввести корректное значение
    }
}
