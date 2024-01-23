package dataDriven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwagLabinventoryPage 
{
     
	
	@FindBy(xpath="(//button[text()='ADD TO CART'])[1]") private WebElement item1;
	@FindBy(xpath="(//button[text()='ADD TO CART'])[1]") private WebElement item2;
	
	public SwagLabinventoryPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void addTshortToCart()
	{
		item1.click();
	}
	public void jacketAddToCart()
	{
		item2.click();
	}
	

}
