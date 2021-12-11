package week2.day1;

import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginFirefox {

	public static void main(String[] args) {
	
		//set up the chrome driver
	//	WebDriverManager.chromedriver().setup();
		WebDriverManager.firefoxdriver().setup();
		
		//Launch the chrome browser
		FirefoxDriver driver=new FirefoxDriver();
		
		
		//load the url
		driver.get("http://leaftaps.com/opentaps/control/main");
		//http://leaftaps.com/opentaps/control/main
		
		//maximize the browser
		driver.manage().window().maximize();
		
		String title = driver.getTitle();
		System.out.println(title);
		
		//driver.close();
		
		
		
		
		
		
		
		
		
		
		
	}

}
