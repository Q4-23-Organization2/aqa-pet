package HomeWork_11;


//класс для игроков
class GamePlayer {
    protected String playerName;
    protected GameItems gameItemsChoice;    // Поле, содержащее enum

    public String getPlayerName() {
        return playerName;
    }

    public GameItems getGameItemsChoice() {
        return gameItemsChoice;
    }

    public GamePlayer(String playerName) {
        this.playerName = playerName;
    }
}