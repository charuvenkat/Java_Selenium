package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class A3TestUiPath {

	public static void main(String[] args) {
		
			
			WebDriverManager.chromedriver().setup();
			ChromeDriver driver=new ChromeDriver();
			
			driver.get("https://acme-test.uipath.com/login");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			
			driver.findElement(By.name("email")).sendKeys("kumar.testleaf@gmail.com");
			driver.findElement(By.name("password")).sendKeys("leaf@12");
			
			//check with mentor for contain text-xpath login button
			//driver.findElement(By.xpath("//button[contains[text(),'Login')]")).click();
			driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
			
			         
			String title = driver.getTitle();
			System.out.println(title);
			driver.findElement(By.linkText("Log Out")).click();
			
			driver.close();
			
		
	}

}
