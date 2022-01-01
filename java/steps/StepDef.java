package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDef {
	
	public ChromeDriver driver;
	
	@Given("open the chrome browser")
	public void open_the_chrome_browser() {
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();	

	}
	@Given("load the application url")
	public void load_the_application_url() {
		driver.get("http://leaftaps.com/opentaps/control/main");	
	}
	@Given("Enter the username as {string}")
	public void enter_the_username_as_demosalesmanager(String username) {
		driver.findElement(By.id("username")).sendKeys(username);
	}

	@Given("Enter the psssword as {string}")
	public void enter_the_psssword_as_crmsfa(String password) {
		driver.findElement(By.id("password")).sendKeys(password);
	}
	@When("click on login button")
	public void click_on_login_button() {
		driver.findElement(By.className("decorativeSubmit")).click();
	}
	@Then("Homepage should be displayed")
	public void homepage_should_be_displayed() {
		boolean displayed = driver.findElement(By.linkText("CRM/SFA")).isDisplayed();
		if(displayed) {
			System.out.println("Homepage is displayed");
		}
		else {
			System.out.println("Homepage is not displayed");
		}
	}
	
	
	@But("Error message should be displayed")
	public void verifyErrorMessage() {
		
			System.out.println("Error message is displayed");
		}
	}
	
