/**
 * 
 */
package Locators;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.Response;


/**
 * 
 */
public class getWindow{

	/**
	 * @param args
	 */

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://myford.firstbaseit.net/cortexfordb2c/warranty.html");
		String mainwindow=driver.getWindowHandle();
		System.out.println(" Parent window" + mainwindow);
		
		Set<String> allWindowHandles = driver.getWindowHandles();
	
		
		

	}

}
