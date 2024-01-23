package ChromeOptions;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Notification {

	public static void main(String[] args)
	{

				ChromeOptions opt=new ChromeOptions();
//				opt.addArguments("--headless");
//				opt.addArguments("incognito");
//				opt.addArguments("-disable-notifications");
//				opt.addArguments("start-maximized");
//				opt.addArguments("disable-infobars");
				
				ArrayList<String> a2=new ArrayList<String>();
				a2.add("start-maximized");
				a2.add("incognito");
				a2.add("--disable-notifications");
				a2.add("disable-infobars");
				opt.addArguments(a2);

				WebDriver driver = new ChromeDriver(opt);
				driver.get("https://www.ajio.com/");
				System.out.println(driver.getCurrentUrl());

	}

}
