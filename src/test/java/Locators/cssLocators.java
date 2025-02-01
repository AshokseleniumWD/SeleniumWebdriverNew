package Locators;

import org.openqa.selenium.chrome.ChromeDriver;

public class cssLocators {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://cortex.firstbaseit.net/cortexui/#/login");
		driver.manage().window().maximize();
		
		/* 1...... CSS - Tag and ID Selector
		 *  Take a note of its Tag and value of its id attribute.
		  Syntax:    driver.findElement(By.cssSelector("Tag#Value of id attribute"))
	      Example: driver.findElement(By.cssSelector("input#fname")) */
		/* 2....By CSS-Tag and Class
		 * Syntax: driver.findElement(By.cssSelector("Tag.Value of Class attribute"))  
		 * Example:driver.findElement(By.cssSelector("input.Automation"))  
		 */
		/* 3... By CSS-Tag and Attribute
		 * Syntax: driver.findElement(By.cssSelector("Tag[Attribute=value]"))  
		 * Example:   driver.findElement(By.cssSelector("input[id=fname]"))  
		 * Example 2: driver.findElement(By.cssSelector("button[id=idOfButton]"))  
		 */
		/* 4.  Tag, Class and Attribute.
		 * Syntax: driver.findElement(By.cssSelector("tag.Value of class attribute[attribute=value]")) 
		 * Example: driver.findElement(By.cssSelector("input.gsfi[name=q]"))  
		 */
		
		/* 5. (By CSS- Sub-String Matches)
		 * Starts with (^):
		 *Syntax: driver.findElement(By.cssSelector("Tag[attribute^=prefix of the string]"))  
		 *Example:driver.findElement(By.cssSelector("input[id^='fna']"))  
		 * 
		 *Ends with ($):
		 Syntax :driver.findElement(By.cssSelector("Tag[attribute$=suffix of the string]"))  
		 Example:driver.findElement(By.cssSelector("input[id$='me']"))  */
		
		 
		  /* 
		   Contains (*):<
To select and locate a web element, we would use * which means 'sub-string'. 
		    
		   driver.findElement(By.cssSelector("Tag[attribute*=sub-string]"))  
Therefore, for locating the Text box on the sample web page we will use the input tag along with the id attribute:

driver.findElement(By.cssSelector("input[id*='id']"))  
We can also use 'contains()' in place of * operator

driver.findElement(By.cssSelector("input:contains('id')"))  
		 */

	}

	
	}

