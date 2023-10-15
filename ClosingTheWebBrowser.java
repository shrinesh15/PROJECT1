package bestbuy;
	
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ClosingTheWebBrowser {

    public static void main(String[] args) {
        // Set the path to the ChromeDriver executable
    	WebDriverManager.chromedriver().setup();

        // Initialize the ChromeDriver
        WebDriver driver = new ChromeDriver();

        try {
            
            driver.get("https://www.bestbuy.com/?intl=nosplash");  

        } finally {
            // Close the browser when testing is complete
            driver.quit();
        }
    }
}


