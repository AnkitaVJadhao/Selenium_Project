package windowHandling;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleTabStudy {

	public static void main(String[] args) throws InterruptedException
	{
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");	
		driver.findElement(By.xpath("//span[text()='MNC']")).click();
		driver.findElement(By.xpath("//span[text()='Sales']")).click();
		driver.findElement(By.xpath("//span[text()='Fresher']")).click();
		Thread.sleep(100);
		
		Set<String> allID = driver.getWindowHandles();
		System.out.println("All IDs are "+allID);
		
		ArrayList<String> a1=new ArrayList<String>(allID);
		
		for(int i=0; i<a1.size();i++)
		{
			driver.switchTo().window(a1.get(i));
			Thread.sleep(1000);
			System.out.println(driver.getTitle());
			Thread.sleep(100);
			driver.close();
			
		}
		
		

	}

}
