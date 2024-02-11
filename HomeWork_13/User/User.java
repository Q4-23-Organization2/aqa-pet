package HomeWork_13.User;

class User {
    private String firstName;
    private String secondName;
    private int age;

    // Конструктор для создания объекта пользователя
    public User(String firstName, String secondName, int age) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.age = age;
    }

    // Геттеры для получения значений полей
    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public int getAge() {
        return age;
    }
}
