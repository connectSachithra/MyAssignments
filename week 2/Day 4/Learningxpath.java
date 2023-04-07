package week2.day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Learningxpath {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get( "http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.findElement(By.xpath("//p[@class='top']/input")).sendKeys("DemoCsr");
		driver.findElement(By.xpath(("(//form[@id='login']//input)[2]"))).sendKeys("crmsfa");
		driver.findElement(By.xpath(("(//form[@id='login']//input)[3]"))).click();
		driver.findElement(By.xpath(("//div[@id='label']/a"))).click();
		driver.findElement(By.xpath(("(//div[@class='x-panel-header']/a)[2]"))).click();
		driver.findElement(By.xpath(("(//div[@class='frameSectionBody']//a)[2]"))).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testing");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Sachithra");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("devi");
		driver.findElement(By.name("submitButton")).click();
	}

}
