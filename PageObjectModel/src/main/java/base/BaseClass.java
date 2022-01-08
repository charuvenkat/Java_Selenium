package base;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;
import utils.ReadExcel;

public class BaseClass {

	public ChromeDriver driver; // driver = null

	public String fileName;

	@DataProvider
	public String[][] sendData() throws IOException {

		return ReadExcel.readData(fileName);

	}

	@Parameters({"url"})
	@BeforeMethod
	public void preCondition(String url) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(); // driver is initialized "sdadq442342dfdff"
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		

	}

	@AfterMethod
	public void postCondition() {
		driver.close();

	}

}
