package pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.BaseClass;

public class CreateLeadPage extends BaseClass{
	
	//Created constructor so that driver can be received from testcases and pass driver to all newpages in return stmt
			public CreateLeadPage(ChromeDriver driver) {
				this.driver=driver;
				
			}

	public  CreateLeadPage enterFirstName(String firstName) throws IOException
	{
		try {
			driver.findElement(By.id("createLeadForm_firstName")).sendKeys(firstName);
			reportStep(firstName + "firstname is entered successfully", "pass");

		} catch (Exception e) {
			
			reportStep(firstName + "firstname is not entered successfully", "fail");
		}
		return this;
	}
	public  CreateLeadPage enterLastName(String lastName) throws IOException
	{
		try {
			driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lastName);
			reportStep(lastName + "lastName is entered successfully", "pass");

		} catch (Exception e) {
			reportStep(lastName + "lastName is not entered successfully", "fail");
		}
		return this;
	}
	public  CreateLeadPage enterCompanyName(String company) throws IOException
	{
		try {
			driver.findElement(By.id("createLeadForm_companyName")).sendKeys(company);
			reportStep(company + "companyName is entered successfully", "pass");

		} catch (Exception e) {
			reportStep(company + "companyName is not entered successfully", "fail");
		}
		return this;
	}
	public  ViewLeadPage clickCreateLeadButton() throws IOException
	{
		try {
			driver.findElement(By.name("submitButton")).click();
			reportStep("CreateLead button is clicked", "pass");

		} catch (Exception e) {
			reportStep("CeateLead button is not clicked", "fail");
		}
		return new ViewLeadPage(driver);
	}

		
	}

