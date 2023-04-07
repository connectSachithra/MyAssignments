package week2day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.findElement(By.id("username")).sendKeys("demoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testing");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Sachithra");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("devi");
		Select options=new Select(driver.findElement(By.id("createLeadForm_dataSourceId")));
		options.selectByIndex(4);
		Select op=new Select(driver.findElement(By.id("createLeadForm_marketingCampaignId")));
		op.selectByVisibleText("Automobile");
		Select opt=new Select(driver.findElement(By.id("createLeadForm_ownershipEnumId")));
		opt.selectByValue("OWN_CCORP");
		driver.findElement(By.name("submitButton")).click();
		
		
	}

}
