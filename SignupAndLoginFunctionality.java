package bestbuy;
  
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SignupAndLoginFunctionality {
    public static void main(String[] args) {
        
     	WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.bestbuy.com/?intl=nosplash");

        // Find and fill out the mandatory fields.
        WebElement firstnameField = driver.findElement(By.xpath("//input[@name='firstname']"));
        WebElement lastnameField = driver.findElement(By.xpath("//input[@name='latname']"));
        WebElement emailField = driver.findElement(By.xpath("//input[@name='email']"));
        WebElement passwordField = driver.findElement(By.xpath("//input[@name='password']"));
        WebElement confirmPasswordField = driver.findElement(By.xpath("//input[@name='confirmPassword']"));
        WebElement mobilenoField = driver.findElement(By.xpath("//input[@name='mobileno']"));
        
        
        firstnameField.sendKeys("Virat");
        lastnameField.sendKeys("Kohli");
        emailField.sendKeys("virat@gmail.com");
        passwordField.sendKeys("asdfghjk");
        confirmPasswordField.sendKeys("asdfghjk");
        mobilenoField.sendKeys("12344567890");


        // Submit the form (you may need to locate the Submit button).
        WebElement submitButton = driver.findElement(By.xpath("//button[@type='submit']"));
        submitButton.click();

        // You can add validation logic here by checking for success messages or errors on the page.
        // For example, checking for an element that appears after a successful registration.

        // Close the browser.
        driver.quit();
    }
}



