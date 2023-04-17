package week3.day4;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsF {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com/alert.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//1.simple alert
		driver.findElement(By.xpath("(//span[text()='Show'])[1]")).click();
        Alert click = driver.switchTo().alert();
        click.accept();
        //2.confirm alert
        driver.findElement(By.xpath("(//span[text()='Show'])[2]")).click();
        Alert click1 = driver.switchTo().alert();
        click1.dismiss();
        //3.sweet alert
        driver.findElement(By.xpath("(//span[text()='Show'])[3]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//span[text()='Dismiss']")).click();
        //4.sweet modal
        driver.findElement(By.xpath("(//span[text()='Show'])[4]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//span[@class='ui-icon ui-icon-closethick'])[2]")).click();
        //5.prompt
        driver.findElement(By.xpath("(//span[text()='Show'])[5]")).click();
        Alert click2 = driver.switchTo().alert();
        click2.sendKeys("Test Leaf");
        click2.accept();
		 
	}
	
}
