package seleniumstudy1;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window_HandlingExamples {

	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		
		
		//Window Handling 
		//Child browser popup	
	driver.findElement(By.linkText("Blogger")).click();
	driver.switchTo().newWindow(WindowType.TAB);     //Selenium 4 
	driver.get("https://www.facebook.com/login/");
	driver.switchTo().newWindow(WindowType.TAB);
	driver.get("https://tutorialsninja.com/demo/");
	
	
	Set<String> ids = driver.getWindowHandles();
	Iterator<String> it= ids.iterator();
	
	while(it.hasNext())
	{
		String id=it.next();
		String title = driver.switchTo().window(id).getTitle();
		System.out.println(title);
		
	}
	

	}

}
