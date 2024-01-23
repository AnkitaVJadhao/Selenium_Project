package actionsStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ContextclickandDoubleclick {

	public static void main(String[] args) 
	{
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		WebElement rightclick = driver.findElement(By.className("home-link"));
		
		Actions act=new Actions(driver);
		//act.moveToElement(rightclick).contextClick().build().perform();
		act.contextClick(rightclick).perform();
		
		WebElement clicks = driver.findElement(By.xpath("//button[text()='Copy Text']"));
		//act.moveToElement(clicks).doubleClick().build().perform();
		act.doubleClick(clicks).perform();
		

	}

}
