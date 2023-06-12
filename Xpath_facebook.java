package org.seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_facebook {

	
	public static void main (String[]args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\raviv\\eclipse-workspace\\SeleniumProjects\\Library\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		WebElement email = driver.findElement(By.xpath("//input[@type = 'text']"));
		email.sendKeys("ravivarma3213@gmail.com");//basic Xpath
		
		WebElement password = driver.findElement(By.xpath("(//input[contains(@class,'inputtext')])[2]"));//Xpath with index
		password.sendKeys("Ravi@0406");
		
		WebElement login = driver.findElement(By.xpath("//button[text()='Log in']"));
		login.click();
		
		Thread.sleep(2000);
		driver.close();
	
		
	}
}
