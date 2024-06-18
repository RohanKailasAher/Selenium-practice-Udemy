package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingActions {
    public static void main(String[] args) {
        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.in/");
        Actions a = new Actions(driver);
        a.moveToElement(driver.findElement(By.id("icp-nav-flyout"))).build().perform();
        a.moveToElement(driver.findElement(By.cssSelector(".nav-search-field "))).click().keyDown(Keys.SHIFT).sendKeys("umbrella for men").doubleClick().build().perform();

    }
}
