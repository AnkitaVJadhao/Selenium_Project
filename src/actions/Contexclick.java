package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Contexclick {

	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.get("https://tutorialsninja.com/demo/");
		//context :- rightclick on that specific locator
		WebElement search = driver.findElement(By.name("search"));
		Actions act1=new Actions(driver);
		
		act1.contextClick(search).perform();
				
	}

}
