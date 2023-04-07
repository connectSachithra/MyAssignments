package week2day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AssFacebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get(" https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("sachithra");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("devi");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("sachithradevi");
		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("12345");
		Select options=new Select(driver.findElement(By.id("day")));
		options.selectByIndex(2);
		Select op=new Select(driver.findElement(By.id("month")));
		op.selectByVisibleText("Aug");
		Select opt=new Select(driver.findElement(By.id("year")));
		opt.selectByValue("1992");
	    WebElement radio= driver.findElement(By.className("_58mt"));
		radio.click();
		
	}

}
