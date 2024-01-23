package dataDriven;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwagLabLoginPage 
{
	//Each webpage should have each class 
	//Various emements on the page are defined as variable 
	//POM :- page object module 
	//Follows encapsulation concept 
	
     //1.Variable--> WebElements 
	//Username,Password,Login 
	//Data member should be declared globally with access level private using @findBy Annotation
	@FindBy(id ="user-name")private WebElement userNameFiled;
	@FindBy(id="password")private WebElement passwordFiled;
	@FindBy(id="login-button") private WebElement loginbutton;

	 //2.Constructor
	public SwagLabLoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	//3.Method
	public void enterUsername(String username)
	{
		userNameFiled.sendKeys(username);
	}
	public void enterPassword(String pwd)
	{
		passwordFiled.sendKeys(pwd);
	}
	public void clickLoginButton()
	{
		loginbutton.click();
	}
	
}
