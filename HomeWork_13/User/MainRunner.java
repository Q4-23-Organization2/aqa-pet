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
        users.add(new User("Keanu", "Weaving", 22));
        users.add(new User("Gloria", "Foster", 40));
        users.add(new User("Joe", "Pantoliano", 35));
        users.add(new User("Marcus", "Chong", 28));
        users.add(new User("Julian", "Arahanga", 20));
        users.add(new User("Keanu", "Doran", 50));
        users.add(new User("Belinda", "McClory", 15));

        // 1. Вывод списка из 10 объектов типа User методом 'forEach'
        System.out.println("\n1. List of 10 objects of type User before sorting:"); // '/n' - это перенос строки
        users.forEach(user -> System.out.println("User: " + user.getFirstName() + " " + user.getSecondName() + ", age: " + user.getAge()));

        // 2. Сортировка списка по возрасту по возрастанию, и запись в новую коллекцию
        System.out.println("\n2. List of 10 objects of type User after sorting in ascending order:");
        List<User> usersSortedByAge = users.stream()    //Создаём Стрим из списка пользователей.
                .sorted(Comparator.comparingInt(User::getAge))  //Сортируем элементы потока с помощью компаратора,
                // который сравнивает возраст пользователей
                .toList();  //Преобразуем отсортированный Стрим в список пользователей
        usersSortedByAge.forEach(user -> System.out.println("User: " + user.getFirstName() + " " + user.getSecondName() + ", age: " + user.getAge()));
        //Перебираем каждый элемент в списке с помощью 'forEach' и выводим на экран

        // 3. Подсчет среднего возраста пользователей
        System.out.println("\n3. Average age of all users:");
        double averageAgeOfUsers = users.stream()   //Создаем Стрим объектов User
                .mapToDouble(User::getAge)  //Преобразуем их возрасты в поток типа 'double' с помощью метода mapToDouble и лямбда выражения
                .average()  //Вычисляем среднее значение с помощью метода 'average()'
                .orElse(0); //Возвращает значение по умолчанию равное '0', если поток пуст или среднее значение не может быть вычислено
        System.out.println("Average age of all users: " + averageAgeOfUsers);   //Выводим на экран средний возраст пользователей

        // 4. Сортировка списка по нескольким свойствам: 'firstName' и 'age'
        System.out.println("\n4. Sort by name and age:");
        List<User> sortedByNameAndAge = users.stream()  //Создаем Стрим объектов User
                .sorted(Comparator.comparing(User::getFirstName).thenComparing(User::getAge))
                //Применяем компаратор. Методами: 'Comparator.comparing()' и 'thenComparing()' сначала сравниваем по имени (в алфавитном порядке),
                //а затем по возрасту, если имена совпадают
                .toList();  //Преобразуем отсортированный поток в список
        sortedByNameAndAge.forEach(user -> System.out.println("User: " + user.getFirstName() + " " + user.getSecondName() + ", age: " + user.getAge()));
        //Выводим на экран отсортированный список по заданным критериям

        // 5. Проверка наличия пользователей с фамилией, начинающейся с "S" или "A"
        System.out.println("\n5. Are there any users with a last name starting with a letter 'S' or 'A'?");
        //Выводим на экран вопрос
        boolean usersWithLetterSorA = users.stream()
                //Переменная типа 'boolean', которой присваевается результат проверки Стрима пользователей
                .anyMatch(user -> user.getSecondName().startsWith("S") || user.getSecondName().startsWith("A"));
        //В методе anyMatch() выполняется проверка, соответствует ли хотя бы один пользователь условию.
        //Лямбда-выражение 'user -> user.getSecondName().startsWith("S") || user.getSecondName().startsWith("A")'
        // Проверяет, начинается ли фамилия пользователя с буквы "S" или "A"
        System.out.println(usersWithLetterSorA ? "There are such users." : "There are no such users.");
        // Вывод результата на экран при помощи тернарного оператора

        // 6. Проверка, все ли пользователи старше 18 лет
        System.out.println("\n6. Are all users over 18 years of age?");
        boolean allOlderThan18 = users.stream()
                //Переменная типа 'boolean', которой присваевается результат проверки Стрима пользователей
                .allMatch(user -> user.getAge() > 18);
        //В методе allMatch() выполняется проверка, соответствуют ли ВСЕ пользователи условию.
        System.out.println(allOlderThan18 ? "Yes. All users over 18 years of age:" : "No. Not all users are over 18 years of age.");
        // Вывод результата на экран при помощи тернарного оператора
    }
}
