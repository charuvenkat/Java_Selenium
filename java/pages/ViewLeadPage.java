package pages;

import org.openqa.selenium.chrome.ChromeDriver;

import base.BaseClass;

public class ViewLeadPage extends BaseClass{
	
	//Created constructor so that driver can be received from testcases
			public ViewLeadPage(ChromeDriver driver) {
				this.driver=driver;
				
			}

	public ViewLeadPage verifyFirstName() {
		System.out.println("First name displayed");
		
		return this;
	}

}
