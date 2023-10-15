package bestbuy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MenuAndBrands {

    public static void main(String[] args) {
        // Set the path to the ChromeDriver executable
    	WebDriverManager.chromedriver().setup();

        // Initialize the ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Navigate to the website
        driver.get("https://www.bestbuy.com/?intl=nosplash");  

        // Define the XPath for the "Brands" menu item
        String brandsMenuXPath = "//a[contains(text(),'Brands')]"; 

        // Click the "Brands" menu item
        WebElement brandsMenuLink = driver.findElement(By.xpath(brandsMenuXPath));
        brandsMenuLink.click();

        // Define the XPath for the specific brand you want to select
        String brandXPath = "//a[contains(text(),'Brand Name')]"; 

        // Click the brand to view its products
        WebElement brandLink = driver.findElement(By.xpath(brandXPath));
        brandLink.click();

        // Define the XPath for the specific item you want to add
        String itemXPath = "//div[@class='product'][1]";  

        // Click the "Add to Cart" button for the selected item
        WebElement item = driver.findElement(By.xpath(itemXPath));
        WebElement addToCartButton = item.findElement(By.xpath(".//button[@class='add-to-cart']"));
        addToCartButton.click();

        // Optionally, you can navigate to the shopping cart and validate that the item is added

        // Close the browser
        driver.quit();
    }
}

