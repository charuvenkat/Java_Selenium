package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class A4LeafGroundDropdown {

	public static void main(String[] args) {
		

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leafground.com/pages/Dropdown.html");
		driver.manage().window().maximize();
		
		
			//	Choose by the Index
		
				WebElement lDropdown = driver.findElement(By.id("dropdown1"));
				Select select = new Select(lDropdown); 
				select.selectByIndex(4);
				
			//  Choose by the text
				
				WebElement lDropdown2 = driver.findElement(By.name("dropdown2"));
				Select sel = new Select(lDropdown2); 
				sel.selectByVisibleText("Appium");
				
			//  Choose the value based 
				WebElement lDropdown3 = driver.findElement(By.name("dropdown3"));
				Select sele = new Select(lDropdown3);
				sele.selectByValue("3");
				
			/*  Get the number of options in list -check with mentor
				WebElement lDropdown4 = driver.findElement(By.xpath("//option[text()='Get the number of dropdown options']"));
				Select snum = new Select(lDropdown4);
				int size = snum.getOptions().size();
				snum.selectByIndex(size-2);		
				int snum = driver.findElements(By.xpath("//option[text()='Get the number of dropdown options']")).size();
				System.out.println(snum);*/
				
			// sendkeys to select - check with mentor
			//	driver.findElement(By.xpath("//option[text()='You can also use sendKeys to select']/following::option[2]")).click();
			//	driver.findElement(By.xpath("//option[text()='You can also use sendKeys to select']/following::option[2]")).sendKeys(Keys.DOWN);
				
			//	Multiple Select using SendKeys check with mentor
			//	driver.findElement(By.xpath("//option[text()='Select your programs']/following::option[1]")).sendKeys(Keys.DOWN, Keys.SHIFT, Keys.DOWN, Keys.DOWN);
				
	}

}
