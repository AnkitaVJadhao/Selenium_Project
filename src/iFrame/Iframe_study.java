package iFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe_study 
{

	public static void main(String[] args) throws InterruptedException
	{
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Frames.html");
		Thread.sleep(1000);
		
		//switch focus from main page to iFrame 
		//driver.switchTo().frame("singleframe");
		//driver.switchTo().frame(0);
		WebElement frame1 = driver.findElement(By.cssSelector("#singleframe"));
		driver.switchTo().frame(frame1);
		
		
	    driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Ankita");
	    //System.out.println("text is "+s1);
	    
	    //switch selenium focus from iframe to main page
	    driver.switchTo().defaultContent();
	    
	    
	    WebElement button = driver.findElement(By.linkText("Iframe with in an Iframe"));
	    System.out.println("Button is visible:- "+button.isDisplayed());
	   
	    
	    driver.findElement(By.linkText("Iframe with in an Iframe")).click();
	    
	    driver.switchTo().frame(1);
	    driver.switchTo().frame(0);
	    
	    WebElement name = driver.findElement(By.xpath("//input[@type='text']"));
	    name.sendKeys("Ankita");
	    Thread.sleep(1000);
	    name.clear();
	    
	    //Child frame to immediate parent
	    driver.switchTo().parentFrame();
	    
	    String s2=driver.findElement(By.xpath("//h5[text()='Nested iFrames']")).getText();
	    System.out.println(s2);
	    
	    //Child frame to main page
	    driver.switchTo().defaultContent();
	    driver.findElement(By.linkText("Home")).click();
		
	}
	
	
}
