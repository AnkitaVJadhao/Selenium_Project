package seleniumstudy1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BasicWebdriver {

	public static void main(String[] args)
	{
		
		WebDriver driver=new ChromeDriver();
		
	  //  driver=new FirefoxDriver();
	//	 Options :- webdriver sub-interface
		//driver.manage() :- return Options 
		driver.manage().window().maximize();
		//driver.manage().window().minimize();  //Selenium 4
		//driver.manage().window().fullscreen();
		System.out.println("===========================================");
		//By is class and using class name calling method is static methods
		//purpose of Webelement :- To store a UI element
		//return type :- WebElement(Interface)
		WebElement name = driver.findElement(By.className(null));  
		driver.findElement(By.cssSelector(null));
		driver.findElement(By.id(null));
		driver.findElement(By.linkText(null));
		driver.findElement(By.partialLinkText(null));
		driver.findElement(By.name(null));
		driver.findElement(By.tagName(null));
		driver.findElement(By.xpath(null));
		
		
		//Action perform on Webelement
		driver.findElement(By.className(null)).click();
		driver.findElement(By.className(null)).sendKeys("Abc");
		driver.findElement(By.className(null)).getText();
		driver.findElement(By.className(null)).clear();
		driver.findElement(By.className(null)).isDisplayed();
		driver.findElement(By.className(null)).isEnabled();
		driver.findElement(By.className(null)).isSelected();
		
		Dimension d1 = driver.findElement(By.className(null)).getSize(); //return :- dimension in px
		System.out.println(d1.height);
		System.out.println(d1.width);
		
		Point l1 = driver.findElement(By.className(null)).getLocation();
		System.out.println(l1.x);
		System.out.println(l1.y);
		
		//Selenium 4
		
		
		
		Rectangle r1 = driver.findElement(By.className(null)).getRect();//find x and y co-ordinate as well as height and width
		System.out.println(r1.getX());
		System.out.println(r1.getY());
		System.out.println(r1.height);
		System.out.println(r1.width);
		System.out.println(r1.getHeight());
		System.out.println(r1.getWidth());
		
		driver.findElement(By.className(null)).getTagName(); //Return :- String
		driver.findElement(By.className(null)).getCssValue(null); //("Color"),("Font")
		driver.findElement(By.className(null)).getAttribute(null);
		
		//Provide 10 sec to pageload
		//Exception :- Timeout
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));

		//WebDriver methods
		driver.get(null);
		driver.getTitle();
		driver.getCurrentUrl();
		driver.close();
		driver.quit();
		driver.navigate().to("null");
		driver.navigate().back();
		driver.navigate().refresh();
		driver.navigate().refresh();
		driver.getPageSource();    //HTML code , return type :String
		driver.getClass().getSimpleName();// getClass(Object).getSimpleName(String)
		
		//set size
		Dimension d=new Dimension(200, 300);
		driver.manage().window().setSize(d);
			

	}

}
