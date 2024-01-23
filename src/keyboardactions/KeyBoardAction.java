package keyboardactions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoardAction {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(1000);
		driver.findElement(By.linkText("Create new account")).click();
		Thread.sleep(1000);
		
		WebElement day = driver.findElement(By.id("day"));
		
		Actions act=new Actions(driver);
		act.click(day).sendKeys(Keys.ARROW_DOWN).build().perform();
		Thread.sleep(500);
		act.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(500);
		act.sendKeys(Keys.ARROW_DOWN).perform();
		act.sendKeys(Keys.ENTER).perform();
		
		WebElement month = driver.findElement(By.id("month"));
		act.click(month).perform();
		for(int i=0;i<=10;i++)
		{
			act.sendKeys(Keys.ARROW_UP).perform();
			Thread.sleep(500);
			
		}
		act.sendKeys(Keys.ENTER).perform();
		Thread.sleep(500);
		
		WebElement year = driver.findElement(By.id("year"));
		act.click(year).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
		

	}

}
