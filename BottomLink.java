package bestbuy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BottomLink {

    public static void main(String[] args) {
        // Set the path to the ChromeDriver executable
    	WebDriverManager.chromedriver().setup();

        // Initialize the ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Navigate to the website's homepage
        driver.get("https://www.bestbuy.com/?intl=nosplash");  

        // Define the XPath for the bottom links container
        String bottomLinksXPath = "//div[@id='bottom-links']";

        // Find the bottom links container
        WebElement bottomLinksContainer = driver.findElement(By.xpath(bottomLinksXPath));

        // Find all links within the bottom links container
        java.util.List<WebElement> bottomLinks = bottomLinksContainer.findElements(By.xpath(".//a"));

        // Iterate through each link
        for (WebElement link : bottomLinks) {
            // Get the link text and URL
            String linkText = link.getText();
            String linkUrl = link.getAttribute("href");

            // Validate the link URL
            if (isValidURL(linkUrl)) {
                System.out.println("Link Text: " + linkText);
                System.out.println("Link URL: " + linkUrl);
                System.out.println("Link is valid.");
            } else {
                System.out.println("Link Text: " + linkText);
                System.out.println("Link URL: " + linkUrl);
                System.out.println("Link is not valid.");
            }
        }

        // Close the browser
        driver.quit();
    }

    private static boolean isValidURL(String url) {
        
        return url != null && (url.startsWith("http://") || url.startsWith("https://"));
    }
}



