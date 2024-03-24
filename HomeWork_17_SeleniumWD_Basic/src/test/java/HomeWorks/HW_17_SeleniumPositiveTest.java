package HomeWorks;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class HW_17_SeleniumPositiveTest extends HW_17_CommonConditions {

    @Test
    public void TestWithCorrectData() {

        logger.info("Running Test with Correct Data...");
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
        logger.info(str + "You have entered the correct username and password!");
    }
}
