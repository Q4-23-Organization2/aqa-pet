package HomeWork_11;

import java.util.Scanner;

public class HumanPlayer extends GamePlayer{

    public HumanPlayer(String playerName) {
        super(playerName);
    }

    // Метод для выбора предмета
    public void makeChoice(Scanner scanner) {
        System.out.println(playerName + ", введите ваш выбор (ROCK, PAPER, SCISSORS):");
        String input = scanner.nextLine().toUpperCase();

        try {
            gameItemsChoice = GameItems.valueOf(input);
        } catch (IllegalArgumentException e) {
            System.out.println("Неправильный выбор. Пожалуйста, выберите ROCK, PAPER или SCISSORS.");
            // Рекурсивный вызов метода makeChoice, пока не будет сделан правильный выбор
            makeChoice(scanner);
        }
    }
}
