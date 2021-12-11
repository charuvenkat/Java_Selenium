package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.SafariDriverManager;

public class CreateLeadLeaftaps {

	public static void main(String[] args) {
	
		//set up the chrome driver
		WebDriverManager.chromedriver().setup();
	//	WebDriverManager.safaridriver().setup();
		
		//Launch the chrome browser
		ChromeDriver driver=new ChromeDriver();
		
		
		//load the url
		driver.get("http://leaftaps.com/opentaps/control/main");
		//http://leaftaps.com/opentaps/control/main
		
		//maximize the browser
	//	driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("nandy");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("ravi");
		
		WebElement source = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select select = new Select(source);
	//	select.selectByVisibleText("Employee");
	//	select.selectByValue("LEAD_COLDCALL");
		select.selectByIndex(4);
		
		String fname = driver.findElement(By.id("createLeadForm_firstName")).getAttribute("value");
		System.out.println("First Name of the Lead = " +fname);
		String title = driver.getTitle();
		System.out.println(title);
		driver.close();
		
		
		
	/*	driver.findElement(By.id("createLeadForm_dataSourceId")).sendKeys("TestLeaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Charu");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("venkat");
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Charu");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("venkat");
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Charu");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("venkat");
		
		
		driver.findElement(By.name("submitButton")).click();
		
		String title = driver.getTitle();
		System.out.println(title);
		
		driver.close();8?
		
		
		
		
		
		
		
		
		//driver.findElement(By.className("decorativeSubmit")).click();
		
		//String title = driver.getTitle();
		//System.out.println(title);*/
		
		
	}

}
