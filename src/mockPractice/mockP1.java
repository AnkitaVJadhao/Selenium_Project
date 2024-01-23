package mockPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class mockP1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();   //webdriver:= interface with using webdriver interface  
		driver.get("http://omayo.blogspot.com/");
		Thread.sleep(2000);
		//navigate
		driver.navigate().to("https://www.w3schools.com/");  //to :- navigate from one side to another
		Thread.sleep(2000);
		driver.navigate().back();    //navigate back 
		Thread.sleep(2000);
		driver.navigate().forward();  // again navigate to another website
		Thread.sleep(2000);
		driver.navigate().refresh();   //refresh the website
		
	}

}
