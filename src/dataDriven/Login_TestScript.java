package dataDriven;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_TestScript {

	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/v1/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		
		SwagLabLoginPage s1=new SwagLabLoginPage(driver);
		s1.enterUsername("standard_user");
		s1.enterPassword("secret_sauce");
		s1.clickLoginButton();
		
		SwagLabinventoryPage s2=new SwagLabinventoryPage(driver);
		s2.addTshortToCart();
		s2.jacketAddToCart();
		
	}

}
