package HomeWorks;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class CommonConditions {
    protected WebDriver driver;
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
