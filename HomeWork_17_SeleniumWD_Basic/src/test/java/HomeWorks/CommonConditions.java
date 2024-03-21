package HomeWorks;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
public class CommonConditions {
    protected WebDriver driver;
    protected static final Logger logger = (Logger) LogManager.getLogger(CommonConditions.class);
    private static final By MESSAGE = By.xpath("//div[@id='flash']");
    private static final String ALERT_BASE_LOCATOR = "//button[@onclick='%s']";
    private final String LOGIN_PAGE_URL = "https://the-internet.herokuapp.com/login";
    @BeforeMethod
    public void initBrowser() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @AfterMethod
    public void closeDriver (){
        if(driver != null) {
            driver.quit();
        }
    }
}
