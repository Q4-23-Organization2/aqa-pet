package HomeWork_13.User;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class MainRunner {
    public static void main(String[] args) {
        // Создание списка из 10 объектов типа User
        List<User> users = new ArrayList<>();
        users.add(new User("Keanu", "Reeves", 25));
        users.add(new User("Laurence", "Fishburne", 30));
        users.add(new User("Carrie-Anne", "Moss", 17));
        users.add(new User("Hugo", "Weaving", 22));
        users.add(new User("Gloria", "Foster", 40));
        users.add(new User("Joe", "Pantoliano", 35));
        users.add(new User("Marcus", "Chong", 28));
        users.add(new User("Julian", "Arahanga", 20));
        users.add(new User("Matt", "Doran", 50));
        users.add(new User("Belinda", "McClory", 15));

        // 1. Вывод списка из 10 объектов типа User методом 'forEach'
        System.out.println("\n1. List of 10 objects of type User before sorting:"); //'/n' - это перенос строки
        users.forEach(user -> System.out.println("User: " + user.getFirstName() + " " + user.getSecondName() + ", age: " + user.getAge()));

        // 2. Сортировка списка по возрасту и запись в новую коллекцию
        System.out.println("\n2. List of 10 objects of type User after sorting:");
        List<User> usersSortedByAge = users.stream()
                .sorted(Comparator.comparingInt(User::getAge))
                .toList();
        usersSortedByAge.forEach(user -> System.out.println(user.getFirstName() + " " + user.getSecondName() + ", возраст: " + user.getAge()));

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
        System.out.println(usersWithSA ? "Есть такие пользователи." : "Таких пользователей нет.");

        // 6. Проверка, все ли пользователи старше 18 лет
        System.out.println("\n6. Все ли пользователи старше 18 лет:");
        boolean allOlderThan18 = users.stream()
                .allMatch(user -> user.getAge() > 18);
        System.out.println(allOlderThan18 ? "Все пользователи старше 18 лет." : "Есть пользователи младше 18 лет.");
    }
}
