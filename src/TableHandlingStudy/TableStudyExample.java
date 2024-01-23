package TableHandlingStudy;


import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableStudyExample {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		
		
		WebElement booktable = driver.findElement(By.id("productTable"));
		
		System.out.println("========");
		
		//Find rows in table
		List<WebElement> rows = driver.findElements(By.xpath("//table[@name='BookTable']//tr"));
		int numberofrows = rows.size();
		System.out.println("Number of rows are" +numberofrows);
		
		for(WebElement ele:rows)
		{
			System.out.println(ele.getText());
			
		}
		
		System.out.println("===================================");
		
		//Find columns in table 
		List<WebElement> columns = driver.findElements(By.xpath("//table[@name='BookTable']//tr[1]/th"));
		int numberofcolumns=columns.size();
		System.out.println("Number of columns"+numberofcolumns);
		
		Iterator<WebElement> itr = columns.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next().getText());
		}
	}

}
