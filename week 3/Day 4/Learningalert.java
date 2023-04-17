package week3.day4;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Learningalert {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
       driver.switchTo().frame("iframeResult");
       driver.findElement(By.xpath("//button[text()='Try it']")).click();
       
       Alert click=driver.switchTo().alert();
       click.sendKeys("Sasi");
       click.accept();
       String text = driver.findElement(By.xpath("//p[@id=\"demo\"]")).getText();
       	System.out.println(text);
       
       
       
       
	}

}
