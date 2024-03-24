package User;

class User {
    private final String firstName;
    private final String secondName;
    private final int age;

    // Конструктор для создания объекта пользователя
    public User(String firstName, String secondName, int age) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.age = age;
    }

    // Геттеры для получения значений полей пользователей
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
