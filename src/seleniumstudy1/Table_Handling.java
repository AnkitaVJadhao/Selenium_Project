package seleniumstudy1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table_Handling {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://omayo.blogspot.com/");
		
		List<WebElement> columns = driver.findElements(By.xpath("//table[@id='table1']//th"));
		List<WebElement> rows = driver.findElements(By.xpath("//table[@id='table1']//tbody/tr"));
		
		System.out.println(columns.size());
		System.out.println(rows.size());
		
		for(WebElement column:columns)
		{
	     System.out.print(column.getText()+" ");
		}
		System.out.println();
		for(int i=1;i<=rows.size();i++)
		{
			for(int j=1;j<=columns.size();j++)
			{
				System.out.print(driver.findElement(By.xpath("(//table[@id='table1']//tbody//tr)["+i+"]//td["+j+"]")).getText()+" ");
			}
			System.out.println();
		}
		

	}

}
