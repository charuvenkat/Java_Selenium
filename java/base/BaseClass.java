package base;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.github.bonigarcia.wdm.WebDriverManager;
import utils.ReadExcel;


public class BaseClass {

	//with static chromedriver parallel testng cant be executed so removed static and created constructor in pages with same class name

	public ChromeDriver driver; //driver = null
	public String fileName;
	public static ExtentReports extent;
	public String testName, testDescription, testCategory, testAuthor;
	public static ExtentTest test;

@BeforeSuite
	public void startReport() {
		// Common for all the test cases
		// Step1: Set up physical report path
		ExtentHtmlReporter reporter = new ExtentHtmlReporter("./reports/result.html");

		// to keep the report history
		reporter.setAppendExisting(true);

		// Step2: Create object for ExtentReports
		extent = new ExtentReports();

		// Step3: attach the data with physical file
		extent.attachReporter(reporter);
		
		}
	@BeforeClass
	public void testcaseDetails() {
		// Step4: Create a test cases and assign test details
		// testName   //testDescription
		test = extent.createTest(testName, testDescription);
		test.assignCategory(testCategory);
		test.assignAuthor(testAuthor);
	}
	
	public int takeSnap() throws IOException {
		int ranNum = (int) (Math.random() * 9999999 );
		
		File source = driver.getScreenshotAs(OutputType.FILE);
		File target = new File("./snaps/img"+ranNum+".png");
		FileUtils.copyFile(source, target);
		
		return ranNum;
		
	}
	
	public void reportStep(String msg, String status) throws IOException {
		if (status.equalsIgnoreCase("pass")) {
			test.pass(msg, MediaEntityBuilder.createScreenCaptureFromPath(".././snaps/img"+takeSnap()+".png").build());;
		}else if(status.equalsIgnoreCase("fail")) {
			test.fail(msg, MediaEntityBuilder.createScreenCaptureFromPath(".././snaps/img"+takeSnap()+".png").build());;
			throw new RuntimeException("see the report for details");
		}
	}

	@DataProvider
	public String[][] sendData() throws IOException{
	
	System.out.println("@Dataprovider started in Lead class");
	return ReadExcel.readData(fileName);
	
	}

	@BeforeMethod
	public void preCondition() {
		
		WebDriverManager.chromedriver().setup();
		
		driver=new ChromeDriver();//driver is initialized "gdgf543545"
		//System.out.println(" Base Class " + driver);
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	}	
	

	@AfterSuite
	public void stopReport() {
		extent.flush();
	}
	
	@AfterMethod
	public void postCondition() {
	driver.close();
	}
		
		

	}

