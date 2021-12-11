package week2.day2;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class A4LeafGroundCheckbox {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leafground.com/pages/checkbox.html");
		driver.manage().window().maximize();
		
		//Select the languages that you know?
		//label[text()='Select the languages that you know?']/following::div[3]
		
		
		//Confirm Selenium is checked
		//label[text()='Confirm Selenium is checked']/following::div/input[1]
		
		
		//DeSelect only checked
		//label[text()='DeSelect only checked']
		
		
		//Select all below checkboxes
		//label[text()='Select all below checkboxes ']
			
	}

}
