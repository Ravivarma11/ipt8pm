package org.seleniumbasics;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class windows_handling {
	
	public static void main (String[]args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\raviv\\eclipse-workspace\\SeleniumProjects\\Library\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://vahan.parivahan.gov.in/vahan/vahan/ui/login/login.xhtml");
	    driver.findElement(By.xpath("//div[text()='National Permit']")).click();
	    
	  String MainWindow = driver.getWindowHandle();
	  Set<String> AllwindowHandles = driver.getWindowHandles();
		
	  for (String Window:AllwindowHandles)
	  {
		if(!MainWindow.equals(Window)) {
			
			driver.switchTo().window(Window);
			driver.findElement(By.xpath("//div[contains(text(),'Online Pay')]")).click();	
			driver.findElement(By.id("tf_REGN_NO1")).sendKeys("TN13A6735");
		}
	}

	  driver.switchTo().window(MainWindow);
	  WebElement information = driver.findElement(By.xpath("(//*[@class='dropdown-toggle'])[3]"));
	  
	  	}
}
