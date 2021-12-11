package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class A2CreateContact {

	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.linkText("Create Contact")).click();
		driver.findElement(By.id("firstNameField")).sendKeys("Anu");
		driver.findElement(By.id("lastNameField")).sendKeys("Kamal");
		driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("AnuL");
		driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("KamalL");
		driver.findElement(By.id("createContactForm_departmentName")).sendKeys("Finance");
		driver.findElement(By.id("createContactForm_description")).sendKeys("kamal Finance Description");
		driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("anus@gmail.com");
		

		WebElement source=driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
		Select state=new Select(source);
		state.selectByVisibleText("New York");
		
		
		driver.findElement(By.name("submitButton")).click();
		driver.findElement(By.className("subMenuButton")).click();
		driver.findElement(By.id("updateContactForm_description")).clear();
		driver.findElement(By.xpath("//input[@value='Update']")).click();
		String title = driver.getTitle();
		System.out.println(title);
		driver.close();
		
	
		
		
		

		
	}

}
