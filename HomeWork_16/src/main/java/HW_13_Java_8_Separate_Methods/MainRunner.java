package HW_13_Java_8_Separate_Methods;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class MainRunner {
    public static void main(String[] args) {
        List<User> users = createUserList();

        sortUsersByAge(users);
        calculateAverageAge(users);
        sortUsersByNameAndAge(users);
        checkUsersWithSorA(users);
        checkAllUsersOlderThan18(users);
    }

    private static List<User> createUserList() {
        List<User> users = new ArrayList<>();
        users.add(new User("Keanu", "Reeves", 25));
        users.add(new User("Laurence", "Fishburne", 30));
        users.add(new User("Carrie-Anne", "Moss", 17));
        users.add(new User("Keanu", "Weaving", 22));
        users.add(new User("Gloria", "Foster", 40));
        users.add(new User("Joe", "Pantoliano", 35));
        users.add(new User("Marcus", "Chong", 28));
        users.add(new User("Julian", "Arahanga", 20));
        users.add(new User("Keanu", "Doran", 50));
        users.add(new User("Belinda", "McClory", 15));
        return users;
    }

    private static void sortUsersByAge(List<User> users) {
        List<User> sortedByAge = users.stream()
                .sorted(Comparator.comparingInt(User::getAge))
                .collect(Collectors.toList());
        System.out.println("Sorted by age:");
        sortedByAge.forEach(user -> System.out.println(user.getFirstName() + " " + user.getSecondName() + ", age: " + user.getAge()));
    }

    private static void calculateAverageAge(List<User> users) {
        double averageAge = users.stream()
                .mapToInt(User::getAge)
                .average()
                .orElse(0);
        System.out.println("Average age: " + averageAge);
    }

    private static void sortUsersByNameAndAge(List<User> users) {
        List<User> sortedByNameAndAge = users.stream()
                .sorted(Comparator.comparing(User::getFirstName).thenComparing(User::getAge))
                .collect(Collectors.toList());
        System.out.println("Sorted by name and age:");
        sortedByNameAndAge.forEach(user -> System.out.println(user.getFirstName() + " " + user.getSecondName() + ", age: " + user.getAge()));
    }

    private static void checkUsersWithSorA(List<User> users) {
        boolean hasSorA = users.stream()
                .anyMatch(user -> user.getSecondName().startsWith("S") || user.getSecondName().startsWith("A"));
        System.out.println("Users with S or A: " + hasSorA);
    }

    private static void checkAllUsersOlderThan18(List<User> users) {
        boolean allOlderThan18 = users.stream()
                .allMatch(user -> user.getAge() > 18);
        System.out.println("All users older than 18: " + allOlderThan18);
    }
}
