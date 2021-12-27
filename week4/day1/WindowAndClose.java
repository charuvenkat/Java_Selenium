package week4.day1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowAndClose {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver=new ChromeDriver();
	
		driver.get("https://www.irctc.co.in/nget/train-search");
		driver.manage().window().maximize();
		/*  NAvigate to https://www.irctc.co.in/nget/train-search
			2. Close the sweet alert
			3. Click on Flights
			4. Get the title in Flights page
		 * SweetAlert handled by element locator
		 */
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.findElement(By.linkText("FLIGHTS")).click();
		Set<String>windowHandles=driver.getWindowHandles();
		List<String>handles = new ArrayList<String>(windowHandles);
		driver.switchTo().window(handles.get(1));
		System.out.println(driver.getTitle());
		driver.switchTo().window(handles.get(0));
		
		driver.close();

	}

}
