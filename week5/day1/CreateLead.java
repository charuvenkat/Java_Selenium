package week5.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.SafariDriverManager;

public class CreateLead  extends BaseLead {
	@Test(priority=1)
	public  void createLead() {
	
		System.out.println("Lead Creation -Entered \n");
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("sandy");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("venkat");
		driver.findElement(By.xpath("//input[@id='createLeadForm_primaryEmail']")).sendKeys("sandy@gmail.com");
		driver.findElement(By.xpath("//input[@id='createLeadForm_primaryPhoneNumber']")).sendKeys("786786");
	
		
		driver.findElement(By.name("submitButton")).click();
		
		System.out.println("Lead Created - Ended");
	//	driver.close();
		
	}
	
}

