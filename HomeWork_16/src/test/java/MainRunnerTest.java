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
    }

    @Test
    @Description("Calculate the average age of all users")
    public void testCalculateAverageAge() {
        logger.info("Running testCalculateAverageAge...");
        double averageAge = MainRunner.calculateAverageAge(users);
        Assert.assertEquals(averageAge, 37.5);
    }

    @Test
    public void testSortUsersByNameAndAge() {
        logger.info("Running testSortUsersByNameAndAge...");
        MainRunner.sortUsersByNameAndAge(users);
        Assert.assertEquals(users.get(0).getFirstName(), "Belinda");
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