package week5.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.SafariDriverManager;

public class CreateLead  extends BaseLead {
	@Test(dataProvider ="sendData")
	public  void createLead(String company,String fname,String lname) {
	
		System.out.println("Lead Creation \n");
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
	public String[][] sendData(){
		String[][] data =new String[2][3];
		
		data[0][0] = "Freshwise";
		data[0][1] = "sandy";
		data[0][2] = "sam";

		data[1][0] = "Testleaf";
		data[1][1] = "Rhea";
		data[1][2] = "veera";

		return data;
	}
	
}

