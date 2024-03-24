package HomeWorks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.equalTo;


public class HW18PageObjectNegativeTest extends HW18PageObjectCommonConditions {

    @Test
    public void TestWithIncorrectData() {

        logger.info("Running Test with Correct Data");
        driver.get("https://guest:welcome2qauto@qauto.forstudy.space/");

        WebElement signUpButton = wait.until(ExpectedConditions.visibilityOfElementLocated
                (By.xpath("//button[contains(text(),'Sign In')]")));
        signUpButton.click();

        wait.until(ExpectedConditions.visibilityOfElementLocated
                (By.xpath("//input[@id='signinEmail']")));
        WebElement emailInput = driver.findElement(By.xpath("//input[@id='signinEmail']"));
        emailInput.sendKeys("stanislavk@nayax.coMM"); // Неверный адрес электронной почты

        try {
            assertThat(emailInput.getAttribute("value"), equalTo("stanislavk@nayax.com"));
            logger.info("Email address validation successful.");
        } catch (AssertionError e) {
            logger.error("Email address validation failed: " + e.getMessage());
        }

/*        driver.findElement(By.xpath("//input[@id='signinEmail']"))
                .sendKeys("stanislavk@nayax.comm");*/
        driver.findElement(By.xpath("//input[@id='signinPassword']"))
                .sendKeys("1qaz!!QQAAZZ");
        driver.findElement(By.xpath("//input[@id='remember']"))
                .click();
        driver.findElement(By.xpath("//button[contains(text(),'Login')]"))
                .click();

        WebElement errorMessage = wait.until(ExpectedConditions.visibilityOfElementLocated
                (By.xpath("//p[contains(text(),'Wrong email or password')]")));
        assertThat(errorMessage.getText(), containsString("Wrong email or password"));

        logger.info("\n You have entered an incorrect login or password!");
    }
}
