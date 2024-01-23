package webDriverMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetText_webElement {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(1000);
		
		String expectedtext="Facebook helps you connect and share with the people in your life.";
		
		String actualtext = driver.findElement(By.className("_8eso")).getText();
		System.out.println(actualtext);
		
		if(expectedtext.equals(actualtext))
		{
			System.out.println("Test case passed");
		}
		else
		{
			System.out.println("Test case failed");
		}
		
		
	}

}
