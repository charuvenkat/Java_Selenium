package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.SafariDriverManager;

public class A2DuplicateLead {

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
		//driver.findElement(By.linkText("Email")).click();
		//check with mentor for email tab above is working but wrong code below
		//driver.findElement(By.className("x-tab-right")).click();
	   driver.findElement(By.xpath("//span[text()='Email']")).click();
		
		
		driver.findElement(By.xpath("//input[@name='emailAddress']")).sendKeys("charu.wins@gmail.com");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(1000);
		String fname=driver.findElement(By.linkText("jp")).getText();
		System.out.println("First name of the Lead :"+ fname);
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		driver.findElement(By.xpath("//a[text()='Duplicate Lead']")).click();
		
		String title = driver.getTitle();
		System.out.println(title);
	
		
		String tit = driver.findElement(By.xpath("//div[text()='Duplicate Lead']")).getText();
		System.out.println(tit);
		if (tit.equals("Duplicate Lead")) {
			System.out.println("Title of the page is Matched");
			driver.findElement(By.xpath("//input[@name='submitButton']")).click();
			if (fname.equals(driver.findElement(By.xpath("//span[@id='viewLead_firstName_sp']")).getText())){
				System.out.println("Firat name of the duplicate Lead : " + driver.findElement(By.xpath("//span[@id='viewLead_firstName_sp']")).getText());
				System.out.println("Lead succefuly Duplicated");
			}
			
		}
		else
			System.out.println("Title not matched");
		
		
		//String sellead = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']")).getText();
	//	System.out.println(sellead);
		
		
//		driver.close();
		
		
	}

}
