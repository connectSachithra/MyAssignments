package week2day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearningXpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  ChromeDriver driver=new ChromeDriver();
			driver.get("http://leaftaps.com/opentaps");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
			driver.findElement(By.xpath("//input[@id='username']")).sendKeys("DemoCsr");
			driver.findElement(By.xpath("(//input[@class='inputLogin'])[2]")).sendKeys("crmsfa");
			driver.findElement(By.xpath("//input[contains(@ class,'Submit') ]")).click();
			driver.findElement(By.xpath("//a[contains(text(),' CRM/SFA')]")).click();
			driver.findElement(By.xpath(("(//div[@class='x-panel-header']/a)[2]"))).click();
			driver.findElement(By.xpath(("//a[(text()= 'Create Lead')]"))).click();
			
		
		
		
	}

}
