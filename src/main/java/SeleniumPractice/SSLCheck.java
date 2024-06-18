package SeleniumPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SSLCheck {
    public static void main(String[] args) {
        ChromeOptions options = new ChromeOptions();
        options.setAcceptInsecureCerts(true);

        WebDriver driver = new ChromeDriver(options);
        driver.get("https://expired.badssl.com/");

        // Print the title of the webpage
        System.out.println("Page title: " + driver.getTitle());

        // Close the browser
        driver.quit();
    }
}
