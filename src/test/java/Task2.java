import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.actitime.com/login.do");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.findElement(By.id("username")).sendKeys("admin");
        driver.findElement(By.name("pwd")).sendKeys("manager");
        driver.findElement(By.xpath("//div[text()='Login ']")).click();
        
        WebElement ele = driver.findElement(By.xpath("//input[@id ='SubmitTTButton']"));
		 
		  Point  p = ele.getLocation(); 
		  int x = p.getX();
		  int y = p.getY();
        
        JavascriptExecutor js = (JavascriptExecutor)driver ;
   
        js.executeScript("window.scrollBy("+x+","+y+")");
        
       
        
	}

}
