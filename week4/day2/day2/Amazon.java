package week4.day2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazon {

	public static void main(String[] args) throws InterruptedException, IOException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//1.Load the URL https://www.amazon.in/
		//2.search as oneplus 9 pro 
		driver.get(" https://www.amazon.in");
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("oneplus 9 pro");
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		//3.Get the price of the first product
		String price = driver.findElement(By.xpath("//span[@class='a-price-whole']")).getText();
		System.out.println("Price of first product:"+price);
		//4. Print the number of customer ratings for the first displayed product
		 WebElement rating = driver.findElement(By.xpath("//a[@class='a-popover-trigger a-declarative']"));
    	 rating.click();
    	 Thread.sleep(2000);
    	 String starRating = driver.findElement(By.xpath("//span[@data-hook='acr-average-stars-rating-text']")).getText();
    	 System.out.println("Star rating : "+ starRating);
		//5. Click the first text link of the first image
    	 driver.findElement(By.xpath("//h2[@class='a-size-mini a-spacing-none a-color-base s-line-clamp-2']/a")).click();	    	 
    	 Thread.sleep(3000);
		//6. Take a screen shot of the product displayed
    	 //handle window
 		Set<String>windowHandles=driver.getWindowHandles();
 		List<String>handle=new ArrayList<String>(windowHandles);
 		driver.switchTo().window(handle.get(1));
 		
 		File scr = driver.getScreenshotAs(OutputType.FILE);
		File dst=new File("./snap/s.png");
		FileUtils.copyFile(scr, dst);
		
		//7. Click 'Add to Cart' button
		driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();
   	     Thread.sleep(5000);
		//8. Get the cart subtotal and verify if it is correct.
   	     
   	  String total = driver.findElement(By.xpath("//span[@id='attach-accessory-cart-subtotal']")).getText();
   	  System.out.println("subtotal:"+total);
		//9.close the browser

	}

}
