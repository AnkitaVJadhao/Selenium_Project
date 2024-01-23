package locaters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Name_Locator {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		//Webelement method
		//Locator :-name 
		//By.name("")
		driver.findElement(By.name("email")).sendKeys("xyz1@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.name("email")).clear();
		Thread.sleep(1000);
		driver.findElement(By.name("login")).click();

	}

}
