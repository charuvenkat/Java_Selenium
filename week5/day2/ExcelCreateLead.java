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

public class ExcelCreateLead  extends ExcelBaseLead {
	
	@BeforeClass
	public void setFile() 
	{
		System.out.println("Started @Before class Reading/set  xl file in Lead class");
		fileName= "CreateLead";	
	}
	
	@Test(dataProvider ="sendData")
	public  void createLead(String company,String fname,String lname) {
	
		System.out.println("Lead Creation  @Test started in Lead class\n");
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(company);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fname);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lname);
		driver.findElement(By.xpath("//input[@id='createLeadForm_primaryEmail']")).sendKeys("sandy@gmail.com");
		driver.findElement(By.xpath("//input[@id='createLeadForm_primaryPhoneNumber']")).sendKeys("786786");
	
		
		driver.findElement(By.name("submitButton")).click();
		
		System.out.println("Lead Created");
	
		
	}
	@DataProvider
	public String[][] sendData() throws IOException{
		
		
		//String[][] data= ReadExcel.readData();
		//return data;
		System.out.println("@Dataprovider started in Lead class");
		return ReadExcel.readData("CreateLead");
		
	}
	
}

