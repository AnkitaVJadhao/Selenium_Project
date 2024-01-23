package webElementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IsDisplayed {

	public static void main(String[] args) {
		
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		boolean result = driver.findElement(By.name("show-hide")).isDisplayed();
		System.out.println(result);
		
		//click on hide button
		driver.findElement(By.id("hide-textbox")).click();
		
		boolean result1 = driver.findElement(By.name("show-hide")).isDisplayed();
		System.out.println(result1);
		
		//drop down
        //webelement :- Interface 
		WebElement option = driver.findElement(By.id("dropdown-class-example"));
		System.out.println(option.getText());
		
		Select s=new Select(option);         //Class 
		s.selectByVisibleText("Option3");   //method :- non-static parameterized  method 

		
		driver.close();
		WebDriver driver1=new ChromeDriver();
		driver1.get("https://www.facebook.com/login/");
		driver1.findElement(By.xpath("//a[text()='Sign up for Facebook']")).click();
		
		
		
		
		WebElement day=driver1.findElement(By.id("day"));
		Select s2 =new Select(day);
		//Select s2 =new Select(driver1.findElement(By.id("day")));
		s2.selectByValue("1");
		
		

	}

}
