package problem;

import java.time.Duration;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task4 {

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
			 
			if(link.contains("linkedin"))
			System.out.println("Linkedin  :"+link);
			else if(link.contains("facebook"))
			System.out.println("facebook   :"+link);
			else if(link.contains("twitter  :")) 
			System.out.println("twitter"+link);
			else
				System.out.println("youtube  :"+link);
				
				
			
		 }
			 /* 
			  Map<String,String> map=new HashMap<String,String>(); 
			  
			 map.put("FaceBook",arr[0]);  
			 map.put("Twitter",arr[1]); 
			 map.put("Youtube",arr[2]); 
			 map.put("Linkedin",arr[3]);
			 
		 */
			  
			  
			   
			  
	}

}
