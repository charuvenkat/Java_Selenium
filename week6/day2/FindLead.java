package week6.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.SafariDriverManager;

public class FindLead  extends BaseLead{
	
	@Test(dataProvider ="sendData")
	public void findLead( String fname) throws InterruptedException {
		

		System.out.println("Find Lead \n");
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		
		
		driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys(fname);
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(1000);
		
		
	}
	@DataProvider
	public String[][] sendData(){
		String[][] data =new String[1][1];
		
		data[0][0] = "Nandy";
	
	//	data[1][0] = "Amir";
		

		return data;
	}

}
