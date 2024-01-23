package mockPractice;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitingMechanism {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://omayo.blogspot.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//button[text()='Dropdown']")).click();
		//Thread.sleep(4000);
		//driver.findElement(By.xpath("//a[text()='Flipkart']")).click();
		//WEB DRIVER WAIT
		//Explicit wait
		//wait for Particular element
		//Syntax:
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		
		//WebElement flipkart = driver.findElement(By.xpath("//a[text()='Flipkart']"));
		
		WebElement flipkart = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Flipkart']")));
		
		flipkart.click();
		
		//10 milisec
		//500 milisec interval 
		
		//Wait<WebDriver> wait1= new FluentWait<WebDriver>(driver).withTimeout(Duration.ofMillis(10000)).pollingEvery(Duration.ofMillis(100)).ignoring(org.openqa.selenium.NoSuchElementException.class);
//		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//h6[text()='Sign In'])[2]")));
//		driver.findElement(By.xpath("(//h6[text()='Sign In'])[2]")).click();
		
		
		
		}

}
