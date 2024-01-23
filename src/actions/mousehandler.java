package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mousehandler {

	public static void main(String[] args) 
	{
		 WebDriver driver =new ChromeDriver();
		 driver.get("http://omayo.blogspot.com/");
		 WebElement Blogs = driver.findElement(By.cssSelector("#blogsmenu"));
		 //Contain all driver method in Action
		 //Driver should be must in Actions class because it's give permission to action class 
         Actions action=new Actions(driver);
         
         action.moveToElement(Blogs).perform();
         WebElement option2 = driver.findElement(By.xpath("//a/span[text()='SeleniumByArun']"));
         //Standerd practice :- build should be there if we are using more than one method ;
         action.moveToElement(option2).click().build().perform();
          
	}

}
