package HomeWork_11;

import java.util.Scanner;

public class GameRunner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        RPSGame game = new RPSGame();

        // Цикл для повторения игры по желанию игроков
        while (true) {
            game.startGame(scanner); // Запуск игры
            System.out.println("Хотите сыграть еще раз? (да/нет)");
            String playAgain = scanner.nextLine().toLowerCase();
            if (!playAgain.equals("да")) {
                break; // Если игроки не хотят играть снова, выходим из цикла
            }
        }

        scanner.close(); // Закрываем Scanner
    }
}
