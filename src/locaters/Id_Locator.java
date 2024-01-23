package locaters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Id_Locator {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();   //interface  
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/login/");
		Thread.sleep(1000);
		
		//Webelement method
		//Locator :-id 
		//By.id("")
		driver.findElement(By.id("email")).sendKeys("xyz@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.id("email")).clear();
		Thread.sleep(1000);
		driver.findElement(By.id("email")).sendKeys("xyz1@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.id("loginbutton")).click();
		
		
	}

}
