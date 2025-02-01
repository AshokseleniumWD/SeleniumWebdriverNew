package Locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigationalMethods {

	public static void main(String[] args) throws InterruptedException {
		 WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		/*
		 * WebElement male=driver.findElement(By.xpath("//input[@id='male']"));
		 * male.click(); Thread.sleep(5000); WebElement
		 * female=driver.findElement(By.xpath("//input[@id='female']")); female.click();
		 */
		/*
		 * List<WebElement>
		 * checkboxes=driver.findElements(By.xpath("//label[normalize-space()='Days:']);
		 * for(int i=0;i<checkboxes.size();i++) { checkboxes.get(i).click(); }
		 */
		
		
	}

}
