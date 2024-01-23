package Screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

public class Fullpagescreenshot {

	public static void main(String[] args) throws IOException, InterruptedException 
	{
//         FirefoxDriver driver=new FirefoxDriver();
//         driver.get("https://omayo.blogspot.com/");
//         driver.manage().window().maximize();
//         
//         File source = driver.getFullPageScreenshotAs(OutputType.FILE);
//         File newFile = new File("C:\\Users\\Ankita\\Desktop\\Velocity\\Selenium\\Screenshots\\image3.jpg");
//         FileHandler.copy(source,newFile);
         
         Thread.sleep(1000);
         WebDriver driver=new FirefoxDriver();
         driver.get("https://omayo.blogspot.com/");
         driver.manage().window().maximize();
         
         File source =((FirefoxDriver)driver).getFullPageScreenshotAs(OutputType.FILE);
         File newFile = new File("C:\\Users\\Ankita\\Desktop\\Velocity\\Selenium\\Screenshots\\fullpagescreenshotimage3.jpg");
         FileHandler.copy(source,newFile);
         
         

	}

}
