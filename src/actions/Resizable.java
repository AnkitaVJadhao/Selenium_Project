package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Resizable {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/resizable/");
		
		driver.switchTo().frame(0);
		WebElement resizable = driver.findElement(By.xpath("//div[contains(@class,'icon-gripsmall-diagonal-se')]"));
		
		Actions alt=new Actions(driver);
		alt.clickAndHold(resizable).moveByOffset(50, 100).perform();

	}

}
