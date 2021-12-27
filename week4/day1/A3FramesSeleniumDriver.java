package week4.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class A3FramesSeleniumDriver {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
	
		//Headless Mode in selenium

		// To Disable Notification
				ChromeOptions option = new ChromeOptions();
				option.addArguments("--disable-notifications");
				ChromeDriver driver = new ChromeDriver(option);

		driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		
		
	}

}
