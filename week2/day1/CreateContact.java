package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.SafariDriverManager;

public class CreateContact {

	public static void main(String[] args) {
	
		//set up the chrome driver
		WebDriverManager.chromedriver().setup();
	//	WebDriverManager.safaridriver().setup();
		
		//Launch the chrome browser
		ChromeDriver driver=new ChromeDriver();
		
		
		//load the url
		driver.get("http://leaftaps.com/opentaps/control/main");
		
	
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.linkText("Create Contact")).click();
		driver.findElement(By.id("firstNameField")).sendKeys("Neha");
		driver.findElement(By.id("lastNameField")).sendKeys("venkat");
		driver.findElement(By.name("submitButton")).click();
		String fname = driver.findElement(By.id("viewContact_firstName_sp")).getText();
		System.out.println("First Name of the Contact = " +fname);
		String title = driver.getTitle();
		System.out.println(title);
		driver.close();
		
	}

}
