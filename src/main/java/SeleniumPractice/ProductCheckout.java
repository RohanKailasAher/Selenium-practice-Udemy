package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class ProductCheckout {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/seleniumPractise/");
        List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));
        for (int i =0 ;i< products.size();i++)
        {
           String name = products.get(i).getText();
           if(name.contains("Grapes"))
           {
               driver.findElement(By.xpath("(//button[text()='ADD TO CART'])[" + (i + 1) + "]")).click();
               break;
           }
        }
    }
}
