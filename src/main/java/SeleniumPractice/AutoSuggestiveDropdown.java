package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.List;

public class AutoSuggestiveDropdown {
    public static void main(String[] args) throws InterruptedException {
        // Set ChromeOptions to disable notifications
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");

        // Initialize WebDriver with ChromeOptions
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://vacations.spicejet.com/");

        // Enter text to trigger the auto-suggestive dropdown
        driver.findElement(By.id("txtHotelCity")).sendKeys("Mum");
        Thread.sleep(3000);

        // Locate the auto-suggestive dropdown items
        List<WebElement> menus = driver.findElements(By.cssSelector(".tt-suggestion"));

        // Print the text of each suggestion and click on "Mumbai"
        for (WebElement menu : menus) {
            System.out.println(menu.getText()); // Print suggestion text
            if (menu.getText().equalsIgnoreCase("Mumbai")) {
                menu.click();
                break;
            }
        }

        // Close the browser
        driver.quit();
    }
}
