package dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown_List {

	public static void main(String[] args) throws InterruptedException
	
	{
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/login/");
		
		//Click on Sign-up button   
		driver.findElement(By.linkText("Sign up for Facebook")).click();
		Thread.sleep(1000);
		
		//Using sendkeys method enter text values in text fields
		driver.findElement(By.name("firstname")).sendKeys("Automation");
		driver.findElement(By.name("lastname")).sendKeys("Testing");
		driver.findElement(By.name("reg_email__")).sendKeys("xyz@gmail.com");
		
		
		//After entering the gmail,confirmation of gmail text field opened 
		//To verify that "Confirmation gmail" text box isDisplayed or not will use isDisplayed()
		boolean displayed = driver.findElement(By.name("reg_email_confirmation__")).isDisplayed();
		System.out.println("Email confirmation text box is displayed? "+displayed);
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("xyz@gmail.com");
		
		//Enter password using Sendkeys
		driver.findElement(By.id("password_step_input")).sendKeys("123456");
		
		//handle drop-down 
		//identify list box to be handled and store it in reference variable
		WebElement day = driver.findElement(By.id("day"));
		
		//Create an object of Select class which will accept WebElement as argument
		Select sday = new Select(day);
		
		//first verify drop-down is multiple selected or not
		boolean days = sday.isMultiple();  //false
		System.out.println("Can we select multiple days? "+days);
		sday.selectByIndex(14);   //15
		
		WebElement month = driver.findElement(By.id("month"));
		Select smonth =new Select(month);
		boolean months = smonth.isMultiple();
		System.out.println("Can we select multiple months?  "+months);
		smonth.selectByValue("9");
		
		WebElement year = driver.findElement(By.id("year"));
		Select syear = new Select(year);
		boolean years = syear.isMultiple();
		System.out.println("Can we select multiple years? "+years);
		syear.selectByVisibleText("1977");
		
		driver.findElement(By.className("_8esa")).click();
		driver.findElement(By.name("websubmit")).click();
			
		
	}

}
