package HomeWork_11;

import java.util.Scanner;

public class HumanPlayer extends GamePlayer {       //Класс наследования
    public HumanPlayer(String playerName) {
        super(playerName);
    }

    public void makeChoice(Scanner scanner) {
        System.out.println("Player " + playerName + " make your choice from the three proposed options (ROCK, PAPER, SCISSORS):");
        String input = scanner.nextLine().toUpperCase();    //Предлагаем сделать выбор из enum констант
        //toUpperCase() - Преобразуем в верхний регистр, чтоб константа не чувствовала дискомфорт при вводе

        try {
            gameItemsChoice = GameItems.valueOf(input);
        } catch (IllegalArgumentException e) {
            System.out.println("Incorrect choice. Please, choose ROCK, PAPER or SCISSORS.");
            makeChoice(scanner);
        }   // При помощи конструкции (try - catch) просим ввести корректное значение
    }
}
