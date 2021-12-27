package week5.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.SafariDriverManager;

public class DeleteLead  extends BaseLead{
	@Test(priority=4)
	public void deleteLead() throws InterruptedException {

		System.out.println("Delete Lead Created  - Entered \n");
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.linkText("Phone")).click();
		driver.findElement(By.name("phoneNumber")).sendKeys("786786");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click(); 
		
		Thread.sleep(1000);
		String cid = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).getText();
		System.out.println(cid);
		
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		driver.findElement(By.linkText("Delete")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.name("id")).sendKeys(cid);
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		
		Thread.sleep(1000);
	//	driver.findElement(By.linkText("No records to display")).getText();
		String norec = driver.findElement(By.xpath("//div[@class='x-paging-info']")).getText();
		System.out.println("deleted" + norec);
		//driver.close();
		System.out.println("Delete Lead Created  - Ended\n");

		
	}

}
