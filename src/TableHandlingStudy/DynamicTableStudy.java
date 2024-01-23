package TableHandlingStudy;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicTableStudy {

	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
        driver.get("https://demo.guru99.com/test/web-table-element.php#");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        
        int numofColumn=driver.findElements(By.xpath("//table[@class='dataTable']/thead//th")).size();
        System.out.println(numofColumn);
        int numofrows=driver.findElements(By.xpath("//table[@class='dataTable']//tr")).size();
        System.out.println(numofrows);
        System.out.println("=============================================================");
        
        for(int i=1;i<=numofColumn;i++)
        {
        String headers =

        driver.findElement(By.xpath("//table[@class='dataTable']/thead/tr[1]/th["+i+"]")).getText();

        System.out.print(headers+"    " );
        }
        System.out.println();
      
        System.out.println("============================================================");
        
        for(int i=1;i<=numofrows-1;i++)//2--->27
        {
        for(int j=1;j<=numofColumn;j++)
        {

        String data =

        driver.findElement(By.xpath("//table[@class='dataTable']/tbody/tr["+i+"]/td["+j+"]")).getText();

        System.out.print(data+"     ");
        }
        System.out.println();

        System.out.println("==============================================================");
        }
        

	}

}
