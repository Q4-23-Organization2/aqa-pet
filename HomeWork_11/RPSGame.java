package HomeWork_11;

import java.util.Scanner;

abstract class RPSGame {
    private final int MIN_COUNT_PLAYERS = 2;
    private final int MAX_COUNT_PLAYERS = 6;
    private GamePlayer[] gamePlayers;

    public RPSGame(int playersCount) {
        if (playersCount < MIN_COUNT_PLAYERS || playersCount > MAX_COUNT_PLAYERS) {
            throw new IllegalArgumentException("Invalid number of players entered!");
        }

        gamePlayers = new GamePlayer[playersCount];
        for (int i = 0; i < playersCount; i++) {
            gamePlayers[i] = new GamePlayer(i + 1);
        }
    }

    public void playGame() {
        Scanner scanner = new Scanner()
    }
}

