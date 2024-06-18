package SeleniumPractice;

import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ProxyExample {
    public static void main(String[] args) {
        // Define the proxy server address and port
        String proxyServer = "192.168.1.100:8080";

        // Create a Proxy object and set the HTTP proxy
        Proxy proxy = new Proxy();
        proxy.setHttpProxy(proxyServer);

        // Create ChromeOptions and set the proxy capability
        ChromeOptions options = new ChromeOptions();
        options.setCapability("proxy", proxy);

        // Initialize ChromeDriver with ChromeOptions
        WebDriver driver = new ChromeDriver(options);

        // Navigate to a website that displays your IP address
        driver.get("https://whatismyipaddress.com/");
    }
}
