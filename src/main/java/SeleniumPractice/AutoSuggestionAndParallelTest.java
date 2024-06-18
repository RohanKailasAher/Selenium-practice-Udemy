package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class AutoSuggestionAndParallelTest {
    WebDriver driver;

    @Parameters("browser")
    @Test
    public void initialization(String browserName) {
        // Initialize the browser driver based on the browser name parameter
        switch (browserName) {
            case "chrome":
                driver = new ChromeDriver();
                driver.manage().window().maximize();
                break;
            case "edge":
                driver = new EdgeDriver();
                driver.manage().window().maximize();
                break;
            default:
                System.out.println("Unsupported browser: " + browserName);
                return;
        }

        // Navigate to Google and perform a search
        driver.get("https://www.google.co.in/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        WebElement search = driver.findElement(By.xpath("//textarea[@name='q']"));
        search.sendKeys("Sachin Tendulkar");

        // Get the list of auto-suggestions
        List<WebElement> suggestionList = driver.findElements(By.xpath("//div[@class='OBMEnb']/ul/li"));
        int suggestionCount = suggestionList.size();
        System.out.println(suggestionCount);

        // Print all suggestions
//        for (int i = 0; i < suggestionCount; i++) {
//            System.out.println(suggestionList.get(i).getText());
//        }

        // Print the 5th suggestion and click on it
        System.out.println("5th suggestion: " + suggestionList.get(4).getText());
        suggestionList.get(4).click();

        // Close the driver
        driver.quit();
    }
}
