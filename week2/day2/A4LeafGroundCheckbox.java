package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class A4LeafGroundCheckbox {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leafground.com/pages/checkbox.html");
		driver.manage().window().maximize();
		
		//Select the languages that you know?
		driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[1]/div[1]/input")).click();
		//System.out.println(driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[1]/div[1]/input")).isSelected());
		
		
		
		//Confirm Selenium is checked
		System.out.println(driver.findElement(By.xpath("//*[@id='contentblock']/section/div[2]/div/input")).isSelected());
		
		
				
		//DeSelect only checked
		
		System.out.println(driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[3]/div[2]/input")).isSelected());

		 if(driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[3]/div[2]/input")).isSelected())
		 {
			 driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[3]/div[2]/input")).click(); 
			 
			System.out.println(driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[3]/div[2]/input")).isSelected());

		 }
		 
		
		//Select all below checkboxes
		 driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[4]/div[1]/input")).click();
		 driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[4]/div[2]/input")).click();
		 driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[4]/div[3]/input")).click();
		 driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[4]/div[4]/input")).click();
		 driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[4]/div[5]/input")).click();

	}

}
