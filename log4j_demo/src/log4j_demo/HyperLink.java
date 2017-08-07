package log4j_demo;
import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HyperLink {
	public static void main(String[] args)throws Exception {
		System.setOut(new PrintStream(new FileOutputStream("D://file.txt")));
		System.out.println("File created");
			WebDriver driver;
			System.setProperty("webdriver.gecko.driver","C:\\Users\\subu\\Documents\\geckodriver.exe"); 
		      driver=new FirefoxDriver();
		      driver.get("http://www.techfetch.com");

		     List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		      
		      System.out.println("All links found on web page are: " + allLinks.size() + " links");
		       
		      for (WebElement link : allLinks) {
		    
		      System.out.println(link.getAttribute("href"));
		  
		      }
		     
	          Thread.sleep(1000);
	          driver.quit();
	}
}
