package problem;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task5 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		 WebDriver driver = new ChromeDriver() ;
			
		 driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 driver.manage().window().maximize();
		  WebElement  footer =driver.findElement(By.xpath("//div[@class='orangehrm-login-footer-sm']"));
		  Thread.sleep(5000);
		  List<WebElement> li =  footer.findElements(By.tagName("a")) ;
		   String arr[]= new  String[3];       
	    for(WebElement ele : li ) 
	    {
		String link = ele.getAttribute("href");
		 
	       if(link.contains("youtube"))
			System.out.println("youtube  :"+link);
			
	     }
		
		
		
	}

}
