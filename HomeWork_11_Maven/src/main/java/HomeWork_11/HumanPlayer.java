package HomeWork_11;


    public HumanPlayer(String playerName) {
        super(playerName);
    }

    public void makeChoice(Scanner scanner) {

        String input = scanner.nextLine().toUpperCase();    //Предлагаем сделать выбор из enum констант
        //toUpperCase() - Преобразуем в верхний регистр, чтоб константа не чувствовала дискомфорт при вводе

        try {
            gameItemsChoice = GameItems.valueOf(input);
        } catch (IllegalArgumentException e) {
При помощи конструкции (try - catch) просим ввести корректное значение
    }
}
