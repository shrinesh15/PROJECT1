package bestbuy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NavigationofMenuAndValidationofTitle{

    public static void main(String[] args) {
        // Set the path to the ChromeDriver executable
    	WebDriverManager.chromedriver().setup();

        // Initialize the ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Navigate to the website
        driver.get("https://www.bestbuy.com/?intl=nosplash");

        // Define the XPath for the main menu container
        String mainMenuXPath = "//ul[@id='main-menu']"; 

        // Find the main menu element
        WebElement mainMenu = driver.findElement(By.xpath(mainMenuXPath));

        // Find all menu items within the main menu
        java.util.List<WebElement> menuItems = mainMenu.findElements(By.xpath(".//li"));

        // Iterate through each menu item
        for (WebElement menuItem : menuItems) {
            // Click the menu item to navigate to the page
            menuItem.click();

            // Validate the page title
            String expectedTitle = "Expected Page Title"; 
            String actualTitle = driver.getTitle();

            if (actualTitle.equals(expectedTitle)) {
                System.out.println("Title is as expected: " + expectedTitle);
            } else {
                System.out.println("Title is not as expected. Actual Title: " + actualTitle);
            }

            // Navigate back to the previous page to continue the loop
            driver.navigate().back();

            // Refresh the elements for the next iteration
            mainMenu = driver.findElement(By.xpath(mainMenuXPath));
            menuItems = mainMenu.findElements(By.xpath(".//li"));
        }

        // Close the browser
        driver.quit();
    }
}

