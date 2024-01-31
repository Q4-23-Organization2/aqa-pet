package HomeWork_11;

import java.util.Scanner;

public class GameRunner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        RPSGame game = new RPSGame();
        game.startGame(scanner);
    }
}
