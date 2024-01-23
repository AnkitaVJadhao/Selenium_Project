package locaters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class_locator {

	public static void main(String[] args) throws InterruptedException 
	{
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.get("https://www.facebook.com/login/");
		Thread.sleep(1000);
		
		//Webelement method
		//Locator :-class 
		//By.class("")
		driver.findElement(By.className("_97w4")).click();
		Thread.sleep(1000);
		
		

	}

}
