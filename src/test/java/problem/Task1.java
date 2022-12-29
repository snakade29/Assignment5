package problem;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver() ;
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.manage().window().maximize();
		
		String url =driver.getCurrentUrl();
		System.out.println(url);
		
		if(url.endsWith("login"))
		{
			System.out.println("YES URL ENDS WITH LOGIN");
		}
		else 
			System.out.print("NO IT DOES NOT ENDS WITH LOGIN");
		
		
		
	 if(url.contains("demo"))
	 {
		 System.out.println("YES, URL CONTAINS DEMO");
	 }
	 else
		 System.out.println("NO,   URL DOES NOT CONTAINS DEMO");
			
	   String Title = driver.getTitle();
	    
	   if(Title.contains("HRM"))
		   System.out.println("YES,  Tittle CONTAINS HRM "); 
	   else 
		   System.out.println("NO ,  Tittle DOES NOT CONTAINS HRM "); 
		   
			
		

	}

}
