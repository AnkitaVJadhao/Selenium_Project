package policyBazar;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PolicyBazarHomePage 
{

	@FindBy(className = "sign-in") private WebElement signInButton;

	public PolicyBazarHomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickonsigninbutton()
	{
		signInButton.click();
	}
	
	
	
	
}
