package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnSelect {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leafground.com/pages/Dropdown.html");
		driver.manage().window().maximize();
		//to choose one of the dropdown value
		
				// Step 1: Find the dropdown element (select tag)
				WebElement eleDropDown = driver.findElement(By.id("Select your programs"));
				
				// Step 2: Convert that as Select class (Dropdown)
				Select select = new Select(eleDropDown); 
				
				// Step 3: Choose the value based on option
				
				// Choose by the text
				//select.selectByVisibleText("Loadrunner");
				
				// Choose by the value attribute
				//select.selectByValue("2");
				
				// Choose by the index
				// select.selectByIndex(2); // 2--> 0,1,2 (3rd option)
				
				// Select the last dropdown option
				// total count (size) - 1
				
				// How many Options tag
				int size = select.getOptions().size();
			select.selectByIndex(size-2);
			// how to print the selected index value in console
			//System.out.println(size);
				
			//	WebElement source = driver.findElement(By.id("createLeadForm_dataSourceId"));
			//	Select select = new Select(source);
			//	select.selectByVisibleText("Employee");
			//	select.selectByValue("LEAD_COLDCALL");
			//	select.selectByIndex(4);
				
			
	}

}
