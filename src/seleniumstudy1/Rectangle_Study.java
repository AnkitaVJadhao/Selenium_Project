package seleniumstudy1;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rectangle_Study {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://omayo.blogspot.com/");
		
		Rectangle r1 = driver.findElement(By.id("alert1")).getRect();
		System.out.println(r1.x);
		System.out.println(r1.y);
		System.out.println(r1.height);
		System.out.println(r1.width);
		System.out.println(r1.getX());
		System.out.println(r1.getY());
		

	}

}
