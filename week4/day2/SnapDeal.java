package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SnapDeal {

	public static void main(String[] args)throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(option);
	
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.snapdeal.com/");
		
		WebElement mensFashion = driver.findElement(By.xpath("//a[@class='menuLinks leftCategoriesProduct ']/span[contains(text(),'Men')]"));
		System.out.println("mensFashion" + mensFashion);
		WebElement shirts = driver.findElement(By.xpath("(//span[text()='Shirts'])[2]"));
		System.out.println("shirts " + shirts);
		Thread.sleep(2000);
		Actions builder = new Actions(driver);
		builder.moveToElement(mensFashion).pause(1000).click(shirts).perform();
		
		WebElement wishList = driver.findElement(By.xpath("//span[@class='animated-icon']"));
		builder.moveToElement(wishList).perform();
		driver.findElement(By.xpath("//div[contains(text(),'Quick View')]")).click();
		
	}

}
