package actionsStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop

{

	public static void main(String[] args) 
	{
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		WebElement box1 = driver.findElement(By.id("draggable"));
		WebElement box2 = driver.findElement(By.id("droppable"));
		
		Actions act=new Actions(driver);
		act.moveToElement(box1).clickAndHold().moveToElement(box2).release().build().perform();
		act.clickAndHold(box1).release(box2).build().perform();
		//act.moveToElement(box1).dragAndDrop(box1, box2).build().perform();
		//act.dragAndDrop(box1, box2).perform();
		
		
		
	}
}
