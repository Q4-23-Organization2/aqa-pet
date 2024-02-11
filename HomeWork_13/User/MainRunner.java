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
    }
}
