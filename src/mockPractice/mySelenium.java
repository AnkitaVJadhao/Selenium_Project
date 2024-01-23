package mockPractice;


import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class mySelenium {

	public static void main(String[] args) throws InterruptedException 
	{
		
		//webdriver:= interface with using webdriver interface
		WebDriver driver = new ChromeDriver();
		
		Dimension d=new Dimension(600, 700);
		driver.manage().window().setSize(d);
		
		driver.get("http://omayo.blogspot.com/");
		
		//maximize the window
		driver.manage().window().maximize();
		
		
		
		//target element by using findElement  
		//click method is used for  simulates a click on an element.
		//driver.findElement(By.id("confirm")).click();
		
//		Boolean b=driver.findElement(By.xpath("//input[@id='checkbox1']")).isSelected();
//		System.out.println(b);
		
		
		Boolean b1=driver.findElement(By.xpath("//input[@id='checkbox2']")).isSelected();
		System.out.println(b1);
		
		String color=driver.findElement(By.id("home")).getCssValue("text-align");
		System.out.println(color);
		
		Dimension Size = driver.findElement(By.xpath("//img[@height='200px']")).getSize();
		System.out.println(Size.height+" "+Size.width);
		
		Point location = driver.findElement(By.xpath("//img[@height='200px']")).getLocation();
		System.out.println(location.x+" "+location.y);
		
	
		
		
		
		//handling alert pop-up
//		Alert alert = driver.switchTo().alert();  
//		String alert_msg=alert.getText();
//		System.out.println(alert_msg);
//		Thread.sleep(2000);
//		alert.dismiss();
//      alert.accept();
		
//		Boolean button=driver.findElement(By.id("but1")).isEnabled(); 
//		System.out.println(button);
		
	
	
	/*	
		
		//sendKeys type content automatically into an editable field
		driver.findElement(By.id("ta1")).sendKeys("Ankita Jadhao"); 
		
		//pauses the execution of the current thread for a specified amount of milliseconds
		Thread.sleep(2000);
		
//		//remove that data which we enter using sendkeys method in line 24
		driver.findElement(By.id("ta1")).clear();
		
		Thread.sleep(2000);
		driver.findElement(By.name("q")).sendKeys("laptop");
		Thread.sleep(2000);
		
		
		 driver.findElement(By.id("confirm")).click();
		 
		 Alert alert1 = driver.switchTo().alert();
		 alert1.accept();
		 
		 
//		//If we want to find a string content,  
//		// return the text 
		String s1=driver.findElement(By.id("pah")).getText(); 
		System.out.println(s1);
		
		
//		//return website title 
 		String title=driver.getTitle();   
		System.out.println(title);
		
		
 		String link=driver.findElement(By.partialLinkText("compendium")).getText();
		System.out.println(link);
		
 		String title1=driver.getCurrentUrl();   //return url , url which we are using
		System.out.println(title1);
	
		
		String classname= driver.findElement(By.id("drop1")).getAttribute("class"); //return name of attribute
		System.out.println(classname);
		
		
		
		
		Boolean button1=driver.findElement(By.cssSelector("#but1")).isEnabled();   //id = # , class :- .(dot)
		System.out.println(button1);
		

		//1 second :- 1000 milisecond 
		//Thread.sleep(15000)
		
		//quit the window means window will be close
		//driver.quit();    
	   //Thread.sleep(10000);
	
		
		
		
		
		//String s1=driver.findElement(By.id(" ")).getText();
		
		//System.out.println(s1);
		
		//driver.quit();  //close the browser
		
		
	*/	
		
	}

}
