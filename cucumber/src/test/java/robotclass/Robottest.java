package robotclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Robottest {
	public WebDriver  driver=new ChromeDriver();
	
	public void  openbaidu( ) {
		
	
	
	driver.get("https://www.baidu.com");
	driver.manage().window().fullscreen();
	String st=driver.getTitle();
	System.out.println(st);
	
	
	}

	
	public void  openamazon( ) {
		
		
	
		driver.get("https://www.amazon.com");
		driver.manage().window().fullscreen();
		String st=driver.getTitle();
		System.out.println(st);
		
		
		}
	
	 public void closedriver() {
		 
		 driver.quit();
	 }
	

}
