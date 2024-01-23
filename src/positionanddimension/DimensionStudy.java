package positionanddimension;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DimensionStudy {

	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		Dimension defaultsize = driver.manage().window().getSize();
		System.out.println(defaultsize);
		
		Dimension d1=new Dimension(1000, 100);
		driver.manage().window().setSize(d1);	

	}

}
