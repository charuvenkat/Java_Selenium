package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragAndDrop {

	public static void main(String[] args) {
			

		WebDriverManager.chromedriver().setup();
		
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		//options.setHeadless(true);
		
		//Launch the Browser
		ChromeDriver driver = new ChromeDriver(option);
	
		//Load the URl
		driver.get("http://leafground.com/pages/drag.html");
		
		//Maximize the Browser
		driver.manage().window().maximize();
		
		//Implicit Wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//Create Actions Object
		Actions builder = new Actions(driver);

		//Drag and Drop
		WebElement dragEle =  driver.findElement(By.id("draggable"));
	//	WebElement dropEle =  driver.findElement(By.id("droppable"));
		
	//	builder.dragAndDrop(dragEle, dropEle).perform();
		
		Point location = dragEle.getLocation();
		int x = location.getX();
		int y = location.getY();
		
		builder.dragAndDropBy(dragEle, 100, 150).perform();

	}

}
