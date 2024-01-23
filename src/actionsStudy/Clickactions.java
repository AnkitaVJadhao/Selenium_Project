package actionsStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Clickactions {

	public static void main(String[] args) 
	{

            WebDriver driver=new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("https://testautomationpractice.blogspot.com/");
            
//          driver.findElement(By.className("wikipedia-search-button")).click();
            
            WebElement clicksearch = driver.findElement(By.className("wikipedia-search-button"));
            Actions act=new Actions(driver);
//          act.moveToElement(clicksearch).perform();
//          act.click().perform();            
//          act.click(clicksearch).perform();            
//          act.moveToElement(clicksearch).click().build().perform();
            act.clickAndHold(clicksearch).release().perform();
            

	}

}
