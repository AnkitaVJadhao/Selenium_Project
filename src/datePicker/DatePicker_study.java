package datePicker;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DatePicker_study {

	public static WebDriver driver = null;

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
		driver.findElement(By.cssSelector("#datepicker")).click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ui-datepicker-div")));
		datePicker("15", "January", "2026");

	}

	public static void datePicker(String day, String m, String y) throws InterruptedException
	
	{
		
		String year_month = driver.findElement(By.className("ui-datepicker-title")).getText();
		String month = year_month.split(" ")[0];
		System.out.println(month);
		String year = year_month.split(" ")[1];

		while (!(month.equals(m) && year.equals(y))) // check both condition
		// equals("January") :- true ,year.equals("2025"):- false :- false
		// if condition is false then while loop will not execute
		// to make condition true
		{
			driver.findElement(By.xpath("//a[@title='Next']")).click();// Feb
			year_month = driver.findElement(By.className("ui-datepicker-title")).getText(); //
			month = year_month.split(" ")[0]; // Feb
			year = year_month.split(" ")[1]; // 2024
			Thread.sleep(200);

		}
		// String datexpath="//a[text()='"+day+"']";
		// driver.findElement(By.xpath(datexpath)).click();
		driver.findElement(By.xpath("//a[text()='" + day + "']")).click();
	}

}
