package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class authenticatedPopUp {

    public static void main(String[] args) {
        // Initialize ChromeDriver
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
        driver.manage().window().maximize();

        // Create a WebDriverWait instance
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // Wait for the frame to be available and switch to it
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("Frame2")); // Remove colon

        // Find the input element and send keys
        WebElement id = driver.findElement(By.xpath("//input[@id='firstName']"));
        id.sendKeys("Ashok");

        // Switch back to the default content
        driver.switchTo().defaultContent();

        // Close the driver
        driver.quit();
    }
}
