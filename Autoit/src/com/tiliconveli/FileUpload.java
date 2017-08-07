package com.tiliconveli;

import static org.junit.Assert.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.assertThat;
import java.io.File;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class FileUpload {
	
	WebDriver driver;
	//System.setProperty("webdriver.gecko.driver","C:\\Users\\subu\\Documents\\geckodriver.exe");
	
	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\subu\\Documents\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://the-internet.herokuapp.com/upload");
	}

	@After
	public void tearDown() throws Exception {
		//driver.quit();
	}

	@Test
	public void test() {
		String filename="f.txt";
		File file=new File(filename);
		String path=file.getAbsolutePath();
        
		//WebDriver driver = new FirefoxDriver();
		//driver.get("https://www.google.co.in/?gfe_rd=cr&ei=o3toWdyZBoXy8AfX2qPwBA");
		//driver.get("http://the-internet.herokuapp.com/upload");
		driver.findElement(By.id("file-upload")).sendKeys(path);
		driver.findElement(By.id("file-submit")).click();
		String text=driver.findElement(By.id("uploaded-files")).getText();
		System.out.println(text);
		System.out.println(path);
		assertThat(text,is(equalTo(filename)));
		driver.quit();
	}

}
