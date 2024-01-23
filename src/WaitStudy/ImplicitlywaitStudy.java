package WaitStudy;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitlywaitStudy {

	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.learn-automation.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
		//Selenium 4 has depricated following concept 
		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}

}
