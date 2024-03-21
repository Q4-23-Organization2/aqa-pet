package HomeWorks;

import DataProvider.DataProviderClass;
import HW_13_Java_8_Separate_Methods.MainRunner;
import HW_13_Java_8_Separate_Methods.User;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class TestRunnerNegative extends CommonClass {
    // Негативный тест на проверку пользователей, у которых фамилия начинается с буквы "S" или "А",
    // с возвращением пустого листа
    @Test(testName = "(8)CheckUsersWithSorA",
            description = "Negative test for checking users, returning an empty list",
            dataProviderClass = DataProviderClass.class,
            dataProvider = "negativeTestData")
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
}
