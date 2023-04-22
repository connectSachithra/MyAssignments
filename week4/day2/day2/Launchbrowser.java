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
import org.openqa.selenium.chrome.ChromeDriver;

public class Launchbrowser {

	public static void main(String[] args) throws IOException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.irctc.co.in/");
		driver.findElement(By.xpath("//a[text()=' FLIGHTS ']")).click();
//handle window
		Set<String>windowHandles=driver.getWindowHandles();
		List<String>handle=new ArrayList<String>(windowHandles);
		driver.switchTo().window(handle.get(1));
//get the title of page.
		String title = driver.getTitle();
		System.out.println(title);
		
// take snap of page,close current window 
        File scr = driver.getScreenshotAs(OutputType.FILE);
		File dst=new File("./snap/s.png");
		FileUtils.copyFile(scr, dst);
		driver.close();
		
//.swtich to first window ,get the title of page,quit
		driver.switchTo().window(handle.get(0));
		String title1=driver.getTitle();
		System.out.println(title1);
		driver.quit();
		
		

	}

}
