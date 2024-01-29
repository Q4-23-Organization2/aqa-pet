package HomeWork_11;

abstract class RPSGame {
    private final int MIN_COUNT_PLAYERS = 2;
    private final int MAX_COUNT_PLAYERS = 6;

    public RPSGame(int playersCount) {
        if (playersCount < MIN_COUNT_PLAYERS || playersCount > MAX_COUNT_PLAYERS) {
            throw new IllegalArgumentException("Invalid number of players entered!");
        }
    }
}
