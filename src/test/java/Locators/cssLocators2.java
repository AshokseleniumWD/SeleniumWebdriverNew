package Locators;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
public class cssLocators2 {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		/* 1...... CSS - Tag and ID Selector
		 *  Take a note of its Tag and value of its id attribute.
		  Syntax:    driver.findElement(By.cssSelector("Tag#Value of id attribute"))
	      Example: driver.findElement(By.cssSelector("input#fname")) */
		driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("Marker");
		//driver.findElement(By.cssSelector("button.button-1[type='submit']")).click();
		//driver.findElement(By.cssSelector("button.button-1[type^='sub']")).click();
		//driver.findElement(By.cssSelector("button[type='submit']")).click();
		driver.findElement(By.cssSelector("button[type$='mit']")).click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

	private static Duration DurationOfSeconds(int i) {
		// TODO Auto-generated method stub
		return null;
	}

}
