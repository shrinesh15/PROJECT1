package bestbuy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OrderConfirmartionMessage {

    public static void main(String[] args) {
        // Set the path to the ChromeDriver executable
    	WebDriverManager.chromedriver().setup();

        // Initialize the ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Navigate to the order confirmation page
        driver.get("https://www.bestbuy.com/?intl=nosplash"); 

        // Define the XPath for the order confirmation message
        String confirmationMessageXPath = "//div[contains(text(),'Your order has been successfully placed.')]";

        // Find the confirmation message element
        WebElement confirmationMessage = driver.findElement(By.xpath(confirmationMessageXPath));

        // Verify the order confirmation message
        if (confirmationMessage.isDisplayed()) {
            System.out.println("Order was placed successfully. Confirmation message found.");
        } else {
            System.out.println("Order confirmation message not found. Order may not have been placed successfully.");
        }

        // Close the browser
        driver.quit();
    }
}
