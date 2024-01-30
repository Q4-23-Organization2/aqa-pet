package HomeWork_11;

class GamePlayer {
    private int gameItemId;
    private GameItems gameItemChoice;

    public GamePlayer(int gameItemId) {
        this.gameItemId = gameItemId;
    }

    public GamePlayer(GameItems gameItemChoice) {
        this.gameItemChoice = gameItemChoice;
    }

    public GamePlayer(int gameItemId, GameItems gameItemChoice) {
        this.gameItemId = gameItemId;
        this.gameItemChoice = gameItemChoice;
    }

    public void setGameItemId(int gameItemId) {
        this.gameItemId = gameItemId;
    }

    public void setGameItemChoice(GameItems gameItemChoice) {
        this.gameItemChoice = gameItemChoice;
    }

    public int getGameItemId() {
        return gameItemId;
    }

    public GameItems getGameItemChoice() {
        return gameItemChoice;
    }
}
