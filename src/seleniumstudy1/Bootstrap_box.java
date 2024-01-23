package seleniumstudy1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Bootstrap_box {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://omayo.blogspot.com/");
		Actions a=new Actions(driver);
		a.moveToElement(driver.findElement(By.id("blogsmenu"))).click().build().perform();
		a.moveToElement(driver.findElement(By.xpath("//span[text()='SeleniumByArun']"))).click().build().perform();
		

	}

}
