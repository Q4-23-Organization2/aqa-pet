package HomeWorks;

import HW_13_Java_8_Separate_Methods.MainRunner;
import HW_13_Java_8_Separate_Methods.User;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.List;

public class CommonClass {
    protected List<User> users;

    protected static final Logger logger = LogManager.getLogger(TestRunnerPositive.class);

    @BeforeMethod
    public void FillInUsersList() {
        users = MainRunner.createUserList();
    }
    //Пересоздание чистого листа юзеров перед каждым тестом, чтоб они не зависели друг от друга

    @AfterMethod
    public void ResetUsersList() {
        users = null;
    }
    //Обнуление листа юзеров после каждого теста, чтоб они не зависели друг от друга)
}
