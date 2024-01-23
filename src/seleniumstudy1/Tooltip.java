package seleniumstudy1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Tooltip {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		String actualresult="Sign up for Facebook";
		String expectedresult = driver.findElement(By.linkText("Sign Up")).getAttribute("title");
		
		if(actualresult.equals(expectedresult))
		{
			System.out.println("Test case passed");
		}

	}

}
