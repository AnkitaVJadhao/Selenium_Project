package dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multi_Selectable {

	public static void main(String[] args) throws InterruptedException 
	
	{

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://omayo.blogspot.com/");
		
		//Verify tag name of dropdown/listbox is 🡪select
		//Identify list box to be handled and store it in reference variable
		WebElement multiselect1 = driver.findElement(By.id("multiselect1"));
		
		//Create an object of Select class which will accept WebElement as argument
		Select s=new Select(multiselect1);
		System.out.println("Can we select multiple options ?"+s.isMultiple());
		s.selectByIndex(0);
		Thread.sleep(100);
		s.selectByValue("swiftx");
		Thread.sleep(100);
		s.selectByVisibleText("Audi");
		Thread.sleep(100);
		
		//deselect method
		s.deselectByVisibleText("Volvo");
		s.deselectByValue("audix");
		s.deselectByIndex(1);
		
		//Select 
		s.selectByIndex(0);
		s.selectByValue("swiftx");
		s.selectByVisibleText("Audi");
		//At last by using deselectAll method , will deselect all selected option 
		s.deselectAll();

	}

}
