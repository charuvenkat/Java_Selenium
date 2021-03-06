package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.BaseClass;

public class CreateLeadPage extends BaseClass {
	

	public CreateLeadPage(ChromeDriver driver) {
		this.driver = driver;
		
	}

	public CreateLeadPage enterFirstName(String firstName) {

		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(firstName);
		return this;
	}

	public CreateLeadPage enterLastName(String lastName) {
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lastName);
		return this;
	}

	public CreateLeadPage enterCompanyName(String company) {
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(company);
		return this;
	}

	public ViewLeadPage clickCreateLeadButton() {

		driver.findElement(By.name("submitButton")).click();
		
		return new ViewLeadPage(driver);
		
		
		
	}

}
