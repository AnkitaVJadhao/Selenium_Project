package seleniumstudy1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multi_Selection_box {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://omayo.blogspot.com/");
		WebElement multi_select = driver.findElement(By.cssSelector("#multiselect1"));
		Select s=new Select(multi_select);
		System.out.println(s.isMultiple());
		s.selectByIndex(0);
		s.selectByIndex(3);
		s.deselectByIndex(0);
		
		
		

	}

}
