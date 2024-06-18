package SeleniumPractice;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Synchronization_ExplicitWait {
    public static void main(String[] args) {
        // Set up WebDriver
        WebDriver driver = new ChromeDriver();

        // Navigate to the website
        driver.get("http://the-internet.herokuapp.com/dynamic_loading/1");

        // Click on Start button
        WebElement startButton = driver.findElement(By.cssSelector("#start > button"));
        startButton.click();

        // Set explicit wait
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // Wait for the finish element to appear
        WebElement finishElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#finish > h4")));
        System.out.println("Loaded Element Text: " + finishElement.getText());

        // Close the driver
        driver.quit();
    }
}
