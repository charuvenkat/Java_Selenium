/*package pages;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import base.BaseClass;

public class LoginPageFactory extends BaseClass{
		
	
	//Created constructor so that driver can be received from testcases
		public LoginPageFactory(ChromeDriver driver) {
			this.driver=driver;
			PageFactory.initElements(driver, this);
			
		}
	
//		@FindBy(how = How.ID, using="username") WebElement eleUsername;
//		@FindBy(how = How.ID, using="password") WebElement elePassword;
//		@FindBy(how = How.CLASS_NAME, using="decorativeSubmit") WebElement eleLogin;

	@FindBy(how = How.CLASS_NAME, using="inputlogin") List< WebElement> eleInputLogin;
		
	
						//action + element (enterUsername)
		public LoginPageFactory enterUsername(String username) throws InterruptedException {
		
	//	eleUsername.sendKeys(username);
		eleInputLogin.get(0).sendKeys(username);
			
		//	driver.findElement(By.id("username")).sendKeys(username);
			
		//	Thread.sleep(10000);
			return this;
		}
		
		public LoginPageFactory enterPassword(String password) {
		
	//	elePassword.sendKeys(password);
	
			
		eleInputLogin.get(1).sendKeys(password);

		//	driver.findElement(By.id("password")).sendKeys(password);
			return this;

		}
		
		public HomePage clickLoginButton() {
			
			//eleLogin.click();
			driver.findElement(By.className("decorativeSubmit")).click();
			return new HomePage(driver);
			

		}

	}*/


