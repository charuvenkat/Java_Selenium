package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class A4LeafGroundEdit {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leafground.com/pages/Edit.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("email")).sendKeys("charu.wins@gmail.com");
		driver.findElement(By.xpath("//input[@value='Append ']")).sendKeys("appended");
		System.out.println(driver.findElement(By.xpath("//input[@value='TestLeaf']")).getAttribute("value"));
		driver.findElement(By.xpath("//input[@value='Clear me!!']")).clear();
		System.out.println(driver.findElement(By.xpath("//label[@for='disabled']/following-sibling::input")).isEnabled());
		
		
		
		

	}

}
