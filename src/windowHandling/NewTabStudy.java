package windowHandling;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class NewTabStudy {

	public static void main(String[] args) throws IOException, InterruptedException
	{
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");	
		driver.findElement(By.xpath("//span[text()='MNC']")).click();
		Thread.sleep(100);
		
		Set<String> allID = driver.getWindowHandles();
		System.out.println(allID);
		
		Iterator<String> t1 = allID.iterator();
		
		String mainPageID = t1.next();
		String childPageID = t1.next();
		
		
		driver.switchTo().window(childPageID);
		Thread.sleep(5000);
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest=new File("C:\\Users\\Ankita\\Desktop\\Velocity\\Selenium\\Screenshots\\MNC1.jpg");
		FileHandler.copy(src, dest);
		Thread.sleep(100);
		driver.switchTo().window(mainPageID);
		Thread.sleep(100);
		driver.findElement(By.xpath("(//input[@class='suggestor-input '])[1]")).sendKeys("Automation Testing");
		
		
		
		

	}

}
