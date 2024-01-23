package locaters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class css_selector {

	public static void main(String[] args)
	{
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/login/");
		
		//CSS :- Tag and ID 
		driver.findElement(By.cssSelector("div#email_container")).sendKeys("xyz@gmail.com");
		
		//CSS :- Tag and class
		
		

	}

}
