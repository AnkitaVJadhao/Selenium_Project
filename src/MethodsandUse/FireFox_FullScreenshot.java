package MethodsandUse;


import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class FireFox_FullScreenshot
{
	public static void main(String[] args) throws IOException

	{
		WebDriver driver1=new FirefoxDriver();
		driver1.get("https://www.redbus.in/");
		CommonlyUsedMethod.implicitlywait(driver1, 20);
		//FullPage Screenshot
		CommonlyUsedMethod.takesScreenshot("FireFoxSS", driver1);
	    
	}
}

