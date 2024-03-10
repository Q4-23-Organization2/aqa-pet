import HW_13_Java_8_Separate_Methods.MainRunner;
import HW_13_Java_8_Separate_Methods.User;
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
    public void setUp() {
        users = MainRunner.createUserList();
    }

    @AfterMethod
    public void tearDown() {
        users = null;
    }

    // Положительные тесты
    @Test
    public void testSortUsersByAge() {
        logger.info("Running testSortUsersByAge...");
        MainRunner.sortUsersByAge(users);
        Assert.assertEquals(users.get(0).getAge(), 15);
    }

    @Test
    public void testSortUsersByAgeSecondCase() {
        logger.info("Running testSortUsersByAgeSecondCase...");
        MainRunner.sortUsersByAge(users);
        Assert.assertEquals(users.get(9).getAge(), 50);
    }

    @Test
    public void testCalculateAverageAge() {
        logger.info("Running testCalculateAverageAge...");
        double averageAge = MainRunner.calculateAverageAge(users);
        Assert.assertEquals(averageAge, 29.2);
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