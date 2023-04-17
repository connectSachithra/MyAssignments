package week3.day4;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assamazon {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Bags");
		driver.findElement(By.xpath("//div[@aria-label='bags for boys']")).click();
		String text = driver.findElement(By.xpath("//div[@class=\"a-section a-spacing-small a-spacing-top-small\"]")).getText();
		System.out.println(text);
		driver.findElement(By.xpath("(//div[contains(@class,'a-checkbox a-checkbox-fancy')]/following-sibling::span)[3]")).click();
		driver.findElement(By.xpath("(//div[contains(@class,'a-checkbox a-checkbox-fancy')]/following-sibling::span)[4]")).click();
		driver.findElement(By.className("a-dropdown-prompt")).click();
		driver.findElement(By.xpath("//*[@id=\"s-result-sort-select_4\"]")).click();
		System.out.println(("Printing Bag details:"));  
		
		
String name = driver.findElement(By.xpath("//div[@class='a-row a-size-base a-color-secondary']//span[1]")).getText();
System.out.println("Bagname is:" +name);
String title = driver.getTitle();
System.out.println("Title of page is:"+title);
driver.close();

		
		
	}

}
