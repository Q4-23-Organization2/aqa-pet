package HomeWorks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

public class HW18PageObjectNegativeTest extends HW18PageObjectCommonConditions {

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
                .sendKeys("stanislavk@nayax.comm");
        driver.findElement(By.xpath("//input[@id='signinPassword']"))
                .sendKeys("1qaz!!QQAAZZ");
        driver.findElement(By.xpath("//input[@id='remember']"))
                .click();
        driver.findElement(By.xpath("//button[contains(text(),'Login')]"))
                .click();

        wait.until(ExpectedConditions.visibilityOfElementLocated
                (By.xpath("//p[contains(text(),'Wrong email or password')]")));

        logger.info("You have entered an incorrect login or password!");
    }
}
