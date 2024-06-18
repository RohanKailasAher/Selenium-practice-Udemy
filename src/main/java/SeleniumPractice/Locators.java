package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Locators {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
        driver.get("https://rahulshettyacademy.com/locatorspractice/");
        driver.findElement(By.id("inputUsername")).sendKeys("Rohan");
        driver.findElement(By.name("inputPassword")).sendKeys("Pass@123");
        driver.findElement(By.className("submit")).click();
        System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
        driver.findElement(By.linkText("Forgot your password?")).click();
        driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Rohan");
        driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("rohan14@gmail.com");
        driver.findElement(By.xpath("//input[@type='text'][2]")).clear();
        driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("Rohan14@gmail.com");
        driver.findElement(By.xpath("//form/input[3]")).sendKeys("8390845852");
        driver.findElement(By.cssSelector("button.reset-pwd-btn")).click();
        System.out.println(driver.findElement(By.cssSelector("p.infoMsg")).getText());
        driver.findElement(By.cssSelector("button.go-to-login-btn")).click();
        driver.findElement(By.id("inputUsername")).sendKeys("Rohan14@gmail.com");
        driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");
        Thread.sleep(3000);
        driver.findElement(By.cssSelector("input#chkboxOne")).click();
        driver.findElement(By.xpath("//button[contains(@class,'submit ')]")).click();

    }

}
