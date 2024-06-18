package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Locators3 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        // Locating an element using XPath axes (following-sibling)
        // header/div/button[1]/following-sibling::button[1]
        System.out.println(driver.findElement(By.xpath("//header/div/button[1]/following-sibling::button[1]")).getText());
        // Locating an element using XPath axes (parent)
        // header/div/button[1]/following-sibling::button[1]
        System.out.println(driver.findElement(By.xpath("//header/div/button[1]/parent::div/button[2]")).getText());

        driver.quit();
    }
}
