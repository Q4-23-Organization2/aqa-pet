package HomeWork_11;

import java.util.Scanner;

// Класс игрока
public class RPSGame {
    public void startGame() {
       Scanner scanner = new Scanner(System.in);
        int countOfPlayers = 0;
        while (countOfPlayers != 2 && countOfPlayers != 3) {    //В цикле проверяем на правильное число из диапазона
            //с помощью '' .
            System.out.println("Incorrect value! Please enter the correct value.");
            try {
                System.out.println("Enter the count of players (2 or 3):");
                countOfPlayers = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("The number cannot be non-integer!");
            }
        }

        GamePlayer[] gamePlayers = new GamePlayer[countOfPlayers];
        for (int i = 0; i < countOfPlayers; i++) {
            System.out.println("Enter player name " + (i + 1) + ":");
            String name = scanner.nextLine();
            gamePlayers[i] = new HumanPlayer(name);
        }

        for (GamePlayer gamePlayer : gamePlayers) {
            ((HumanPlayer) gamePlayer).makeChoice(scanner);
        }

        determineWinner(gamePlayers, scanner);

        scanner.close();
    }

    private void determineWinner(GamePlayer[] gamePlayers, Scanner scanner) {
        boolean allEqual = true;
        GameItems firstChoice = gamePlayers[0].getGameItemsChoice();
        for (int i = 1; i < gamePlayers.length; i++) {
            if (gamePlayers[i].getGameItemsChoice() != firstChoice) {
                allEqual = false;
                break;
            }
        }

        if (allEqual) {
            System.out.println("Draw! Let's play again.");

            // Повторный выбор предметов
            for (GamePlayer gamePlayer : gamePlayers) {
                ((HumanPlayer) gamePlayer).makeChoice(scanner);
            }

            // Рекурсивный вызов определения победителя
            determineWinner(gamePlayers, scanner);
            return;
        }

        if (gamePlayers.length == 2) {
            GameItems choice1 = gamePlayers[0].getGameItemsChoice();
            GameItems choice2 = gamePlayers[1].getGameItemsChoice();
            if ((choice1 == GameItems.ROCK && choice2 == GameItems.SCISSORS) ||
                    (choice1 == GameItems.PAPER && choice2 == GameItems.ROCK) ||
                    (choice1 == GameItems.SCISSORS && choice2 == GameItems.PAPER)) {
                System.out.println(gamePlayers[0].getPlayerName() + " won!");
            } else {
                System.out.println(gamePlayers[1].getPlayerName() + " won!");
            }
        }

        if (gamePlayers.length == 3) {
            GameItems choice1 = gamePlayers[0].getGameItemsChoice();
            GameItems choice2 = gamePlayers[1].getGameItemsChoice();
            GameItems choice3 = gamePlayers[2].getGameItemsChoice();

            if (choice1 == choice2 && choice1 != choice3) {
                System.out.println(gamePlayers[0].getPlayerName() + " & " + gamePlayers[1].getPlayerName() + " won!");
            } else if (choice1 == choice3 && choice1 != choice2) {
                System.out.println(gamePlayers[0].getPlayerName() + " & " + gamePlayers[2].getPlayerName() + " won!");
            } else if (choice2 == choice3 && choice2 != choice1) {
                System.out.println(gamePlayers[1].getPlayerName() + " & " + gamePlayers[2].getPlayerName() + " won!");
            } else {
                System.out.println("Draw! Let's play again.");
                // Повторный выбор предметов
                for (GamePlayer gamePlayer : gamePlayers) {
                    ((HumanPlayer) gamePlayer).makeChoice(scanner);
                }

                // Рекурсивный вызов определения победителя
                determineWinner(gamePlayers, scanner);
            }
        }
    }
    }