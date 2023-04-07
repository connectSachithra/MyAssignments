package week2day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Createcontact {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  ChromeDriver driver=new ChromeDriver();
			driver.get( "http://leaftaps.com/opentaps/control/login");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
			driver.findElement(By.id("username")).sendKeys("demoSalesManager");
			driver.findElement(By.id("password")).sendKeys("crmsfa");
			driver.findElement(By.className("decorativeSubmit")).click();
			driver.findElement(By.linkText("CRM/SFA")).click();
	        driver.findElement(By.linkText("Contacts")).click();
	        driver.findElement(By.linkText("Create Contact")).click();
	        driver.findElement(By.id("firstNameField")).sendKeys("Sachithra");
	        driver.findElement(By.id("lastNameField")).sendKeys("Devi");
	        driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("sasi");
	        driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("thara");
	        driver.findElement(By.id("createContactForm_departmentName")).sendKeys("Computer");
	        driver.findElement(By.id("createContactForm_description")).sendKeys("NIL");
	        driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("sachithra@gmail.com");
	        Select op=new Select(driver.findElement(By.id("createContactForm_generalStateProvinceGeoId")));
			op.selectByVisibleText("New York");
			driver.findElement(By.name("submitButton")).click();
			driver.findElement(By.linkText("Edit")).click();
			driver.findElement(By.name("description")).clear();
			driver.findElement(By.id("updateContactForm_importantNote")).sendKeys("Good job");
			driver.findElement(By.xpath("(//input[@class='smallSubmit'])[1]")).click();
}
}
