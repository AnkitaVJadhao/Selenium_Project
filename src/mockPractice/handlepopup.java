package mockPractice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class handlepopup {

	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("Ankita111");
		driver.findElement(By.xpath("//input[@name='submit']")).click();
		
		Alert a=driver.switchTo().alert();
		a.accept();
		a.accept();
		
	}

}
