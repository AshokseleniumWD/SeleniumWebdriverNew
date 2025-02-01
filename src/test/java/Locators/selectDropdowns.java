package Locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class selectDropdowns {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
		driver.manage().window().maximize();
		Thread.sleep(10000);
		//Locating dropdown
		WebElement dropdownEle=driver.findElement(By.xpath("//div[@class='single_tab_div resp-tab-content resp-tab-content-active']//p//select"));
		//Creating select object to accessing dropdown
		Select obj=new Select(dropdownEle);

		List<WebElement> options=obj.getOptions();
		System.out.println(options.size());
//		for( WebElement all:options)
//		{
//			System.out.println(all.getText());
//		}
		
		
		
		

	}

}
