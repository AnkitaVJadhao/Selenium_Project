package locaters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_Textcontain {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/login/");
		
		//click on login button using xpath with text
		//syntax:- //tagname[@text()='textvalue']
		driver.findElement(By.xpath("//button[text()='Log in']")).click();
		
		//using xpath by contain
		//Storing error msg in string "The email -----------------log in"
		//syntax:- //tagname[contains(text(),'partialtextvalue')]
		
		String error_msg= driver.findElement(By.xpath("//div[contains(text(),'The email')]")).getText();
		System.out.println(error_msg);
		
		//Enter a email id using contain with attributes
		//syntax:- //tagname[contains(@attribute name,attribute value')]
		
	driver.findElement(By.xpath("//input[contains(@placeholder,'Email address')]")).sendKeys("xyz@gmail.com");
	//driver.findElement(By.xpath("//input[contains(@placeholder,'Email address')]")).clear();
		
		//Translating the facebook login webpage language into hindi using xpath by index
		//sytax :-(//tagname[@attribute name = ‘attribute value’] )[2]
		
		driver.findElement(By.xpath("(//a[@dir='ltr'])[2]")).click();
		
		

	}

}
