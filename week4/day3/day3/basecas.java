package week4.day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class basecas {
	ChromeDriver driver  = new ChromeDriver();
	
		 @BeforeMethod
			public void precondition() {
				driver.manage().window().maximize();
				driver.get("https://login.salesforce.com");
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
				driver.findElement(By.xpath("//input[@id='username']")).sendKeys("hari.radhakrishnan@qeagle.com");
		    	driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Leaf@123");
		    	driver.findElement(By.xpath("//input[@id='Login']")).click();
		    	driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
		    	driver.findElement(By.xpath("//button[text()='View All']")).click();
		    	driver.findElement(By.xpath("//p[text()='Sales']")).click();
		 }

@AfterMethod

public void postcondition() {
driver.close();
}
}
	