package TableHandlingStudy;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table1 {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		
		
		//One Header reading 
		String headername = driver.findElement(By.xpath("//table[@name='BookTable']//tr[1]/th[4]")).getText();
        System.out.println(headername);
        System.out.println("====================================");
        
        //Whole header row reading
        List<WebElement> allheaders = driver.findElements(By.xpath("//table[@name='BookTable']//tr[1]/th"));
        for(WebElement ele:allheaders)
        {
        	System.out.print(ele.getText()+" ");
        }
        System.out.println();
        System.out.println("=======================================");
        
        //only one table data reading 
        String testdata = driver.findElement(By.xpath("//table[@name='BookTable']//tr[3]/td[2]")).getText();
        System.out.println(testdata);
        System.out.println("=======================================");
        
        //read complete row from table
        List<WebElement> allrows = driver.findElements(By.xpath("//table[@name='BookTable']//tr[3]//td"));
        
        for(WebElement ele:allrows)
        {
        	System.out.print(ele.getText()+" ");
        }
        System.out.println();
        System.out.println("===================================");
        
        //read complete single column
        for(int i=2;i<=7;i++)
        {
        	 WebElement tabledata = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+i+"]/td"));
        	System.out.println(tabledata.getText());
        }
       
        System.out.println("====================================");
        
        //read all columns
          for(int i=1;i<=7;i++)
        {
        	for(int j=1;j<=4;j++)
        	{
        		
        		
        		if(i==1)
        		{
        			WebElement alltabledata = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+i+"]/th["+j+"]"));
            	    System.out.print(alltabledata.getText()+" ");
        			
        		}
        		else
        		{
        		
        	    WebElement alltabledata = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+i+"]/td["+j+"]"));
        	    System.out.print(alltabledata.getText()+" ");
        		}
        	}
        	System.out.println();
        	System.out.println("============================================");
        }
	}

}
