package mockPractice;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Assignment {

	public static void main(String[] args) throws InterruptedException, IOException
	
	{
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.google.com/");
		 
		 //find search box and enter "Honda"
		 
		 driver.findElement(By.id("APjFqb")).sendKeys("Honda");
		 //by.name=q;
		 Thread.sleep(1000);
		 List<WebElement> searchResult = driver.findElements(By.xpath("//div[@class='OBMEnb'][1]/ul/li"));	
		 
		 for(WebElement ele:searchResult)
		 {
			 //System.out.println(ele.getText());
			 if(ele.getText().equals("honda elevate"))
			 {
				 driver.findElement(By.xpath("//div[@aria-label='honda elevate']")).click();
				 break;
				
			 }
		 }
		 Thread.sleep(1000);
		 
		 driver.findElement(By.linkText("Images")).click();
		 
		 File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 
		 Date currentDate = new Date(); 
		 System.out.println(currentDate);
		 String screenshotfilename = currentDate.toString().replace(" ", "-").replace(":", "-");
		 System.out.println(screenshotfilename);
		 
		 File dest=new File("C:\\Users\\Ankita\\Desktop\\Velocity\\Selenium\\Screenshots\\Car\\car"+screenshotfilename+".jpg");
		 FileHandler.copy(src, dest);
		 		 

	}

}
