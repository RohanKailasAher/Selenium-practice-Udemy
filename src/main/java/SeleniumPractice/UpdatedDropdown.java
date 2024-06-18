package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UpdatedDropdown {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        driver.findElement(By.id("divpaxinfo")).click();
        System.out.println("Before Selecting : ");
        System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
        Thread.sleep(3000);
        /*int i=1 ;
        while (i<5){
            driver.findElement(By.id("hrefIncAdt")).click();
            i++;
        }*/
        for (int i=1;i<5;i++){
            driver.findElement(By.id("hrefIncAdt")).click();
        }
        driver.findElement(By.id("btnclosepaxoption")).click();
        System.out.println("After Selecting : ");
        System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
    }
}
