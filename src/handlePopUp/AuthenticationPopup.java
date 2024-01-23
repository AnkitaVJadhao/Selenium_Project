package handlePopUp;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthenticationPopup {

	public static void main(String[] args)
	{
		String username ="admin";
		String password ="admin";
        WebDriver driver=new ChromeDriver();
        driver.get("https://"+username+":"+password+"@"+"the-internet.herokuapp.com/basic_auth");
        //String url="https://" + username + ":" + password + "@" + domain;
	}

}
