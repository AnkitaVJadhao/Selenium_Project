package locaters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_text {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver = new ChromeDriver();  
		driver.get("https://www.facebook.com/login/");
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		String error_msg="The email address or mobile number you entered isn't connected to an account. Find your account and log in.";
		
		//Xpath by text
		//:- //tagname[text()='textvalue']
		driver.findElement(By.xpath("//button[text()='Log in']")).click();
		
		String actual_error=driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/div[1]/div[2]")).getText();
		System.out.println(actual_error);
		
		
		if(error_msg.equals(actual_error))
		{
			System.out.println("Error msg matched ");
		}
		else
		{
			System.out.println("Error msg is not same");
		}
			

	}

}
