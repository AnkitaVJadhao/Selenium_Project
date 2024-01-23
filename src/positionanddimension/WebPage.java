package positionanddimension;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebPage {

	public static void main(String[] args) throws InterruptedException 
	{
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
	    Point defaultPosition = driver.manage().window().getPosition();
	    System.out.println(defaultPosition);
	    
	    Point p2=new Point(100, 100);
	    Thread.sleep(100);
	    driver.manage().window().setPosition(p2);
	    
	    
		
		

	}

}
