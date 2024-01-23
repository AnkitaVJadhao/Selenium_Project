package mockPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ArrayList 
{

	public static void main(String[] args) 
	{
		
       WebDriver driver = new ChromeDriver();
       driver.get("http://omayo.blogspot.com/");
       List<WebElement> Input = driver.findElements(By.xpath("//img"));
       System.out.println(Input.size());
       
       
       for(int s=0;s<Input.size();s++)
       {
    	 String values=Input.get(s).getAttribute("src");  
    	 System.out.println(values);
    	  
	    }

    }

}
