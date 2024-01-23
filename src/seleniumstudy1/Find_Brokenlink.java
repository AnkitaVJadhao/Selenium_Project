package seleniumstudy1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Find_Brokenlink {

	public static void main(String[] args)
	{
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		
		//Find broken link 
		List<WebElement> tagnames = driver.findElements(By.tagName("a"));
		System.out.println(tagnames.size());
		
		for(WebElement tagname:tagnames)
		{
			
			if(tagname.getAttribute("href")!=null)
			{
				System.out.println(tagname.getAttribute("href"));
			}
			else {
				System.out.println("Null");
			}
		}
		
	}

}
