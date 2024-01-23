package Screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Specificscreenshot {

	public static void main(String[] args) throws IOException
	{
          
		WebDriver driver=new ChromeDriver();
		driver.get("https://omayo.blogspot.com/");
		WebElement specific = driver.findElement(By.id("multiselect1"));
		
		//No need of type cast if we have to take SS of specific element
		File source = specific.getScreenshotAs(OutputType.FILE);
		File dest=new File("C:\\Users\\Ankita\\Desktop\\Velocity\\Selenium\\Screenshots\\image1.jpg");
		FileHandler.copy(source, dest);

	}

}
