package webDriverMethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Getcurrenturl {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://vctcpune.com/");
		Thread.sleep(2000);
		
		String expectedurl="https://vctcpune.com/";
		
		String url=driver.getCurrentUrl();
		System.out.println("The current url is "+url);
		
		if(expectedurl.equals(url))
		{
			System.out.println("Test case is passed :- Expected result is equal to actual result ");
		}
		else
		{
			System.out.println("Test case is failed :- Expected result is not equal to actual result ");
		}
		
		
			

	}

}
