package Locators;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class xPath01 {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		/* X-Path using single attribute 
		Syntax://<HTML tag>[@attribute_name='attribute_value']
		/html/body/div[6]/div[2]/ul[1]/li[4]/a   
		WebElement input=driver.findElement(By.xpath("//input[@type='text']"));
		input.sendKeys("Computers");
		input.click();*/
		
		/*
		  (By XPath- Using Multiple Attribute)
		    Syntax://<HTML tag>[@attribute_name1='attribute_value1'][@attribute_name2='attribute_value2]  */
		WebElement multiple=driver.findElement(By.xpath("//*[@id='name'][@type='text']"));
		multiple.sendKeys("Ashokkumarguptha");
		
		/* (By XPath- Using And)
		 * Syntax://<HTML tag>[@attribute_name1='attribute_value1' and @attribute_name2='attribute_value2] */
		WebElement Triple=driver.findElement(By.xpath("//*[@id='email' and @type='text']"));
		Triple.sendKeys("ashokm@ibaseit.com");
		Triple.click();
		
		/* Locating Strategies- (By XPath- Using Or)
          Syntax: //<HTML tag>[@attribute_name1='attribute_value1' or @attribute_name2='attribute_value2]   
		
		WebElement Four=driver.findElement(By.xpath("//*[@class='form-control' or @type='textarea']"));
		Four.sendKeys("2-41,lg pudi");
		Four.click(); */
		
		
               driver.findElement(By.xpath("//input[starts-with(@id,'pho')]")).sendKeys("8790789021");
               /*  (By XPath- Using contains())
               Syntax: //<HTML tag>[contains(@attribute_name,'attribute_value')] */
               driver.findElement(By.xpath("//textarea[contains(@id,'text')]")).sendKeys("2-41,lg pudi");
               driver.findElement(By.xpath("//*[text()='New Browser Window']"));
               
               


		
		
		
		
		
		
		
		
		
	
		
		

	}

}
