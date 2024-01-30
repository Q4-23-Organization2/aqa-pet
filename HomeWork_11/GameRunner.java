package HomeWork_11;

import java.util.Scanner;

public class GameRunner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество игроков (от 2 до 6): ");
        int numPlayers = scanner.nextInt();
        scanner.nextLine();

        RPSGame.RockPaperScissorsGame game = new RPSGame.RockPaperScissorsGame(numPlayers);
        game.play();
    }
}
