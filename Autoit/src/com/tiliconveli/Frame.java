package com.tiliconveli;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Frame {
	
		public static void main(String args[]) throws InterruptedException {

			System.setProperty("webdriver.gecko.driver","C:\\Users\\subu\\Documents\\geckodriver.exe");	
			WebDriver driver = new FirefoxDriver(); //navigates to the Browser
			    driver.get("http://www.techfetch.com/"); 
			       // navigates to the page consisting an iframe

			       driver.manage().window().maximize();
			    // driver.wait(30000);
			       String name=driver.switchTo().frame(driver.findElement(By.id("twframe"))).switchTo().defaultContent().getTitle(); //switching the frame by ID

					System.out.println("********We are switch to the iframe*******");
		     		System.out.print("The Title is"+name);
		  		    //Clicks the iframe
		       
		  			System.out.println("*********We are done***************");
		      }
		}		

