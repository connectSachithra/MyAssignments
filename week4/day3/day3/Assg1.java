package week4.day3;



import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Assg1 extends basecas {
	@Test
	public  void runassg1() throws InterruptedException {

		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));		    	 
    	WebElement until = wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//a[@title='Opportunities']"))));
    	
	//4. Click on Opportunity tab 
    	WebElement opportunities = driver.findElement(By.xpath("(//span[text()='Opportunities'])[1]"));
    	driver.executeScript("arguments[0].click()", opportunities);
    	
    	//5. Click on New button
    	driver.findElement(By.xpath("//a[@title='New']")).click();
    	//6. Enter Opportunity name as 'Salesforce Automation by Your Name,Get the text and Store it 
    	driver.findElement(By.xpath("//input[@name='Name']")).sendKeys("Salesforce Automation by Sachithra");
    	//7. Choose close date as Today
        driver.findElement(By.xpath("//input[@name='CloseDate']")).click();
        
        DateFormat dateformat = new SimpleDateFormat("dd");
		Date date = new Date();
		
		String date1 = dateformat.format(date);
		System.out.println(date1);
		
		int  currentdate= Integer.parseInt(date1);
		
    	driver.findElement(By.xpath("//span[text()='"+currentdate+"']")).click();
    	//8. Select 'Stage' as Need Analysis
		driver.findElement(By.xpath("(//button[contains(@id,'combobox')])[1]")).click();
		WebElement stage = driver.findElement(By.xpath("//span[@title='Needs Analysis']"));
    	stage.click();
    	
    	//9. click Save and VerifyOppurtunity Name"
		driver.findElement(By.xpath("//button[@name='SaveEdit']")).click();

	}

}
