package dropdown;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebookdropdown {

	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/login/");
		driver.findElement(By.className("_97w5")).click();
		
		WebElement day = driver.findElement(By.id("day"));
		
		Select s1=new Select(day);
		System.out.println(s1.isMultiple());
		
		System.out.println("==============================");
		List<WebElement> days = s1.getOptions();
		
		for(WebElement d:days)
		{
			System.out.println(d.getText());
		}
		System.out.println("=======Iterator===============");
		
		Iterator<WebElement> date = days.iterator();
		
		while(date.hasNext())
		{
			System.out.println(date.next().getText());
		}
		
		System.out.println("=====ListIterator============");
		
		ListIterator<WebElement> dates = days.listIterator();
		
		while(dates.hasNext())
		{
			System.out.println(dates.next().getText());
		}
		System.out.println("=======Previous============");
		
		while(dates.hasPrevious())
		{
			System.out.println(dates.previous().getText());
		}
		System.out.println("======forloop=============");
		for(int i=0;i<days.size();i++)
		{
			System.out.println(days.get(i).getText());
		}
		
		
		

	}

}
