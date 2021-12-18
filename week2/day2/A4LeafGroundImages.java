package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class A4LeafGroundImages {


		public static void main(String[] args) {
			
			WebDriverManager.chromedriver().setup();
			ChromeDriver driver = new ChromeDriver();
		
			driver.get("http://leafground.com/pages/Image.html");
			driver.manage().window().maximize();
			
			//1. Go to Home Page
			driver.findElement(By.xpath("//img[@src='../images/home.png']")).click();
			driver.navigate().back();
		
			
			Boolean chkenabled = (driver.findElement(By.xpath("//img[@src='../images/abcd.jpg']")).isEnabled());
			System.out.println(chkenabled);
			driver.findElement(By.xpath("//img[@src='../images/abcd.jpg']")).click();
			String tit= driver.getTitle();
			driver.navigate().back();
			if (tit.equals("HTTP Status 404 – Not Found")) {
			System.out.println("Target Link is broken");
			}
			else
			System.out.println("Link is not broken");
			System.out.println(tit);
			
			
			//img[@src='../images/keyboard.png']
			

	}

}
