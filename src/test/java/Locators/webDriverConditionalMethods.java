package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webDriverConditionalMethods {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/"); 
		WebElement one=driver.findElement(By.xpath("//h2[contains(@class,'title')and text()='New Browser Window']"));
	 boolean Display=one.isDisplayed(); System.out.println(Display);
	 boolean Display2=one.isEnabled(); System.out.println(Display2);
	 boolean Display3=one.isSelected();
	 System.out.println(Display3);
	 
	
	WebElement two=driver.findElement(By.xpath("//input[@id='male']"));
	if(two.isEnabled()) {
		System.out.println("Radio button is enabled");
	}
	else
	{
		System.out.println("Not enabled");
	}

}
}
