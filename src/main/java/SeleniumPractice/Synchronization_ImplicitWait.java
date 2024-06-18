package SeleniumPractice;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.concurrent.TimeUnit;
public class Synchronization_ImplicitWait {
    public static void main(String[] args) {
        // Set up WebDriver
        WebDriver driver = new ChromeDriver();

        // Set implicit wait time
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // Navigate to the website
        driver.get("http://the-internet.herokuapp.com/dynamic_controls");

        // Find the checkbox element
        WebElement checkbox = driver.findElement(By.cssSelector("#checkbox > input"));

        // Check if checkbox is selected
        System.out.println("Checkbox is selected: " + checkbox.isSelected());

        // Close the driver
        driver.quit();
    }
}
