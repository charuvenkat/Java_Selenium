package week4.day1;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class A4FunWithFrames {

	public static void main(String[] args) throws IOException {
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver=new ChromeDriver();
	
		driver.get("http://leafground.com/pages/frame.html");
		
		driver.manage().window().maximize();
		
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//button[@id='Click']")).click();
		driver.switchTo().defaultContent();
	
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@src='page.html']")));
		
		driver.switchTo().frame("frame2");
		driver.findElement(By.xpath("//button[@id='Click1']")).click();
		driver.switchTo().defaultContent();
		
		//Frame count
		driver.findElement(By.xpath("//div[@id='wrapframe'][3]"));
		//iframe[@src='countframes.html']
				List<WebElement> frame = driver.findElements(By.xpath("//iframe"));
				System.out.println(frame);

				int size = frame.size();
				System.out.println("No of frame size " + size);
				int count = 0;
				
				for(int i= 0; i<size;i++) {
					driver.switchTo().frame(i);
					//System.out.println(frame);
					System.out.println(driver.findElements(By.tagName("iframe")).size());
					//count = count + driver.findElements(By.tagName("iframe")).size();
					driver.switchTo().defaultContent();
				}
				//System.out.println(count);
				//driver.close();


}
	}