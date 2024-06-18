package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ProductsCheckout {
    public static void main(String[] args) {
        String[] productNeeded = {"Grapes", "Potato", "Banana"};
        int j = 0;
          WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/seleniumPractise/");

        // Create a list to store added product names
        List<String> addedProducts = new ArrayList<>();
        List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));

        for (int i = 0; i < products.size(); i++) {
            // Carrot - 1 Kg
            // Carrot, 1 Kg
            String name = products.get(i).getText();
            String formattedName = name.split("-")[0].trim();

            // Format it to get actual vegetable
            // Convert array into array list for easy search
            // Check whether name you extracted is present in array list or not
            List productNeededList = Arrays.asList(productNeeded);
            if (productNeededList.contains(formattedName)) {
                j++;

                // Add product name to the list of added products
                addedProducts.add(formattedName);

                // Click the 'ADD TO CART' button
                driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();

                if (j == productNeeded.length) {
                    break;
                }
            }
        }

        // Print the number of items added to the cart
        System.out.println("Total items added to cart: " + j);

        // Print the names of the products added to the cart
        System.out.println("Products added to cart: " + addedProducts);

        // Close the driver
        driver.quit();
    }
}
