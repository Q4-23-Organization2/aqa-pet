package HomeWork_11;

import java.util.Scanner;

public class RPSGame {
    // Главный класс игры
    public static class RockPaperScissorsGame {
        private final int MIN_PLAYERS = 2;
        private final int MAX_PLAYERS = 6;
        private final GamePlayer[] gamePlayers;

        public RockPaperScissorsGame(int numPlayers) {
            if (numPlayers < MIN_PLAYERS || numPlayers > MAX_PLAYERS) {
                throw new IllegalArgumentException("Недопустимое количество игроков.");
            }

            gamePlayers = new GamePlayer[numPlayers];
            for (int i = 0; i < numPlayers; i++) {
                gamePlayers[i] = new GamePlayer(i + 1);
            }
        }

        // Метод для запуска игры
        public void play() {
            Scanner scanner = new Scanner(System.in);

            while (true) {
                // Сбор выборов от каждого игрока
                for (GamePlayer player : gamePlayers) {
                    GameItems gameItemChoice;
                    while (true) {
                        System.out.print("Игрок " + player.gameItemId() + ", выберите предмет (камень, ножницы, бумага): ");
                        String input = scanner.nextLine().toUpperCase();

                        try {
                            gameItemChoice = GameItems.valueOf(input);
                            break;
                        } catch (IllegalArgumentException e) {
                            System.out.println("Неправильный выбор. Попробуйте еще раз.");
                        }
                    }
                    player.(gameItemChoice);
                }

                // Проверка на ничью
                if (isDraw()) {
                    System.out.println("Ничья! Все игроки сделали одинаковый выбор. Переигрываем.");
                    continue;
                }

                // Проверка на ничью, если игроков больше 2 и выбраны все три разных предмета
                if (gamePlayers.length > 2 && isDrawForMoreThanTwoPlayers()) {
                    System.out.println("Ничья! Все игроки выбрали разные предметы. Переигрываем.");
                    continue;
                }

                // Определение победителя
                gamePlayers winner = determineWinner();
                System.out.println("Игрок " + winner.gameItemId() + " побеждает!");
                break;
            }

            scanner.close();
        }

        // Метод для определения ничьей, если у всех игроков совпал выбор
        private boolean isDraw() {
            GameItems gameItemFirstChoice = gamePlayers[0].gameItemChoice();
            for (int i = 1; i < gamePlayers.length; i++) {
                if (gamePlayers[i].gameItemChoice() != gameItemFirstChoice) {
                    return false;
                }
            }
            return true;
        }

        // Метод для определения ничьей, если игроков больше 2 и выбраны все три разных предмета
        private boolean isDrawForMoreThanTwoPlayers() {
            boolean[] chosen = new boolean[3];
            for (GamePlayer player : gamePlayers) {
                int choiceIndex = player.gameItemChoice().ordinal();
                if (!chosen[choiceIndex]) {
                    chosen[choiceIndex] = true;
                }
            }
            return chosen[0] && chosen[1] && chosen[2];
        }

        // Метод для определения победителя
        private GamePlayer determineWinner() {
            GamePlayer winner = gamePlayers[0];
            for (int i = 1; i < gamePlayers.length; i++) {
                if (beats(gamePlayers[i].getGameItemChoice(), winner.getGameItemChoice())) {
                    winner = gamePlayers[i];
                }
            }
            return winner;
        }

        // Метод, определяющий, выигрывает ли один предмет у другого
        private boolean beats(GameItems item1, GameItems item2) {
            return (item1 == GameItems.ROCK && item2 == GameItems.SCISSORS) ||
                    (item1 == GameItems.PAPER && item2 == GameItems.ROCK) ||
                    (item1 == GameItems.SCISSORS && item2 == GameItems.PAPER);
        }
    }
}
