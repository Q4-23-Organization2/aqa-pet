import HW_13_Java_8_Separate_Methods.User;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.Collections;
import java.util.List;
import HW_13_Java_8_Separate_Methods.MainRunner;

public class MainRunnerTest {
    private List<User> users;

    // Метод, выполняющийся перед каждым тестом для подготовки данных
    @BeforeMethod
    public void setUp() {
        users = MainRunner.createUserList();
    }

    // Метод, выполняющийся после каждого теста для очистки данных
    @AfterMethod
    public void tearDown() {
        users = null;
    }

    // Положительный тест для метода sortUsersByAge()
    @Test
    public void testSortUsersByAge() {
        MainRunner.sortUsersByAge(users);
        Assert.assertEquals(users.get(0).getAge(), 15);
    }

    // Второй положительный тест для метода sortUsersByAge()
    @Test
    public void testSortUsersByAgeSecondCase() {
        MainRunner.sortUsersByAge(users);
        Assert.assertEquals(users.get(9).getAge(), 50);
    }

    // Положительный тест для метода calculateAverageAge()
    @Test
    public void testCalculateAverageAge() {
        double averageAge = MainRunner.calculateAverageAge(users);
        Assert.assertEquals(averageAge, 29.2);
    }

    // Положительный тест для метода sortUsersByNameAndAge()
    @Test
    public void testSortUsersByNameAndAge() {
        MainRunner.sortUsersByNameAndAge(users);
        Assert.assertEquals(users.get(0).getFirstName(), "Belinda");
    }

    // Негативный тест для метода checkUsersWithSorA()
    @Test(dataProvider = "negativeTestData")
    public void testCheckUsersWithSorA(List<User> users) {
        List<User> result = MainRunner.checkUsersWithSorA(users);
        Assert.assertTrue(result.isEmpty());
    }

    // Провайдер данных для негативного теста
    @DataProvider(name = "negativeTestData")
    public Object[][] negativeTestData() {
        return new Object[][]{
                {null},
                {Collections.emptyList()}
        };
    }

    // Положительный тест для метода checkAllUsersOlderThan18()
    @Test
    public void testCheckAllUsersOlderThan18() {
        boolean allOlderThan18 = MainRunner.checkAllUsersOlderThan18(users);
        Assert.assertFalse(allOlderThan18);
    }
}