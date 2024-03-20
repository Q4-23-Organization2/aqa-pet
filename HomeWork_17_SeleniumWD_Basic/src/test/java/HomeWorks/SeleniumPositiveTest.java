package HomeWorks;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SeleniumPositiveTest extends CommonConditions {

    @Test
    public void TestWithCorrectData() {
        driver.get("https://the-internet.herokuapp.com/login");

        driver.findElement(By.xpath("//input[@id='username']"))
                .sendKeys("tomsmith");
        driver.findElement(By.xpath("//input[@id='password']"))
                .sendKeys("SuperSecretPassword!");
        driver.findElement(By.xpath("//button[@class='radius']"))
                .click();

        WebElement el = driver.findElement(By.xpath("//div[@id='flash']"));

        JavascriptExecutor js = (JavascriptExecutor) driver;
        String str = js.executeScript("return arguments[0].firstChild.textContent", el).toString();
        System.out.println("The message is: " + str);
    }
}
