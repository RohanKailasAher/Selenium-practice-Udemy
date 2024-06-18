package SeleniumPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Selenium_Intro {
    public static void main(String[] args) {
        //Invoking Browser
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");

//        WebDriver driver1 = new EdgeDriver();
//        driver.get("https://www.google.com/");
//
//        WebDriver driver2 = new FirefoxDriver();
//        driver.get("https://www.google.com/");

        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());

        driver.quit();

    }
}
