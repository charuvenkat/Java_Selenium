package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class A4LeafGroundBondwithButton {

	public static void main(String[] args) {
		
			WebDriverManager.chromedriver().setup();
			ChromeDriver driver = new ChromeDriver();
		
			driver.get("http://leafground.com/pages/Button.html");
			driver.manage().window().maximize();
			
			driver.findElement(By.xpath("//button[@id='home']")).click();
			driver.navigate().back();
			
			System.out.println(driver.findElement(By.xpath("//button[@id='position']")).getLocation());
			
			System.out.println(driver.findElement(By.xpath("//button[@id='color']")).getCssValue("background-color"));
			
			System.out.println(driver.findElement(By.xpath("//button[@id='size']")).getSize());
			
	}

}
