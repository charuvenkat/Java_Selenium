package week2.day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class A4LeafgroundLinks {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
	
		driver.get("http://leafground.com/pages/Link.html");
		driver.manage().window().maximize();
		
		//1. Go to Home Page
		driver.findElement(By.xpath("(//a[@link='blue'])[1]")).click();
		driver.navigate().back();
		
		//2. Find where am supposed to go without clicking me?
		driver.findElement(By.xpath("//a[@href='Button.html']")).click();
		String url=driver.getCurrentUrl();
		driver.navigate().back();
		System.out.println(url);
		//a[@href='Button.html']
		
		//3. Verify am I broken?
		driver.findElement(By.linkText("Verify am I broken?")).click();
		String tit= driver.getTitle();
		driver.navigate().back();
		if (tit.equals("HTTP Status 404 – Not Found")) {
		System.out.println("Target Link is broken");
		}
		else
		System.out.println("Link is not broken");
		
		
		//4. Go to Home Page (Interact with same link name)

		driver.findElement(By.xpath("(//a[@href='../home.html'])[3]")).click();
		driver.navigate().back();
		
		//5. How many links are available in this page?
		
		System.out.println("The number of links " + driver.findElements(By.tagName("a")).size());
		
		//	List<WebElement> links = driver.findElements(By.tagName("a"));
		//  System.out.println("The number of links " + links.size());
	      driver.close();
		
		
		
		
		
		
		
	}

}
