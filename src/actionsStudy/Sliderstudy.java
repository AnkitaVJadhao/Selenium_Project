package actionsStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sliderstudy {

	public static void main(String[] args) 
	{
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		WebElement slider = driver.findElement(By.xpath("//span[contains(@class,'corner-all ui-state-default')]"));
		
		Actions act=new Actions(driver);
		act.dragAndDropBy(slider, 100, 0).perform();
	
	}

}
