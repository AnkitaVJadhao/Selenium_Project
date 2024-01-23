package datePicker;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Guru99DatePicker {

	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/");
		driver.findElement(By.name("bdaytime")).sendKeys("06081998");
		driver.findElement(By.name("bdaytime")).sendKeys(Keys.TAB);
		driver.findElement(By.name("bdaytime")).sendKeys("0615");
	}

}
