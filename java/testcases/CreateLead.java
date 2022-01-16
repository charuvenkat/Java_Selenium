package testcases;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.BaseClass;
import pages.LoginPage;
import pages.CreateLeadPage;

public class CreateLead extends BaseClass{
	
	@BeforeTest
	public void setData() 
	{
		
		fileName= "CreateLead";	
		testName = "CreateLead";
		testDescription = "CreateLead with mandarory fields";
		testCategory = "regression";
		testAuthor = "Hari";
	}

	@Test(dataProvider = "sendData")
	public void runCreateLead(String username,String password, String company, String firstName, String lastName ) throws InterruptedException, IOException {
		
	//	LoginPage lp= new LoginPage();
		//lp.enterUsername(); // no need create obj directly write new loginpage
		
		new LoginPage(driver).enterUsername(username)
		.enterPassword(password)
		.clickLoginButton()
		.clickCrmsfaLink().clickLeadsLink()
		.clickCreateLeadLink()
		.enterFirstName(firstName)
		.enterLastName(lastName)
		.enterCompanyName(company)
		.clickCreateLeadButton()
		.verifyFirstName();

		
	}
	
}
