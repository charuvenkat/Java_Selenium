package week4.day1;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SnapShot {

	public static void main(String[] args) throws IOException {
		
		WebDriverManager.chromedriver().setup();
		
		//Headless Mode in selenium

		// To Disable Notification
				ChromeOptions option = new ChromeOptions();
				option.addArguments("--disable-notifications");
				//options.setHeadless(true);
				ChromeDriver driver = new ChromeDriver(option);

		driver.get("http://www.leafground.com/pages/Alert.html");
		driver.manage().window().maximize();
		
		//Screenshot of Webpage
		File source = driver.getScreenshotAs(OutputType.FILE);
		File destination = new File("./Screenshot/leafground.png");
		FileUtils.copyFile(source, destination);
		
		//Screenshot of WebElement
		WebElement alertBox= driver.findElement(By.xpath("//button[text()='Alert Box']"));
		File sourceEle = driver.getScreenshotAs(OutputType.FILE);
		File destinationEle = new File("./alertBox.png");
		FileUtils.copyFile(sourceEle, destinationEle);

	}

}
