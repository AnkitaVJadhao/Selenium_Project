package mockPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class isEnabled {

	public static void main(String[] args) throws InterruptedException 
	{
       WebDriver driver=new ChromeDriver();
       driver.manage().window().maximize();
       
       
       
       driver.get("http://omayo.blogspot.com/");
       Thread.sleep(1000);
       
      boolean result = driver.findElement(By.id("but1")).isDisplayed();
      System.out.println(result);
      
      boolean result1 = driver.findElement(By.id("but2")).isDisplayed();
      System.out.println(result1);
      
       

	}

}
