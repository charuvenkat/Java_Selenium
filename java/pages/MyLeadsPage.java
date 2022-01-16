package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.BaseClass;

public class MyLeadsPage extends BaseClass {
	
	//Created constructor so that driver can be received from testcases
			public MyLeadsPage(ChromeDriver driver) {
				this.driver=driver;
				
			}
	
	public CreateLeadPage clickCreateLeadLink() {
		driver.findElement(By.linkText("Create Lead")).click();
		return new CreateLeadPage(driver);

	}
	

}
