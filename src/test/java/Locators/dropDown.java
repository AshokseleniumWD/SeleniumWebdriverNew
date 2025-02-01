package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class dropDown {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver=new ChromeDriver();
//		////Bootstrap drop down
//		driver.get("https://seleniumpractise.blogspot.com/2016/08/bootstrap-dropdown-example-for-selenium.html");
//		driver.manage().window().maximize();
//		Thread.sleep(5000);
//		
//		driver.findElement(By.xpath("//button[@class='btn btn-default dropdown-toggle']")).click();
//		driver.findElement(By.xpath("//a[normalize-space()='JavaScript']")).click();
//		driver.quit();
//		
		// Hidden dropdowns
		driver.get(null);
		WebElement blog=driver.findElement(By.xpath("//a[@class='dropdown-item'][normalize-space()='Blogs']"));
		blog.click();
	}

}
