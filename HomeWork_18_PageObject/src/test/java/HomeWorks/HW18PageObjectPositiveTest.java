package HomeWorks;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import java.time.Duration;

public class HW18PageObjectPositiveTest extends HW18PageObjectCommonConditions {

    @Test
    public void TestWithCorrectData() {

        logger.info("Running Test with Correct Data...");
        driver.get("https://guest:welcome2qauto@qauto.forstudy.space/");


        WebElement signUpButton = wait.until(ExpectedConditions.visibilityOfElementLocated
                (By.xpath("//button[contains(text(),'Sign In')]")));
        signUpButton.click();

        wait.until(ExpectedConditions.visibilityOfElementLocated
                (By.xpath("//input[@id='signinEmail']")));
        driver.findElement(By.xpath("//input[@id='signinEmail']"))
                .sendKeys("stanislavk@nayax.com");
        driver.findElement(By.xpath("//input[@id='signinPassword']"))
                .sendKeys("1qaz!!QQAAZZ");
        driver.findElement(By.xpath("//input[@id='remember']"))
                .click();
        driver.findElement(By.xpath("//button[contains(text(),'Login')]"))
                .click();
        logger.info("You have entered the correct email and password!");
    }
}
