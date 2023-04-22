package week4.day1;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Snapdeal {

	

	public static void main(String[] args) throws InterruptedException, IOException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.snapdeal.com");

		WebElement mens_fashion = driver.findElement(By.xpath("(//span[contains(text(),'Men')])[1]"));
		Actions builder = new Actions(driver);
		builder.moveToElement(mens_fashion).perform();
		driver.findElement(By.xpath("//span[text()='Sports Shoes']")).click();
		String count = driver.findElement(By.xpath("//h1[@class='category-name']/following-sibling::span")).getText();
		System.out.println("Count of the sports shoes: "+count);
		driver.findElement(By.xpath("//div[text()='Training Shoes']")).click();
		driver.findElement(By.xpath("//div[contains(text(),'Popularity')]")).click();
		driver.findElement(By.xpath("(//li[@class='search-li'])[1]")).click();
 String p1 = driver.findElement(By.xpath("(//span[@class='lfloat product-price'])[1]")).getText().replace("Rs. ","");
String p2 = driver.findElement(By.xpath("(//span[@class='lfloat product-price'])[2]")).getText().replace("Rs. ","");
if (Integer.parseInt(p1)<Integer.parseInt(p2)) {
	
	System.out.println("Items are sorted as expected");
}

else
{
	System.out.println("Items are not sorted as expected");
	
}
 
Thread.sleep(2000);
WebElement priceFrom = driver.findElement(By.xpath("//input[@name='fromVal']"));
priceFrom.clear();
priceFrom.sendKeys("500");

Thread.sleep(2000);

WebElement priceTo = driver.findElement(By.xpath("//input[@name='toVal']"));
priceTo.clear();
priceTo.sendKeys("1200");

Thread.sleep(2000);
driver.findElement(By.xpath("//div[contains(text(),'GO')]")).click(); 
Thread.sleep(2000);
String appliedFilters = driver.findElement(By.xpath("(//div[@class='filters'])[1]")).getText();

if (appliedFilters.contains("Price")&&(appliedFilters.contains("Navy"))) {
	
	System.out.println("Filters applied ");
	
}
else
{
	System.out.println("Filters not applied");
	
	WebElement element = driver.findElement(By.xpath("//img[@class='product-image wooble']"));
	
	builder.moveToElement(element).perform();
	
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[contains(text(),'Quick View')]")).click();
	String cost = driver.findElement(By.xpath("//span[contains(@class,'strikee')]")).getText();
	System.out.println(cost);
	
	
	String dp = driver.findElement(By.xpath("//div[contains(@class,'product-price')]/span")).getText();
	System.out.println(dp);
	WebElement shoeImage = driver.findElement(By.xpath("(//ul[@id='bx-slider-qv-image-panel']//img)[1]"));
	
	File src = shoeImage.getScreenshotAs(OutputType.FILE);
	
	File dest = new File("./snap/p.png");
	
	FileUtils.copyFile(src, dest);
	driver.close();
}
	}
}
		
	


