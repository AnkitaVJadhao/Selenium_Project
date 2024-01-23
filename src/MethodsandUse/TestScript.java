package MethodsandUse;

import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestScript {

	public static void main(String[] args) throws IOException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.redbus.in/");
		
	
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		CommonlyUsedMethod.implicitlywait(driver, 20);
		
		//To take screenshot directly called static method using class name and provide arguments
		//CommonlyUsedMethod.takesScreenshot(driver,"Homepage");
		
		//specific ss
		WebElement specific = driver.findElement(By.xpath("//div[@class='imgCard']"));
		//CommonlyUsedMethod.takesScreenshot(driver, "ABC", specific);
		
		//border
		//CommonlyUsedMethod.solidborder(driver, specific);
		//dotted
		CommonlyUsedMethod.dottedborder(driver, specific);
	
//		WebElement GLOBALPRESENCE = driver.findElement(By.xpath("//h2[text()='Global Presence']"));
//	    CommonlyUsedMethod.scrolling(driver,GLOBALPRESENCE);
//	    CommonlyUsedMethod.takesScreenshot(driver,"After Scrolling");
	    
	    
		
		
		

	}

}
