package week5.day2;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.SafariDriverManager;

public class ExcelFindLead  extends ExcelBaseLead{
	

	@BeforeClass
	public void setFile() 
	{
		fileName = "FindLead";	
	}
	@Test(dataProvider ="sendData")
	public void findLead(String fname) throws InterruptedException {

		System.out.println("Find Lead \n");
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		
		
		driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys(fname);
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(1000);
		
	}
	@DataProvider
	public String[][] sendData() throws IOException{
		//String[][] data= ReadExcel.readData();
		//return data;
		System.out.println("@Dataprovider started in Lead class");
		return ReadExcel.readData("FindLead");
		
	}

}
