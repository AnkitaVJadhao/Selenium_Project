package MethodsandUse;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookSignup_Script {

	public static void main(String[] args) throws IOException 
	{
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/login/");
		CommonlyUsedMethod.implicitlywait(driver, 5);
		
		driver.findElement(By.className("_97w5")).click();
		
		//Elements required for signup process
		WebElement firstname = driver.findElement(By.name("firstname"));
		WebElement lastname = driver.findElement(By.name("lastname"));
		WebElement emailormobile = driver.findElement(By.name("reg_email__"));
		WebElement password = driver.findElement(By.name("reg_passwd__"));
		WebElement day = driver.findElement(By.id("day"));
		WebElement month = driver.findElement(By.id("month"));
		WebElement year = driver.findElement(By.id("year"));
						
		
	
		firstname.sendKeys(CommonlyUsedMethod.exceldata(0, 0));
		lastname.sendKeys(CommonlyUsedMethod.exceldata(0, 1));
		emailormobile.sendKeys(CommonlyUsedMethod.exceldata(0, 2));
		password.sendKeys(CommonlyUsedMethod.exceldata(1, 0));
		CommonlyUsedMethod.selectdob(day, CommonlyUsedMethod.exceldata(1, 1));
		CommonlyUsedMethod.selectdob(month, CommonlyUsedMethod.exceldata(1, 2));
		CommonlyUsedMethod.selectdob(year, CommonlyUsedMethod.exceldata(2, 0));
			

	}

}
