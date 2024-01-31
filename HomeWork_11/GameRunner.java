package HomeWork_11;

import java.util.Scanner;

public class GameRunner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Создаем экземпляр класса GamePlayer для запуска игры
        while (true) {
            RPSGame gameRockScissorsPaper = new RPSGame();
            gameRockScissorsPaper.startGame();
        }
    }
}