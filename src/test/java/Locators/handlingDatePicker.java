package Locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class handlingDatePicker {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/datepicker/");
		driver.manage().window().maximize();
		//Thread.sleep(5000);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.switchTo().frame(0);
        driver.findElement(By.xpath("//input[@id='datepicker']")).click();//Click the date picker
        //September 2024
        String month="September";
        String year="2024";
        String date="24";
        //select month and year
        while(true)
        {
        	String Cmonth=driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();//Capturing month
        	String Cyear=driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();//Capturing year
        	if((Cmonth.equals(month))&&(Cyear.equals(year)))
        	{
        		break;
        	}
        	driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();//Next button
        }
        
	}

}
