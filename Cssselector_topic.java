package org.seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cssselector_topic {

	
	public static void main(String[]args) throws InterruptedException {
		
		
			System.setProperty("webdriver.chrome.driver","C:\\Users\\raviv\\eclipse-workspace\\SeleniumProjects\\Library\\chromedriver.exe" );
			
	    WebDriver driver = new ChromeDriver();
	     driver.get("https://www.facebook.com/");
	     
	  WebElement email = driver.findElement(By.cssSelector("input#email"));  
	    email.sendKeys("ravivarma3213@gmail.com");
	    
	    WebElement password = driver.findElement(By.cssSelector("input[type*='as']"));
	    password.sendKeys("Ravi@0406");
	    
	    WebElement login = driver.findElement(By.cssSelector("button[type^='sub']"));
	    login.click();
	    
	    WebElement forgotPassword = driver.findElement(By.cssSelector("a._97w4"));
	    forgotPassword.click();
	    
	    
	    
	    
	    
	}
}
