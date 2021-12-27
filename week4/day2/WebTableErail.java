package week4.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTableErail {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver=new ChromeDriver();
	
		driver.get("https://erail.in/");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement frmstn = driver.findElement(By.id("txtStationFrom"));
		frmstn.clear();
		frmstn.sendKeys("ms");
		frmstn.sendKeys(Keys.TAB);
		
		WebElement tostn = driver.findElement(By.id("txtStationTo"));
		tostn.clear();
		tostn.sendKeys("mdu");
		tostn.sendKeys(Keys.TAB);
		
		driver.findElement(By.xpath("//input[@id='chkSelectDateOnly']")).click(); 
		Thread.sleep(2000);
		int rowCount = driver.findElements(By.xpath("//table[@class='DataTable TrainList TrainListHeader']//tr")).size();
		System.out.println("No.of Rows : + rowCount");	
		List<String> trainNames = new ArrayList<String>();
		for(int i=1; i<=rowCount;i++) {
		String trainName = driver.findElement(By.xpath("//table[@class='DataTable TrainList TrainListHeader']//tr["+i+"]/td[2]")).getText();
		trainNames.add(trainName);
		System.out.println(trainNames);
		
		}
		
		Set<String> setNames =new LinkedHashSet<String>(trainNames);
		if(trainNames.size() != setNames.size()) {
			System.out.println("there are duplicate train names");
		}else {
			System.out.println("There is no duplicated train names");
		}
		
		
	}
	

}
