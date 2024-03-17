import HW_13_Java_8_Separate_Methods.MainRunner;
import HW_13_Java_8_Separate_Methods.User;
import jdk.jfr.Description;
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

    @AfterMethod
    public void ResetUsersList() {
        users = null;
    }

    // Положительные тесты
    @Test
    @Description("Checking the first and last user for age after sorting")
    public void testSortUsersByAgeFirstCase() {
        logger.info("Running testSortUsersByAge...");
        MainRunner.sortUsersByAge(users);
        // Проверяем первый элемент в отсортированном списке
        Assert.assertEquals(users.get(0).getAge(), 15);
        // Проверяем последний элемент в отсортированном списке
        Assert.assertEquals(users.get(users.size() - 1).getAge(), 60);
        logger.info("The first user is the youngest");
        logger.info("The last user is the oldest");
    }

    @Test
    @Description("Checking each user from the list for age after sorting with an interval of 5 years")
    public void testSortUsersByAgeSecondCase() {
        logger.info("Running testSortUsersByAge...");
        MainRunner.sortUsersByAge(users);

        // Проверяем возраст каждого пользователя после сортировки
        for (int i = 0; i < users.size(); i++) {
            User user = users.get(i);
            int expectedAge = i * 5 + 15; // Возраст должен увеличиваться на 5 с каждым следующим пользователем
            Assert.assertEquals(user.getAge(), expectedAge);
        }
        logger.info("Each subsequent user is 5 years older than the previous one");
    }

    @Test
    @Description("Calculate the average age of all users")
    public void testCalculateAverageAge() {
        logger.info("Running testCalculateAverageAge...");
        double averageAge = MainRunner.calculateAverageAge(users);
        Assert.assertEquals(averageAge, 37.5);
    }

    @Test
    @Description("Checking that the total age is less than 400 years")
    public void testTotalAgeLessThan400() {
        logger.info("Running testTotalAgeLessThan400...");
        int totalAge = 0;
        // Суммируем возраст каждого пользователя
        for (User user : users) {
            totalAge += user.getAge();
        }
        // Проверяем, что общий возраст меньше 400 лет
        Assert.assertTrue(totalAge < 400, "Total age should be less than 400 years");
        logger.info("The total age of all users is less than 400 years");
    }

    @Test(dataProvider = "firstUserParams")
    @Description("Parameterized test with check for the first user of a sorted list")
    public void testSortUsersByNameAndAge_FirstUser(String expectedFirstName, int expectedAge) {
        logger.info("Running testSortUsersByNameAndAge_FirstUser...");
        // Создаем копию списка пользователей, чтобы избежать изменения исходного списка
        List<User> sortedUsers = new ArrayList<>(users);
        // Сортируем список и получаем отсортированный список
        sortedUsers = MainRunner.sortUsersByNameAndAge(sortedUsers);
        // Получаем первого пользователя после сортировки
        User firstUser = sortedUsers.get(0);
        // Проверяем параметры первого пользователя
        Assert.assertEquals(firstUser.getFirstName(), "Belinda"); // Проверяем, что первое имя в отсортированном списке это "Belinda"
        Assert.assertEquals(firstUser.getAge(), 60); // Проверяем, что возраст первого пользователя в отсортированном списке равен 60
    }

    @DataProvider(name = "firstUserParams")
    public Object[][] getFirstUserParams() {
        return new Object[][]{
                {"Belinda", 60} // Ожидаемое имя и возраст первого пользователя после сортировки
        };
    }

    @Test(dataProvider = "seventhUserParams")
    @Description("Parameterized test with check for the seventh user of a sorted list")
    public void testSortUsersByNameAndAge_SevenUser(String expectedFirstName, int expectedAge) {
        logger.info("Running testSortUsersByNameAndAge_MiddleUser...");
        // Создаем копию списка пользователей, чтобы избежать изменения исходного списка
        List<User> sortedUsers = new ArrayList<>(users);
        // Сортируем список и получаем отсортированный список
        sortedUsers = MainRunner.sortUsersByNameAndAge(sortedUsers);
        // Получаем пользователя в середине списка
        User seventhUser = sortedUsers.get(sortedUsers.size() / 2 + 1);
        // Проверяем параметры пользователя в середине списка
        Assert.assertEquals(seventhUser.getFirstName(), expectedFirstName);
        // Проверяем, что имя 7го пользователя в списке соответствует ожидаемому
        Assert.assertEquals(seventhUser.getAge(), expectedAge);
        // Проверяем, что возраст 7го пользователя в списке соответствует ожидаемому
        logger.info("The 7th user from the sorted list is: "
                + seventhUser.getFirstName() + " " + seventhUser.getSecondName()  + ", age: " + seventhUser.getAge());
    }


    @DataProvider(name = "seventhUserParams")
    public Object[][] getMiddleUserParams() {
        return new Object[][]{
                {"Keanu", 15} // Ожидаемое имя и возраст пользователя в середине списка после сортировки
        };
    }

    // Отрицательный тест
    @Test(dataProvider = "negativeTestData")
    public void testCheckUsersWithSorA(List<User> users) {
        logger.info("Running testCheckUsersWithSorA...");
        List<User> result = MainRunner.checkUsersWithSorA(users);
        Assert.assertTrue(result.isEmpty());
    }

    @DataProvider(name = "negativeTestData")
    public Object[][] negativeTestData() {
        return new Object[][]{
                {null},
                {Collections.emptyList()}
        };
    }

    @Test
    public void testCheckAllUsersOlderThan18() {
        logger.info("Running testCheckAllUsersOlderThan18...");
        boolean allOlderThan18 = MainRunner.checkAllUsersOlderThan18(users);
        Assert.assertFalse(allOlderThan18);
    }
}