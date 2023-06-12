package org.seleniumbasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class waits_topic {

	public static void main(String[]args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver","C:\\Users\\raviv\\eclipse-workspace\\SeleniumProjects\\Library\\chromedriver.exe" );
		
    WebDriver driver = new ChromeDriver();
     driver.get("https://www.flipkart.com/");
     
     WebElement email = driver.findElement(By.id("email"));
     driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS); // Imlipicit Wait
     
     WebDriverWait wait = new WebDriverWait(driver, 30); // Explicit wait
     wait.until(ExpectedConditions.elementToBeClickable(email));
     wait.until(ExpectedConditions.alertIsPresent());
   //wait.until(ExpectedConditions.urlContains(email));
     
     Wait<WebDriver> wt = new FluentWait<WebDriver>(driver);
      wt.wait(0);
     
     

		
		
		
	}
		
		
	
	
}
