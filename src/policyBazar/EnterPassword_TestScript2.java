package policyBazar;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EnterPassword_TestScript2
{

	@FindBy(xpath="//a[contains(@href,\"javascript:void[0]\")]")private  WebElement enterPassword;
	@FindBy(id="login-in-with-password")private WebElement login_with_password;
	
	public EnterPassword_TestScript2(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void enterpassword()
	{
		enterPassword.sendKeys("ankita@123");
	}
	public void clickon_loginwithpassword()
	{
		login_with_password.click();
	}
	
	

}
