package Locators;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class typesOfAlerts {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
//		 WebElement one=driver.findElement(By.xpath("//Button[@onclick='myFunctionAlert()']"));
//		 one.click(); 
//		 Alert myalert=driver.switchTo().alert(); //
//		 myalert.accept();
//		 WebElement confirmAlert=driver.findElement(By.xpath("//Button[@onclick='myFunctionConfirm()']"));
//		 confirmAlert.click();
//		 Alert myalert2=driver.switchTo().alert();
//		 myalert2.dismiss();
//		 String text=driver.findElement(By.xpath("//p[@id='demo']")).getText();
//		 if(text.equals("You pressed Cancel!"))
//		 {
//			 System.out.println("You pressed cancel button!");
//		 }
//		 else
//		 {
//			 System.out.println("You pressed ok button!"); 
//		 } 
		WebElement three=driver.findElement(By.xpath("//button[@onclick='myFunctionPrompt()']"));
		three.click();
		
		Alert myalert=driver.switchTo().alert();
		myalert.sendKeys("Ashokkumarguptha");
		Thread.sleep(5000);
		myalert.accept();
		
		
		
	}

}
