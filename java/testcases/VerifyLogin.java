package testcases;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.BaseClass;
import pages.LoginPage;
//import pages.LoginPageFactory;

public class VerifyLogin extends BaseClass{
	
	
	@BeforeTest
	public void setData() 
	{
		
		fileName= "LoginData";
		testName = "Login";
		testDescription = "Login Testcase";
		testCategory = "smoke";
		testAuthor = "Hari";
	}

	@Test(dataProvider = "sendData")
	
	public void runLogin(String username, String password) throws InterruptedException, IOException {
		//System.out.println("test case :" + driver);
		
		//LoginPageFactory lp = new LoginPageFactory(driver);
		LoginPage lp = new LoginPage(driver);
		lp.enterUsername(username)
		.enterPassword(password)
		.clickLoginButton()
		.verifyHomepage();
		
	}

}
