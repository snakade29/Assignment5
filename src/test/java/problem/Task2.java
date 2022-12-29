package problem;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	 
			
			
	    WebDriver driver = new ChromeDriver() ;
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.manage().window().maximize();
		
 
	    WebElement ele = driver.findElement(By.xpath("//img[@src='/web/images/ohrm_branding.png?1666596668857']"));

		Thread.sleep(4000);
	    System.out.print(ele.isDisplayed());
	}

}
