package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;

import java.time.Duration;

public class Locators2 {
    public static void main(String[] args) throws InterruptedException {
        String email ="Rohan14@gmail.com";
        WebDriver driver = new EdgeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
        String password = getPassword(driver);
        driver.get("https://rahulshettyacademy.com/locatorspractice/");
        driver.findElement(By.id("inputUsername")).sendKeys(email);
        driver.findElement(By.name("inputPassword")).sendKeys(password);
        driver.findElement(By.className("submit")).click();
        Thread.sleep(3000);
        System.out.println(driver.findElement(By.tagName("p")).getText());
        Assert.assertEquals(driver.findElement(By.tagName("p")).getText(),"You are successfully logged in.");
        System.out.println(driver.findElement(By.cssSelector("div[class='login-container'] h2")).getText());
        Assert.assertEquals(driver.findElement(By.cssSelector("div[class='login-container'] h2")).getText(),"Hello "+email+",");
        driver.findElement(By.xpath("//*[text()='Log Out']")).click();
        driver.close();
    }
    public static String getPassword(WebDriver driver) throws InterruptedException

    {

        driver.get("https://rahulshettyacademy.com/locatorspractice/");

        driver.findElement(By.linkText("Forgot your password?")).click();

        Thread.sleep(1000);

        driver.findElement(By.cssSelector(".reset-pwd-btn")).click();

        String passwordText =driver.findElement(By.cssSelector("form p")).getText();

       //Please use temporary password 'rahulshettyacademy' to Login.

        String[] passwordArray = passwordText.split("'");

      // String[] passwordArray2 = passwordArray[1].split("'");

      // passwordArray2[0]

        String password = passwordArray[1].split("'")[0];

        return password;

      //0th index - Please use temporary password

     //1st index - rahulshettyacademy' to Login.

     //0th index - rahulshettyacademy

     //1st index - to Login.

    }
}
