package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandleFrames {
    public static void main(String[] args) {
        // Set up WebDriver
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // Navigate to the website
        driver.get("https://jqueryui.com/droppable/");

        System.out.println(driver.findElements(By.tagName("iframe")).size());
        // Switch to the iframe containing the draggable and droppable elements
        driver.switchTo().frame(0);
        //driver.switchTo().frame(driver.findElement(By.className("demo-frame")));

        // Locate the draggable and droppable elements
        WebElement draggable = driver.findElement(By.id("draggable"));
        WebElement droppable = driver.findElement(By.id("droppable"));

        // Perform drag and drop
        Actions actions = new Actions(driver);
        actions.dragAndDrop(draggable, droppable).perform();

        driver.switchTo().defaultContent();

    }
}
