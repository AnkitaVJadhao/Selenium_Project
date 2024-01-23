package policyBazar;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_TestScript {

	public static void main(String[] args) throws IOException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.policybazaar.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		PolicyBazarHomePage p1=new PolicyBazarHomePage(driver);
		p1.clickonsigninbutton();
		
		EnterPassword_TestScript home=new EnterPassword_TestScript(driver);
		home.entermobilenumber();
		home.entermobilenumber_enter();
		home.clickonSigninwithpwd_button(driver);
		
		EnterPassword_TestScript2 home1=new EnterPassword_TestScript2(driver);
		home1.enterpassword();
		home1.clickon_loginwithpassword();
        
	}

}
