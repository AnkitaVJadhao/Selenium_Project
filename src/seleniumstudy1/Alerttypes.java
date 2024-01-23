package seleniumstudy1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Alerttypes {

	public static void main(String[] args)
	{
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		
		//Types of alert 
		//1. Information alert
		//2.Cofirmation alert
		//3.Prompt alert
		//4.bootstrap alert pop-up /hidden division
		//
		
		//Alert :- interface
		
		Alert alert = driver.switchTo().alert();
		alert.accept();
		alert.dismiss();
		alert.getText();
		alert.sendKeys(""); // applicable for Prompt alert 
		
		//Authentication pop-up
		//"https://" + username + ":" + password + "@" + domain;
		//driver.get("https://" + username + ":" + password + "@" + "omayo.blogspot.com;");
		//ChromeOptions
		
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--disable-notifications");
		WebDriver driver1=new ChromeDriver(opt);
		
		
		
		
		
		

	}

}
