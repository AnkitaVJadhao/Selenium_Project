package actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TabandSpace {

	public static void main(String[] args) 
	{
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
        driver.get("https://tutorialsninja.com/demo/index.php?route=account/register");
        
        driver.findElement(By.id("input-firstname")).sendKeys("Ankita");
        
        Actions act=new Actions(driver);
        act.sendKeys(Keys.TAB).
        sendKeys("Jadhao").pause(Duration.ofSeconds(1))
        .sendKeys(Keys.TAB).
        sendKeys("ankitajadhao40@gmail.com").pause(Duration.ofSeconds(1)).
        sendKeys(Keys.TAB).
        sendKeys("1234564535").pause(Duration.ofSeconds(1)).
        sendKeys(Keys.TAB).
        sendKeys("asedet").pause(Duration.ofSeconds(1)).
        sendKeys(Keys.TAB).
        sendKeys("asedet").pause(Duration.ofSeconds(1)).
        sendKeys(Keys.TAB).
        sendKeys(Keys.TAB).
        sendKeys(Keys.TAB).
        sendKeys(Keys.SPACE).
        sendKeys(Keys.TAB).
        sendKeys(Keys.ENTER).build().perform();
        
        

	}

}
