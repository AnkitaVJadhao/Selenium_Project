package dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multipleoptions {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		Thread.sleep(100);
		WebElement cars = driver.findElement(By.id("multiselect1"));
		
		Select s1=new Select(cars);
		System.out.println(s1.isMultiple());
		
		s1.selectByValue("volvox");
		s1.selectByVisibleText("Audi");
		s1.selectByIndex(2);
		
	    System.out.println(s1.getFirstSelectedOption().getText());
	    
	    System.out.println("====getOptions===============");
	    
	    List<WebElement> options = s1.getOptions();
	    for(WebElement ele:options)
	    {
	    	System.out.println(ele.getText());
	    }
		
		System.out.println("==========getAllSelected======================");
		
		List<WebElement> selected = s1.getAllSelectedOptions();
		for(WebElement ele1:selected)
		{
			System.out.println(ele1.getText());
		}
		

	}

}
