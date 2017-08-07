package d;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.apache.log4j.xml.DOMConfigurator;
	public class S{
		

	
		private static WebDriver driver1;
	 
		private static Logger Log = Logger.getLogger(S.class.getName());
	 
		public static void main(String[] args) {

			DOMConfigurator.configure ("log4j.xml");
		}
	/*public static void main(String[] args) {
		 
	 DOMConfigurator.configure("log4j.xml");
		//private static Logger Log = Logger.getLogger("devpinoyLogger".class.getName());
	 Logger log = Logger.getLogger("devpinoyLogger");*/
	
public void testCase1()	{
		 System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe"); 	
	driver1 = new ChromeDriver(); 
	
	}
public void testCase2(){
driver1.get("https://www.yahoo.com");	
Log.debug("opening webiste");
		driver1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Log.debug("Waiting For Some Seconds");
	}
public void testCase3(){
			driver1.findElement(By.xpath(".//*[@id='uh-search-box']")).sendKeys("TechFetch");
			Log.debug("Searching TechFetch in Google");
driver1.findElement(By.xpath(".//*[@id='uh-search-button']")).click();	
Log.debug("Clicking Search Button");
}
 }	
	
