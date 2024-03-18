

import HW_13_Java_8_Separate_Methods.MainRunner;
import HW_13_Java_8_Separate_Methods.User;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainRunnerTest {
    private static final Logger logger = LogManager.getLogger(MainRunnerTest.class);
    private List<User> users;

    @BeforeMethod
    public void FillInUsersList() {
        users = MainRunner.createUserList();
    }
    //Пересоздание чистого листа юзеров перед каждым тестом, чтоб они не зависели друг от друга)

    @AfterMethod
    public void ResetUsersList() {
        users = null;
    }
    //Обнуление листа юзеров после каждого теста, чтоб они не зависели друг от друга)

    // Положительные тесты
    @Test(testName = "SortUsersByAgeFirstCase",
            description = "Checking the first and last user for age after sorting")
    public void testSortUsersByAgeFirstCase() {
        logger.info("Running testSortUsersByAge...");
        MainRunner.sortUsersByAge(users);
        // Проверяем первый элемент в отсортированном списке
        Assert.assertEquals(users.getFirst().getAge(), 15);
        // Проверяем последний элемент в отсортированном списке
        Assert.assertEquals(users.getLast().getAge(), 60);
        logger.info("The first user is the youngest");
        logger.info("The last user is the oldest");
    }

    @Test(testName = "SortUsersByAgeSecondCase",
            description = "Checking each user from the list for age after sorting with an interval of 5 years")
    public void testSortUsersByAgeSecondCase() {
        logger.info("Running testSortUsersByAge...");
        MainRunner.sortUsersByAge(users);

        // Проверяем возраст каждого пользователя после сортировки
        for (int i = 0; i < users.size(); i++) {
            User user = users.get(i);
            int expectedAge = i * 5 + 15; // Возраст должен увеличиваться на 5 с каждым следующим пользователем
            Assert.assertEquals(user.getAge(), expectedAge,
                    "Each subsequent user is 5 years older than the previous one");
        }
        logger.info("Each subsequent user is 5 years older than the previous one");
    }

    @Test(testName = "CalculateAverageAge",
            description = "Calculate the average age of all users")
    public void testCalculateAverageAge() {
        logger.info("Running testCalculateAverageAge...");
        double averageAge = MainRunner.calculateAverageAge(users);
        Assert.assertEquals(averageAge, 37.5);
        //проверка на совпадение результата среднего возраста пользователей
    }

    @Test(testName = "TotalAgeLessThan400",
            description = "Checking that the total age is less than 400 years")
    public void testTotalAgeLessThan400() {
        logger.info("Running testTotalAgeLessThan400...");
        int totalAge = 0;
        // Суммируем возраст всех пользователей
        for (User user : users) {
            totalAge += user.getAge();
        }
        // Проверяем, что общий возраст всех пользователей меньше 400 лет
        Assert.assertTrue(totalAge < 400, "Total age should be less than 400 years");
        logger.info("The total age of all users is less than 400 years");
    }

    @Test(testName = "SortUsersByNameAndAge_FirstUser",
            dataProvider = "firstUserParams",
            description = "Parameterized test with check for the first user of a sorted list")
    public void testSortUsersByNameAndAge_FirstUser(String expectedFirstName, int expectedAge) {
        logger.info("Running testSortUsersByNameAndAge_FirstUser...");
        // Создаем копию списка пользователей, чтобы избежать изменения исходного списка
        List<User> sortedUsers = new ArrayList<>(users);
        // Сортируем список и получаем отсортированный список
        sortedUsers = MainRunner.sortUsersByNameAndAge(sortedUsers);
        // Получаем первого пользователя после сортировки
        User firstUser = sortedUsers.getFirst();
        // Проверяем параметры первого пользователя
        Assert.assertEquals(firstUser.getFirstName(), "Belinda");
        // Проверяем, что первое имя в отсортированном списке это "Belinda"
        Assert.assertEquals(firstUser.getAge(), 60);
        // Проверяем, что возраст первого пользователя в отсортированном списке равен 60
    }

    @DataProvider(name = "firstUserParams")
    public Object[][] getFirstUserParams() {
        return new Object[][]{
                {"Belinda", 60} // Ожидаемое имя и возраст первого пользователя после сортировки
        };
    }

    @Test(testName = "SortUsersByNameAndAge_SeventhUser",
            dataProvider = "seventhUserParams",
            description = "Parameterized test with check for the seventh user of a sorted list")
    public void testSortUsersByNameAndAge_SeventhUser(String expectedFirstName, int expectedAge) {
        logger.info("Running testSortUsersByNameAndAge_MiddleUser...");
        // Создаем копию списка пользователей, чтобы избежать изменения исходного списка
        List<User> sortedUsers = new ArrayList<>(users);
        // Сортируем список и получаем отсортированный список
        sortedUsers = MainRunner.sortUsersByNameAndAge(sortedUsers);
        // Получаем седьмого пользователя из списка
        User seventhUser = sortedUsers.get(sortedUsers.size() / 2 + 1);
        // Проверяем параметры седьмого пользователя из списка
        Assert.assertEquals(seventhUser.getFirstName(), expectedFirstName);
        // Проверяем, что имя седьмого пользователя из списка соответствует ожидаемому
        Assert.assertEquals(seventhUser.getAge(), expectedAge);
        // Проверяем, что возраст седьмого пользователя из списка соответствует ожидаемому
        logger.info("The 7th user from the sorted list is: "
                + seventhUser.getFirstName() + " " + seventhUser.getSecondName()
                + ", age: " + seventhUser.getAge());
    }

    @DataProvider(name = "seventhUserParams")
    public Object[][] getSeventhUserParams() {
        return new Object[][]{
                {"Keanu", 15} // Ожидаемое имя и возраст седьмого пользователя из списка после сортировки
        };
    }

    // Негативный тест на проверку пользователей, у которых фамилия начинается с буквы "S" или "А",
    // с возвращением пустого листа
    @Test(testName = "CheckUsersWithSorA",
            dataProvider = "negativeTestData",
            description = "Negative test for checking users, returning an empty list")
    public void testCheckUsersWithSorA(List<User> users) {
        logger.info("Running testCheckUsersWithSorA...");
        try {
            List<User> result = MainRunner.checkUsersWithSorA(users);
            // Проверяем, что результат пустой (список пользователей с фамилией, начинающейся на 'S' или 'A')
            Assert.assertTrue(result.isEmpty());
        } catch (NullPointerException e) {
            // Если было сгенерировано исключение NullPointerException, возвращаем пустой список
            logger.error("NullPointerException occurred: " + e.getMessage());
            Assert.fail("NullPointerException occurred: " + e.getMessage());
        }
    }

    @DataProvider(name = "negativeTestData")
    public Object[][] negativeTestData() {
        //Возвращаем двумерный массив объектов, в котором первое значение 'null',
        // а второй - это пустой лист, созданный при помощи коллекции 'Collections.emptyList()'
        return new Object[][]{
                {null},
                {Collections.emptyList()}
        };
    }

    @Test(description = "Checking that NOT all users elder than 18 years")
    public void testCheckNotAllUsersOlderThan18() {
        List<User> users = MainRunner.createUserList(); // Получаем список пользователей
        logger.info("Running testCheckNotAllUsersOlderThan18...");
        boolean allOlderThan18 = MainRunner.checkAllUsersOlderThan18(users); // Проверяем, все ли пользователи старше 18 лет

        // Проверяем, что не все пользователи старше 18 лет
        Assert.assertTrue(!allOlderThan18, "Not all users are older than 18 years.");

        // Если не все пользователи старше 18 лет, найдем пользователя младше 18 лет и выведем его информацию
        if (!allOlderThan18) {
            for (User user : users) {
                if (user.getAge() < 18) {
                    logger.info("Younger than 18 user: " + user.getFirstName() + " " + user.getSecondName() + ", age: " + user.getAge());
                    return; // Пользователь найден, тест успешно завершен
                }
            }
        }
    }
}