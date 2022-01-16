package pages;


import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import base.BaseClass;

public class LoginPage extends BaseClass{
		
	
	//Created constructor so that driver can be received from testcases
		public LoginPage(ChromeDriver driver) {
			this.driver=driver;
			
			
		}
	
	
						//action + element (enterUsername)
		public LoginPage enterUsername(String username) throws InterruptedException, IOException {
		try {
			driver.findElement(By.id("username")).sendKeys(username);
			reportStep(username + "Username is entered successfully", "pass");
		} catch (Exception e) {
			reportStep(username + "Username is not entered successfully"+e, "fail");
		}
			
		//	Thread.sleep(10000);
			return this;
		}
		
		public LoginPage enterPassword(String password) throws IOException {
			try {
				driver.findElement(By.id("password")).sendKeys(password);
				reportStep(password + "password is entered successfully", "pass");
			} catch (Exception e) {
				reportStep(password + "password is not entered successfully"+e, "fail");
			}
			return this;

		}
		
		public HomePage clickLoginButton() throws IOException {
			try {
				driver.findElement(By.className("decorativeSubmit")).click();
				reportStep("Login button is clicked", "pass");
			} catch (Exception e) {
				reportStep("Login button is not clicked", "fail");
			}
			return new HomePage(driver);
			

		}

	}


