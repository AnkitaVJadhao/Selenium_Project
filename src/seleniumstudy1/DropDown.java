package seleniumstudy1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/dropdown");
		WebElement dropdown = driver.findElement(By.id("dropdown"));
		//dropdown.click();
		Select s=new Select(dropdown);
		//s.selectByIndex(1);
		//s.selectByValue("2");
     	s.selectByVisibleText("Option 1");
		System.out.println(s.isMultiple());
		List<WebElement> alloptions = s.getOptions();
		for(WebElement ele:alloptions)
		{
			System.out.println(ele.getText());
		}
		

	}

}
