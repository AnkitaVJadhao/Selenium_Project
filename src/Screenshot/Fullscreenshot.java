package Screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Fullscreenshot 
{

	public static void main(String[] args) throws IOException {
		
		WebDriver driver=new ChromeDriver();
		//ChromeDriver driver=new ChromeDriver();
		driver.get("https://omayo.blogspot.com/");
		driver.manage().window().maximize();
		
		//To take screenshot we need to type cast driver object to TakesScreenshot interface.
		//After that call getScreenshotAs method with parameter OutputType.file
		
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//File src = driver.getScreenshotAs(OutputType.FILE);
		
		//in above screenshot will store in any temp memory
		//so add screenshot in specific folder we have to call copyfile method 
		
		File dest=new File("C:\\Users\\Ankita\\Desktop\\Velocity\\Selenium\\Screenshots\\image.jpg");
		FileHandler.copy(src, dest);

	}

}
