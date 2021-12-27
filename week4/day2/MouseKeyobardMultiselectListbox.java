package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseKeyobardMultiselectListbox {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver=new ChromeDriver();
	
		driver.get("http://leafground.com/pages/Dropdown.html");
		
		driver.manage().window().maximize();
		
		Actions builder=new Actions(driver);
		
		WebElement item1 = driver.findElement(By.xpath("//option[text()='Select your programs']/following::option[1]"));
		WebElement item2 = driver.findElement(By.xpath("//option[text()='Select your programs']/following::option[4]"));

		builder.keyDown(Keys.COMMAND).click(item1).click(item2).keyUp(Keys.COMMAND).perform();
		


	}

}
