package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.SafariDriverManager;

public class A2DeleteFindLead {

	public static void main(String[] args) throws InterruptedException {

		
		WebDriverManager.chromedriver().setup();
	
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/main");
	
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.linkText("Phone")).click();
		driver.findElement(By.name("phoneNumber")).sendKeys("1238904567");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click(); 
		
		Thread.sleep(1000);
		String cid = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).getText();
		System.out.println(cid);
		//check with mentor /a
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		driver.findElement(By.linkText("Delete")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.name("id")).sendKeys(cid);
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		
		Thread.sleep(1000);
	//	driver.findElement(By.linkText("No records to display")).getText();
		String norec = driver.findElement(By.xpath("//div[@class='x-paging-info']")).getText();
		System.out.println(norec);
		driver.close();
		
		
		
		
	//	driver.close();
		
		//String norec=driver.findElement(By.linkText("No records to display")).getText();
	/*	String nrd= "No records to display";
		
		if (nrd==driver.findElement(By.linkText("No records to display")).getText()) {
		
		
		System.out.println(cid + "Lead is deleted ");
		
		}*/
		
		
		///String title = driver.getTitle();
		//System.out.println(title);
		
		
		
		
	}

}
