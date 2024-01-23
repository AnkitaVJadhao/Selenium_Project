package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickandHold {

	public static void main(String[] args)
	{
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		WebElement box1 = driver.findElement(By.id("box1"));
		WebElement box2 = driver.findElement(By.id("box101"));
		Actions act3=new Actions(driver);
		act3.clickAndHold(box1).moveToElement(box2).release().build().perform();
        
		
		WebElement stock = driver.findElement(By.id("box2"));
		WebElement sweden = driver.findElement(By.id("box102"));
		act3.dragAndDrop(stock, sweden).perform();
		
	}

}
