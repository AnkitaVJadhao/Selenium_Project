package handlePopUp;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildWindowPopUp {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://skpatro.github.io/demo/links/");
		Thread.sleep(1000);
		String text = driver.findElement(By.xpath("//p[contains(text(),'open link in new browser')]")).getText();
		System.out.println("Text is " +text );
		driver.findElement(By.name("NewWindow")).click();
		
		//Handle childwindowpop
		//For handling popup we have to switch focus of selenium from main page to child window
		//But before that we should know ID of child window
		
		String mainPageID = driver.getWindowHandle();
		System.out.println("ID of main page is "+mainPageID);
		
		//but now we want ID of Child window also ,so will use the getwindowhandles()
		
		Set<String> allWindowIDS = driver.getWindowHandles();
		
		Iterator<String> itr1 = allWindowIDS.iterator();
		
		String mainID = itr1.next();
		System.out.println(mainID);
		String childPageID = itr1.next();
		System.out.println(childPageID);
		
		//Now we have to switch focus from main page to child window
		
		driver.switchTo().window(childPageID);
		Thread.sleep(1000);
		driver.manage().window().maximize();
		driver.findElement(By.id("the7-search")).sendKeys("Hii Ankita!!!!");
		
		//Now again I want to switch to main page for perfomring some actions
		
		driver.switchTo().window(mainID);
		driver.findElement(By.name("home")).click();

	}

}
