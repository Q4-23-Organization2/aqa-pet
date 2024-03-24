package HomeWorks;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.hamcrest.MatcherAssert.assertThat;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class HW19PageFactoryCommonConditions {
    protected WebDriver driver;
    protected WebDriverWait wait;
    protected static final Logger logger = (Logger) LogManager.getLogger(HW19PageFactoryCommonConditions.class);

    @BeforeMethod
    public void initBrowser() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-extensions");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        wait = new WebDriverWait(driver, Duration.ofSeconds(3));
    }

    @AfterMethod
    public void closeDriver (){
        if(driver != null) {
            driver.quit();
        }
    }
}
