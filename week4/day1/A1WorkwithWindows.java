package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class A1WorkwithWindows {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver=new ChromeDriver();
	
		driver.get("http://www.leafground.com/pages/Window.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//Click button to open home page in New Window
		System.out.println("First button");
		driver.findElement(By.xpath("//button[text()='Open Home Page']")).click();
		
		Set<String>windowHandles=driver.getWindowHandles();
		List<String>handles = new ArrayList<String>(windowHandles);
		driver.switchTo().window(handles.get(1));
		System.out.println(driver.getTitle());
		driver.close();
		
		driver.switchTo().window(handles.get(0));
		//System.out.println(driver.getTitle());
		//driver.close();
		
		//Find the number of opened windows
		System.out.println("Second button");
		
		driver.findElement(By.xpath("//button[text()='Open Multiple Windows']")).click();
		

		Set<String>windowHandles2=driver.getWindowHandles();
		List<String>handles2 = new ArrayList<String>(windowHandles2);
		
		System.out.println(windowHandles2);
		System.out.println("Number of Opened windows  : " + handles2.size());
		int size = handles2.size();
		for(int i=size-1; i>=1;i--) {
			driver.switchTo().window(handles2.get(i));
			System.out.println(driver.getTitle());
			driver.close();
			
		}
		driver.switchTo().window(handles2.get(0));
		System.out.println(driver.getTitle());
		
		//Close all except this window
		System.out.println("Third button");
		WebElement name= driver.findElement(By.xpath("//button[text()='Do not close me ']"));
		String bname=name.getText();
		System.out.println("button name  " + bname);
		
		driver.findElement(By.xpath("//button[text()='Do not close me ']")).click();
		
		Set<String>windowHandles3=driver.getWindowHandles();
		List<String>handles3 = new ArrayList<String>(windowHandles3);
		System.out.println("Number of Opened windows  : " + handles3.size());
		int size2 = handles3.size();
		for(int j=size2-1; j>=1;j--) {
			driver.switchTo().window(handles3.get(j));
			driver.close();
			
		}
		driver.switchTo().window(handles3.get(0));
		System.out.println("Current Window " + driver.getTitle());
		
		
		//Wait for 2 new Windows to open
		System.out.println("Fourth button");
		
		driver.findElement(By.xpath("//button[text()='Wait for 5 seconds']")).click();
		
		Set<String>windowHandles4=driver.getWindowHandles();
		List<String>handles4 = new ArrayList<String>(windowHandles4);
		System.out.println("Number of new Opened windows  : " +( handles4.size()-1));
		int size3 = handles4.size();
		for(int j=size3-1; j>=1;j--) {
			driver.switchTo().window(handles4.get(j));
			driver.close();
			
		}
		driver.switchTo().window(handles4.get(0));
		System.out.println("Current Window :  " + driver.getTitle());
		driver.close();
	}

}
