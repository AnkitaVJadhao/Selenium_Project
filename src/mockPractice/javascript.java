package mockPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class javascript {

	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/register");
		driver.findElement(By.xpath("(//span[contains(@class,'hidden-xs hidden-sm hidden-md')])[3]")).click();
		

	}

}
