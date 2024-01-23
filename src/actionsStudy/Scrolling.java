package actionsStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Scrolling {

	public static void main(String[] args)
	{
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		
		WebElement selecttwoptions = driver.findElement(By.id("colors"));
		
		Select s1=new Select(selecttwoptions);
		
		Actions act=new Actions(driver);
		act.scrollToElement(selecttwoptions).perform();
		s1.selectByVisibleText("Red");
		s1.selectByValue("blue");
		s1.selectByIndex(3);
		

	}

}
