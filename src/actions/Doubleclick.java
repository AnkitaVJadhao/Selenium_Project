package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Doubleclick {

	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		 driver.get("http://omayo.blogspot.com/");
		WebElement doubleclick = driver.findElement(By.id("testdoubleclick"));
        Actions act2=new Actions(driver);
        act2.doubleClick(doubleclick).perform();
	}

}
