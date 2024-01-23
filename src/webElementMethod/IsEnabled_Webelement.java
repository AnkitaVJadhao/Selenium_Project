package webElementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabled_Webelement {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://auth.discoveryplus.in/login?flow=OTPLogin");
		
		Thread.sleep(1000);
		boolean enabled = driver.findElement(By.xpath("//button[text()='Get OTP']")).isEnabled();
		System.out.println("1.Before entering a mobile number, Get OTP button is  "+enabled);
		
		
		Thread.sleep(1000);
		driver.findElement(By.id("mobileNumber")).sendKeys("9403599094");
		
		Thread.sleep(1000);
		boolean enabled1 = driver.findElement(By.xpath("//button[text()='Get OTP']")).isEnabled();
		System.out.println("2.After entering mobile number ,Get OTP button is "+enabled1);
		
		

	}

}
