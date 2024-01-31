package HomeWork_11;


//класс для игроков
class GamePlayer {
    protected String playerName;
    protected GameItems choice;

    public GamePlayer() {

    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public GameItems getChoice() {
        return choice;
    }

    public void setChoice(GameItems choice) {
        this.choice = choice;
    }

    public GamePlayer(String playerName) {
        this.playerName = playerName;
    }

    public GamePlayer(GameItems choice) {
        this.choice = choice;
    }

    public GamePlayer(String playerName, GameItems choice) {
        this.playerName = playerName;
        this.choice = choice;
    }

    public void startGame() {
    }
}
