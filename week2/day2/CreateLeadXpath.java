package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.SafariDriverManager;

public class CreateLeadXpath {

	public static void main(String[] args) {
	
		//set up the chrome driver
		WebDriverManager.chromedriver().setup();
	
		//Launch the chrome browser
		ChromeDriver driver=new ChromeDriver();
		
		
		//load the url
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		
		//driver.findElement(By.linkText("CRM/SFA")).click();
		//driver.findElement(By.xpath("//*[contains(text( ),' CRM/SFA')]")).click();
		driver.findElement(By.xpath("//div[@class='crmsfa']")).click();
		
		
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		
		driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("xcomp");
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Lary");
		driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("Anbu");
		driver.findElement(By.xpath("//input[@class='smallSubmit']"));
		
		String title = driver.getTitle();
		System.out.println(title);
	
		driver.close();
		
		
		
	/*	driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Charu");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("venkat");
		driver.findElement(By.name("submitButton")).click();
		
		
		
		
		//driver.findElement(By.className("decorativeSubmit")).click();
		
		//String title = driver.getTitle();
		//System.out.println(title);*/
		
		
	}

}
