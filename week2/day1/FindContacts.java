package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.SafariDriverManager;

public class FindContacts {

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
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.linkText("Find Contacts")).click();
		driver.findElement(By.linkText("Email")).click();
		driver.findElement(By.name("emailAddress")).sendKeys("charu.wins@gmail.com");
		
		//driver.findElement(By.name("Find Contacts")).click();
		driver.findElement(By.className("x-btn-text")).click(); //check ment
		driver.findElement(By.linkText("Find Contacts")).click(); 
		
		
		/*driver.findElement(By.linkText("Create Contact")).click();
		driver.findElement(By.id("firstNameField")).sendKeys("Neha");
		driver.findElement(By.id("lastNameField")).sendKeys("venkat");
		driver.findElement(By.name("submitButton")).click();
		//System.out.println(firstNameField);
		String title = driver.getTitle();
		System.out.println(title);*/
		
	
		
		
		
	}

}
