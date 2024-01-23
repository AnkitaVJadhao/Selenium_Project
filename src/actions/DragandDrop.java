package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {

	public static void main(String[] args)
	{
		WebDriver driver =new ChromeDriver();
		driver.get("https://omayo.blogspot.com/p/page3.html");
		WebElement slider = driver.findElement(By.xpath("//a[@aria-labelledby='price-min-label']"));
		
		Actions act=new Actions(driver);
		act.dragAndDropBy(slider, -40, 0).perform();
		

	}

}
