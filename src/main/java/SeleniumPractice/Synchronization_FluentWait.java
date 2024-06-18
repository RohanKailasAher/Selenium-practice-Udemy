package SeleniumPractice;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;
import java.util.function.Function;
public class Synchronization_FluentWait {
    public static void main(String[] args) {
        // Set up WebDriver
        WebDriver driver = new ChromeDriver();

        // Navigate to the website
        driver.get("http://the-internet.herokuapp.com/dynamic_loading/2");

        // Click on Start button
        WebElement startButton = driver.findElement(By.cssSelector("#start > button"));
        startButton.click();

        // Set up fluent wait
        Wait<WebDriver> fluentWait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofSeconds(2))
                .ignoring(NoSuchElementException.class);

        // Wait for the finish element to appear
        WebElement finishElement = fluentWait.until(new Function<WebDriver, WebElement>() {
            public WebElement apply(WebDriver driver) {
                return driver.findElement(By.cssSelector("#finish > h4"));
            }
        });
        System.out.println("Loaded Element Text: " + finishElement.getText());

        // Close the driver
        driver.quit();
    }
}
