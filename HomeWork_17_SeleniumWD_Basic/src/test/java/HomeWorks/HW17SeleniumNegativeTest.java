package HomeWorks;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class HW17SeleniumNegativeTest extends HW17SeleniumCommonConditions {

    @Test
    public void TestWithIncorrectData() {

        logger.info("Running Test with Incorrect Data...");
        driver.get("https://the-internet.herokuapp.com/login");

        driver.findElement(By.xpath("//input[@id='username']"))
                .sendKeys("IncorrectUserName");
        driver.findElement(By.xpath("//input[@id='password']"))
                .sendKeys("IncorrectPassword!");
        driver.findElement(By.xpath("//button[@class='radius']"))
                .click();

        WebElement el = driver.findElement(By.xpath("//div[@id='flash']"));

        JavascriptExecutor js = (JavascriptExecutor) driver;
        String str = js.executeScript("return arguments[0].firstChild.textContent", el).toString();
        logger.error(str + "You entered an incorrect login or password!");
    }
}
