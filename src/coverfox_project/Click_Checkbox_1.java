package coverfox_project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Click_Checkbox_1 
{

	@FindBy(xpath = "//div[text()='Female']")private WebElement checkbox;
	
	public Click_Checkbox_1(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickoncheckbox()
	{
		checkbox.click();
	}
	
	
}
