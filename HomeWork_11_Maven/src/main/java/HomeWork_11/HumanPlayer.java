package HomeWork_11;

<<<<<<< HEAD
import java.util.Scanner;

public class HumanPlayer extends GamePlayer {       //Класс наследования
=======

>>>>>>> 5b0be71c0a15ceb3016f571f62fefb9d0c05c091
    public HumanPlayer(String playerName) {
        super(playerName);
    }

    public void makeChoice(Scanner scanner) {
<<<<<<< HEAD
        System.out.println("Player " + playerName + " make your choice from the three proposed options (ROCK, PAPER, SCISSORS):");
=======

>>>>>>> 5b0be71c0a15ceb3016f571f62fefb9d0c05c091
        String input = scanner.nextLine().toUpperCase();    //Предлагаем сделать выбор из enum констант
        //toUpperCase() - Преобразуем в верхний регистр, чтоб константа не чувствовала дискомфорт при вводе

        try {
            gameItemsChoice = GameItems.valueOf(input);
        } catch (IllegalArgumentException e) {
<<<<<<< HEAD
            System.out.println("Incorrect choice. Please, choose ROCK, PAPER or SCISSORS.");
            makeChoice(scanner);
        }   // При помощи конструкции (try - catch) просим ввести корректное значение
=======
При помощи конструкции (try - catch) просим ввести корректное значение
>>>>>>> 5b0be71c0a15ceb3016f571f62fefb9d0c05c091
    }
}
