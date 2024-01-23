package handlePopUp;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopupstudy {

	public static void main(String[] args) throws InterruptedException
	{
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		driver.findElement(By.id("prompt")).click();
		Thread.sleep(1000);
		Alert alt = driver.switchTo().alert();
		alt.sendKeys("Ankita");
		System.out.println(alt.getText());
		alt.accept();
		//Thread.sleep(2000);
		//alt.dismiss();
		//driver.findElement(By.xpath("//textarea[@id='ta1']")).sendKeys("Ankita");
		//Thread.sleep(1000);
		
		
		
		
		
		
		
		
		
	}

}
