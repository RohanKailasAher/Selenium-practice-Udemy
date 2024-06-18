package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CalendarHandling {
    public static void main(String[] args) {
        // Set ChromeOptions to disable notifications
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");

        // Initialize WebDriver with ChromeOptions
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");

        // Click on the date picker icon
        driver.findElement(By.cssSelector("input#datepicker")).click();

        // Click on a date in the calendar (for example, the current date)
        driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();

        // Print the selected date from the input field
        String selectedDate = driver.findElement(By.cssSelector("input#datepicker")).getAttribute("value");
        System.out.println("Selected date: " + selectedDate);

        // Close the browser
        driver.quit();
    }
}
