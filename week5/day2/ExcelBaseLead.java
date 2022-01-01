package week5.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.annotations.Parameters;

import com.beust.jcommander.Parameter;


import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.SafariDriverManager;

public class ExcelBaseLead {
	
	public ChromeDriver driver;
	public String fileName;
	

	@Parameters({"username","password"})
	@BeforeMethod(alwaysRun = true)
	
	public void beforeMethod(String user, String pswd) {
		
		System.out.println("started @Before method in BaseLead class");
	
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
		driver.findElement(By.id("username")).sendKeys(user);
		driver.findElement(By.id("password")).sendKeys(pswd);
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
	
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("end @aftermethod in BaseLead class");
		driver.close();
	}
}
	

