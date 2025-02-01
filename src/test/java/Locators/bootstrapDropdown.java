package Locators;

import org.openqa.selenium.chrome.ChromeDriver;

public class bootstrapDropdown {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://seleniumpractise.blogspot.com/2016/08/bootstrap-dropdown-example-for-selenium.html");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		

	}

}
