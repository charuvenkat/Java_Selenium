package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assign1Fb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		driver.findElement(By.name("firstname")).sendKeys("Nehashritha");
		
		//driver.findElement(By.xpath("//input[@id='u_13_d_iE']")).sendKeys("Venkat");chk ment
		driver.findElement(By.name("lastname")).sendKeys("Venkat");
		
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("6788999998");
		driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("babyneha");
	
		WebElement dsource=driver.findElement(By.id("day"));
		Select dselect = new Select(dsource);
		dselect.selectByVisibleText("4");
		
		WebElement msource=driver.findElement(By.id("month"));
		Select mselect=new Select(msource);
		mselect.selectByVisibleText("Feb");
				
		WebElement ysource=driver.findElement(By.id("year"));
		Select yselect=new Select(ysource);
		yselect.selectByVisibleText("2004");
		
		driver.findElement(By.xpath("//label[text()='Female']")).click();
		
		//'check with mentor below
	//	driver.findElement(By.id("u_13_4_w/")).click();
	//	WebElement radio=driver.findElement(By.xpath("//input[@id='u_13_4_w/']"));
	//	radio.click();
		
		
	}

}


