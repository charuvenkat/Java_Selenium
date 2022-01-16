package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.BaseClass;

public class MyHomePage extends BaseClass{
	
	
	//Created constructor so that driver can be received from testcases
			public MyHomePage(ChromeDriver driver) {
				this.driver=driver;
				
			}

	public MyLeadsPage clickLeadsLink() {
		driver.findElement(By.linkText("Leads")).click();
		return new MyLeadsPage(driver);
	}
}
