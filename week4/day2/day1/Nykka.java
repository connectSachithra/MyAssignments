package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Nykka {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.nykaa.com");
		WebElement brands = driver.findElement(By.xpath("//a[text()='brands']"));
		Actions builder = new Actions(driver);
		builder.moveToElement(brands).perform();
		driver.findElement(By.xpath("//img[contains(@src,'lorealparis.png')]")).click();
		
		Thread.sleep(3000);
		String title = driver.getTitle();
		
		if (title.contains("L'Oreal Paris")) {
			
			System.out.println("title contains L'Oreal Paris");
			
		}
		else
		{
			System.out.println("title does not contains L'Oreal Paris");
			
		}
		driver.findElement(By.xpath("//div[contains(text(),'Paris Colour Protect Shampoo')]")).click();
		Thread.sleep(4000);
		Set<String> windowHandles = driver.getWindowHandles();
		   
		List<String> windowList= new ArrayList<String>(windowHandles);
		
		driver.switchTo().window(windowList.get(1));
		
		System.out.println(driver.getWindowHandles().size());
		Select sizeDropdown= new Select(driver.findElement(By.xpath("//select[@title='SIZE']")));//Select size as 180ml
		
		sizeDropdown.selectByIndex(1);
		Thread.sleep(2000);
		String mrp = driver.findElement(By.xpath("//span[text()='₹209']")).getText();
		
		System.out.println("MRP of the product: "+mrp);
		driver.findElement(By.xpath("//span[text()='Add to Bag']")).click();
		driver.findElement(By.xpath("//span[@class='cart-count']")).click();
		Thread.sleep(3000);
		WebElement f1 = driver.findElement(By.xpath("//iframe[@class='css-acpm4k']"));
		
		driver.switchTo().frame(f1);

		String grandTotal = driver.findElement(By.xpath("//span[contains(@class,'css-1um1mkq')]")).getText();
		
		System.out.println("Gramds Total is: "+grandTotal);
		driver.findElement(By.xpath("//span[text()='Proceed']")).click();
		driver.close();
		
		
	}
	
	
	
	

}
