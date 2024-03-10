package HW_13_Java_8_Separate_Methods;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class MainRunner {
    private static final Logger logger = LogManager.getLogger(MainRunner.class);
    public static void main(String[] args) {
        List<User> users = createUserList();

        sortUsersByAge(users);
        calculateAverageAge(users);
        sortUsersByNameAndAge(users);
        checkUsersWithSorA(users);
        checkAllUsersOlderThan18(users);
    }

    public static List<User> createUserList() {
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

    public static void sortUsersByAge(List<User> users) {
        List<User> sortedByAge = users.stream()
                .sorted(Comparator.comparingInt(User::getAge))
                .collect(Collectors.toList());
        logger.info("Sorted by age:");
        logger.info("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        sortedByAge.forEach(user -> logger.info(user.getFirstName() + " " + user.getSecondName() + ", age: " + user.getAge()));
        logger.info("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
    }

    public static double calculateAverageAge(List<User> users) {
        double averageAge = users.stream()
                .mapToInt(User::getAge)
                .average()
                .orElse(0);
        logger.info("Average age: " + averageAge);
        logger.info("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        return averageAge;
    }

    public static void sortUsersByNameAndAge(List<User> users) {
        List<User> sortedByNameAndAge = users.stream()
                .sorted(Comparator.comparing(User::getFirstName).thenComparing(User::getAge))
                .collect(Collectors.toList());
        logger.info("Sorted by name and age:");
        logger.info("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        sortedByNameAndAge.forEach(user -> logger.info(user.getFirstName() + " " + user.getSecondName() + ", age: " + user.getAge()));
        logger.info("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
    }

    public static List<User> checkUsersWithSorA(List<User> users) {
        boolean hasSorA = users.stream()
                .anyMatch(user -> user.getSecondName().startsWith("S") || user.getSecondName().startsWith("A"));
        logger.info("Users with S or A: " + hasSorA);
        logger.info("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        return users;
    }

    public static boolean checkAllUsersOlderThan18(List<User> users) {
        boolean allOlderThan18 = users.stream()
                .allMatch(user -> user.getAge() > 18);
        logger.info("All users older than 18: " + allOlderThan18);
        return allOlderThan18;
    }
}
