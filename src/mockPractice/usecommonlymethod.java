package mockPractice;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class usecommonlymethod {

	public static void main(String[] args) throws IOException
	{
		
         WebDriver driver=new ChromeDriver();
         driver.manage().window().maximize();

         driver.get("https://www.redbus.in/");
         CommonlyUsedmethodstudy.waiting(driver, 10);
         WebElement scrolling = driver.findElement(By.xpath("//h2[text()='PARTNERED WITH']"));
         CommonlyUsedmethodstudy.Scrollingmethod(driver, scrolling);
         CommonlyUsedmethodstudy.TakesScreenshots(driver, "ScrollingSS");
         
         
	}

}
