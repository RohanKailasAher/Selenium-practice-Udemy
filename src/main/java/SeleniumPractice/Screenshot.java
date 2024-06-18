package SeleniumPractice;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.io.File;
import java.io.IOException;

public class Screenshot {
    public static void main(String[] args) throws IOException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://google.com");

        // Take screenshot and save it to a file
        File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        String destinationPath = "C:\\Users\\user\\Pictures\\takeScreenshot\\google_homepage.png";

        // Use FileUtils to copy the screenshot to the destination path
        FileUtils.copyFile(src, new File(destinationPath));

        System.out.println("Screenshot saved: " + destinationPath);

        // Close the browser
        driver.quit();
    }
}
