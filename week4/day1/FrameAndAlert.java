package week4.day1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FrameAndAlert {

	public static void main(String[] args) {
		
				WebDriverManager.chromedriver().setup();
			
				ChromeDriver driver=new ChromeDriver();
			
				driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_prompt");
				
				driver.manage().window().maximize();
				
				driver.switchTo().frame(0);
				driver.findElement(By.xpath("//button[text()='Try it']")).click();
				Alert alert=driver.switchTo().alert();
				alert.sendKeys("Testleaf");
				alert.accept();
				String text = driver.findElement(By.id("demo")).getText();
				boolean contains = text.contains("leaf");
				//System.out.println(contains);
				//System.out.println(text);
				if(contains=true) {
				//	if(text.contains("Test"))
				System.out.println("Text is Printed"); }
				else
				System.out.println("Text is not printed");
		 	
	}

}
