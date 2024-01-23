package windowHandling;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Setstudy 
{

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
	    driver.get("http://omayo.blogspot.com/");	
	    
	    driver.findElement(By.linkText("SeleniumTutorial")).click();
	    Thread.sleep(4000);

	    driver.findElement(By.id("ta1")).sendKeys("Ankita");
	    
	    Set<String> wids = driver.getWindowHandles();
	    System.out.println(wids);
	    Iterator itr=wids.iterator();
	    
	    while(itr.hasNext())
	    {
	    	String wid = (String) itr.next();
	    	driver.switchTo().window(wid);
	    	if(driver.getTitle().equals("Selenium143"))
	    	{
	    		String text = driver.findElement(By.linkText("What is Selenium?")).getText();
	    		System.out.println(text);
	    	    driver.findElement(By.linkText("What is Selenium?")).click();
	    	    
	    	}
	    }
	    
	}
}
