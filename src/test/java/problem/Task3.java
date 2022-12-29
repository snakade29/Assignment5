package problem;

import java.time.Duration;
 

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
	    WebDriver driver = new ChromeDriver() ;
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		 
	  WebElement  footer =driver.findElement(By.xpath("//div[@class='orangehrm-login-footer-sm']"));
	  Thread.sleep(5000);
	  int noofLinks =  footer.findElements(By.tagName("a")).size();
	 if(noofLinks == 4)
	 {
		System.out.println("It contains 4 social media icons ") ;
	 }
	 else 
		 System.out.println("It does not contains 4 social media icons ") ;
		 

	}

}
