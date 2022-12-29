import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Popup {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver() ;
		driver.get("https://demoapp.skillrary.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
	    WebElement ele=driver.findElement(By.xpath("//a[@id ='course']"));
		Actions a = new Actions(driver);
		WebElement ele1=driver.findElement(By.xpath("//a[text()='munit testing ']"));
		a.moveToElement(ele).build().perform();
		a.moveToElement(ele1).click().build().perform();
		driver.findElement(By.xpath("//button[@class='btn btn-primary btn-lg btn-flat']")).click();
		 
 
		 
		
	    Alert alt = driver.switchTo().alert();
	    alt.accept();
	    System.out.print("pass");
		

	}

}
