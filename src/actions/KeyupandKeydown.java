package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyupandKeydown {

	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.get("https://omayo.blogspot.com/");
		WebElement compen = driver.findElement(By.linkText("compendiumdev"));
		
		Actions act=new Actions(driver);
		act.keyDown(Keys.CONTROL).moveToElement(compen).click().keyUp(Keys.CONTROL).build().perform();

	}

}
