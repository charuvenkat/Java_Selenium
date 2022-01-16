package pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import base.BaseClass;

public class HomePage extends BaseClass{
	
	//Created constructor so that driver can be received from testcases
			public HomePage(ChromeDriver driver) {
				this.driver=driver;
				
			}

	public MyHomePage  clickCrmsfaLink() {
		driver.findElement(By.linkText("CRM/SFA")).click();
		return new MyHomePage(driver);
	}
	public LoginPage clickLogout(){
		driver.findElement(By.className("decorativeSubmit")).click();
		return new LoginPage(driver);
	
	}
	public HomePage  verifyHomepage() throws IOException {
		try {
			boolean	displayed = driver.findElement(By.linkText("CRM/SFA")).isDisplayed();
		//	System.out.println(displayed);
			Assert.assertTrue(displayed);
			reportStep("Homepage is displayed","pass");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			reportStep("Homepage is not displayed","fail");
		}
		
		return this;
		
}
}