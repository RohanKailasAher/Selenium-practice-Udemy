package SeleniumPractice;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutorExample {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");

        // Cast the driver to JavascriptExecutor
        JavascriptExecutor js = (JavascriptExecutor) driver;

        // Example of executing JavaScript code to scroll down by 500 pixels
        js.executeScript("window.scrollBy(0,500);");

        // Wait for 3 seconds
        Thread.sleep(3000);

        // Scroll the element with the class 'tableFixHead' by 5000 pixels
        js.executeScript("document.querySelector('.tableFixHead').scrollTop=5000");

        // Close the driver
        //driver.quit();
    }
}
