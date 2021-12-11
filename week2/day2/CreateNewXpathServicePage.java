package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateNewXpathServicePage {

	public static void main(String[] args) {
		
		//set up the chrome driver
		WebDriverManager.chromedriver().setup();
	
		
		//Launch the chrome browser
		ChromeDriver driver=new ChromeDriver();
		
		
		//load the url
		driver.get("https://dev97183.service-now.com/");
		driver.findElement(By.xpath("//input[@id='user_name']"));
		driver.findElement(By.xpath("//input[@id='user_password']"));
		
	}

}
