package bestbuy;
	
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PaymentInformation {

    public static void main(String[] args) {
        // Set the path to the ChromeDriver executable
    	WebDriverManager.chromedriver().setup();
    	
        // Initialize the ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Navigate to the website
        driver.get("https://www.bestbuy.com/?intl=nosplash"); 

        
        String nameXPath = "//input[@id='name']";
        String cardNumberXPath = "//input[@id='cardNumber']";
        String expirationXPath = "//input[@id='expiration']";
        String cvvXPath = "//input[@id='cvv']";
        String submitButtonXPath = "//button[@id='submit']";

        // Fill out the payment form with dummy information
        WebElement nameInput = driver.findElement(By.xpath(nameXPath));
        WebElement cardNumberInput = driver.findElement(By.xpath(cardNumberXPath));
        WebElement expirationInput = driver.findElement(By.xpath(expirationXPath));
        WebElement cvvInput = driver.findElement(By.xpath(cvvXPath));
        WebElement submitButton = driver.findElement(By.xpath(submitButtonXPath));

        // Replace with your dummy payment information
        nameInput.sendKeys("John");
        cardNumberInput.sendKeys("1234 5678 9012 3456");
        expirationInput.sendKeys("12/23");
        cvvInput.sendKeys("123");

        // Submit the form
        submitButton.click();

        // Close the browser
        driver.quit();
    }
}
