package MethodsandUse;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Test_Script1 {

	public static void main(String[] args) throws InterruptedException
	{
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.saucedemo.com/v1/");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			
			//Loggin with Valaid credetials :-	
			WebElement username = driver.findElement(By.id("user-name"));
			WebElement password = driver.findElement(By.id("password"));
			WebElement loginbutton = driver.findElement(By.id("login-button"));
			username.sendKeys("standard_user");
			password.sendKeys("secret_sauce");
			loginbutton.click();
			
			
			WebElement backpack = driver.findElement(By.xpath("(//button[@class='btn_primary btn_inventory'])[1]"));
		    //WebElement bike_light = driver.findElement(By.xpath("(//button[@class='btn_primary btn_inventory'])[2]"));
			backpack.click();
			//bike_light.click();
			
			
		    WebElement carts = driver.findElement(By.id("shopping_cart_container"));
		    carts.click();
		    
		    List<WebElement> allitems = driver.findElements(By.className("inventory_item_name"));
		    System.out.println("I have added "+allitems.size()+"items in my cart");
		    
		    for(WebElement ele:allitems)
		    {
		    	System.out.println(ele.getText());
		    }
		    
		    //validate all items added is correct 
		    Iterator<WebElement> it =allitems.iterator();
		    WebElement itemNum1 = it.next();
		    
		    if(itemNum1.getText().equals("Sauce Labs Backpack"))
		    {
		    System.out.println("Selected item is correct as=Sauce Labs Backpack");

		    driver.findElement(By.linkText("CHECKOUT")).click();
		    }
		    else 
		    {
		    System.out.println("Selected item is not correct");
		    }
		    
		    WebElement firstName = driver.findElement(By.id("first-name"));
		    WebElement lastName = driver.findElement(By.id("last-name"));
		    WebElement postalCode = driver.findElement(By.id("postal-code"));
		    
		    
		    firstName.sendKeys("Velocity");
		    lastName.sendKeys("Pune");
		    postalCode.sendKeys("411046");
		    
		    WebElement continueButton = driver.findElement(By.xpath("//input[@value='CONTINUE']"));
		    continueButton.click();

		    WebElement finishButton = driver.findElement(By.linkText("FINISH"));
		    finishButton.click();
		    
		    
		    WebElement thankYouMsg =driver.findElement(By.xpath("//h2[text()='THANK YOU FOR YOUR ORDER']"));
		    
		    if (thankYouMsg.getText().equals("THANK YOU FOR YOUR ORDER"))
		    {
		    System.out.println("Thank you msg is displyed......Logging out");
		    driver.findElement(By.xpath("//button[text()='Open Menu']")).click();
		    Thread.sleep(500);
		    driver.findElement(By.id("logout_sidebar_link")).click();
		    }
		    else 
		    {
		    System.out.println("Thank you msg is not displayed....Please check");
		    }
		 		

	}

}
