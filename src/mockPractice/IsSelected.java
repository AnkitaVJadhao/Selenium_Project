package mockPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelected {

	public static void main(String[] args) throws InterruptedException
	{
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        
        driver.get("https://www.facebook.com/login/");
        Thread.sleep(1000);
        
        Dimension d=new Dimension(600, 700);
        driver.manage().window().setSize(d);
        
       
        
        driver.findElement(By.xpath("//a[text()='Sign up for Facebook']")).click();
        WebElement gender = driver.findElement(By.xpath("//input[contains(@id,'u_0_4')]"));
        
        
        boolean result = gender.isSelected();
        System.out.println(result);     //false
        
        gender.click();     //click
        
        result= gender.isSelected();  
        System.out.println(result);   //true

        
        
        
	}

}
