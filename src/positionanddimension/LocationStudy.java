package positionanddimension;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocationStudy {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("http://omayo.blogspot.com/");
		Point defaultLocation = driver.findElement(By.id("alert1")).getLocation();
		System.out.println(defaultLocation.x+" "+defaultLocation.y);
	}

}
