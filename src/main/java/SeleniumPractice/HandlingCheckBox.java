package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingCheckBox {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");

        // Check the first checkbox
        WebElement firstCheckbox = driver.findElement(By.xpath("(//input[@type='checkbox'])[1]"));
        firstCheckbox.click();
        System.out.println("First checkbox is checked: " + firstCheckbox.isSelected());

        // Uncheck the first checkbox
        firstCheckbox.click();
        System.out.println("First checkbox is unchecked: " + !firstCheckbox.isSelected());

        // Get the count of checkboxes present on the page
        int checkboxCount = driver.findElements(By.cssSelector("input[type='checkbox']")).size();
        System.out.println("Number of checkboxes present on the page: " + checkboxCount);

        driver.quit();
    }
}
