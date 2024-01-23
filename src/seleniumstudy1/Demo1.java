package seleniumstudy1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/login/");
		String name = driver.findElement(By.name("email")).getAttribute("placeholder");
		System.out.println(name);
		String border = driver.findElement(By.name("email")).getCssValue("border-radius");
		System.out.println(border);
		String color = driver.findElement(By.id("loginbutton")).getCssValue("background-color");
		System.out.println(color);

	}

}
