package week4.day3;



import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Assg2 extends basecas {
	@Test
	public  void runassg1() throws InterruptedException {

		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));		    	 
    	WebElement until = wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//a[@title='Opportunities']"))));
    	
	//4. Click on Opportunity tab 
    	WebElement opportunities = driver.findElement(By.xpath("(//span[text()='Opportunities'])[1]"));
    	driver.executeScript("arguments[0].click()", opportunities);
    	
    	//5. Click on New button
    	driver.findElement(By.xpath("//a[@title='New']")).click();
     	
    	   //6. Choose Close date as Tomorrow Date
    	    	DateFormat dateformat = new SimpleDateFormat("dd");
    			Date date = new Date();
    			
    			String date1 = dateformat.format(date);
    			System.out.println(date1);
    			
    			int  currentdate= Integer.parseInt(date1);
    			int tomorrowdate=currentdate+1;
    			
    	    	
    	    	driver.findElement(By.xpath("//input[@name='CloseDate']")).click();    	
    	    	driver.findElement(By.xpath("//span[text()='"+tomorrowdate+"']")).click();
		
	
	//7. Click on save 
	driver.findElement(By.xpath("//button[@name='SaveEdit']")).click();
	
    
//8 Verify the Alert message (Complete this field) displayed for Name and Stage"	
	
	String stageMessage = driver.findElement(By.xpath("(//div[text()='Complete this field.'])[2]")).getText();
	
	String opportunityMessage = driver.findElement(By.xpath("//div[text()='Complete this field.']")).getText();
	
	if (stageMessage.equals("Complete this field.") && opportunityMessage.equals("Complete this field.")) {
		
		System.out.println("Complete this field error message displayed for Opportunity and Stage");
		
	}
	
	else
	{
		System.out.println("Complete this field error message not displayed for Opportunity and Stage");
	}


	
}

}