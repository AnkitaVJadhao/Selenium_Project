package handlePopUp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hiddendivision {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		//Handle Hiddendivision Pop-up 
		driver.findElement(By.className("_30XB9F")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("q")).sendKeys("shoes");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
	}

}
