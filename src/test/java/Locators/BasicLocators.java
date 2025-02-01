package Locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class BasicLocators {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://cortex.firstbaseit.net/cortexui/#/login");
		driver.manage().window().maximize();
		//changes as part of next day
		/* WebElement Downloadlink=driver.findElement(By.linkText("Download"));
		Downloadlink.click(); 
		WebElement Bloglink=driver.findElement(By.linkText("Blog"));
		Bloglink.click();*/
		//driver.findElement(By.linkText("Demo")).click();
		//driver.findElement(By.name("Unlimited everything")).click();
		//driver.findElement(By.linkText("Features")).click(); 
		//driver.findElement(By.linkText("Unlimited everything")).click();
		//driver.findElement(By.linkText("Developer")).click();
		//driver.findElement(By.cssSelector("a#Unlimited everything"));
		//driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.id("mat-input-0")).sendKeys("admin@fordb2c.com");
		driver.findElement(By.name("password")).sendKeys("Password1");
		driver.findElement(By.cssSelector("span.mat-button-wrapper")).click();
		/* Click on the Submit button using click() command  
		driver.findElement(By.tagName("button")).click();  */
		/*Locate the checkbox by Class Name and check it using click() function  
	     driver.findElement(By.className("Automation")).click();  */
		
		
		
		
		
		
		
		
		//driver.quit();
	}

}
