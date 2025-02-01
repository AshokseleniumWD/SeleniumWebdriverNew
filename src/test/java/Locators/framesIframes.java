package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class framesIframes {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
       driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
       driver.manage().window().maximize();

  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
  WebElement iframe=driver.findElement(By.id("frm2"));

  // Switch to the frame by index or use frame WebElement
  wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(iframe)); 

     WebElement id=  driver.findElement(By.xpath("//input[@id='firstName']"));
     id.sendKeys("Ashok");
     driver.switchTo().defaultContent();
     
       
       
	}

}
