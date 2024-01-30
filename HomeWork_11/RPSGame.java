package HomeWork_11;

import java.util.Scanner;

public class RPSGame {
    private final int MIN_PLAYERS = 2;
    private final int MAX_PLAYERS = 6;
    private Player[] players;

    // Вставил проверку на количество игорков в конструктор, используя константы.
    public RPSGame(int numPlayers) {
        if (numPlayers < MIN_PLAYERS || numPlayers > MAX_PLAYERS) {
            throw new IllegalArgumentException("The number of players does not correspond to the rules of the game!");
        }

        // Создание массива игроков
        players = new Player[numPlayers];
        // Инициализация игроков
        for (int i = 0; i < numPlayers; i++) {
            players[i] = new Player(i + 1);
        }
    }

    // Метод для запуска игры
    public void play() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            // Сбор выборов от каждого игрока
            for (Player player : players) {
                GameItems choice;
                // Запрашиваем у игрока выбор предмета
                while (true) {
                    System.out.print("Игрок " + player.getId() + ", выберите предмет (камень, ножницы, бумага): ");
                    String input = scanner.nextLine().toUpperCase();

                    try {
                        choice = GameItems.valueOf(input);
                        break;
                    } catch (IllegalArgumentException e) {
                        System.out.println("Неправильный выбор. Попробуйте еще раз.");
                    }
                }
                // Устанавливаем выбор игрока
                player.setChoice(choice);
            }

            // Проверка на ничью
            if (isDraw()) {
                System.out.println("Ничья! Все игроки сделали одинаковый выбор. Переигрываем.");
                continue;
            }

            // Проверка на ничью, если игроков больше 2 и выбраны все три разных предмета
            if (players.length > 2 && isDrawForMoreThanTwoPlayers()) {
                System.out.println("Ничья! Все игроки выбрали разные предметы. Переигрываем.");
                continue;
            }

            // Определение победителя
            Player winner = determineWinner();
            System.out.println("Игрок " + winner.getId() + " побеждает!");
            break;
        }

        scanner.close();
    }

    // Метод для определения ничьей, если у всех игроков совпал выбор
    private boolean isDraw() {
        GameItems firstChoice = players[0].getChoice();
        for (int i = 1; i < players.length; i++) {
            if (players[i].getChoice() != firstChoice) {
                return false;
            }
        }
        return true;
    }

    // Метод для определения ничьей, если игроков больше 2 и выбраны все три разных предмета
    private boolean isDrawForMoreThanTwoPlayers() {
        boolean[] chosen = new boolean[3];
        for (Player player : players) {
            int choiceIndex = player.getChoice().ordinal();
            if (!chosen[choiceIndex]) {
                chosen[choiceIndex] = true;
            }
        }
        return chosen[0] && chosen[1] && chosen[2];
    }

    // Метод для определения победителя
    private Player determineWinner() {
        Player winner = players[0];
        for (int i = 1; i < players.length; i++) {
            if (beats(players[i].getChoice(), winner.getChoice())) {
                winner = players[i];
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

    // Метод, который должны реализовать наследники для начала игры
    public abstract void start();

    // Внутренний класс игрока
    static class Player {
        private final int id;
        private GameItems choice;

        // Конструктор
        public Player(int id) {
            this.id = id;
        }

        // Геттеры и сеттеры
        public int getId() {
            return id;
        }

        public GameItems getChoice() {
            return choice;
        }

        public void setChoice(GameItems choice) {
            this.choice = choice;
        }
    }
}
