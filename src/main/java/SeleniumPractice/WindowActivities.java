package SeleniumPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowActivities {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/"); // wait until whole page loaded
        driver.navigate().to("https://emp.neosofttech.com/"); // not wait until whole page loaded
        driver.navigate().back();
        driver.navigate().forward();
        driver.quit();
    }
}
