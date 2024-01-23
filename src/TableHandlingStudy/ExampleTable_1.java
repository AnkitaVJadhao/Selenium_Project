package TableHandlingStudy;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExampleTable_1 
{

	public static void main(String[] args)
	{

      WebDriver driver=new ChromeDriver();
      driver.get("https://www.cricbuzz.com/cricket-series/6732/icc-cricket-world-cup-2023/points-table");
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
      
      List<WebElement> header = driver.findElements(By.xpath("//table//thead//tr/td"));
      for(WebElement ele:header)
      {
    	  System.out.print(ele.getText()+" ");
      }
      System.out.println();
      
      List<WebElement> rows = driver.findElements(By.xpath("//table//tbody/tr/td[@class='cb-srs-pnts-td']"));
          int count=0;
    	  for(int j=0;j<60;j++)
    	  {
    		  System.out.print(rows.get(j).getText()+"   ");
    		  count++;
    		  if(count%6==0)
    		  {
    			  System.out.println();
    		  }
    	  }
    		  
      }
	

}


