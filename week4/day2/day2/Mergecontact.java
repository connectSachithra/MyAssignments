package week4.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mergecontact {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.findElement(By.id("username")).sendKeys("DemoCsr");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.xpath("//a[text()='Merge Contacts']")).click();
		//7.Click on Widget of From Contact
		driver.findElement(By.xpath("//img[@alt='Lookup']")).click();
		 // 8. Click on First Resulting Contact
		Set<String>windowHandles=driver.getWindowHandles();
		List<String>handle=new ArrayList<String>(windowHandles);
		driver.switchTo().window(handle.get(1));
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		driver.switchTo().window(handle.get(0));
		Thread.sleep(3000);
		//9. Click on Widget of To Contact
		driver.findElement(By.xpath("(//img[@alt='Lookup'])[2]")).click();
		 // 10. Click on Second Resulting Contact
		Set<String>windowHandles1=driver.getWindowHandles();
		List<String>handle1=new ArrayList<String>(windowHandles1);
		driver.switchTo().window(handle1.get(1));
	    driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a)[2]")).click();
		driver.switchTo().window(handle1.get(0));
		Thread.sleep(3000);
		 // 11. Click on Merge button using Xpath Locator
		driver.findElement(By.linkText("Merge")).click();
		// 12. Accept the Alert
		Alert click = driver.switchTo().alert();
        click.accept();
		 // 13. Verify the title of the page
        String Title=driver.getTitle();
		 System.out.println(Title);
		 driver.close();
		
	}
}
		
		
		
		
		


