package HomeWorks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SeleniumTests {

    protected WebDriver driver;
    private static final By MESSAGE = By.xpath("//div[@id='flash']");
    private static final String ALERT_BASE_LOCATOR = "//button[@onclick='%s']";
    private final String LOGIN_PAGE_URL = "https://the-internet.herokuapp.com/login";
    @BeforeMethod
    public void initBrowser() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }
    @Test
    public void KrasTest() {
        driver.get("https://the-internet.herokuapp.com/login");

        driver.findElement(By.xpath("//input[@id='username']")).sendKeys("tomsmith");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("SuperSecretPassword!");
        driver.findElement(By.xpath("//button[@class='radius']")).click();
    }
}
