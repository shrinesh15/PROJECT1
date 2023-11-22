package bestbuy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BestbuyecommerceTest {

    private WebDriver driver;

    @BeforeClass
    public void setUp() {
    	
    	WebDriverManager.chromedriver().setup();

        driver = new ChromeDriver();
        driver.get("https://www.bestbuy.com/");
      
    }

    @Test
    public void testAddToCartPositive() {
    	
        // positive test logic
        // Example: Add an item to the cart
        WebElement addToCartButton = driver.findElement(By.xpath("//button[@data-track='Add to Cart']"));
        addToCartButton.click();
        // Add verification logic
        Assert.assertTrue(driver.getCurrentUrl().contains("/cart/"), "Item was not added to the cart");
   
    }

    @Test
    public void testCheckoutPositive() {
    	
        // positive test logic
        // Example: Proceed to checkout
        WebElement checkoutButton = driver.findElement(By.xpath("//button[@data-track='Checkout']"));
        checkoutButton.click();
        // Add verification logic
        Assert.assertTrue(driver.getCurrentUrl().contains("/checkout/"), "Unable to proceed to checkout");
    
    }

    @Test
    public void testAddToCartNegative() {
    	
        // negative test logic
        // Example: Try adding an item that is out of stock
        WebElement outOfStockItem = driver.findElement(By.xpath("//div[contains(text(),'Out of Stock')]"));
        Assert.assertTrue(outOfStockItem.isDisplayed(), "Item was added to the cart, but it should be out of stock");
  
    }

    @AfterClass
    public void tearDown() {
    	
        // Close the browser 
        driver.quit();
        
    }
}


