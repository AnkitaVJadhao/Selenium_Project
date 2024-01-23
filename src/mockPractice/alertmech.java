package mockPractice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alertmech {

	public static void main(String[] args)
	{
	//Handling javascript ALERTS and PROMPTS
		
	WebDriver driver=new ChromeDriver();
	driver.get("https://omayo.blogspot.com/");
	driver.manage().window().maximize();
	driver.findElement(By.id("alert1")).click();
	//to handle alert
	Alert alert = driver.switchTo().alert();
	String alertText = alert.getText();
	alert.accept();
	
	System.out.println(alertText);
	//alert.dismiss();
	driver.findElement(By.id("ta1")).sendKeys("chaitali");
		
		
		

	}

}
