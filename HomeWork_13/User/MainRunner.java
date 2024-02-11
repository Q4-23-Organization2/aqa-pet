package HomeWork_13.User;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class MainRunner {
    public static void main(String[] args) {
        // Создание списка из 10 объектов типа User
        List<User> users = new ArrayList<>();
        users.add(new User("John", "Smith", 25));
        users.add(new User("Alice", "Johnson", 30));
        users.add(new User("Bob", "Jones", 17));
        users.add(new User("Charlie", "Adams", 22));
        users.add(new User("Emma", "Brown", 40));
        users.add(new User("Sarah", "Simpson", 35));
        users.add(new User("David", "Anderson", 28));
        users.add(new User("Olivia", "Scott", 20));
        users.add(new User("Michael", "Allen", 50));
        users.add(new User("Sophia", "White", 15));

        // 1. Вывод списка из 10 объектов типа User
        System.out.println("1. Список из 10 объектов типа User:");
        users.forEach(user -> System.out.println(user.getFirstName() + " " + user.getSecondName() + ", возраст: " + user.getAge()));

        // 2. Сортировка списка по возрасту и запись в новую коллекцию
        System.out.println("\n2. Сортировка по возрасту:");
        List<User> sortedByAge = users.stream()
                .sorted(Comparator.comparingInt(User::getAge))
                .toList();
        sortedByAge.forEach(user -> System.out.println(user.getFirstName() + " " + user.getSecondName() + ", возраст: " + user.getAge()));

        // 3. Подсчет среднего возраста пользователей
        System.out.println("\n3. Средний возраст пользователей:");
        double averageAge = users.stream()
                .mapToDouble(User::getAge)
                .average()
                .orElse(0);
        System.out.println("Средний возраст: " + averageAge);

        // 4. Сортировка списка по нескольким свойствам: firstName и age
        System.out.println("\n4. Сортировка по имени и возрасту:");
        List<User> sortedByNameAndAge = users.stream()
                .sorted(Comparator.comparing(User::getFirstName).thenComparing(User::getAge))
                .toList();
        sortedByNameAndAge.forEach(user -> System.out.println(user.getFirstName() + " " + user.getSecondName() + ", возраст: " + user.getAge()));

        // 5. Проверка наличия пользователей с фамилией, начинающейся с "S" или "A"
        System.out.println("\n5. Пользователи с фамилией, начинающейся с 'S' или 'A':");
        boolean usersWithSA = users.stream()
                .anyMatch(user -> user.getSecondName().startsWith("S") || user.getSecondName().startsWith("A"));
        if (usersWithSA) {
            users.stream()
                    .filter(user -> user.getSecondName().startsWith("S") || user.getSecondName().startsWith("A"))
                    .map(user -> user.getFirstName() + " " + user.getSecondName())
                    .forEach(System.out::println);
        } else {
            System.out.println("Таких пользователей нет.");
        }

        // 6. Проверка, все ли пользователи старше 18 лет, вывод пользователей младше 18 лет и их возраст
        System.out.println("\n6. Пользователи  не старше 18 лет и их возраст:");
        boolean anyYoungerThan18 = users.stream()
                .filter(user -> user.getAge() <= 18)
                .peek(user -> System.out.println(user.getFirstName() + " " + user.getSecondName() + ", возраст: " + user.getAge()))
                .count() > 0;

        if (!anyYoungerThan18) {
            System.out.println("Таких пользователей нет.");
        }
    }
}
