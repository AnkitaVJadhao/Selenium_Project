package coverfox_project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Location 
{
	//variable
		@FindBy(xpath = "//input[@placeholder='6 Digit Pincode']")private WebElement pincode;
		@FindBy(xpath = "//input[@placeholder='Your mobile number']") private WebElement mobile_number;
		@FindBy(className = "next-btn")private WebElement continue_button;
		//constructor
		public Location(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
		public void enter_pincode(String pincode1)
		{
			pincode.sendKeys(pincode1);
		}
		public void enter_mobile(String mobilenumber)
		{
			mobile_number.sendKeys(mobilenumber);
		}
		public void click_continueButton()
		{
			continue_button.click();
		}
		
		
}
