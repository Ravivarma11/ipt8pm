package org.seleniumbasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class chrome_option_topic {
	
	public static void main(String[]args) 
{
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\raviv\\eclipse-workspace\\SeleniumProjects\\Library\\chromedriver.exe");
		
		ChromeOptions options =new ChromeOptions();
		options.addArguments("--start-maximized");
		options.addArguments("--incognito");
		
		WebDriver driver  = new ChromeDriver(options);
		
		driver.get("https://www.flipkart.com/");
		
		
		
		
		
		
	}

}
