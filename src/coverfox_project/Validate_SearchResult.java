package coverfox_project;


import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Validate_SearchResult
{

	@FindBy(xpath="//div[contains(text(),'matching Health')]")private WebElement result;
	@FindBy(id="plans-list")private List<WebElement> search_results;
	
	public Validate_SearchResult(WebDriver driver) throws InterruptedException
	{
		Thread.sleep(10000);
		PageFactory.initElements(driver, this);
	}
	public void search_result()
	{
		String r1 = result.getText();
		String a[]=r1.split(" ");
		
		String numberOfResultsInString = a[0];
		int numberOfResultsInInt = Integer.parseInt(numberOfResultsInString);
		int size1 = search_results.size();
		System.out.println(size1);
		System.out.println(numberOfResultsInInt);
		
		
		if(size1==numberOfResultsInInt)
		{
			System.out.println("Plans number matching with plans List,TC is passed");
		}
		else
		{
			System.out.println("Plans number is not matching with plans List, TC is failed");
		}
	}
	
	
	
}
