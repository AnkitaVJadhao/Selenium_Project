package webDriverMethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gettitle_method {

	public static void main(String[] args) throws InterruptedException 
	{
		String expectedr="W3Schools Online Web Tutorials";

		
		WebDriver driver=new ChromeDriver();
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.get("https://www.w3schools.com/");
		Thread.sleep(1000);
		String title=driver.getTitle();
		System.out.println(title);
		
		if(expectedr.equals(title))
		{
			System.out.println("Title is matching and test case is passed");
		}
		else
		{
			System.out.println("Test case failed");
		}
		
		
	}

}
