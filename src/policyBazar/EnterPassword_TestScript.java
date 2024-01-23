package policyBazar;


import java.time.Duration;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EnterPassword_TestScript
{
	

	@FindBy(xpath = "(//input[@type='number'])[2]") private WebElement mobileNumber;
	@FindBy(xpath="(//input[@type='number'])[2]")private  WebElement mobileNumber_enter;
	@FindBy(xpath="(//span[text()='Sign in with Password'])[2]") private WebElement signin_with_password;
	
	public EnterPassword_TestScript(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	public void entermobilenumber()
	{
		mobileNumber.click();
	}
	public void entermobilenumber_enter()
	{
		mobileNumber_enter.sendKeys("7057774212");
	}
	
	public void clickonSigninwithpwd_button(WebDriver driver)
	{
		signin_with_password.click();
		implicitwait(driver);
	}
	public void implicitwait(WebDriver driver)
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	
	
	
}
