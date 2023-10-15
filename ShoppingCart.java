package bestbuy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ShoppingCart {

    public static void main(String[] args) {
        // Set the path to the ChromeDriver executable
    	WebDriverManager.chromedriver().setup();

        // Initialize the ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Navigate to the website
        driver.get("https://www.bestbuy.com/cart"); 

        // Define the XPath for the search input field and the search button
        String searchInputXPath = "//input[@id='search']";  
        String searchButtonXPath = "//button[@id='search-button']"; 

        // Enter the search query and perform the search
        WebElement searchInput = driver.findElement(By.xpath(searchInputXPath));
        WebElement searchButton = driver.findElement(By.xpath(searchButtonXPath));

        searchInput.sendKeys("item to search"); 
        searchButton.click();

        // Define the XPath for the product you want to add to the cart
        String productXPath = "//div[@class='product']"; 

        // Find the product element and click the "Add to Cart" button
        WebElement product = driver.findElement(By.xpath(productXPath));

        // You may need to adjust the XPath for the "Add to Cart" button within the product element
        WebElement addToCartButton = product.findElement(By.xpath(".//button[@class='add-to-cart']"));

        addToCartButton.click();

        // Optionally, you can validate that the item is added to the cart

        // Close the browser
        driver.quit();
    }
}


