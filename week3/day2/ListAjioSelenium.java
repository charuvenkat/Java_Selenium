package week3.day2;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ListAjioSelenium {

		public static void main(String[] args) throws InterruptedException {
			
			//Launch the ChromeDriver
			WebDriverManager.chromedriver().setup();
			// Step 2: Instantaite the ChromeDriver
			ChromeDriver driver = new ChromeDriver();
			// Loads a new web page in the current browser window
			// Maximise the screen
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.get("https://www.ajio.com/");
			
			driver.findElement(By.name("searchVal")).sendKeys("bags", Keys.ENTER);
			//driver.findElement(By.id("Men")).click();
			Thread.sleep(2000);
			// To the left  of the screen under " Gender" click the "Men"
			driver.findElement(By.xpath("//label[@for='Men']")).click();
			Thread.sleep(2000);
			//Under "Category" click "Fashion Bags"
			driver.findElement(By.xpath("//label[@for='Men - Fashion Bags']")).click();
			Thread.sleep(2000);
			
			
			// Print the count of the items Found.
			String totalItems = driver.findElement(By.className("length")).getText();
			System.out.println("Total number of items : " + totalItems);
			
	        //Get the list of brand of the products displayed in the page and print the list.
			System.out.println(" List of Brands");
			
			List<WebElement> bagBrandList = driver.findElements(By.className("brand"));
			List<String>bn=new ArrayList<String>();
			for(WebElement b: bagBrandList) {
				String text=b.getText();
				bn.add(text);
			}
			System.out.println(bn);
			//System.out.println(" Size :" + bagBrandList.size());
			//System.out.println(" Size :" + bn.size());
		}
}
