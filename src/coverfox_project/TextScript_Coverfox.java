package coverfox_project;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextScript_Coverfox {

	public static void main(String[] args) throws InterruptedException, IOException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.coverfox.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Click_Checkbox_1 c1=new Click_Checkbox_1(driver);
		c1.clickoncheckbox();
		
		Click_Checkbox_2 c2=new Click_Checkbox_2(driver);
		c2.click_on_Nextbutton();
		
		Select_age s1=new Select_age(driver);
		s1.select_age(Excel_file.exceldata("Sheet4", 0, 0));
		s1.next_after_selecting_age();
		
		Location l1=new Location(driver);
		l1.enter_pincode(Excel_file.exceldata("Sheet4", 0, 1));
		l1.enter_mobile(Excel_file.exceldata("Sheet4", 0, 2));
		l1.click_continueButton();
		
		Validate_SearchResult v1=new Validate_SearchResult(driver);
		v1.search_result();

	}

}
