package mockPractice;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class mock1 {

	public static void main(String[] args) throws InterruptedException
	{
		
		 WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		Thread.sleep(100);
		 Dimension size = driver.findElement(By.xpath("//button[text()='Log in']")).getSize();
		 System.out.println(size.height);
		 System.out.println(size.width);
		
		
		//div[contains(text(),'Please enter')]
//		String msg=driver.findElement(By.xpath("//div[contains(text(),'Please enter')]")).getText();
//		System.out.println(msg);
	}

}
