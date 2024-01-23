package TableHandlingStudy;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Assignment_Table {

	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().minimize();
		
		driver.get("https://www.google.com/search?gs_ssp=eJzj4tTP1TcwMiw0MjZg9GLOTE4GACEjA_U&q=icc&oq=icc&gs_lcrp=EgZjaHJvbWUqEggBEC4YQxiDARixAxiABBiKBTIGCAAQRRg8MhIIARAuGEMYgwEYsQMYgAQYigUyDwgCEAAYQxixAxiABBiKBTINCAMQLhjUAhixAxiABDINCAQQLhjUAhixAxiABDIKCAUQLhixAxiABDIKCAYQABixAxiABDIGCAcQRRg80gEINTYxNWowajeoAgCwAgA&sourceid=chrome&ie=UTF-8#sie=m;/g/11v13f93lc;5;/m/021vk;cms;fp;1;;;");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		int numofcolumn = driver.findElements(By.xpath("(//table[@class='imspo_tps__tb'])[3]//tr[1]/th")).size();
		System.out.println();
		int numofrow=driver.findElements(By.xpath("(//table[@class='imspo_tps__tb'])[3]//tr")).size();
		System.out.println(numofrow);
		
		System.out.println("========================================");
		
//		for(int i=1; i<=5;i++)
//		{
//			String header = driver.findElement(By.xpath("(//table[@class='imspo_tps__tb'])[3]//tr[1]/th["+i+"]//span[1]")).getText();
//			System.out.print(header+" ");
//			
//		}
		
		List<WebElement> text1 = driver.findElements(By.xpath("(//table[@class='imspo_tps__tb'])[3]//tr[1]//th//span[1]"));
		
		
		for(WebElement ele:text1)
		{
			System.out.print(ele.getText()+"  ");
		}
		
		System.out.println();
		
		for(int i=1;i<numofrow;i++)
		{
			for(int j=1;j<numofcolumn;j++)
			{
				//(//table[@class='imspo_tps__tb'])[3]//tr/td//div[@class='imspo_tps__nmapos-wd']
			}
		}
		
		
		

	}

}
