package mockPractice;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;

public class CommonlyUsedmethodstudy
{

	//scrolling
	
	public static void Scrollingmethod(WebDriver driver, WebElement ele)
	{
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript("arguments[0].scrollIntoView();",ele );
	}
	
	//takesScreenshot
	public static void TakesScreenshots(WebDriver driver, String fileName) throws IOException
	{
		File ts = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest=new File("C:\\Users\\Ankita\\Desktop\\Velocity\\Selenium\\Screenshots\\"+fileName+".png");
		FileHandler.copy(ts, dest);
		
	}
	public static void waiting(WebDriver driver, int time)
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(time));
	}
	
	
	
}
