package mockPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class mockPractice {

	public static void main(String[] args) throws InterruptedException
	{
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		Thread.sleep(2000);
		
		//handle drop down
		  WebElement w2 = driver.findElement(By.id("drop1"));
		  
		  Select s1=new Select(w2);
		  System.out.println(s1.isMultiple());
		  s1.selectByIndex(1);
		 // s1.selectByValue("def");
		 // s1.selectByVisibleText("doc 1");
		//multiple selectable drop down
		  WebElement w3= driver.findElement(By.id("multiselect1")); 
		  Select s2 =new Select(w3);
		  System.out.println(s2.isMultiple());
		  s2.selectByIndex(0);
		  s2.selectByValue("volvox");
		  s2.selectByVisibleText("Audi");
		  Thread.sleep(2000);
		  //Check box
		  Boolean b1=driver.findElement(By.xpath("//input[@id='checkbox2']")).isSelected();
		  System.out.println(b1);
		  //getText()
		  String link=driver.findElement(By.partialLinkText("compendium")).getText();
		  System.out.println(link);
		  //getCurrentUrl
		  String title1=driver.getCurrentUrl();   
		  System.out.println(title1);  
		  //isEnabled()
		  Boolean button1=driver.findElement(By.cssSelector("#but1")).isEnabled();   
		  System.out.println(button1);
		  //sendKeys
		  driver.findElement(By.id("ta1")).sendKeys("Ankita");
		  //clear
		  driver.findElement(By.id("ta1")).clear();
		  
		 
			
		  
		  
		  
		 
		  
		  
		

	}

}
