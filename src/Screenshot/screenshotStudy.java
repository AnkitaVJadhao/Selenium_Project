package Screenshot;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class screenshotStudy {

	public static void main(String[] args) throws InterruptedException, IOException
	{
		 
		System.out.println("=======Screenshots of Instagram Logins screen============ ");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		
		Thread.sleep(5000);
		
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		System.out.println(source);
		System.out.println("===================================================");
//		String s = RandomString.make(3);
//		System.out.println(s);
		
		Date currentDate = new Date(); 
		System.out.println(currentDate);
		String screenshotfilename = currentDate.toString().replace(" ", "-").replace(":", "-");
		System.out.println(screenshotfilename);
		
		File destination=new File("C:\\Users\\Ankita\\Desktop\\Velocity\\Selenium\\Screenshots\\InstagramLoginScreen\\InstaLogin"+screenshotfilename+".jpg");
		FileHandler.copy(source, destination);	
		
		

	}

}
