package locaters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_Locator {

	public static void main(String[] args) throws InterruptedException 
	{
		
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.instagram.com/?hl=en");
	Thread.sleep(1000);
	//xpath:- //tagname[@attribute name='attribute value']
	//input[@aria-label='Phone number, username, or email']
		
	//Enter the username
	driver.findElement(By.xpath("//input[@aria-label='Phone number, username, or email']")).sendKeys("x@gmail.com");
	Thread.sleep(1000);
		
	//Enter the password
	driver.findElement(By.xpath("//input[@aria-label='Password']")).sendKeys("xyz@123");
	Thread.sleep(1000);
		
	//Click on show password button
	driver.findElement(By.xpath("//button[@class='_acan _acao _acat _aj1-']")).click();
	Thread.sleep(1000);
		
	//Click on Login button
	driver.findElement(By.xpath("//div[@class='x9f619 xjbqb8w x78zum5 x168nmei x13lgxp2 x5pf9jr xo71vjh x1xmf6yo x1e56ztr x540dpk x1m39q7l x1n2onr6 x1plvlek xryxfnj x1c4vz4f x2lah0s xdt5ytf xqjyukv x1qjc9v5 x1oa3qoh x1nhvcw1']")).click();
	Thread.sleep(1000);	
	
	//click on Forgot password hyperlink
	driver.findElement(By.xpath("//span[@class='x1lliihq x1plvlek xryxfnj x1n2onr6 x193iq5w xeuugli x1fj9vlw x13faqbe x1vvkbs x1s928wv xhkezso x1gmr53x x1cpjm7i x1fgarty x1943h6x x1i0vuye x1fhwpqd xo1l8bm x7l2uk3 x10wh9bi x1wdrske x8viiok x18hxmgj']")).click();
	Thread.sleep(1000);
	
	//click on Back to login hyperlink
	driver.findElement(By.xpath("//a[contains(text(),'Back to login')]")).click();
	Thread.sleep(1000);
	
	//click on Signup
//	driver.findElement(By.xpath("//span[@class='_aacl _aaco _aacw _aad0 _aad7']")).click();
//	Thread.sleep(1000);
	
	
	
	//window handling 
	//driver.findElement(By.xpath("//body/div[@id='mount_0_0_SO']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/section[1]/main[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[4]/div[1]/label[1]/input[1]")).sendKeys("xyz@gmail.com");
	}

}
