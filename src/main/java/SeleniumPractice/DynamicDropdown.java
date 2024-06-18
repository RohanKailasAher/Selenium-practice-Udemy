package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DynamicDropdown {
    public static void main(String[] args) throws InterruptedException {
        // Set ChromeOptions to disable notifications
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");

        // Initialize WebDriver with ChromeOptions
        WebDriver driver = new ChromeDriver(options);
        driver.get("http://spicejet.com");


        // With Index - xpath
        //driver.findElement(By.xpath("(//div[@class='css-1dbjc4n r-14lw9ot r-11u4nky r-z2wwpe r-1phboty r-rs99b7 r-1loqt21 r-13awgt0 r-ymttw5 r-tju18j r-5njf8e r-1otgn73'])[1]")).click();
       //Without Index -xpath
        driver.findElement(By.xpath("//div[@class='css-1dbjc4n r-13awgt0 r-18u37iz']//div[@data-testid='to-testID-origin']")).click();
        driver.findElement(By.xpath("//div[text()='International']")).click();
        driver.findElement(By.xpath("//div[text()='Suvarnabhumi Airport']")).click();

        Thread.sleep(2000);
        // With Index -xpath
        //driver.findElement(By.xpath("(//div[@class='css-1dbjc4n r-14lw9ot r-11u4nky r-z2wwpe r-1phboty r-rs99b7 r-1loqt21 r-13awgt0 r-ymttw5 r-tju18j r-5njf8e r-1otgn73'])[2]")).click();
        //Without Index -xpath
        driver.findElement(By.xpath("//div[@class='css-1dbjc4n r-13awgt0 r-18u37iz']//div[@data-testid='to-testID-destination']")).click();
        driver.findElement(By.xpath("//div[text()='Raja Bhoj Airport']")).click();

        // Close the browser
        driver.quit();
    }
}
