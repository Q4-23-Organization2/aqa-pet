package HomeWork_11;

import java.util.Scanner;

public class RPSGame {
    public void startGame() {
        Scanner scanner = new Scanner(System.in);
        int countOfPlayers = 0;
        boolean isDraw = false;

        // Цикл do-while для запроса количества игроков (2 или 3)
        do {
            try {
                System.out.println("Enter the count of players (2 or 3):");
                countOfPlayers = Integer.parseInt(scanner.nextLine());

                if (countOfPlayers < 2 || countOfPlayers > 3) {
                    System.out.println("Incorrect value! Please enter 2 or 3.");
                    //Тут проверка не неверное количество игроков с сообщением.
                }
            } catch (NumberFormatException e) {
                System.out.println("The number cannot be non-integer!");
                //Тут проверка не нецелое число при помощи (try -catch) с сообщением.
            }
        } while (countOfPlayers != 2 && countOfPlayers != 3);

        GamePlayer[] gamePlayers = new GamePlayer[countOfPlayers];

        // Цикл do-while для игры и определения победителя или ничьи
        do {
            // Ввод имен игроков
            for (int i = 0; i < countOfPlayers; i++) {
                if (!isDraw) {
                    // Если была ничья, то не делается повторный запрос имён игроков, а сразу переходит к повторным выборам предметов.
                    System.out.println("Enter player name " + (i + 1) + ":");
                    String name = scanner.nextLine();
                    gamePlayers[i] = new HumanPlayer(name);
                }
            }

            // Выбор предмета каждым игроком в цикле (for each)
            for (GamePlayer gamePlayer : gamePlayers) {
                ((HumanPlayer) gamePlayer).makeChoice(scanner);
            }

            // Проверка на ничью, с помощью boolean-поля (isDraw)
            isDraw = true;
            for (int i = 1; i < gamePlayers.length; i++) {
                if (gamePlayers[i].getGameItemsChoice() != gamePlayers[0].getGameItemsChoice()) {
                    isDraw = false;
                    break;
                }
            }

            if (isDraw) {
                System.out.println("Draw! Let's play again.");
            }
        } while (isDraw);

        // Вызов метода (gameWinner) для пределение победителя
        gameWinner(gamePlayers);
        scanner.close();
    }

    // Метод для определения победителя
    private void gameWinner(GamePlayer[] gamePlayers) {
        if (gamePlayers.length == 2) {      //Определение победителя, если игроков 2 при помощи массива
            GameItems choice1 = gamePlayers[0].getGameItemsChoice();
            GameItems choice2 = gamePlayers[1].getGameItemsChoice();
            if ((choice1 == GameItems.ROCK && choice2 == GameItems.SCISSORS) ||
                    (choice1 == GameItems.PAPER && choice2 == GameItems.ROCK) ||
                    (choice1 == GameItems.SCISSORS && choice2 == GameItems.PAPER)) {
                System.out.println("Player " + gamePlayers[0].getPlayerName() + " won!");
            } else {
                System.out.println("Player " + gamePlayers[1].getPlayerName() + " won!");
            }
        }

        if (gamePlayers.length == 3) {      //Определение победителя, если игроков 3 при помощи массива
            GameItems choice1 = gamePlayers[0].getGameItemsChoice();
            GameItems choice2 = gamePlayers[1].getGameItemsChoice();
            GameItems choice3 = gamePlayers[2].getGameItemsChoice();
            if (choice1 == choice2 && choice1 != choice3) {
                System.out.println("Players " + gamePlayers[0].getPlayerName() + " & " + gamePlayers[1].getPlayerName() + " won!");
            } else if (choice1 == choice3 && choice1 != choice2) {
                System.out.println("Players " + gamePlayers[0].getPlayerName() + " & " + gamePlayers[2].getPlayerName() + " won!");
            } else if (choice2 == choice3 && choice2 != choice1) {
                System.out.println("Players " + gamePlayers[1].getPlayerName() + " & " + gamePlayers[2].getPlayerName() + " won!");
            } else {
                System.out.println("Draw! Let's play again.");      //Ничья, если все игроки сделали одинаковый выбор.
            }
        }
    }
}