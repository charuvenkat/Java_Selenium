package week4.day1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class A1HandleAlerts {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver=new ChromeDriver();
	
		driver.get("http://www.leafground.com/pages/Alert.html");
		
		driver.manage().window().maximize();
		
		
		driver.findElement(By.xpath("//button[text()='Alert Box']")).click();
		Alert alert=driver.switchTo().alert();
		alert.accept();
		
		driver.findElement(By.xpath("//button[text()='Confirm Box']")).click();
		Alert alert2=driver.switchTo().alert();
		//alert2.accept();
		alert2.dismiss();
		
		String text = driver.findElement(By.id("result")).getText();
		System.out.println(text);
		
		driver.findElement(By.xpath("//button[text()='Prompt Box']")).click();
		Alert alert3=driver.switchTo().alert();	
		//alert3.sendKeys("Testleaf");
		alert3.accept();
		String text2 = driver.findElement(By.id("result1")).getText();
		System.out.println(text2);
		
	/*	//check with mentor for line break code
		driver.findElement(By.xpath("//button[text()='Line Breaks?']")).click();
		Alert alert4=driver.switchTo().alert();	
		String lbrk=alert4.getText();
		System.out.println(lbrk);
		alert4.accept();*/
		
		//Sweet Alert - inspect element locate/xpath and action
		driver.findElement(By.xpath("//button[text()='Sweet Alert']")).click();
		driver.findElement(By.xpath("//button[text()='OK']")).click();
		//check with mentor - below happy coding is not printing when sweet alert is only executed
		System.out.println(driver.findElement(By.xpath("//div[@class='swal-text']")).getText());
		
		driver.close();


	}

}
