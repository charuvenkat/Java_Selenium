package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class InteractDropdown {

	public static void main(String[] args) {
		
			WebDriverManager.chromedriver().setup();
			ChromeDriver driver = new ChromeDriver();
		
			driver.get("http://leafground.com/pages/Dropdown.html");
			driver.manage().window().maximize();

			WebElement drweb = driver.findElement(By.id("dropdown1"));
			Select drsel = new Select(drweb); 
			int size = drsel.getOptions().size();
			drsel.selectByIndex(size-1);
			System.out.println(size);
			
				
			
	}

}
