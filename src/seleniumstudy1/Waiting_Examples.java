package seleniumstudy1;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waiting_Examples {

	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		
		//Implicitly wait
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		//Explicitly wait types:- 
		//WebDriver wait
		driver.findElement(By.xpath("//button[@class='dropbtn']")).click();
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(2)); //TimeoutException:-
		//WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(5));
		WebElement gmailoption = wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Gmail")));
		gmailoption.click();
		
		//fluent wait
		Wait<WebDriver> w1=new FluentWait<WebDriver>(driver)
		.withTimeout(Duration.ofSeconds(5))
		.pollingEvery(Duration.ofSeconds(1))
		.ignoring(NoSuchElementException.class);
		

	}

}
