package webElementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelected_Webelement {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/login/");
		
		
		System.out.println(driver.findElement(By.cssSelector("._9axz")).getText());
		
		//input[value='083241_tMDX']+input
		
		
		driver.findElement(By.xpath("//a[text()='Sign up for Facebook']")).click();
		WebElement gender= driver.findElement(By.xpath("//input[contains(@id,'u_0_5')]"));
		
		boolean result = gender.isSelected();
		System.out.println("Before click "+result);
		gender.click();
		boolean result2 = gender.isSelected();
		System.out.println("After clicking "+result2);
		
	}

}
