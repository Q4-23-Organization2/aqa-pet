package HomeWork_11;


//класс для игроков
class GamePlayer {
    protected String playerName;
    protected GameItems gameItemsChoice;

    public GamePlayer() {

    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public void setChoice(GameItems choice) {
        this.gameItemsChoice = choice;
    }

    public GameItems getGameItemsChoice() {
        return gameItemsChoice;
    }

    public GamePlayer(String playerName) {
        this.playerName = playerName;
    }

    public GamePlayer(GameItems choice) {
        this.gameItemsChoice = choice;
    }

    public GamePlayer(String playerName, GameItems choice) {
        this.playerName = playerName;
        this.gameItemsChoice = choice;
    }
}
