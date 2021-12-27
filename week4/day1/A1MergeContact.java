package week4.day1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class A1MergeContact { //not finished - unable to select the fist contact from widget

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver=new ChromeDriver();
	
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();

		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.xpath("//a[text()='Merge Contacts']")).click();
		//check why below 2 line for widget not open.. it worked on img tag
		//driver.findElement(By.cssSelector("//*[@id='ext-gen625']"));
		//driver.findElement(By.id("ext-gen625")).click();		
		driver.findElement(By.xpath("(//img[@src='/images/fieldlookup.gif'])[1]")).click();
		Thread.sleep(3000);
		
		//using Window handle
		Set<String>windowHandles=driver.getWindowHandles();
		List<String>handles = new ArrayList<String>(windowHandles);
		driver.switchTo().window(handles.get(0));
		//System.out.println(driver.getTitle());
		driver.switchTo().window(handles.get(1));
	//	System.out.println(driver.getTitle());
		driver.findElement(By.className("linktext")).click();	

		driver.switchTo().window(handles.get(0));
		
		driver.findElement(By.xpath("(//img[@src='/images/fieldlookup.gif'])[2]")).click();
		Thread.sleep(3000);
		
		//using Window handle
		Set<String>windowHandles2=driver.getWindowHandles();
		List<String>handles2 = new ArrayList<String>(windowHandles2);
		driver.switchTo().window(handles2.get(1));
		
		driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[2]/a")).click();	
		driver.switchTo().window(handles.get(0));
		driver.findElement(By.linkText("Merge")).click();
		
		Alert alert=driver.switchTo().alert();
		alert.accept();
		
		String title = driver.getTitle();
		System.out.println(title);
	
	}

}
