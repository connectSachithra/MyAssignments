package week2.day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Asstwo1 {

	public static void main(String[] args) {
		 ChromeDriver driver=new ChromeDriver();
			driver.get( "http://leaftaps.com/opentaps/control/login");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
			driver.findElement(By.xpath("//input[@name='USERNAME']")).sendKeys("demoSalesManager");
			driver.findElement(By.xpath("//input[@name='PASSWORD']")).sendKeys("crmsfa");
			driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
			driver.findElement(By.xpath("//div[@ id='label']/a")).click();
			driver.findElement(By.xpath("//a[text()='Contacts']")).click();
			driver.findElement(By.xpath("//a[text()='Create Contact']")).click();
			driver.findElement(By.xpath("//input[@id='firstNameField']")).sendKeys("Sachithra");
			driver.findElement(By.xpath("//input[@id='lastNameField']")).sendKeys("devi");
			driver.findElement(By.xpath("//input[@id='createContactForm_departmentName']")).sendKeys("Computer");
			driver.findElement(By.xpath("//textarea[@id='createContactForm_description']")).sendKeys("NIL");
driver.findElement(By.xpath("//input[@id='createContactForm_primaryEmail']")).sendKeys("sachithra.devi1@gmail.com");
Select op=new Select(driver.findElement(By.xpath("//select[@id='createContactForm_generalStateProvinceGeoId']")));
op.selectByVisibleText("New York");
driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
driver.findElement(By.xpath("//a[text()='Edit']")).click();
driver.findElement(By.xpath("//textarea[@id='updateContactForm_description']")).clear();
driver.findElement(By.xpath("//textarea[@id='updateContactForm_description']")).sendKeys("Good job");
driver.findElement(By.xpath("(//input[@class='smallSubmit'])[1]")).click();




	}

}
