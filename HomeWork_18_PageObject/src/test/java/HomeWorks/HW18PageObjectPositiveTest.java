package HomeWorks;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;

public class HW18PageObjectPositiveTest extends HW18PageObjectCommonConditions {

    @Test
    public void testBaseAuthentication() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2)); // Создаем объект WebDriverWait с временем ожидания 10 секунд

        driver.get("http://example.com/protected_page"); // Открываем защищенную страницу
        logger.info("Открыта защищенная страница.");

        String username = "your_username"; // Задаем имя пользователя
        String password = "your_password"; // Задаем пароль
        String authString = username + ":" + password; // Формируем строку вида "username:password"
        String authStringEnc = java.util.Base64.getEncoder().encodeToString(authString.getBytes());
        // Кодируем строку в Base64

        wait.until(ExpectedConditions.alertIsPresent()); // Ждем появления диалогового окна аутентификации
        driver.switchTo().alert().sendKeys(authStringEnc); // Вводим закодированные учетные данные в диалоговое окно
        logger.info("Введены учетные данные.");

        WebElement welcomeMessage = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1"))); // Ждем появления элемента h1 на странице
        assertThat(welcomeMessage.getText(), containsString("Welcome")); // Проверяем, содержит ли элемент текст "Welcome"
        logger.info("Аутентификация успешна. Защищенная страница доступна.");
    }
}
