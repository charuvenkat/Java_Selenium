package week5.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.SafariDriverManager;

public class DuplicateLead  extends BaseLead{
	@Test(priority=3)
	public void duplicateLead() throws InterruptedException {

		System.out.println("Duplicate Lead Creation - Entered  \n");
		driver.findElement(By.linkText("Find Leads")).click();
		
		driver.findElement(By.xpath("//span[text()='Email']")).click();
		
		
		driver.findElement(By.xpath("//input[@name='emailAddress']")).sendKeys("sandy@gmail.com");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(1000);
		String fname=driver.findElement(By.xpath("(//a[@class='linktext'])[6]")).getText();
		System.out.println("First name of the Lead tbd :"+ fname);
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		driver.findElement(By.xpath("//a[text()='Duplicate Lead']")).click();
		
		String title = driver.getTitle();
		//System.out.println(title);
	
		
		String tit = driver.findElement(By.xpath("//div[text()='Duplicate Lead']")).getText();
		System.out.println("dup title " + tit);
		if (tit.equals("Duplicate Lead")) {
			System.out.println("Title of the dup page is Matched");
			driver.findElement(By.xpath("//input[@name='submitButton']")).click();
			if (fname.equals(driver.findElement(By.xpath("//span[@id='viewLead_firstName_sp']")).getText())){
				System.out.println("Firat name of the duplicate Lead : " + driver.findElement(By.xpath("//span[@id='viewLead_firstName_sp']")).getText());
				System.out.println("Lead succefuly Duplicated");
			}
			
		}
		else {
			System.out.println("Title dup not matched");
		}
//		driver.close();
		
		System.out.println("Duplicate Lead Creation - Ended  \n");

	}

}
